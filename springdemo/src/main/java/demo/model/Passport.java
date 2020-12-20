package demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {
	

	private int passId;
	private String name;
	private Student student;
	
	@OneToOne(mappedBy = "passport")
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Passport()
	{
		
	}
	public Passport(int passId, String name) {
		super();
		this.passId = passId;
		this.name = name;
	}
	
	@Id
	public int getPassId() {
		return passId;
	}
	public void setPassId(int passId) {
		this.passId = passId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
