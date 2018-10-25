import java.awt.EventQueue;

/**
 * Clase principal
 * 
 * @author adriangomezmartin
 *
 */
public class Principal {
	// cabio
	/**
	 * Método main
	 * 
	 * @param args
	 *            : Cadenas de parámetros del main
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
					ventanaPrincipal.inicializar();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
