package peaksoft.model;

import javax.persistence.*;

@Entity
@Table (name = "teachers")
public class Teacher {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String firstName;
    @Column
    private String email;
    @Column
    private String lastName;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "company_id",nullable = false)
//    private Company company;
//
//    public Company getCompany() {
//        return company;
//    }
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id",nullable = false)
    private Student student;
    @OneToOne(mappedBy = "teacher")
    private Group group;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Teacher(String firstName, String email, String lastName) {
        this.firstName = firstName;
        this.email = email;
        this.lastName = lastName;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
