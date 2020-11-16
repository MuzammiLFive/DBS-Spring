
public class Car {
	private String type = "sedan";
	private int cost = 400000;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Car(String type, int cost) {
		super();
		this.type = type;
		this.cost = cost;
	}
}
