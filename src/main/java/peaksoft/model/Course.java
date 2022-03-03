package peaksoft.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Column
    private String courseName;
    @Column
    private String durationMonth;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id",nullable = false)
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    @OneToMany(mappedBy = "course")
    private List<Group>groups;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public Course(String courseName, String durationMonth){
        this.courseName = courseName;
        this.durationMonth = durationMonth;
    }

    public String getDurationMonth() {
        return durationMonth;
    }

    public void setDurationMonth(String durationMonth) {
        this.durationMonth = durationMonth;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getId() {
        return id;
    }

    public Course() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
