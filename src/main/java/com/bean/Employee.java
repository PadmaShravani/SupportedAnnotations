package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("10")
    private int eid;
    @Value("Saha")
    private String eName;
    @Autowired(required = false)
    private Address address;

    public String toString(){
        return eid+" "+eName+" "+address;
    }
    public Employee(){}
    public Employee(int eid, String eName, Address address) {
        this.eid = eid;
        this.eName = eName;
        this.address = address;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
