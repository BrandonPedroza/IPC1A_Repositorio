import javax.swing.JFrame;


public class ventanaJuego extends JFrame{

	public static void main(String[] args) {
		ventanaJ ventana = new ventanaJ();
		creadorDiscos.crearDiscos(ventana);
		ventana.setVisible(true);
		
	}
	
}
