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
	
	public double getMass()
	{
		return m;
	}
	
	public void setPromienWalca(double promien)
	{
		r=promien;
	}
	
	public double getPromienWalca()
	{
		return r;
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
		return m*r*r*0.5;
	}
	
	
	public double steiner(double x)
	{
		return m*r*r*0.5 + m*x*x;
		
	}
	
	public void opis()
	{
		System.out.println("Walec o masie " + getMass()+ " i promieniu " + getPromienWalca());
		System.out.println("Moment bezwladnosci tego walca wynosi " + moment());
		
		
	}
	
	public void opisSteiner()
	{
		System.out.println("Nowa os obrotu jest oddalona o " + x + " a moment bezwladnosci bryly wzgledem tej osi wynosi " + steiner(x));
	}
	
	
	
}
