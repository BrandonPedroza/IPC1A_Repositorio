import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.RootPaneContainer;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;



public class creadorDiscos {

	ImageIcon lbdisco0 = new ImageIcon("practica2/disco0.png");
	ImageIcon lbdisco1 = new ImageIcon("practica2/disco1.png");
	ImageIcon lbdisco2 = new ImageIcon("practica2/disco2.png");
	ImageIcon lbdisco3 = new ImageIcon("practica2/disco3.png");
	ImageIcon lbdisco4 = new ImageIcon("practica2/disco4.png");
	ImageIcon lbdisco5 = new ImageIcon("practica2/disco5.png");
	ImageIcon lbdisco6 = new ImageIcon("practica2/disco6.png");
	ImageIcon lbdisco7 = new ImageIcon("practica2/disco7.png");

	
	
	
	
public static void crearDiscos(JFrame ventana){
		
		creadorDiscos cD = new creadorDiscos();
		JLabel disco0 = new JLabel(cD.lbdisco0);
		JLabel disco1 = new JLabel(cD.lbdisco1);
		JLabel disco2 = new JLabel(cD.lbdisco2);
		JLabel disco3 = new JLabel(cD.lbdisco3);
		JLabel disco4 = new JLabel(cD.lbdisco4);
		JLabel disco5 = new JLabel(cD.lbdisco5);
		JLabel disco6 = new JLabel(cD.lbdisco6);
		JLabel disco7 = new JLabel(cD.lbdisco7);

	
		int [] T1={288,260,233,203,176,146,122,94};
		
		ventanaJ vj= new ventanaJ();
		int d= vj.numeroDiscos();
		
	
		
		//posicionando los discos
		
		if(d==3){
			disco2.setBounds(49, T1[0], 240, 30);
			disco1.setBounds(49, T1[1], 240, 30);
			disco0.setBounds(49, T1[2], 240, 30);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
			JLabel[] Torre1={disco2,disco1,disco0};
		}else if(d==4){
			disco3.setBounds(49, T1[0], 240, 30);
			disco2.setBounds(49, T1[1], 240, 30);
			disco1.setBounds(49, T1[2], 240, 30);
			disco0.setBounds(49, T1[3], 240, 30);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
			JLabel[] Torre1={disco3,disco2,disco1,disco0};
		}else if (d==5){
			disco4.setBounds(49, T1[0], 175,30);
			disco3.setBounds(49, T1[1], 175,30);
			disco2.setBounds(49, T1[2], 175,30);
			disco1.setBounds(49, T1[3], 175,30);
			disco0.setBounds(49, T1[4], 175,30);
			ventana.add(disco4);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
			JLabel[] Torre1={disco4,disco3,disco2,disco1,disco0};
		}else if(d==6){
			disco5.setBounds(49, T1[0], 175,30);
			disco4.setBounds(49, T1[1], 175,30);
			disco3.setBounds(49, T1[2], 175,30);
			disco2.setBounds(49, T1[3], 175,30);
			disco1.setBounds(49, T1[4], 175,30);
			disco0.setBounds(49, T1[5], 175,30);
			ventana.add(disco5);
			ventana.add(disco4);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
			JLabel[] Torre1={disco5,disco4,disco3,disco2,disco1,disco0};
		}else if (d==7){
			disco6.setBounds(49, T1[0], 175,30);
			disco5.setBounds(49, T1[1], 175,30);
			disco4.setBounds(49, T1[2], 175,30);
			disco3.setBounds(49, T1[3], 175,30);
			disco2.setBounds(49, T1[4], 175,30);
			disco1.setBounds(49, T1[5], 175,30);
			disco0.setBounds(49, T1[6], 175,30);
			ventana.add(disco6);
			ventana.add(disco5);
			ventana.add(disco4);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
			JLabel[] Torre1={disco6,disco5,disco4,disco3,disco2,disco1,disco0};
		}else if (d==8){
			disco7.setBounds(49, T1[0], 175,30);
			disco6.setBounds(49, T1[1], 175,30);
			disco5.setBounds(49, T1[2], 175,30);
			disco4.setBounds(49, T1[3], 175,30);
			disco3.setBounds(49, T1[4], 175,30);
			disco2.setBounds(49, T1[5], 175,30);
			disco1.setBounds(49, T1[6], 175,30);
			disco0.setBounds(49, T1[7], 175,30);
			ventana.add(disco7);
			ventana.add(disco6);
			ventana.add(disco5);
			ventana.add(disco4);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
			JLabel[] Torre1={disco7,disco6,disco5,disco4,disco3,disco2,disco1,disco0};
		}	else{
			ventana.repaint();
		}
}



public void mover(){

	int[] disco ={1,2,3,4,5,6,7,8};
	Stack <JLabel> Torre1= new Stack<JLabel>();
	Torre1.pop();
	
	
	
}

}

