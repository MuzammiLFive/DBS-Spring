
public class System1 {
	private String name;
	private String gpu;
	private int ram;
	private String motherboard;
	private Processor cpu;
	
	public System1() {
		super();
	}
	public System1(String name, Processor cpu, String gpu, int ram, String motherboard) {
		super();
		this.name = name;
		this.cpu = cpu;
		this.gpu = gpu;
		this.ram = ram;
		this.motherboard = motherboard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getMotherboard() {
		return motherboard;
	}
	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}
	public Processor getCpu() {
		return cpu;
	}
	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}
	@Override
	public String toString() {
		return "System [name=" + name + ", gpu=" + gpu + ", ram=" + ram + ", motherboard=" + motherboard + ", cpu="
				+ cpu.toString() + "]";
	}
	
}
