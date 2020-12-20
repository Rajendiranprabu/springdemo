package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TravelService {
	
	public TravelService(Vehicle vh) {
		// TODO Auto-generated constructor stub
		this.vh=vh;
		System.out.println("Constructor");
	}
	
	private Vehicle vh;
	
	

	public Vehicle getVh() {
		return vh;
	}
	public void setVh(Vehicle vh) {
		this.vh = vh;
	}
	public  void startTravel()
	{
		vh.travel();
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		TravelService ts= (TravelService) context.getBean("ts");
		
		TravelService ts2= (TravelService) context.getBean("ts");
		ts.startTravel();
		
	}

}
