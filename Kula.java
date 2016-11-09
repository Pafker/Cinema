package Cwiczenie;

public class Kula extends Punkt {
	
	public Kula()
	{
		super();
		r=10;
	}
	
	
	public Kula(double m, double r)
	{
		super(m,r);
	}
	
	public double getMasa()
	{
		return m;
	}
	
	public double getPromienKuli()
	{
		return r;
	}
	
	public void setMass(double masa)
	{
		m=masa;
	}
	
	public double moment()
	{
		return m*r*r*0.4;
	}
	
	public void opis()
	{
	
		System.out.println("Kula o masie "+getMasa()+" i promieniu "+getPromienKuli());
		System.out.println("Moment bezwladnosci tej kuli wynosi "+moment());
	}

}
