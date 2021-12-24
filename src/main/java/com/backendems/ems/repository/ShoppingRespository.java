/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backendems.ems.repository;

import com.backendems.ems.Entity.Shopping;
import java.util.Optional;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author LENOVO
 */
public interface ShoppingRespository extends CrudRepository<Shopping, Integer>{
    @Override
    @Cacheable(value = "getShoppings")
    public Iterable<Shopping> findAll();
    
    
    @Override
    @Cacheable(value = "getShoppingById", key = "#id")
    public Optional<Shopping> findById(Integer id);
    
    public Shopping findByid(Integer id);
}

