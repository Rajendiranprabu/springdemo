package springdemo;

public class Car implements Vehicle {

	private int regNo;
	private String carName;
	
	public Car()
	{
		
	}
	
	public Car(String str,String str2)
	{
		
	}
	public Car(int regNo, String carName) {
		super();
		this.regNo = regNo;
		this.carName = carName;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void travel()
	{
		System.out.println("Travelling by Car");
	}
	
	public String toString()
	{
		return this.carName;
	}
}
