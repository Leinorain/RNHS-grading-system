package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AddRecordController implements Initializable {

	
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Connection conn;
	
	@FXML
	private Button deleteButton;
	
	@FXML
    private Button aboutButton;

    @FXML
    private Button accountSettingsButton;

    @FXML
    private Button addRecordButton;

    @FXML
    private TableView<UserDetails> tableStudents;
    
    @FXML
    private TableColumn<UserDetails, String> colLRN;

    @FXML
    private TableColumn<UserDetails, String> colName;

    @FXML
    private Button homeButton;

    @FXML
    private Button logoutButton;

    @FXML
    private TextField lrnField;

    @FXML
    private AnchorPane mainAnchor;

    @FXML
    private TextField firstNameField;
    
    @FXML
    private TextField lastNameField;
    
    @FXML
    private TextField extnNameField;

    @FXML
    private Button reportsButton;

    @FXML
    private Button saveButton;
    
    @FXML
    private Button editFormButton;

    @FXML
    private TextField searchField;
    
    
    @FXML
    void addRecord(ActionEvent event) {

    }
    
    @FXML
    void delete(ActionEvent event) {
//    	String sql = "DELETE FROM studentsfinal2 "
//				+ "WHERE lrn = ?";
//    	try {
//			PreparedStatement stmt = this.conn.prepareStatement(sql);
//			stmt.setString(1, data);
//			rs = stmt.executeQuery();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

    }
    
    @FXML
    void searchLRNField(KeyEvent event) {
        String search = searchField.getText();
    	ResultSet rs;
		
		
		try {
//			dc = new DatabaseConnection();
//			Connection conn = dc.Connect();
			String sql = "SELECT * FROM studentsfinal2 "
					+ "WHERE lrn = ?";
	    	

	        if(search == "") {

				String query = "SELECT id, lrn, name, firstName, lastName, extnName FROM studentsfinal2"; 
	        	rs = conn.createStatement().executeQuery("SELECT * FROM studentsfinal2");
	    		Statement statement = conn.createStatement();
	        	//Populate
		    	while (rs.next() ) {
		    		data.add(new UserDetails(rs.getString(2), rs.getString(3)));
		    		
		    	}
		    	colLRN.setCellValueFactory(new PropertyValueFactory<>("lrn"));
				colName.setCellValueFactory(new PropertyValueFactory<>("name"));
				
				tableStudents.setItems(null);
				tableStudents.setItems(data);
				rs = statement.executeQuery(query);
				
//	        	sql = "SELECT * FROM studentsfinal2";
//	        	data = FXCollections.observableArrayList();
//				PreparedStatement stmt = this.conn.prepareStatement(sql);
//				stmt.setString(1, search);
//				rs = stmt.executeQuery();
	        }
			
			data = FXCollections.observableArrayList();
			PreparedStatement stmt = this.conn.prepareStatement(sql);
			stmt.setString(1, search);
			rs = stmt.executeQuery();
	    	
	    	
//	    	PreparedStatement pst = conn.prepareStatement(sql);
			
	    	//Populate
	    	while (rs.next() ) {
	    		data.add(new UserDetails(rs.getString(2), rs.getString(3)));
	    	}
	    	
	    	
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			System.exit(1);
		}


		colLRN.setCellValueFactory(new PropertyValueFactory<>("lrn"));
		colName.setCellValueFactory(new PropertyValueFactory<>("name"));
		
//		tableStudents.setItems(null);
		tableStudents.setItems(data);
		

    }
    
    
    @FXML
    void logoutUser(ActionEvent event) {
    	System.out.println("Logout");
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    private ObservableList<UserDetails>data;
    private DatabaseConnection dc;
    
    static String LRNData = "";
    
    @FXML
    public void editForm(ActionEvent event) throws IOException {
    	
//    	TablePosition pos = tableStudents.getSelectionModel().getSelectedCells().get(0);
//    	int row = pos.getRow();
//
//    	// Item here is the table view type:
//    	UserDetails item = tableStudents.getItems().get(row);
//
//    	TableColumn col = pos.getTableColumn();
//
//    	// this gives the value in the selected cell:
//    	String data = (String) col.getCellObservableValue(item).getValue();
    	
    	// Get the selected cell position
//    	TablePosition pos = tableStudents.getSelectionModel().getSelectedCells().get(0);
    	TablePosition<?, ?> pos = tableStudents.getSelectionModel().getSelectedCells().get(0);
    	// Get the row index of the selected cell
    	int row = pos.getRow();

    	// Get the item at the selected row
    	UserDetails item = tableStudents.getItems().get(row);

    	// Get the value of the "Name" column for the selected row
    	LRNData = colLRN.getCellObservableValue(item).getValue();
    	
//    	System.out.println(LRNData);
    	
    	root = FXMLLoader.load(getClass().getResource("Form137_1.fxml"));
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    	
    	
    }
    
    @FXML
    void save(ActionEvent event) throws ClassNotFoundException, SQLException{
    	
    	String lrn = lrnField.getText();
    	String firstName = firstNameField.getText();
    	String lastName = lastNameField.getText();
    	String name = firstName + " " + lastName;
    	String extnName = extnNameField.getText();
    	extnName = extnName.toUpperCase();
    	
    	if (extnName.equals("JR.") || extnName.equals("SR.") || extnName.equals("JR") || extnName.equals("SR") || extnName.equals("III") || extnName.equals("II")  || extnName.equals("I") || extnName.equals("IV") || extnName.equals("V")) {
    		name = firstName + " " + lastName + " " + extnName;
    		System.out.println("with name extension");
    	} else {
			System.out.println("no name extension");
			extnName = "";
    	}
    	
    	if(firstName.equals("") || lrn.equals("")) {
    		JOptionPane.showMessageDialog(null, "Fill in the fields.");
    	} else {
			try {

				String query = "SELECT id, lrn, name, firstName, lastName, extnName FROM studentsfinal2"; 
				ResultSet rs;
				

				Connection conn = dc.Connect();
				PreparedStatement pst = conn.prepareStatement("INSERT INTO studentsfinal2 (lrn, name, firstName, lastName, extnName) VALUES (?,?,?,?,?)");
				
				
				rs = conn.createStatement().executeQuery("SELECT * FROM studentsfinal2");
		    	
				Statement statement = conn.createStatement();
				
				//Add
				pst.setString(1, lrnField.getText());
				pst.setString(2, name);
				pst.setString(3, firstNameField.getText());
				pst.setString(4, lastNameField.getText());
				pst.setString(5, extnNameField.getText());
				pst.execute();

				rs = statement.executeQuery(query);
				
				//Populate
		    	while (rs.next() ) {
		    		data.add(new UserDetails(rs.getString(2), rs.getString(3)));
		    	}
				
		    	lrnField.setText("");
		    	firstNameField.setText("");
		    	lastNameField.setText("");
		    	extnNameField.setText("");
		    	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				JOptionPane.showMessageDialog(null, "Student Added");
				
				colLRN.setCellValueFactory(new PropertyValueFactory<>("lrn"));
				colName.setCellValueFactory(new PropertyValueFactory<>("name"));
				
				tableStudents.setItems(null);
				tableStudents.setItems(data);
				
    	}
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
    void showAccountSettings(ActionEvent event) throws IOException{
    	root = FXMLLoader.load(getClass().getResource("AccountSetting.fxml"));
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    }

    @FXML
    void showHome(ActionEvent event) throws IOException{
    	root = FXMLLoader.load(getClass().getResource("Home.fxml"));
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    }

    @FXML
    void showReports(ActionEvent event) throws IOException{
    	root = FXMLLoader.load(getClass().getResource("Reports.fxml"));
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    }

	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		String query = "SELECT id, lrn, name, firstName, lastName, extnName FROM studentsfinal2"; 
		ResultSet rs;
		
		
		try {
			dc = new DatabaseConnection();
			this.conn = dc.Connect();
	    	data = FXCollections.observableArrayList();
	    	
	    	rs = this.conn.createStatement().executeQuery("SELECT * FROM studentsfinal2");
			
			//Populate
	    	while (rs.next() ) {
	    		data.add(new UserDetails(rs.getString(2), rs.getString(3)));
	    	}
	    	
	    	
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			System.exit(1);
		}
		
		colLRN.setCellValueFactory(new PropertyValueFactory<>("lrn"));
		colName.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		tableStudents.setItems(null);
		tableStudents.setItems(data);
		
		
	}
    

}
