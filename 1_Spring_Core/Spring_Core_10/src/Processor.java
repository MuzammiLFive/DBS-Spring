
public class Processor {
	private String architecture;
	private String model;
	private int size;
	public Processor() {
		super();
	}
	public Processor(String architecture, String model, int size) {
		super();
		this.architecture = architecture;
		this.model = model;
		this.size = size;
	}
	public String getArchitecture() {
		return architecture;
	}
	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Processor [architecture=" + architecture + ", model=" + model + ", size=" + size + "]";
	}
}
