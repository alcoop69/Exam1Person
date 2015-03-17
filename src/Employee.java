
public class Employee extends Person {
	
	private String office;
	private int salary;
	private MyDate date_hired;

	
	public Employee(){
	}
	
	public Employee(String office, int salary, MyDate date_hired){
		this.office = office;
		this.salary = salary;
		this.date_hired = date_hired;
	}
	
	public String getOffice(){
		return office;
	}
	
	public void setOffice(String office){
		this.office = office;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	public MyDate getDate_Hired(){
		return date_hired;
			
	}
}
