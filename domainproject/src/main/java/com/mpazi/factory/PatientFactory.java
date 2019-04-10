package com.mpazi.factory;

import com.mpazi.domain.Patient;

public class PatientFactory {

    public static Patient getPatient(String name, String phone, String address, int sex, int id){
       return new Patient.Builder().id(id)
               .name(name)
               .phone(phone)
               .address(address)
               .sex(sex)
               .build();
    }
}
