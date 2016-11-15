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
	
	public double getMass()
	{
		return m;
	}
	
	public double getDlugoscPreta()
	{
		return 2*r;
	}
	
	public void setDlugoscPreta(double promien)
	{
		r=promien;
	}
	
	public void setMass(double masa)
	{
		m=masa;
	}
	
	public void setOdleglosc(double odleglosc)
	{
		x=odleglosc;
	}
	
	public double getOdleglosc()
	{
		return x;
	}
	
	public double moment()
	{
		return (m*r*r)/6;
	}
	
	public double steiner(double x)
	{
		return (m*r*r)/6 + m*x*x;
	}
	
	public void opis()
	{
		System.out.println("Pret o masie "+getMass()+" i dlugosci "+getDlugoscPreta());
		System.out.println("Moment bezwladnosci tego preta wynosi "+moment());
	}
	
	public void opisSteiner()
	{
		System.out.println("Nowa os obrotu jest oddalona o " +x+ " a moment bezwladnosci bryly wzgledem tej osi wynosi " + steiner(x));
	}
	

}
