package peaksoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import peaksoft.service.StudentServiceImpl;

import javax.persistence.Access;

//@Controller
public class StudentController {
    @Autowired
    private final StudentServiceImpl service;

    public StudentController(StudentServiceImpl service) {
        this.service = service;
    }
}
