package com.pranav.UserDetails.model;

//import lombok.*;

import java.util.List;

//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
//@Builder
public class User {
    private Long userId;
    private String name;
    private String phone;

    List<Contact> contact;

    User(){}

    public User(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }
}
