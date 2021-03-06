package com.example.democrudmongo.model;

import org.springframework.data.annotation.Id;

public class Persona {

    @Id
    private Long id;

    private String name;
    private String lastname;
    private String address;
    private String phone;


    public Persona() {

    }

    public Persona(Long id, String name, String lastname, String address, String phone) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
