package peaksoft.service;

import peaksoft.model.Course;
import peaksoft.model.Group;

import java.sql.SQLException;
import java.util.List;

public interface GroupService {
    void UpdateGroupsTable(long id,Group group);

    void saveGroups(Group group);

    void removeGroupsById(long id);

    List<Group> getAllGroups();

    Group getById(long id);


}
