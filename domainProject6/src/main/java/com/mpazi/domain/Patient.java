package com.mpazi.domain;

public class Patient {
    private int id;
    private String name;
    private int sex;
    private String email;
    private String phone;
    private String address;
    private String createdAt;
    private int numberOfPrescription;

    private Patient(int id, String name, int sex, String email, String phone, String address, String createdAt) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.createdAt = createdAt;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public int getNumberOfPrescription() {
        return numberOfPrescription;
    }

    public void setNumberOfPrescription(int numberOfPrescription) {
        this.numberOfPrescription = numberOfPrescription;
    }


}
