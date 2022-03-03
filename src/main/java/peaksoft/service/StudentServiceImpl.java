package peaksoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.dao.StudentDao;
import peaksoft.dao.StudentDaoImpl;
import peaksoft.model.Company;
import peaksoft.model.Student;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao ;

    @Override
    public void UpdateStudentsTable(long id, Student student) {
        studentDao.UpdateStudentsTable(id,student);
    }

    @Override
    public void saveStudents(Student student){
        studentDao.saveStudents(student);
    }

    @Override
    public void removeStudentsById(long id) {
        studentDao.removeStudentsById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
    @Override
    public Student getById(long id){
     return studentDao.getById(id);
    }
}
