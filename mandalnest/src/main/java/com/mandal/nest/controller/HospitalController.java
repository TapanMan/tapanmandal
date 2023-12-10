package com.mandal.nest.controller;

import com.mandal.nest.entity.Hospital;
import com.mandal.nest.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * This controller and it's component is for Hackathon
 */
@RestController
@RequestMapping("/test/")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping("hospitals/{id}")
    public @ResponseBody Optional<Hospital> getHospital(@PathVariable("id") int id) throws Exception {
        return hospitalService.getHospital(id);
    }

    @GetMapping("hospitals/")
    public @ResponseBody List<Hospital> getAllHospitals() throws Exception {
        return hospitalService.getAllHospitals();
    }

    @PostMapping("hospitals/")
    public ResponseEntity<String> addHospital(@RequestBody Hospital hospital  ) {
        hospitalService.addHospital(hospital);
//URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(sevedUser.getId()).toUri();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<String> updateHospital(@RequestBody Hospital hospital) {
        hospitalService.updateHospital(hospital);
        return ResponseEntity.ok("ok");
    }

    @DeleteMapping("hospitals/")
    public ResponseEntity<String> deleteHospital(@RequestBody Hospital hospital) {
        hospitalService.deleteHospital(hospital);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
