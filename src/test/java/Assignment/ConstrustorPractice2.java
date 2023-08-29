package Assignment;

public class ConstrustorPractice2 {
	
	String city;
	int population;
	
	

	public ConstrustorPractice2(String city, int population) 
	{
		this.city = city;
		this.population = population;
	}

	public void method()
	{
		System.out.println("Method name");
	}

	public static void main(String[] args) 
	{
		ConstrustorPractice2 c=new ConstrustorPractice2("blg", 100);
		System.out.println(c.city);
		System.out.println(c.population);
		
		c.method();
		
	}

}
