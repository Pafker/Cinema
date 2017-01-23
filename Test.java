package Cinema;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		
		int i = 2;
		//Tworze obiekt filmik klasy Film
		Film filmik = new Film();
		filmik.getNazwaFilmu(i);
		System.out.println("Film "+filmik.getNazwaFilmu(i));
		
		
		filmik.getGodzinaSeansu(i);
		
		
		System.out.println("Godzina seansu: " + filmik.getGodzinaSeansu(i));
		
		Kino salka = new Kino();
		salka.otwarcieSali();
		salka.rezerwacjaMiejsca(4);
		salka.rezerwacjaMiejsca(2);
		salka.rezerwacjaMiejsca(7);
		salka.opisKina();
		
		System.out.println("Ktore miejsce chcesz zarezerwowac?");
		Scanner input = new Scanner (System.in);
		int Miejsce=input.nextInt();
		salka.rezerwacjaMiejsca(Miejsce);
		salka.opisKina();
		input.close();
		
		
		filmik.getCenaFilmu(1, 0);
		
		Double d = new Double(filmik.getCenaFilmu(1, 0)); //tworzê obiekt d i ustawiam wartoœæ
		java.text.DecimalFormat decf=new java.text.DecimalFormat(); //tworzymy obiekt DecimalFormat
		decf.setMaximumFractionDigits(2); //dla df ustawiamy najwiêksz¹ iloœæ miejsc po przecinku
		decf.setMinimumFractionDigits(2); //dla df ustawiamy najmniejsz¹ iloœæ miejsc po przecinku
	
		System.out.println("Do zaplaty: "+decf.format(filmik.getCenaFilmu(1, 0))+"z³");
		
		PrintWriter zapis = new PrintWriter("Bilet.txt");
	      zapis.println("Film "+filmik.getNazwaFilmu(i));
	      zapis.println("Godzina seansu: " + filmik.getGodzinaSeansu(i));
	      zapis.println("Do zaplaty: "+decf.format(filmik.getCenaFilmu(1, 0))+"z³");
	      zapis.close();

	};

}
