package com.sakura.springboottest.repository;

import com.sakura.springboottest.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer>{
}
