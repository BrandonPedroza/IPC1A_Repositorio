import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;



public class instrucciones extends JFrame{
	
	public instrucciones(){
		iniciar();
	}
	
	public void iniciar(){
		//GENERANDO VENTANA
		setTitle("¿Como Jugar?");
		setVisible(true);
		setBounds(100, 100, 275, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		
		
		
		
		JTextPane txIns = new JTextPane();
		txIns.setText(" \n\n Instrucciones: \n\n  Solo se puede mover un disco a la vez>\n * El juego tendrá solamente 3 estacas (torres). >\n *No se permite colocar un disco más grande sobre otro de menor tamaño. >\n * Solamente se puede mover el disco que esta hasta arriba de cada la torre. >\n *El juego se gana cuando se forma la torre de discos que inicialmente se tiene en la torre 1, en cualquiera de las otras 2 torres.");
		txIns.setBounds(10, 10, 250, 250);
		getContentPane().add(txIns);
		
		
			
	}
	

	

}

