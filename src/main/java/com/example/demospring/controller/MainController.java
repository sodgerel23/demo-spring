package com.example.demospring.controller;

import com.example.demospring.data.PersonModel;
import com.example.demospring.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/main")
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping("/getPersonData")
    public PersonModel getPersonData(){
        return mainService.getPersonData();
    }

    @GetMapping("/updateDataGet")
    public void updateDataGet(@RequestParam Integer age, @RequestParam String firstName, @RequestParam String lastName) {
        this.mainService.updatePersonData(age, firstName, lastName);
    }

    @PostMapping("/updateDataPost")
    public void updateDataPost(@RequestBody PersonModel personModel) {
        this.mainService.updatePersonData(personModel.getAge(), personModel.getFirstName(), personModel.getLastName());
    }

}
