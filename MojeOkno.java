package Cinema;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class MojeOkno extends JFrame implements ActionListener
{

	private JButton bDalej; 
	private JLabel lPowitanie;
	private static JComboBox comboFilm;
	private static JComboBox comboGodzina;
	private JCheckBox m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20;
	static Bilet bilet = new Bilet();
	
	public MojeOkno()
	{
		setSize(300,500);
		setTitle("Kino Pajka");
		setLocation(200, 400);
		setResizable(false);
		setLayout(null);
		
		bDalej = new JButton("Dalej");
		bDalej.setBounds(160, 420, 80, 30);
		add(bDalej);
		bDalej.addActionListener(this);
		
		
		
		lPowitanie = new JLabel("System rezerwacji miejsc w kinie");
		lPowitanie.setBounds(20, 10, 250, 30);
		lPowitanie.setForeground(Color.RED);
		lPowitanie.setFont(new Font("SansSerif",Font.BOLD,16));
		add(lPowitanie);
		
			
	
		Film filmik = new Film();
		
		comboFilm = new JComboBox();
		comboFilm.setBounds(20, 150, 250, 30);
		for (int i=0; i<5; i++)
		{
		comboFilm.addItem(filmik.getNazwaFilmu(i));
		}
		add(comboFilm);
		
		comboGodzina = new JComboBox();
		comboGodzina.setBounds(20, 190, 250, 30);
		for (int i=0; i<4; i++)
		{
		comboGodzina.addItem(filmik.getGodzinaSeansu(i));
		}
		add(comboGodzina);
		
		
		
		
				
	}
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		MojeOkno okienko = new MojeOkno();
		
		okienko.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		okienko.setVisible(true);
		
		//Pobiera zla dana
		PrintWriter zapis = new PrintWriter("Bilet.txt");
		zapis.println("Film " + drukujFilm(1));
		zapis.println("Godzina "+comboGodzina.getSelectedItem());
		zapis.close();
		

}

	
	
	public void actionPerformed(ActionEvent e)
	{
		Object zrodlo = e.getSource();
		if (zrodlo==bDalej)
		{
			System.out.println("Lecim"+bilet.getDane(1));
			dispose();
			pobranieFilmu(comboFilm.getSelectedIndex());
			PrintWriter zapis;
			try {
				zapis = new PrintWriter("Bilet.txt");
				zapis.println("Film " + drukujFilm(1));
				zapis.println("Godzina "+comboGodzina.getSelectedItem());
				zapis.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			new MojeOknoDwa();			
		}
	}

	public void pobranieFilmu(int k){
		bilet.setDane((String) comboFilm.getSelectedItem(), 1);
	} 
	
	public static String drukujFilm(int k){
		return bilet.getDane(k);
		
	}
	
	}



