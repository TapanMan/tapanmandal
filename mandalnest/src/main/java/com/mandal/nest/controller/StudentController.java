package com.mandal.nest.controller;

import com.mandal.nest.entity.Student;
import com.mandal.nest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This is used for Heterogeneous database, one is for PostgresSQL and
 * Other DB used is Oracle
 */
@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/all-student")
    public ResponseEntity<List<Student>> getAll() {
        return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable String id) {
        return new ResponseEntity<>(studentRepository.findById(Long.valueOf(id))
                .orElseThrow(() -> new IllegalStateException("Student with id " + id + " not found")), HttpStatus.OK);
    }

    @PostMapping("/add-student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentRepository.save(student), HttpStatus.CREATED);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable String id) {
        studentRepository.deleteById(Long.valueOf(id));
        return new ResponseEntity<>("Student deleted", HttpStatus.NO_CONTENT);
    }
}
