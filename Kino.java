package Cinema;

public class Kino {
	
	private int Miejsce;
	
	String[] SalaKinowa = new String[21];
	
	public void otwarcieSali(){
		for (int k = 1; k < 21; k++){
			SalaKinowa[k]="wolne";
		}
	}
	
	public void rezerwacjaMiejsca(int m){
			
		SalaKinowa[m]="zajete";		
	}
		
	
	public String getMiejsce(int k) {
		return SalaKinowa[k];
	}



	public void opisKina(){
		for (int k = 1; k < 21; k++){
			System.out.println("Miejsce " + k +" jest " + SalaKinowa[k]);
		}		
	}
	
	

}
