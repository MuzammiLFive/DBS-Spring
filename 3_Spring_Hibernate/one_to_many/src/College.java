import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="college")
public class College {
	@Id
	@Column(name="code")
	private String code;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="CLGSTU", joinColumns = { @JoinColumn(name="code") }, inverseJoinColumns = { @JoinColumn( name = "pin" ) }  )
	private Set<Student> std = new HashSet<Student>();
	
	College() {}

	public College(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public College(String code, String name, Set<Student> std) {
		super();
		this.code = code;
		this.name = name;
		this.std = std;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getStd() {
		return std;
	}

	public void setStd(Set<Student> std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "College [code=" + code + ", name=" + name + ", std=" + std + "]";
	}
	
}
