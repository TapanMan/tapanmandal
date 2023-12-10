package com.mandal.nest.repository;

import com.mandal.nest.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * This repository and it's component is for Hackathon
 */
@Repository
public interface HospitalRepository extends JpaRepository<Hospital,Integer> {
}
