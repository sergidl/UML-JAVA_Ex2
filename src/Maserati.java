
public class Maserati extends Car {
	private String designer;
	private String productionYears;
	
	public Maserati(String color, int maxSpeed, String designer, String productionYears) {
		super(color, maxSpeed);
		setDesigner(designer);
		setProductionYears(productionYears);        
	}


	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
	}

	public String getProductionYears() {
		return productionYears;
	}
	public void setProductionYears(String productionYears) {
		this.productionYears = productionYears;
	}
	

	public void MaseratiStartDemo() {
		System.out.println("Overview: Design= " + getDesigner() + ", Production years= " + getProductionYears());
		CarInfo();
		enginStart("Maserati");

	}

}
