package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSeller;

	@FXML
	private MenuItem menuItemDepartment;

	@FXML
	private MenuItem menuItemAbout;

	
	
	public void OnMenuItemSellerAction() {
		System.out.println("OnMenuItemSellerAction");
	}
	
	public void OnMenuItemDepartmentAction() {
		System.out.println("OnMenuItemDepartmentAction");
	}
	
	
	public void OnMenuItemAboutAction() {
		System.out.println("OnMenuItemAboutAction");
	}
	
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {

	}

}
