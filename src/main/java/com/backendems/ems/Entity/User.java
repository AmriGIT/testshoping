///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.backendems.ems.Entity;
//
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//
///**
// *
// * @author LENOVO
// */
//@Entity
//@Table(name = "t_user")
//public class User implements Serializable{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    private Integer id;
//    
//    @Column(name = "username", nullable = false)
//
//    private String username;
//
//
//    @Column(name = "password", nullable = false)
//
//    private String password;
//    
//    @Column(name = "email")
//    private String email;
//    
//    @Column(name = "phone")
//    private Integer phone;
//    
//    @Column(name ="country")
//    private String country;
//    
//    @Column(name="city")
//    private String city;
//    
//    @Column(name="postcode")
//    private String postcode;
//    
//    @Column (name="name")
//    private String name;
//    
//    @Column(name="address")
//    private String address;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Integer getPhone() {
//        return phone;
//    }
//
//    public void setPhone(Integer phone) {
//        this.phone = phone;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getPostcode() {
//        return postcode;
//    }
//
//    public void setPostcode(String postcode) {
//        this.postcode = postcode;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//    
//}
