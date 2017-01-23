package Cinema;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MojeOkno extends JFrame implements ActionListener
{

	JButton bDalej; 
	JButton bWstecz;
	JLabel lPowitanie;
	JLabel lOsobowe;
	JLabel lSiemanko;
	JLabel lOsoba;
	JTextField tOsobowe;
	JComboBox comboFilm;
	JComboBox comboGodzina;
	
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
		
		bWstecz = new JButton("Powitanie");
		bWstecz.setBounds(60, 420, 80, 30);
		add(bWstecz);
		bWstecz.addActionListener(this);
		
		lPowitanie = new JLabel("System rezerwacji miejsc w kinie");
		lPowitanie.setBounds(20, 10, 250, 30);
		lPowitanie.setForeground(Color.RED);
		lPowitanie.setFont(new Font("SansSerif",Font.BOLD,16));
		add(lPowitanie);
		
		lOsobowe = new JLabel("Podaj swoje imie i nazwisko");
		lOsobowe.setBounds(20, 50, 250, 30);
		add(lOsobowe);
		
		tOsobowe = new JTextField("");;
		tOsobowe.setBounds(20, 90, 250, 30);
		add(tOsobowe);
		
		lSiemanko = new JLabel("Dzieñ dobry ");
		lSiemanko.setBounds(20, 120, 250, 30);
		add(lSiemanko);
		
		lOsoba = new JLabel("");;
		lOsoba.setBounds(100, 120, 100, 30);
		add(lOsoba);
		
	
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
	
	
	
	
	public static void main(String[] args) {
		
		
		MojeOkno okienko = new MojeOkno();
		
		okienko.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		okienko.setVisible(true);
		

}

	
	
	public void actionPerformed(ActionEvent e)
	{
		Object zrodlo = e.getSource();
		if (zrodlo==bDalej)
		{
			System.out.println("Lecim");
			dispose();
			MojeOknoDwa okienko2 = new MojeOknoDwa();
			
		}
		else if (zrodlo==bWstecz)
		{
			String pseudonim=tOsobowe.getText();
			lOsoba.setText(pseudonim);
		}
	}
}
