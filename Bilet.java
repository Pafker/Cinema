package Cinema;

public class Bilet {

	private String d;
	String[] bilet = new String[3];
	
	public Bilet(){
		for (int i = 0; i < 2; i++){
			bilet[i]="";
		}
	}
	
	public void setDane(String dane, int k){
		d=dane;
		bilet[k]=d;
	}
	
	public String getDane(int k){
		return bilet[k];
	}
	
}
