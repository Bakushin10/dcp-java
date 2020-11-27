package com.dcp.dcp.repository;

import com.dcp.dcp.model.claim.ClaimInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimJpaRepository extends JpaRepository<ClaimInfo, String> {
}
