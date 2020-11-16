import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEACHER")
public class Teacher {
	private int teacherId;
	private String teacherName;
	
	public Teacher() {}
	
	public Teacher(String teacherName) {
		this.teacherName = teacherName;
	}
	
	@Id
	@GeneratedValue
	@Column(name="TEACHER_ID")
	public int getTeacherId() {
		return this.teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	@Column(name="TEACHER_NAME", nullable=false)
	public String getTeacherName() {
		return this.teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
}
