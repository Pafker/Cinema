package Cwiczenie;

public class Pret extends Punkt {
	
	public Pret()
	{
		super();
		r=10;
	}
	
	
	public Pret(double m, double r)
	{
		super(m,r);
	}
	
	public double getMasa()
	{
		return m;
	}
	
	public double getDlugoscPreta()
	{
		return 2*r;
	}
	
	public void setMass(double masa)
	{
		m=masa;
	}
	
	public double moment()
	{
		return (m*r*r)/6;
	}
	
	public void opis()
	{
		System.out.println("Pret o masie "+getMasa()+" i dlugosci "+getDlugoscPreta());
		System.out.println("Moment bezwladnosci tego preta wynosi "+moment());
	}

}
