package peaksoft.dao;
import peaksoft.model.Teacher;
import java.util.List;

public interface TeacherDao {
    void UpdateTeachersTable(long id ,Teacher teacher);

    void saveTeachers(Teacher teacher);

    void removeTeachersById(long id);

    List<Teacher> getAllTeachers();

    Teacher getById(long id);

}
