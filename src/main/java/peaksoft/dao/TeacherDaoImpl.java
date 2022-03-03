package peaksoft.dao;

import org.springframework.stereotype.Repository;
import peaksoft.model.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;
@Transactional
@Repository
public class TeacherDaoImpl implements TeacherDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void UpdateTeachersTable(long id,Teacher teacher) {
    entityManager.merge(teacher);
    }

    @Override
    public void saveTeachers(Teacher teacher){
    entityManager.persist(teacher);
    }

    @Override
    public void removeTeachersById(long id) {
        entityManager.remove(getById(id));
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return entityManager.createQuery("select te from Teacher te",Teacher.class).getResultList();
    }

    @Override
    public Teacher getById(long id) {
        return entityManager.find(Teacher.class,id);
    }
}

