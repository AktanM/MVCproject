package peaksoft.dao;

import org.springframework.stereotype.Repository;
import peaksoft.model.Course;
import peaksoft.model.Group;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;
@Transactional
@Repository
public class GroupDaoImpl implements GroupDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void UpdateGroupsTable(long id,Group group) {
    entityManager.merge(group);
    }

    @Override
    public void saveGroups(Group group){
    entityManager.persist(group);
    }

    @Override
    public void removeGroupsById(long id) {
    entityManager.remove(getById(id));
    }

    @Override
    public List<Group> getAllGroups() {
        return entityManager.createQuery("select gr from Group gr",Group.class).getResultList();
    }

    @Override
    public Group getById(long  id){
        return entityManager.find(Group.class,id);
    }
}
