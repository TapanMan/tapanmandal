package com.mandal.nest.service;

import com.mandal.nest.entity.Hospital;
import com.mandal.nest.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
/**
 * This service and it's component is for Hackathon
 */
@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    public List<Hospital> getAllHospitals() {
        List<Hospital> hos = new ArrayList<Hospital>();
        hospitalRepository.findAll().forEach(hos1 -> hos.add(hos1));
        return hos;
    }

    public Optional<Hospital> getHospital(int id) {

        //return hospitalRepository.findOne(id);
        return hospitalRepository.findById(id);
    }

    public void addHospital(Hospital hospital) {
        hospitalRepository.save(hospital);
    }

    public void updateHospital(Hospital hos) {
//if(hospitalRepository.findById(hos.getId()).isPresent())
//      {
//  Hospital hospital=hospitalRepository.findById(hos.getId()).get();
//  hospital.setName(hos.getName());
//  hospital.setCity(hos.getCity());
//  hospital.setRating(hos.getRating());
        hospitalRepository.save(hos);

//      }
    }

    public void deleteHospital(Hospital hospital) {
        hospitalRepository.delete(hospital);
    }
}
