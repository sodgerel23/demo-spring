package com.example.demospring.service;

import com.example.demospring.data.PersonModel;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private PersonModel personModel;

    public PersonModel getPersonData() {
        return this.personModel;
    }

    public void updatePersonData(Integer age, String firstName, String lastName) {
        this.personModel.setAge(age);
        this.personModel.setFirstName(firstName);
        this.personModel.setLastName(lastName);
    }

}
