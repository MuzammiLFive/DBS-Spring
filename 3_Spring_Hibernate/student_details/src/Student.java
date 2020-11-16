import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int rollNo;
	
	private String name;
	private int standard;
	private String section;
	
	@OneToOne(targetEntity=Address.class, cascade = CascadeType.ALL)
	private Address address;
	
	public Student() {}

	public Student(int rollNo, String name, int standard, String section) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.standard = standard;
		this.section = section;
	}

	public Student(int rollNo, String name, int standard, String section, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.standard = standard;
		this.section = section;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
