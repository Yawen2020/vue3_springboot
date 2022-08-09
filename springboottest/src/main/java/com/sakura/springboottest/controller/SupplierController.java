package com.sakura.springboottest.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sakura.springboottest.entity.Goods;
import com.sakura.springboottest.entity.Supplier;
import com.sakura.springboottest.repository.GoodsRepository;
import com.sakura.springboottest.repository.SupplierRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/supplier")
public class SupplierController {
    @Resource
    private SupplierRepository supplierRepository;
    @Resource
    private GoodsRepository goodsRepository;

    @RequestMapping(value = "/findAll")
    public List<Supplier> findAll(){
        System.out.println(supplierRepository.findAll());
        return supplierRepository.findAll();
    }

    @RequestMapping(value="/getById")
    public Supplier getById(Integer id){
        System.out.println(supplierRepository.getById(id));
        return supplierRepository.getById(id);
    }

    @RequestMapping(value = "/add")
    public List<Supplier> add(String name, String person, String tel, String email, String address){
        Supplier s = new Supplier();
        s.setName(name);
        s.setPersonInCharge(person);
        s.setTel(tel);
        s.setEmail(email);
        s.setAddress(address);
        supplierRepository.save(s);
        System.out.println(supplierRepository.getById(s.getSupplierId()));
        return supplierRepository.findAll();

    }

    @RequestMapping(value = "/deleteById")
    public List<Supplier> deleteById(Integer id){
        supplierRepository.deleteById(id);
        return supplierRepository.findAll();
    }

    @RequestMapping(value="/getGoods")
    public List<Goods> getGoods(){
        System.out.println(goodsRepository.findAll());
      return goodsRepository.findAll();
    }

}
