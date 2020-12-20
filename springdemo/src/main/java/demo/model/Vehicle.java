package demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	
	private int vehicleId;
	private String name;

	private Student student;
	
	
	public Vehicle()
	{
		
	}
	@ManyToOne()
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Id
	public int getVehicleId() {
		return vehicleId;
	}
	public Vehicle(int vehicleId, String name) {
		super();
		this.vehicleId = vehicleId;
		this.name = name;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return name;
	}

}
