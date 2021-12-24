/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backendems.ems.Controller;

import com.backendems.ems.Entity.Shopping;
import com.backendems.ems.model.DAOUser;
import com.backendems.ems.repository.ShoppingRespository;
import com.backendems.ems.repository.UserRepository;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/api")
public class ShoppingController {

    @Autowired
    private ShoppingRespository shoppingRespository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/shopping") //Gett All Shopping
    public ResponseEntity<List<Shopping>> getShoppings() {
        Iterable<Shopping> shoppings = shoppingRespository.findAll();
        List<Shopping> shoppingList = new ArrayList<>();
        for (Shopping shopping : shoppings) {
            shoppingList.add(shopping);
        }
        return ResponseEntity.ok(shoppingList);
    }

    @GetMapping("shopping/{id}") //Get Shopping By Id
    public ResponseEntity<Shopping> getShoppingById(
            @PathVariable(name = "id") Integer id) {
        Optional<Shopping> optionalShopping = shoppingRespository.findById(id);
        if (!optionalShopping.isEmpty()) {
            return ResponseEntity.ok(optionalShopping.get());
        }
        return ResponseEntity.badRequest().body(null);
    }

    @PutMapping("/shopping/")
    public ResponseEntity<Shopping> updateShopping(@RequestBody Shopping shopping,
            Principal principal) {
        String userName = principal.getName();
        DAOUser user = userRepository.getUserByUsername(userName);
        if (user != null) {
            Optional<Shopping> optionalShopping = shoppingRespository.findById(shopping.getId());

            if (!optionalShopping.isEmpty()) {
                Shopping s = optionalShopping.get();
                if (s != null) {
                    s.setCreatedate(shopping.getCreatedate());
                    s.setName(shopping.getName());
                    shoppingRespository.save(s);
                    return ResponseEntity.ok(optionalShopping.get());
                }
            }
        }
        return ResponseEntity.badRequest()
                .body(null);
    }

    @DeleteMapping("/shopping/{id}")
    public ResponseEntity<String> deleteShoppingById(
            @PathVariable(name = "id") Integer id,
            Principal principal) {
        String userName= principal.getName();
        DAOUser user = userRepository.getUserByUsername(userName);
        if(user !=null){
        Shopping shopping = shoppingRespository.findById(id).get();
        if(shopping !=null){
        shoppingRespository.deleteById(id);
        return ResponseEntity.ok("deleted");
        }
        }
        return ResponseEntity.badRequest().body("Id Not Found");
    }
    
    
    @PostMapping("/shopping/")
    public ResponseEntity<String>saveShopping(@RequestBody Shopping shopping){
  
    shoppingRespository.save(shopping);
    return ResponseEntity.ok("ok");
            
    }
}
