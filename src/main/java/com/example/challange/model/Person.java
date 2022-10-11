package com.example.challange.model;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    private String address;
    private String postcode;
    private String age;
    private String job;
    private String email;
    private String phoneno;
    public Person(){

    }

    public Person(int id, String address, String postcode, String age, String job, String email, String phoneno) {
        this.id = id;
        this.address = address;
        this.postcode = postcode;
        this.age = age;
        this.job = job;
        this.email = email;
        this.phoneno = phoneno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", age='" + age + '\'' +
                ", job='" + job + '\'' +
                ", email='" + email + '\'' +
                ", phoneno='" + phoneno + '\'' +
                '}';
    }
}

