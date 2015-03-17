
public class Person {

	private String name;
	private String address;
	private int phone_number;
	private String email_address;
	
	public Person(String name, String address, int phone_number, String email_address){
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
		this.email_address = email_address;
	}
	
	public Person(){
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public int getPhone_Number(){
		return phone_number;
	}
	
	public void setPhone_Number(int phone_number){
		this.phone_number = phone_number;
	}
	
	public String getEmail_Address(){
		return address;
	}
	
	public void setEmail_Address(String email_address){
		this.email_address = email_address;
	}
}
	
	/**
	@Override
	public String toString(){
		
	**/

