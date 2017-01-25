package Cinema;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MojeOknoTrzy extends JFrame implements ActionListener {

	private JButton bDalej;
	private JButton bWstecz;
	JTextField tImieINazwisko;
	JTextField tNumerTelefonu;
	JTextField tAdresEmail;
	JLabel lImieInazwisko;
	JLabel lNumerTelefonu;
	JLabel lAdresEmail;
	static DaneOsobowe dane = new DaneOsobowe();

	public MojeOknoTrzy() {

		setSize(300, 500);
		setTitle("Dane koncowe");
		setResizable(false);
		setLayout(null);
		setLocation(200, 400);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		bDalej = new JButton("Dalej");
		bDalej.setBounds(160, 420, 80, 30);
		add(bDalej);
		bDalej.addActionListener(this);

		bWstecz = new JButton("Wstecz");
		bWstecz.setBounds(60, 420, 80, 30);
		add(bWstecz);
		bWstecz.addActionListener(this);

		tImieINazwisko = new JTextField("");
		;
		tImieINazwisko.setBounds(20, 90, 250, 30);
		add(tImieINazwisko);

		tNumerTelefonu = new JTextField("");
		;
		tNumerTelefonu.setBounds(20, 150, 250, 30);
		add(tNumerTelefonu);

		tAdresEmail = new JTextField("");
		;
		tAdresEmail.setBounds(20, 210, 250, 30);
		add(tAdresEmail);

		lImieInazwisko = new JLabel("Podaj swoje imie i nazwisko");
		lImieInazwisko.setBounds(20, 60, 250, 30);
		add(lImieInazwisko);

		lNumerTelefonu = new JLabel("Podaj swoj numer telefonu");
		lNumerTelefonu.setBounds(20, 120, 250, 30);
		add(lNumerTelefonu);

		lAdresEmail = new JLabel("Podaj swoj adres email");
		lAdresEmail.setBounds(20, 180, 250, 30);
		add(lAdresEmail);

	}

	public void actionPerformed(ActionEvent e) {

		Object zrodlo = e.getSource();
		if (zrodlo == bDalej) {
			System.out.println("Hej trzy");
			pobranieDanych();
			try(FileWriter fw = new FileWriter("Bilet.txt", true);
				    BufferedWriter bw = new BufferedWriter(fw);
				    PrintWriter out = new PrintWriter(bw))
				{
				    out.println("Imie i nazwisko: "+drukujFilm(1));
				    out.println("Numer telefonu: "+drukujFilm(2));
				    out.println("Adres email: "+drukujFilm(3));
				    
				} catch (IOException x) {
				    //exception handling left as an exercise for the reader
				}
			dispose();

		} else if (zrodlo == bWstecz) {
			System.out.println("Hej trzy wstecz");
			dispose();
			MojeOknoDwa okienko2 = new MojeOknoDwa();
		}
	}
	
	public void pobranieDanych(){
		dane.setDane(tImieINazwisko.getText(), 1);
		dane.setDane(tNumerTelefonu.getText(), 2);
		dane.setDane(tAdresEmail.getText(), 3);
	} 
	
	public static String drukujFilm(int k){
		return dane.getDane(k);
		
	}

}
