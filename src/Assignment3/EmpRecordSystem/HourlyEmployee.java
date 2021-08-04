package Assignment3.EmpRecordSystem;

public class HourlyEmployee extends Employee {

	private double hourlyRate;
	private int totalHours;
	
	public HourlyEmployee(double hourlyRate, int totalHours, String firstName, String lastName, int ein) {
		super(firstName, lastName, ein);
		this.hourlyRate = hourlyRate;
		this.totalHours = totalHours;
	}
	
	
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
		System.out.println("Rate chaged!");

	}


	@Override
	public double earning() {
		return (double)(totalHours * hourlyRate);
	}
	
	@Override
	public void display() {
		System.out.println("-----Hourly Employee-----");
		super.display();
		System.out.println(" Weekly Salary: " + earning());
	}
}
