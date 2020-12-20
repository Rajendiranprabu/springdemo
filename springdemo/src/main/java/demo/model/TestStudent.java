package demo.model;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config=new Configuration();
		Session session=config.configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	/*	Student student=new Student(103,"Rajesh","Kannan");
		
		Passport ps=new Passport(1003,"Rajesh");
		student.setPassport(ps);
		
		ps.setStudent(student);
		
		
		session.persist(student);
		//session.save(ps);
		
		Vehicle vh=new Vehicle(5001,"Xcent");
		Vehicle vh2=new Vehicle(5002,"RE");
		
		student.getVehicle().add(vh);
		student.getVehicle().add(vh2);
		
		vh.setStudent(student);
		vh2.setStudent(student);*/
		
		session.beginTransaction();
		//Student st=session.get(Student.class,103);
		
		Query query=session.createQuery("from Student");
		
		List<Student> l=query.getResultList();
		
		for(Student st:l)
		{
		System.out.println(st.getName());
		//System.out.println(st.getPassport().getPassId());
		}
		
		//Passport pst=session.get(Passport.class, 1003);
		
		
		//System.out.println(pst.getStudent().getLast_name());
		
		System.out.println("_________________________________");
	//	System.out.println(st.getVehicle());
		
		session.getTransaction().commit();
		
	}

}
