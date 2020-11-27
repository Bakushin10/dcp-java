package com.dcp.dcp.service;

import com.dcp.dcp.model.claim.ClaimInfo;
import com.dcp.dcp.repository.ClaimJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccessUserService {

    @Autowired
    private ClaimJpaRepository claimJpaRepository;
    private static List<ClaimInfo> DB = new ArrayList<>();

    public List<ClaimInfo> findAll() {
        return claimJpaRepository.findAll();
    }

    // public ClaimInfo getUserID(String userID){
    // return claimJpaRepository.findById(userID).orElse(null);
    // }

    public ClaimInfo saveDataByUserID(ClaimInfo claimInfo) {
        return claimJpaRepository.save(claimInfo);
    }

}