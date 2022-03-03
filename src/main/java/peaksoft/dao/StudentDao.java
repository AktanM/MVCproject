package peaksoft.dao;

import peaksoft.model.Company;
import peaksoft.model.Student;

import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;
public interface StudentDao {

    void UpdateStudentsTable(long id, Student student);

    void saveStudents(Student student);

    void removeStudentsById(long id);

    List<Student> getAllStudents();
    Student getById(long id);}
