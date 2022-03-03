package peaksoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.dao.GroupDao;
import peaksoft.dao.GroupDaoImpl;
import peaksoft.model.Course;
import peaksoft.model.Group;

import javax.persistence.Access;
import java.sql.SQLException;
import java.util.List;
@Service
public class GroupServiceImpl implements GroupService{
    @Autowired
    private GroupDao groupDao;

    @Override
    public void UpdateGroupsTable(long id,Group group) {
        groupDao.UpdateGroupsTable(id,group);
    }

    @Override
    public void saveGroups(Group group){
        groupDao.saveGroups(group);
    }

    @Override
    public void removeGroupsById(long id) {
        groupDao.removeGroupsById(id);
    }

    @Override
    public List<Group> getAllGroups() {
        return groupDao.getAllGroups();
    }
    @Override
    public Group getById(long id){
        return groupDao.getById(id);
    }
}
