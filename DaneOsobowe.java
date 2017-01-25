package Cinema;

public class DaneOsobowe {

	private String d;
	String[] dane = new String[4];
	
	public DaneOsobowe(){
		for (int i = 0; i < 3; i++){
			dane[i]="";
		}
	}
	
	public void setDane(String daneosobowe, int k){
		d=daneosobowe;
		dane[k]=d;
	}
	
	public String getDane(int k){
		return dane[k];
	}
	
}