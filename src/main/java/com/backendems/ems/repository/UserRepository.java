package com.backendems.ems.repository;

import com.backendems.ems.model.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends CrudRepository<DAOUser, Long> {
        public DAOUser getUserByUsername(String userName);
	DAOUser findByUsername(String username);

}