package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("8-7")
    private String hno;
    @Value("big Bazar")
    private String location;

public String toString(){
    return hno+" "+location;
}

    public Address() {
    }

    public Address(String hno, String location) {
        this.hno = hno;
        this.location = location;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
