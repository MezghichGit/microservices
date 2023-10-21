package com.sip.ams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sip.ams.entities.Product;
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product , Integer>{

}
