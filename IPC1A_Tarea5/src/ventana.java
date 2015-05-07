import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ventana {

	private ImageIcon disco1 = new ImageIcon("Graficos\\disco1.png");
	private ImageIcon disco2 = new ImageIcon("Graficos\\disco2.png");
	private ImageIcon disco3 = new ImageIcon("Graficos\\disco3.png");
	private ImageIcon disco4 = new ImageIcon("Graficos\\disco4.png");
	private ImageIcon disco5 = new ImageIcon("Graficos\\disco5.png");
	private ImageIcon disco6 = new ImageIcon("Graficos\\disco6.png");
	private ImageIcon disco7 = new ImageIcon("Graficos\\disco7.png");
	private ImageIcon disco8 = new ImageIcon("Graficos\\disco8.png");
	
public static void generarDiscos(JFrame ventana, String Discos){
		
		ventana jn = new ventana();
		JLabel disco0 = new JLabel(jn.disco1);
		JLabel disco1 = new JLabel(jn.disco2);
		JLabel disco2 = new JLabel(jn.disco3);
		JLabel disco3 = new JLabel(jn.disco4);
		JLabel disco4 = new JLabel(jn.disco5);
		JLabel disco5 = new JLabel(jn.disco6);
		JLabel disco6 = new JLabel(jn.disco7);
		JLabel disco7 = new JLabel(jn.disco8);
		
		final int [] y ={485,445,405,365,325,285,245,205};
		final int [] x ={100,200,300};
		
		int d = Integer.parseInt(Discos);
		
		//GENERANDO DISCOS
		if(d==3){
			disco2.setBounds(45, y[0], 240, 40);
			disco1.setBounds(45, y[1], 240, 40);
			disco0.setBounds(45, y[2], 240, 40);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
		}else if(d==4){
			disco3.setBounds(45, y[0], 240, 40);
			disco2.setBounds(45, y[1], 240, 40);
			disco1.setBounds(45, y[2], 240, 40);
			disco0.setBounds(45, y[3], 240, 40);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
		}else if (d==5){
			disco4.setBounds(45, y[0], 240, 40);
			disco3.setBounds(45, y[1], 240, 40);
			disco2.setBounds(45, y[2], 240, 40);
			disco1.setBounds(45, y[3], 240, 40);
			disco0.setBounds(45, y[4], 240, 40);
			ventana.add(disco4);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
		}else if(d==6){
			disco5.setBounds(45, y[0], 240, 40);
			disco4.setBounds(45, y[1], 240, 40);
			disco3.setBounds(45, y[2], 240, 40);
			disco2.setBounds(45, y[3], 240, 40);
			disco1.setBounds(45, y[4], 240, 40);
			disco0.setBounds(45, y[5], 240, 40);
			ventana.add(disco5);
			ventana.add(disco4);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
		}else if (d==7){
			disco6.setBounds(45, y[0], 240, 40);
			disco5.setBounds(45, y[1], 240, 40);
			disco4.setBounds(45, y[2], 240, 40);
			disco3.setBounds(45, y[3], 240, 40);
			disco2.setBounds(45, y[4], 240, 40);
			disco1.setBounds(45, y[5], 240, 40);
			disco0.setBounds(45, y[6], 240, 40);
			ventana.add(disco6);
			ventana.add(disco5);
			ventana.add(disco4);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
		}else{
			disco7.setBounds(45, y[0], 240, 40);
			disco6.setBounds(45, y[1], 240, 40);
			disco5.setBounds(45, y[2], 240, 40);
			disco4.setBounds(45, y[3], 240, 40);
			disco3.setBounds(45, y[4], 240, 40);
			disco2.setBounds(45, y[5], 240, 40);
			disco1.setBounds(45, y[6], 240, 40);
			disco0.setBounds(45, y[7], 240, 40);
			ventana.add(disco7);
			ventana.add(disco6);
			ventana.add(disco5);
			ventana.add(disco4);
			ventana.add(disco3);
			ventana.add(disco2);
			ventana.add(disco1);
			ventana.add(disco0);
			ventana.repaint();
		}
		
	}



}
