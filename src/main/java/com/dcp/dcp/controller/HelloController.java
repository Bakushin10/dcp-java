package com.dcp.dcp.controller;

import com.dcp.dcp.model.claim.ClaimInfo;
import com.dcp.dcp.model.common.Response;
import com.dcp.dcp.repository.ClaimJpaRepository;
import com.dcp.dcp.service.AccessUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {

//    @Autowired
//    private AccessUserService accessUserService;

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }

}
