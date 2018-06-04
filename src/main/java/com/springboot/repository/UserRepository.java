package com.springboot.repository;

import com.springboot.domain.ClientUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<ClientUser, Long> {

    Optional<ClientUser> findByUsername(String username);

}
