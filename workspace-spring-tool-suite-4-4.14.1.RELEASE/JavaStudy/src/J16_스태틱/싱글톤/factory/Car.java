package J16_스태틱.싱글톤.factory;

public class Car {

	private int serialNaumber;
	private String company;
	private String model;
	
	public Car() {}

	public Car(int serialNaumber, String company, String model) {
		super();
		this.serialNaumber = serialNaumber;
		this.company = company;
		this.model = model;
	}

	public int getSerialNaumber() {
		return serialNaumber;
	}

	public void setSerialNaumber(int serialNaumber) {
		this.serialNaumber = serialNaumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [serialNaumber=" + serialNaumber + ", company=" + company + ", model=" + model + "]";
	}
	
	
}
