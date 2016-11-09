
package Cwiczenie;
//import java.util.Scanner;

class Punkt
{
	
	protected double m;
	protected double r;
	private double x;
	 
	 
	public Punkt()
	{
		 m=1;
		 r=0;
	}
	
	public Punkt(double masa, double promien)
	{
		m=masa;
		r=promien;
	}
	
	
	public void setPunkt(double masa, double promien)
	{
		 m=masa;
		 r=promien;
	}
	
	
	
	public void setPromien(double promien)
	{
		r=promien;
	}
	
	public double getPromien()
	{
		return r;
	}
	
	public void setOdleglosc(double odleglosc)
	{
		x=odleglosc;
	}
	
	public double getOdleglosc()
	{
		return x;
	}
	
	public void setMass(double masa)
	{
		m=masa;
	}
	
	public double getMass()
	{
		return m;
	}
	
	
	public double moment()
	{
		return m*r*r;
	}

	
	public double steiner(double x)
	{
		return m*r*r+m*x*x;
	}

	
	public void opis()
	{
		//Pobieranie odleglosci od osi obrotu z klawiatury
		//Scanner input = new Scanner (System.in);
		//System.out.println("Podaj odleglosc od osi obrotu"); 
		//int x=input.nextInt(); 
		//System.out.println("Odleglosc od osi obrotu to "+x);
		System.out.println("Masa punktu wynosi "+getMass()+" a promien "+getPromien()+" i jej g³ówny moment bezw³adnoœci wynosi "+moment());
		System.out.println("Odleglosc od osi obrotu to "+getOdleglosc());
		System.out.println("Moment bezw³adnoœci punktu wzglêdem nowej osi obrotu wynosi "+steiner(getOdleglosc()));
		System.out.println();
	}
	
}
