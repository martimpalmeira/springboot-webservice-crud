package com.devsuperior.finalworkcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.finalworkcrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
