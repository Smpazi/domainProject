package com.mpazi.domain;

public class Patient {
    private int id;
    private int sex;
    private String name,email,phone,address;

    private Patient(){}

    private Patient(Builder builder){
        this.id = builder.id;
        this.sex = builder.sex;
        this.name= builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address =builder.address;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSex() {
        return sex;
    }


    public String getEmail() {
        return email;
    }


    public String getPhone() {
        return phone;
    }


    public String getAddress() {
        return address;
    }

    public  static class Builder{
        private String name,email,phone,address;
        private int id;
        private int sex;

        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name= name;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Builder sex(int sex){
            this.sex = sex;
            return this;
        }

        public  Patient build(){
            return new Patient(this);
        }
    }

}
