import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
	private int studentId;
	private String studentName;
	private Set<Teacher> teachers = new HashSet<Teacher>(0);
	
	public Student() {}
	
	public Student(String studentName) {
		this.studentName = studentName;
	}
	
	public Student(String studentName, Set<Teacher> teachers) {
		this.studentName = studentName;
		this.teachers = teachers;
	}
	
	@Id
	@GeneratedValue
	@Column(name="STUDENT_ID")
	public int getStudentId() {
		return this.studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	@Column(name = "STUDENT_NAME", nullable = false, length = 100)
	public String getStudentName() {
		return this.studentName;
	}
	
	public void setStudentName (String studentName) {
		this.studentName = studentName;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_TEACHER", joinColumns = { @JoinColumn(name="STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "TEACHER_ID") })
	public Set<Teacher> getTeachers() {
		return this.teachers;
	}
	
	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
}
