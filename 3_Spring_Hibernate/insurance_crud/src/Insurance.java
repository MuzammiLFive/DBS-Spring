import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Insurance")
public class Insurance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int policyNo;
	
	private String name;
	private int tenure;
	private int due;
	
	public Insurance() {}

	public Insurance(int policyNo, String name, int tenure, int due) {
		super();
		this.policyNo = policyNo;
		this.name = name;
		this.tenure = tenure;
		this.due = due;
	}

	public int getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getDue() {
		return due;
	}

	public void setDue(int due) {
		this.due = due;
	}
	
	
}
