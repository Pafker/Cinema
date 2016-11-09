package Cwiczenie;

public class Walec extends Punkt {

	
	public Walec()
	{
		super();
		r=10;
	}
	
	
	public Walec(double m, double r)
	{
		super(m,r);
	}
	
	public double getMasa()
	{
		return m;
	}
	
	public double getPromienWalca()
	{
		return r;
	}
	
	public void setMass(double masa)
	{
		m=masa;
	}
	
	public double moment()
	{
		return m*r*r*0.5;
	}
	
	public void opis()
	{
		
		System.out.println("Walec o masie "+getMasa()+" i promieniu "+getPromienWalca());
		System.out.println("Moment bezwladnosci tego walca wynosi "+moment());
	}
	
	
	
}
