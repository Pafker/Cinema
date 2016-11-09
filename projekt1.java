
package Cwiczenie;


public class projekt1
{

	public static void main(String[] args)
	{
		 
				
		/*Punkt pkt1=new Punkt ();
		pkt1.setOdleglosc(6);
		pkt1.opis();
		Punkt pkt2=new Punkt ();
		pkt2.setPunkt(8,6);
		pkt2.setOdleglosc(6);
		pkt2.opis();
		pkt1.setMass(10);
		pkt1.opis();
		
		int tablicaMasy[] = {14, 4, 7, 10, 11};
		int tablicaPromienia[] = {5, 12, 8, 2, 10};
		int tablicaOdleglosci[] = {2, 8, 24, 5, 10};
		for (int i=0; i<5; i++)
		{
			pkt2.setMass(tablicaMasy[i]);
			pkt2.setPromien(tablicaPromienia[i]);
			pkt2.setOdleglosc(tablicaOdleglosci[i]);
			pkt2.opis();
		}*/
		
		Walec  walec1=new Walec();
		walec1.opis();
		
		Kula kula1=new Kula();
		kula1.opis();
		
		Pret pret1=new Pret();
		pret1.opis();
		System.out.println("");
		
		
		int tablicaMasy[] = {14, 4, 7};
		for (int i=0; i<3; i++)
		{
			walec1.setMass(tablicaMasy[i]);
			kula1.setMass(tablicaMasy[i]);
			pret1.setMass(tablicaMasy[i]);
			walec1.opis();
			kula1.opis();
			pret1.opis();
			System.out.println("");
		}

	}

}
