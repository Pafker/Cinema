package Cinema;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MojeOknoDwa extends JFrame implements ActionListener, ItemListener{
	
	private JButton bDalej;
	private JButton bWstecz;
	//Miejsca siedzace w kinie
	private JCheckBox m1, m2, m3, m4, m5, m6 ,m7, m8, m9, m10, m11 , m12, m13, m14, m15, m16, m17, m18, m19, m20;

	
	
	public MojeOknoDwa(){
		
		setSize(300,500);
		setTitle("Wybor miejsc");
		setResizable(false);
		setLayout(null);
		setLocation(200, 400);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		bDalej = new JButton("Dalej");
		bDalej.setBounds(160, 420, 80, 30);
		add(bDalej);
		bDalej.addActionListener(this);
		
		bWstecz = new JButton("Rezerwuj");
		bWstecz.setBounds(60, 420, 80, 30);
		add(bWstecz);
		bWstecz.addActionListener(this);
		
		m1 = new JCheckBox("1 1");
		m1.setBounds(10, 40, 60, 60);
		m1.setBackground(Color.GREEN);
		add(m1);
		m1.addActionListener(this);
		
		m2 = new JCheckBox("1 2");
		m2.setBounds(80, 40, 60, 60);
		m2.setBackground(Color.GREEN);
		add(m2);
		m2.addActionListener(this);
		
		m3 = new JCheckBox("1 3");
		m3.setBounds(150, 40, 60, 60);
		m3.setBackground(Color.GREEN);
		add(m3);
		m3.addActionListener(this);
		
		m4 = new JCheckBox("1 4");
		m4.setBounds(220, 40, 60, 60);
		m4.setBackground(Color.GREEN);
		add(m4);
		m4.addActionListener(this);
		
		m5 = new JCheckBox("2 1");
		m5.setBounds(10, 110, 60, 60);
		m5.setBackground(Color.GREEN);
		add(m5);
		m5.addActionListener(this);
		
		m6 = new JCheckBox("2 2");
		m6.setBounds(80, 110, 60, 60);
		m6.setBackground(Color.GREEN);
		add(m6);
		m6.addActionListener(this);
		
		m7 = new JCheckBox("2 3");
		m7.setBounds(150, 110, 60, 60);
		m7.setBackground(Color.GREEN);
		add(m7);
		m7.addActionListener(this);
		
		m8 = new JCheckBox("2 4");
		m8.setBounds(220, 110, 60, 60);
		m8.setBackground(Color.GREEN);
		add(m8);
		m8.addActionListener(this);
		
		m9 = new JCheckBox("3 1");
		m9.setBounds(10, 180, 60, 60);
		m9.setBackground(Color.GREEN);
		add(m9);
		m9.addActionListener(this);
		
		m10 = new JCheckBox("3 2");
		m10.setBounds(80, 180, 60, 60);
		m10.setBackground(Color.GREEN);
		add(m10);
		m10.addActionListener(this);
		
		m11 = new JCheckBox("3 3");
		m11.setBounds(150, 180, 60, 60);
		m11.setBackground(Color.GREEN);
		add(m11);
		m11.addActionListener(this);
		
		m12 = new JCheckBox("3 4");
		m12.setBounds(220, 180, 60, 60);
		m12.setBackground(Color.GREEN);
		add(m12);
		m12.addActionListener(this);
		
		m13 = new JCheckBox("4 1");
		m13.setBounds(10, 250, 60, 60);
		m13.setBackground(Color.GREEN);
		add(m13);
		m13.addActionListener(this);
		
		m14 = new JCheckBox("4 2");
		m14.setBounds(80, 250, 60, 60);
		m14.setBackground(Color.GREEN);
		add(m14);
		m14.addActionListener(this);
		
		m15 = new JCheckBox("4 3");
		m15.setBounds(150, 250, 60, 60);
		m15.setBackground(Color.GREEN);
		add(m15);
		m15.addActionListener(this);
		
		m16 = new JCheckBox("4 4");
		m16.setBounds(220, 250, 60, 60);
		m16.setBackground(Color.GREEN);
		add(m16);
		m16.addActionListener(this);
		
		m17 = new JCheckBox("5 1");
		m17.setBounds(10, 320, 60, 60);
		m17.setBackground(Color.GREEN);
		add(m17);
		m17.addActionListener(this);
		
		m18 = new JCheckBox("5 2");
		m18.setBounds(80, 320, 60, 60);
		m18.setBackground(Color.GREEN);
		add(m18);
		m18.addActionListener(this);
		
		m19 = new JCheckBox("5 3");
		m19.setBounds(150, 320, 60, 60);
		m19.setBackground(Color.GREEN);
		add(m19);
		m19.addActionListener(this);
		
		m20 = new JCheckBox("5 4");
		m20.setBounds(220, 320, 60, 60);
		m20.setBackground(Color.GREEN);
		add(m20);
		m20.addActionListener(this);
		m20.addItemListener(this);
		
				
		
	}


	
	public void actionPerformed(ActionEvent e) {
	
		Object zrodlo = e.getSource();
		if (zrodlo==bDalej)
		{
			System.out.println("Hej dwa");
			dispose();
			MojeOknoTrzy okienko3 = new MojeOknoTrzy();
			
		}
		
		Kino salka = new Kino();
		salka.otwarcieSali();
		JCheckBox[] miejsca = {m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20};
		int i;
		
		for (i=0; i<20; i++)
		{
		if (zrodlo==miejsca[i])
		{
			if (miejsca[i].isSelected()==true)
			{
				miejsca[i].setBackground(Color.BLUE);
				salka.rezerwacjaMiejsca(i);
			}
			else
			{
				miejsca[i].setBackground(Color.GREEN);
			}
		}
		}
		if (zrodlo==bWstecz)
		{
			System.out.println("Dokonaj rezerwacji");
			salka.opisKina();
		}
		
	}

	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
		
}
