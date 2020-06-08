package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable  {

	
	private Department entity;
	
	@FXML
	private TextField txtId;

	@FXML
	private TextField txtName;
	
	@FXML
	private Label labemErrorName;
	
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("Botao Save Action");
		
	}
	
	@FXML
	public void onBtCancelAction() {
		System.out.println("Botao Cancel Action");
	}

	
	public void setDepartment(Department entity  ) {
		this.entity = entity;
	}
	
	public void updateFormData() {
		if (entity == null ) {
			throw new IllegalStateException("Entity was null");
		}
		txtId.setText(String.valueOf(entity.getId()));
		txtName.setText(String.valueOf(entity.getName()));
		
	}
	
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		inicializeNodes();
		
	}
	
	
	private void inicializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
		
	}
	
	
	
	

}
