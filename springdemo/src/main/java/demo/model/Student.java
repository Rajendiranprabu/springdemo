package demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	
	private int studentId;
	
	
	private String name;
	private String last_name;
	
	
	private Passport passport;
	
	private List<Vehicle> vehicle=new ArrayList<Vehicle>();
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "student" ,fetch = FetchType.EAGER) 
	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	@OneToOne(cascade = CascadeType.ALL)
	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public Student()
	{
		
	}
	
	public Student(int studentId, String name, String last_name) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.last_name = last_name;
	}
	@Id
	@GeneratedValue               
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Column(name="first_name" )
	public String getName() {
		return name ;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	

}
