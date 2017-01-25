package Cinema;

public class Film {

	private String nazwaFilmu;
	private float cenaFilmu;
	private double godzinaSeansu;

	public String getNazwaFilmu(int numer) {
		String[] nazwaFilmu = new String[5];
		nazwaFilmu[0] = "Alicja w Krainie Czarow";
		nazwaFilmu[1] = "Hobbit";
		nazwaFilmu[2] = "Muminki";
		nazwaFilmu[3] = "Piotrus Pan";
		nazwaFilmu[4] = "Smerfy";

		return nazwaFilmu[numer];
	}

	public float getCenaFilmu(int iloscUlg, int iloscNorm) {
		int biletUlgowy = 15;
		int biletNormalny = 20;
		cenaFilmu = iloscUlg * biletUlgowy + iloscNorm * biletNormalny;
		return cenaFilmu;
	}

	public String getGodzinaSeansu(int wybor) {
		String[] godzinaSeansu = new String[4];
		godzinaSeansu[0] = "10:00";
		godzinaSeansu[1] = "12:00";
		godzinaSeansu[2] = "14:30";
		godzinaSeansu[3] = "16:00";
		return godzinaSeansu[wybor];
	}

}
