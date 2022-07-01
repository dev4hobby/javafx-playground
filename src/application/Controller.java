package application;

//import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
	public int status = 1;
	public Button button_status;
	public Button button_website;

	// @FXML
	public void buttonClicked() {
		System.out.println("Button Clicked");
		switch (status) {
			case 1:
				button_status.setText("STATE 1");
				break;
			case 2:
				button_status.setText("STATE 2");
				break;
			case 3:
				button_status.setText("STATE 3");
				break;
			default:
				button_status.setText("STATE 4");
		}
		status += 1;
		status %= 4;
	}

	public void goToWebSite() {
		System.out.println("Go to website");
	}

}