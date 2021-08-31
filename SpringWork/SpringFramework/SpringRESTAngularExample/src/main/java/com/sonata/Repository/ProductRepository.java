package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.Model.ProductDetails;


@Repository
public interface ProductRepository extends JpaRepository<ProductDetails, Long> {
	
}
