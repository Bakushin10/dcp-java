package com.dcp.dcp.controller;

import java.util.List;

//import org.apache.coyote.Response;
import com.dcp.dcp.model.claim.ClaimInfo;
import com.dcp.dcp.model.common.Response;
import com.dcp.dcp.repository.ClaimJpaRepository;
import com.dcp.dcp.service.AccessUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClaimController {

    @Autowired
    private AccessUserService accessUserService;

    @CrossOrigin(origins = "http://localhost:9999")
    @GetMapping("/api/v1/claimlist")
    public List<ClaimInfo> getClaimInfoForAUser() {
        // Response<ClaimInfo> response = new Response<>();
        List<ClaimInfo> cr = accessUserService.findAll();

        // if (cr != null) {
        // response.success((T) cr);
        // } else {
        // String[] errorMessage = new String[1];
        // errorMessage[0] = "no claim was found";
        // response.fail(errorMessage);
        // }

        return cr;
    }

    // @GetMapping("/api/v1/claimlist")
    // public <T> Response<T> getClaimInfoForAUser(@RequestParam String
    // claimRequest) {
    // Response<T> response = new Response<>();
    // String userID = claimRequest;
    // ClaimInfo cr = accessUserService.getUserID(userID);

    // if (cr != null) {
    // response.success((T) cr);
    // } else {
    // String[] errorMessage = new String[1];
    // errorMessage[0] = "no id '" + claimRequest + "' was found";
    // response.fail(errorMessage);
    // }

    // return response;
    // }

    @PostMapping("/api/v1/claim")
    public <T> Response<T> saveClaimInfo(@RequestBody ClaimInfo claiminfo) {
        Response<T> response = new Response<>();
        accessUserService.saveDataByUserID(claiminfo);

        // add logic here
        return response;
    }
}
