
public class Benz extends Car{
	private String name = "AMG";

	public Benz(String type, int cost, String name) {
		super(type, cost);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Benz [name=" + name + ", getName()=" + getName() + ", getType()=" + getType() + ", getCost()="
				+ getCost() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
