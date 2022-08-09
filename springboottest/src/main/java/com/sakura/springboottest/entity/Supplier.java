package com.sakura.springboottest.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 供应商信息
 */
@NoArgsConstructor
@Entity(name = "supplier")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SUPPLIER_ID;// 供应商ID
    private String SUPPLIER_NAME;// 供应商名
    private String SUPPLIER_PERSON;// 负责人
    private String SUPPLIER_TEL;// 联系电话
    private String SUPPLIER_EMAIL;// 电子邮件
    private String SUPPLIER_ADDRESS;// 供应商地址


    public Supplier(Integer SUPPLIER_ID, String SUPPLIER_NAME, String SUPPLIER_PERSON, String SUPPLIER_TEL,String SUPPLIER_EMAIL,String SUPPLIER_ADDRESS){
        this.SUPPLIER_ID = SUPPLIER_ID;
        this.SUPPLIER_NAME = SUPPLIER_NAME;
        this.SUPPLIER_PERSON = SUPPLIER_PERSON;
        this.SUPPLIER_TEL = SUPPLIER_TEL;
        this.SUPPLIER_EMAIL = SUPPLIER_EMAIL;
        this.SUPPLIER_ADDRESS = SUPPLIER_ADDRESS;
    }

    public Integer getSupplierId() {
        return SUPPLIER_ID;
    }

    public void setSupplierId(Integer SUPPLIER_ID) {
        this.SUPPLIER_ID = SUPPLIER_ID;
    }

    public String getName() {
        return SUPPLIER_NAME;
    }

    public void setName(String SUPPLIER_NAME) {
        this.SUPPLIER_NAME = SUPPLIER_NAME;
    }

    public String getPersonInCharge() {
        return SUPPLIER_PERSON;
    }

    public void setPersonInCharge(String SUPPLIER_PERSON) {
        this.SUPPLIER_PERSON = SUPPLIER_PERSON;
    }

    public String getTel() {
        return SUPPLIER_TEL;
    }

    public void setTel(String SUPPLIER_TEL) {
        this.SUPPLIER_TEL = SUPPLIER_TEL;
    }

    public String getEmail() {
        return SUPPLIER_EMAIL;
    }

    public void setEmail(String SUPPLIER_EMAIL) {
        this.SUPPLIER_EMAIL = SUPPLIER_EMAIL;
    }

    public String getAddress() {
        return SUPPLIER_ADDRESS;
    }

    public void setAddress(String SUPPLIER_ADDRESS) {
        this.SUPPLIER_ADDRESS = SUPPLIER_ADDRESS;
    }

    @Override
    public String toString() {
        return "Supplier [id=" + SUPPLIER_ID + ", name=" + SUPPLIER_NAME + ", personInCharge=" + SUPPLIER_PERSON + ", tel=" + SUPPLIER_TEL
                + ", email=" + SUPPLIER_EMAIL + ", address=" + SUPPLIER_ADDRESS + "]";
    }
}
