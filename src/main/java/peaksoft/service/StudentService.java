package peaksoft.service;

import peaksoft.model.Company;
import peaksoft.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {

    void UpdateStudentsTable(long id,Student student);

    void saveStudents(Student student);

    void removeStudentsById(long id);

    List<Student> getAllStudents();
     Student getById(long id);

}
