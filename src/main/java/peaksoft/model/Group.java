package peaksoft.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "groups")
public class Group {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String groupName;
    @Column int dateOfStart;
    @Column int dateOfFinish;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "company_id",nullable = false)
//    private Company company;

      @ManyToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "course_id",nullable = false)
      private Course course;

      @OneToMany(mappedBy = "group")
      private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id",nullable = false)
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(int dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public int getDateOfFinish() {
        return dateOfFinish;
    }

    public void setDateOfFinish(int dateOfFinish) {
        this.dateOfFinish = dateOfFinish;
    }


    public Group(String groupName, int dateOfStart, int dateOfFinish) {
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Group() {
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
