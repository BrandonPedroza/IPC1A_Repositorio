import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RootPaneContainer;



public class ventanaJ extends JFrame{

	int n=5;
	
	public ventanaJ() {
		inicializar();
		botones();
		numeroDiscos();
		
	
	}

	public void inicializar(){
	new JFrame();
	setTitle("Juego Torres de Hanoi");
	setBounds(100, 100, 667, 466);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container contentpane = getContentPane();
	getContentPane().setLayout(null);
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


	JButton btDemo = new JButton("Demostracion");
	btDemo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Demo d= new Demo();

				d.demo();
			}
			
	});
	
	btDemo.setBounds(200, 10, 150, 20);
	getContentPane().add(btDemo);

	

	JButton btInstr = new JButton("Instrucciones");
	btInstr.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
						
			instrucciones in= new instrucciones();
			in.iniciar();
			}
			
	});
	
	btInstr.setBounds(380, 10, 150, 20);
	getContentPane().add(btInstr);
	
	
	
	
	}	

public int numeroDiscos(){
	JComboBox w= new JComboBox();
	w.setModel(new DefaultComboBoxModel(new String[] {"Escoja numero de discos", "1", "2", "3", "4", "5", "6", "7", "8"}));
	w.setBounds(10, 10, 150, 20);
	getContentPane().add(w);
	w.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			int g=w.getSelectedIndex();
		}
	});
	return n;
	
	}

}
