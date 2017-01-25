package Cinema;

public class Kino2 {

	private String s;
	String[] sala = new String[21];
	
	public Kino2(){
		for (int i = 0; i < 20; i++){
			sala[i]="wolne";
		}
	}
	
	public void setMiejsce(String status, int k){
		s=status;
		sala[k]=s;
	}
	
	public String getMiejsce(int k){
		return sala[k];
	}
}
