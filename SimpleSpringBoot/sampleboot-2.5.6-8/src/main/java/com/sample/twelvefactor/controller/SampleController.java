package com.sample.twelvefactor.controller;

import com.sample.twelvefactor.service.SampleValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.ValidationAnnotationUtils;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    private SampleValidator validator;

    @Autowired
    public SampleController(SampleValidator validator){
        this.validator=validator;
    }

    @GetMapping(value = "example-get-mapping/firstname/{firstName}/lastName/{lastName}")
    public String exampleGetMapping(@PathVariable String firstName,
                                    @PathVariable String lastName,
                                    @RequestParam(required = false)String format) throws Exception{

        return validator.exampleGetMapping(firstName,lastName,format);
    }
}
