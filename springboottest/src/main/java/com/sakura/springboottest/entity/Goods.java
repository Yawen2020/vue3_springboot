package com.sakura.springboottest.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Entity(name = "goods")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer GOOD_ID;
    private Integer SUPPLIER_ID;
    private String GOOD_NAME;
    private String GOOD_RYPE;
    private String GOOD_SIZE;
    private String GOOD_VALUE;

    public Goods(Integer GOOD_ID, Integer SUPPLIER_ID,String GOOD_NAME, String GOOD_RYPE, String GOOD_SIZE,String GOOD_VALUE){
        this.GOOD_ID = GOOD_ID;
        this.SUPPLIER_ID = SUPPLIER_ID;
        this.GOOD_NAME = GOOD_NAME;
        this.GOOD_RYPE = GOOD_RYPE;
        this.GOOD_SIZE = GOOD_SIZE;
        this.GOOD_VALUE = GOOD_VALUE;
    }
    public Integer getGOOD_ID() {
        return GOOD_ID;
    }

    public void setGOOD_ID(Integer GOOD_ID) {
        this.GOOD_ID = GOOD_ID;
    }

    public Integer getSUPPLIER_ID() {
        return SUPPLIER_ID;
    }

    public void setSUPPLIER_ID(Integer SUPPLIER_ID) {
        this.SUPPLIER_ID = SUPPLIER_ID;
    }

    public String getGOOD_NAME() {
        return GOOD_NAME;
    }

    public void setGOOD_NAME(String GOOD_NAME) {
        this.GOOD_NAME = GOOD_NAME;
    }

    public String getGOOD_RYPE() {
        return GOOD_RYPE;
    }

    public void setGOOD_RYPE(String GOOD_RYPE) {
        this.GOOD_RYPE = GOOD_RYPE;
    }

    public String getGOOD_SIZE() {
        return GOOD_SIZE;
    }

    public void setGOOD_SIZE(String GOOD_SIZE) {
        this.GOOD_SIZE = GOOD_SIZE;
    }

    public String getGOOD_VALUE() {
        return GOOD_VALUE;
    }

    public void setGOOD_VALUE(String GOOD_VALUE) {
        this.GOOD_VALUE = GOOD_VALUE;
    }

    @Override
    public String toString() {
        return "Goods [id=" + GOOD_ID + ", supplierId=" + SUPPLIER_ID + ", name=" + GOOD_NAME + ", type=" + GOOD_RYPE
                + ", size=" + GOOD_SIZE + ", value=" + GOOD_VALUE + "]";}
}

