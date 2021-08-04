package Assignment3.EmpRecordSystem;

public class SalariedEmployee extends Employee {

private double rate;
	
	public SalariedEmployee(double rate, String firstName, String lastName, int ein) {
		super(firstName, lastName, ein);
		this.rate = rate;
	}
	

	public void setRate(double rate) {
		this.rate = rate;
		System.out.println("Rate chaged!");

	}


	public double weeklySalary() {
		return rate * 8 * 7;
	}
	
	@Override
	public double earning() {
		return weeklySalary();
	}
	
	@Override
	public void display() {
		System.out.println("-----Salary Employee-----");
		super.display();
		System.out.println(" Weekly Salary: " + earning());
	}

}
