package peaksoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import peaksoft.service.GroupServiceImpl;

//@Controller
public class GroupController {
    private final GroupServiceImpl groupService;
    @Autowired
    public GroupController(GroupServiceImpl groupService) {
        this.groupService = groupService;
    }
}
