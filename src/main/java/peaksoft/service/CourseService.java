package peaksoft.service;

import peaksoft.model.Course;

import java.sql.SQLException;
import java.util.List;

public interface CourseService {

    void UpdateCoursesTable(long id,Course course);

    void saveCourses(Course course) ;

    void removeCoursesById(long id);

    List<Course> getAllCourses();

    Course getById(long id);

}
