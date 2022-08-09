package com.sakura.springboottest.repository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SupplierRepositoryTest {
    @Resource
    private SupplierRepository supplierRepository;


    @Test
    void test(){
        System.out.println(supplierRepository.findAll());
    }
}
