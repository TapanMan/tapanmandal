package com.mandal.nest.service;

import com.mandal.nest.entity.Hospital;
import com.mandal.nest.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
/**
 * This service and it's component is for Hackathon
 */
@Service
public class HospitalService {

    private static List<Hospital> hospitalList = new ArrayList<>(Arrays.asList(
            new Hospital(1001, "Apollo Hospital", "Chennai", 3.8),
            new Hospital(1002, "Global Hospital", "Chennai", 3.5),
            new Hospital(1003, "VCare Hospital", "Bangalore", 3)));
    @Autowired
    private HospitalRepository hospitalRepository;

    public List<Hospital> getAllHospitals() {
        //List<Hospital> hospitalList= new ArrayList<>();
        return hospitalList;
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
