package peaksoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import peaksoft.service.CourseServiceImpl;

//@Controller
public class CourseController {
    private final CourseServiceImpl courseService;
    @Autowired
    public CourseController(CourseServiceImpl courseService) {
        this.courseService = courseService;
    }


}
