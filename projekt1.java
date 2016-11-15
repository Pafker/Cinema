
package Cwiczenie;

/**
 * To program realizowany podczas zajec laboratorynych
 * Patryk Pawlos
 * AGH
 */

import java.util.Scanner;
public class projekt1
{

	public static void main(String[] args)
	{
		 
		//Klasa testowa do 1 zajec laboratoryjnych		
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
		
		
		
		/*//Klasa testowa do 2 zajec laboratoryjnych
		Walec  walec1=new Walec();
		walec1.opis();
		
		Kula kula1=new Kula();
		kula1.opis();
		
		Pret pret1=new Pret();
		pret1.opis();
		System.out.println("");
		
		walec1.setOdleglosc(5);
		kula1.setOdleglosc(5);
		pret1.setOdleglosc(5);
		
				
		
		int tablicaMasy[] = {14, 4, 7};
		for (int i=0; i<3; i++)
		{
			walec1.setMass(tablicaMasy[i]);
			kula1.setMass(tablicaMasy[i]);
			pret1.setMass(tablicaMasy[i]);
			walec1.opis();
			walec1.opisSteiner();
			kula1.opis();
			kula1.opisSteiner();
			pret1.opis();
			pret1.opisSteiner();
			System.out.println("");
		}*/
		
		//Zadanie dodatkowe do 2 zajec laboratoryjnych
		
		System.out.println("Program obliczajacy momenty bezwladnosci");
		System.out.println("Podaj bry³e (Walec/Kula/Pret) lub Koniec"); 
		
		
		while(true)		
				
		{
			Scanner input = new Scanner (System.in);
			String wybor=input.nextLine(); 
			
			if (wybor.equals("Walec"))
			{
				System.out.println("Wybrano walec. Podaj mase i promien");
				Walec  walec1=new Walec();
				int masa=input.nextInt();
				walec1.setMass(masa);
				int promien=input.nextInt();
				walec1.setPromienWalca(promien);
				walec1.opis();
				System.out.println("Podaj odleglosc od nowej osi obrotu");
				int odleglosc=input.nextInt();
				walec1.setOdleglosc(odleglosc);
				walec1.opisSteiner();
				System.out.println("Koniec obliczen. Wybierz nowa bryle lub koniec");
				continue;
			}
		
			else if (wybor.equals("Kula"))
			{
				System.out.println("Wybrano kule. Podaj mase i promien");
				Kula  kula1=new Kula();
				int masa=input.nextInt();
				kula1.setMass(masa);
				int promien=input.nextInt();
				kula1.setPromienKuli(promien);
				kula1.opis();
				System.out.println("Podaj odleglosc od nowej osi obrotu");
				int odleglosc=input.nextInt();
				kula1.setOdleglosc(odleglosc);
				kula1.opisSteiner();
				System.out.println("Koniec obliczen. Wybierz nowa bryle lub koniec");
				continue;
			
			}
		
			else if (wybor.equals("Pret"))
			{
				System.out.println("Wybrano pret. Podaj mase i promien");
				Pret  pret1=new Pret();
				int masa=input.nextInt();
				pret1.setMass(masa);
				int promien=input.nextInt();
				pret1.setDlugoscPreta(promien);
				pret1.opis();
				System.out.println("Podaj odleglosc od nowej osi obrotu");
				int odleglosc=input.nextInt();
				pret1.setOdleglosc(odleglosc);
				pret1.opisSteiner();
				System.out.println("Koniec obliczen. Wybierz nowa bryle lub koniec");
				continue;
			
			}
			else 
			{
				System.out.println("Koniec programu");
				break;
			}	
		
		}
		
		
		
			

		

	}

}
