package com2.example.demo.lab1;

import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class BusinessCalculationService {
    DataService dataservice;

    public BusinessCalculationService(DataService dataservice) {
        this.dataservice = dataservice;
    }
    public int findMax(){
         return Arrays.stream(dataservice.retrieveData()).max().orElse(0);
    }
}
