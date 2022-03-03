package peaksoft.dao;

import org.springframework.stereotype.Repository;
import peaksoft.model.Company;
import peaksoft.model.Course;

import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;
@PersistenceContext
@Repository
public interface CourseDao {

    void UpdateCoursesTable(long id,Course course);

    void saveCourses(Course course);

    void removeCoursesById(long id);

    List<Course> getAllCourses();
    Course getByid(long id);

}
