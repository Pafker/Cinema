package Cinema;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MojeOknoTrzy extends JFrame implements ActionListener{
	
	private JButton bDalej;
	private JButton bWstecz;
	JTextField tImieINazwisko;
	JTextField tNumerTelefonu;
	JTextField tAdresEmail;
	
	
	public MojeOknoTrzy(){
		
		setSize(300,500);
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
		
		tImieINazwisko = new JTextField("");;
		tImieINazwisko.setBounds(20, 90, 250, 30);
		add(tImieINazwisko);
		
		tNumerTelefonu = new JTextField("");;
		tNumerTelefonu.setBounds(20, 150, 250, 30);
		add(tNumerTelefonu);
		
		tAdresEmail = new JTextField("");;
		tAdresEmail.setBounds(20, 210, 250, 30);
		add(tAdresEmail);
		
		
		
		
	}


	
	public void actionPerformed(ActionEvent e) {
	
		Object zrodlo = e.getSource();
		if (zrodlo==bDalej)
		{
			System.out.println("Hej trzy");
			dispose();
			
			
		}
		else if (zrodlo==bWstecz)
		{
			System.out.println("Hej trzy wstecz");
			dispose();
			MojeOknoDwa okienko2 = new MojeOknoDwa();
		}
	}
		
}
