package Assignment;

public class ContrustorPractice {
	
	String city;
	int Population;
	
	

	public ContrustorPractice(String city, int population) 
	{
		this.city = city;
		this.Population = population;
	}

	public static void execute() {
		System.out.println("method");
	}


	public static void main(String[] args) 
	{
		
		ContrustorPractice c=new ContrustorPractice("Mysore", 100);
		ContrustorPractice c1=new ContrustorPractice("blr", 300);
		
		System.out.println(c.city);
		System.out.println(c.Population);
		c.execute();
		c1.execute();
		System.out.println(c1.city);
	}

}
