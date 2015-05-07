import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Demo extends JFrame{
	
	ImageIcon lbdisco0 = new ImageIcon("practica2/disco0.png");
	ImageIcon lbdisco1 = new ImageIcon("practica2/disco1.png");
	ImageIcon lbdisco2 = new ImageIcon("practica2/disco2.png");
	ImageIcon lbdisco3 = new ImageIcon("practica2/disco3.png");
	ImageIcon lbdisco4 = new ImageIcon("practica2/disco4.png");

	
	
	JLabel disco0 = null;
	JLabel disco1 = null;
	JLabel disco2 = null;
	JLabel disco3 = null;
	JLabel disco4 = null;
	
	
	public Demo(){
		botones();
	}
	
	public void demo(){
		//GENERANDO VENTANA
		setTitle("DEMOSTRACION");
		setVisible(true);
		setBounds(100, 100, 667, 466);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		
	
		//CREANDO DISCOS

		Demo d = new Demo();
		disco0 = new JLabel(d.lbdisco0);
		disco1 = new JLabel(d.lbdisco1);
		disco2 = new JLabel(d.lbdisco2);
		disco3 = new JLabel(d.lbdisco3);
		disco4 = new JLabel(d.lbdisco4);
		
		
		int [] T={288,260,233,203,176,146,122,94};
		
		disco4.setBounds(45, T[0], 240, 30);
		disco3.setBounds(45, T[1], 240, 30);
		disco2.setBounds(45, T[2], 240, 30);
		disco1.setBounds(45, T[3], 240, 30);
		disco0.setBounds(45, T[4], 240, 30);
		
		JButton iniciar = new JButton("Iniciar Demo");
		iniciar.setBounds(400,10,150,20);
		
		//AGREGANDO A VENTANA
		add(disco4);
		add(disco3);
		add(disco2);
		add(disco1);
		add(disco0);
		add(iniciar);
		
		repaint();
		
		
		}
	
	public void botones(){
		JButton btTorre_1 = new JButton("Torre 1");
		btTorre_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "hola mundo");
			}
		});
		
		btTorre_1.setBounds(92, 331, 89, 23);
		getContentPane().add(btTorre_1);
		
		JButton btTorre_2 = new JButton("Torre 2");
		btTorre_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "hola mundo");
			}
		});
		
		btTorre_2.setBounds(309, 331, 89, 23);
		getContentPane().add(btTorre_2);
		
				
		JButton btTorre_3 = new JButton("Torre 3");
		btTorre_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "hola mundo");
			}
		});
		btTorre_3.setBounds(509, 331, 89, 23);
		getContentPane().add(btTorre_3);
	
		
		JLabel label = new JLabel("Numero de Discos: 5");
		label.setBounds(20, 20, 150, 30);
		getContentPane().add(label);
		
		
	
	
	
	
	
	}
	

	

}
