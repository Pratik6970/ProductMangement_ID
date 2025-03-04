package com.app.pojos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduct extends JpaRepository<Product, Integer> {

}
