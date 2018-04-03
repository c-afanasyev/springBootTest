package com.afanasyev.bootmvcdatafreemarker.entity;


import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Objects;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;

    public Customer() { }

    public Customer(Integer id, String name, String address, String city, String state, String zip) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAddress(), getCity(), getName(), getState(), getZip());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;
        return Objects.equals(getId(), customer.getId()) &&
                Objects.equals(getAddress(), customer.getAddress()) &&
                Objects.equals(getCity(), customer.getCity()) &&
                Objects.equals(getName(), customer.getName()) &&
                Objects.equals(getState(), customer.getState()) &&
                Objects.equals(getZip(), customer.getZip());
    }

    @Override
    public String toString() {
        return String.format("Customer(id:%d, address:%s, city:%s, name:%s, state:%s, zip:%s",
                id, address, city, name, state, zip);
    }
}
