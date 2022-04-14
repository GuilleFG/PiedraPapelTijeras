import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable {
	
	String piedra = "piedra.png";
	String papel = "papel90.jpg";
	String tijera = "tijera90x61.jpg";
	
	@FXML
	private Label letras;
	@FXML
	private ImageView imagen;
	@FXML
	private Image ig;
	

	private void setImage(String elemento) {
		
		try {
			  ig = new Image(elemento);
			imagen.setImage(ig);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void botonPiedra(ActionEvent event) {
		
		int aleatorio = (int) (Math.random() * 3) + 1;
		
		if (aleatorio == 1) {
			letras.setText("Piedra- Piedra, EMPATE!");
			setImage(piedra);

		} else if (aleatorio == 2) {
			letras.setText("Piedra - Papel, PERDISTE!");
			setImage(papel);
		} else {
			letras.setText("Piedra - Tijera, GANASTE!");
			setImage(tijera);
		}
	}

	public void botonPapel(ActionEvent event) {
		System.out.println("Papel ");
		int seleccionCompu = (int) (Math.random() * 3) + 1;
		switch (seleccionCompu) {
		case 1:
			letras.setText("Papel-Piedra: Ganaste!");
			setImage(piedra);
			break;
		case 2:
			letras.setText("Papel - Papel: Empaste!");
			setImage(papel);
			break;
		case 3:
			letras.setText("Papel- Tijera: Perdiste!");
			setImage(tijera);
			break;
		}
	}

	public void botonTijera(ActionEvent event) {
		int seleccionCompu = (int) (Math.random() * 3) + 1;
		System.out.println("Tijera");
		switch (seleccionCompu) {
		case 1:
			letras.setText("Tijera-Piedra: Perdiste!");
			setImage(piedra);
			break;
		case 2:
			letras.setText("Tijera - Papel: Ganaste!");
			setImage(papel);
			break;
		case 3:
			letras.setText("Tijera- Tijera: Empate!");
			setImage(tijera);
			break;
		}
	}

	public void botonJugar(ActionEvent event) {
		letras.setText("La máquina ya ha elegido. Elige!");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
}