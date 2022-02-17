package com.sample.twelvefactor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleValidator {

    private SampleImpl sampleImpl;

    @Autowired
    public SampleValidator(SampleImpl sampleImpl){
        this.sampleImpl=sampleImpl;
    }

    public String exampleGetMapping(String firstName, String lastName, String format) throws Exception {
        if(firstName.isEmpty() || lastName.isEmpty()){
            throw new Exception("values cannot br blank");
        }
        return sampleImpl.exampleGetMapping(firstName,lastName,format);
    }
}
