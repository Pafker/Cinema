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
	
	public double getMass()
	{
		return m;
	}
	
	public void setPromienKuli(double promien)
	{
		r=promien;
	}
	
	public double getPromienKuli()
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
		return m*r*r*0.4;
	}
	
	public double steiner(double x)
	{
		return m*r*r*0.4 + m*x*x;
	}
	
	
	public void opis()
	{
	
		System.out.println("Kula o masie "+getMass()+" i promieniu "+getPromienKuli());
		System.out.println("Moment bezwladnosci tej kuli wynosi "+moment());
	}
	
	public void opisSteiner()
	{
		System.out.println("Nowa os obrotu jest oddalona o " +x+ " a moment bezwladnosci bryly wzgledem tej osi wynosi " + steiner(x));
	}
	

}
