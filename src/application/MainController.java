package application;

import java.io.IOException;
//import java.net.URL;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ResourceBundle;

//import javax.swing.JOptionPane;

//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
//import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
    @FXML
    private Button aboutButton;
    
	@FXML
    private Button accountSettingsButton;

    @FXML
    private Button addRecordButton;

    @FXML
    private Button homeButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button reportsButton;
    
    @FXML
    private Button saveButton;
    
    @FXML
    private TextField lrnField;
    
    @FXML
    private TextField nameField;

    @FXML
    private AnchorPane mainAnchor;
   
    @FXML
    private TableView<UserDetails> tableStudents;
    
    @FXML
    private TableColumn<UserDetails, String> colLRN;

    @FXML
    private TableColumn<UserDetails, String> colName;

    
    
    @FXML
    void addRecord(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
    	
    	root = FXMLLoader.load(getClass().getResource("AddRecord.fxml"));
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    	
	}
    		 

    @FXML
    void logoutUser(ActionEvent event) {
        System.out.println("Logout");
        ((Node)(event.getSource())).getScene().getWindow().hide();
        
    }
    
    
    @FXML
    void showAbout(ActionEvent event) throws IOException {
    	root = FXMLLoader.load(getClass().getResource("About.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }

    @FXML
    void showAccountSettings(ActionEvent event) throws IOException {
    	root = FXMLLoader.load(getClass().getResource("AccountSetting.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }

    @FXML
    void showHome(ActionEvent event) throws IOException {
    	root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }

    @FXML
    void showReports(ActionEvent event) throws IOException {
    	root = FXMLLoader.load(getClass().getResource("Reports.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
   
    

}
