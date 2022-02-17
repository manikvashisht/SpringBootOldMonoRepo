package com.sample.twelvefactor.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SampleImpl {

    @Value("${return.constant}")
    private String returnConstant;

    public String exampleGetMapping(String firstName, String lastName, String format){
        if (null != format && format.equalsIgnoreCase("India")){
            return returnConstant+" "+firstName+" "+lastName;
        }else {
            return returnConstant+" "+lastName+","+firstName;
        }
    }

    }
