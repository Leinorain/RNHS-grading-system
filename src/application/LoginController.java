package application;



import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

	
	
    @FXML
    private TextField emailField;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Parent root;
    
    @FXML
    private Label label;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    
    
    @FXML
    void login(ActionEvent event) throws Exception{
    	
    	
    	System.out.println("a");
    	
    	
    	String userName = emailField.getText();
    	String password = passwordField.getText();
		
    	
    	if(userName.equals("") && password.equals("")) {
    		JOptionPane.showMessageDialog(null, "The fields are blank.");
    	} else {
    		if(userName.equals("test") && password.equals("123")) {

				

				JOptionPane.showMessageDialog(null, "Login Success");
			    FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
			    root = (Parent) loader.load();
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
				
			} else {
				JOptionPane.showMessageDialog(null, "Login Failed");
				emailField.setText("");
				passwordField.setText("");
				emailField.requestFocus();
			} 
    	}
    	
    }
 

}