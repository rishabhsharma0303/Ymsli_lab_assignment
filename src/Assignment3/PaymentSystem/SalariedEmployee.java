package Assignment3.PaymentSystem;

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


	@Override
	public double getPayment() {
		System.out.println("-----Commision Employee-----");
		super.display();
		return earning();
	}

}
