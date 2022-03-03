package peaksoft.model;

import javax.persistence.*;

@Entity
@Table (name = "students")
public class Student {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String email;
    @Column
    private String lastName;
    @Column
    StudyFormate studyFormate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id",nullable = false)
    private Group group;
    @OneToOne(mappedBy = "student")
    private Teacher teacher;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student(String firstName, String email, String lastName, StudyFormate studyFormate) {
        this.firstName = firstName;
        this.email = email;
        this.lastName = lastName;
        this.studyFormate = studyFormate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public StudyFormate getStudyFormate() {
        return studyFormate;
    }

    public void setStudyFormate(StudyFormate studyFormate) {
        this.studyFormate = studyFormate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public enum StudyFormate{
        ONLINE,OFFLINE
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studyFormate=" + studyFormate +
                '}';
    }
}
