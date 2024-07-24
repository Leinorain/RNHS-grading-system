package application;
	
import java.net.URL;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ResourceBundle;

//import javax.swing.JOptionPane;

import javafx.application.Application;
//import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.StackPane;



public class Main extends Application {

	
	@Override
	public void start(Stage stage) throws Exception{
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			String css = this.getClass().getResource("application.css").toExternalForm();
			scene.getStylesheets().add(css);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
	
	public static void main(String[] args) {
	
//    	String jdbcURL = "jdbc:derby:TeacherStudentSystem2;create=true";
    	

//		try {
//			DatabaseConnection dc;
////			dc = new DatabaseConnection();
//			
//			Connection connection = DriverManager.getConnection(jdbcURL);
//			Statement statement = connection.createStatement();
			
//			int x = 0;
//			if (x == 0) {
//				x++;
//			String addTable = "Create Table studentsfinal2 (id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 1, Increment by 1),"
//	    			+ "lrn varchar(32), name varchar(64), firstName varchar(32), lastName varchar(32), extnName varchar(32), middleName varchar(32), birthday varchar(32),"
//	    			+ "sex varchar(32), school varchar(64), schoolID varchar(32), district varchar(32), division varchar(32),region varchar(32),"
//	    			
//	    			+ "filipino1_1 varchar(32), english1_1 varchar(32), mathematics1_1 varchar(32), science1_1 varchar(32), mapeh1_1 varchar(32),"
//	    			+ "aralingPanlipunan1_1 varchar(32), EsP1_1 varchar(32), TLE1_1 varchar(32), music1_1 varchar(32), arts1_1 varchar(32),"
//	    			+ "PE1_1 varchar(32), health1_1 varchar(32),"
//	    			+ "filipino1_2 varchar(32), english1_2 varchar(32), mathematics1_2 varchar(32), science1_2 varchar(32), aralingPanlipunan1_2 varchar(32), mapeh1_2 varchar(32),"
//	    			+ "EsP1_2 varchar(32), TLE1_2 varchar(32), music1_2 varchar(32), arts1_2 varchar(32), PE1_2 varchar(32), health1_2 varchar(32),"
//	    			+ "filipino1_3 varchar(32), english1_3 varchar(32), mathematics1_3 varchar(32), science1_3 varchar(32), aralingPanlipunan1_3 varchar(32), mapeh1_3 varchar(32),"
//	    			+ "EsP1_3 varchar(32), TLE1_3 varchar(32), music1_3 varchar(32), arts1_3 varchar(32), PE1_3 varchar(32), health1_3 varchar(32),"
//	    			+ "filipino1_4 varchar(32), english1_4 varchar(32), mathematics1_4 varchar(32), science1_4 varchar(32), aralingPanlipunan1_4 varchar(32), mapeh1_4 varchar(32),"
//	    			+ "EsP1_4 varchar(32), TLE1_4 varchar(32), music1_4 varchar(32), arts1_4 varchar(32), PE1_4 varchar(32), health1_4 varchar(32),"
//			    	+ "average1 varchar(32),average2 varchar(32),average3 varchar(32),average4 varchar(32),"
//	    			
//	    			//2
//			    	
//			    	+ "filipino2_1 varchar(32), english2_1 varchar(32), mathematics2_1 varchar(32), science2_1 varchar(32), mapeh2_1 varchar(32),"
//					+ "aralingPanlipunan2_1 varchar(32), EsP2_1 varchar(32), TLE2_1 varchar(32), music2_1 varchar(32), arts2_1 varchar(32),"
//					+ "PE2_1 varchar(32), health2_1 varchar(32),"
//					+ "filipino2_2 varchar(32), english2_2 varchar(32), mathematics2_2 varchar(32), science2_2 varchar(32), aralingPanlipunan2_2 varchar(32), mapeh2_2 varchar(32),"
//					+ "EsP2_2 varchar(32), TLE2_2 varchar(32), music2_2 varchar(32), arts2_2 varchar(32), PE2_2 varchar(32), health2_2 varchar(32),"
//					+ "filipino2_3 varchar(32), english2_3 varchar(32), mathematics2_3 varchar(32), science2_3 varchar(32), aralingPanlipunan2_3 varchar(32), mapeh2_3 varchar(32),"
//					+ "EsP2_3 varchar(32), TLE2_3 varchar(32), music2_3 varchar(32), arts2_3 varchar(32), PE2_3 varchar(32), health2_3 varchar(32),"
//					+ "filipino2_4 varchar(32), english2_4 varchar(32), mathematics2_4 varchar(32), science2_4 varchar(32), aralingPanlipunan2_4 varchar(32), mapeh2_41 varchar(32),"
//					+ "EsP2_4 varchar(32), TLE2_4 varchar(32), music2_4 varchar(32), arts2_4 varchar(32), PE2_4 varchar(32), health2_4 varchar(32),"
////					
//			
//					//3
//			
//					+ "filipino3_1 varchar(32), english3_1 varchar(32), mathematics3_1 varchar(32), science3_1 varchar(32), mapeh3_1 varchar(32),"
//					+ "aralingPanlipunan3_1 varchar(32), EsP3_1 varchar(32), TLE3_1 varchar(32), music3_1 varchar(32), arts3_1 varchar(32),"
//					+ "PE3_1 varchar(32), health3_1 varchar(32),"
//					+ "filipino3_2 varchar(32), english3_2 varchar(32), mathematics3_2 varchar(32), science3_2 varchar(32), aralingPanlipunan3_2 varchar(32), mapeh3_2 varchar(32),"
//					+ "EsP3_2 varchar(32), TLE3_2 varchar(32), music3_2 varchar(32), arts3_2 varchar(32), PE3_2 varchar(32), health3_2 varchar(32),"
//					+ "filipino3_3 varchar(32), english3_3 varchar(32), mathematics3_3 varchar(32), science3_3 varchar(32), aralingPanlipunan3_3 varchar(32), mapeh3_3 varchar(32),"
//					+ "EsP3_3 varchar(32), TLE3_3 varchar(32), music3_3 varchar(32), arts3_3 varchar(32), PE3_3 varchar(32), health3_3 varchar(32),"
//					+ "filipino3_4 varchar(32), english3_4 varchar(32), mathematics3_4 varchar(32), science3_4 varchar(32), aralingPanlipunan3_4 varchar(32), mapeh3_4 varchar(32),"
//					+ "EsP3_4 varchar(32), TLE3_4 varchar(32), music3_4 varchar(32), arts3_4 varchar(32), PE3_4 varchar(32), health3_4 varchar(32),"
//
//			
//					//4
//			
//					+ "filipino4_1 varchar(32), english4_1 varchar(32), mathematics4_1 varchar(32), science4_1 varchar(32), mapeh4_1 varchar(32),"
//					+ "aralingPanlipunan4_1 varchar(32), EsP4_1 varchar(32), TLE4_1 varchar(32), music4_1 varchar(32), arts4_1 varchar(32),"
//					+ "PE4_1 varchar(32), health4_1 varchar(32),"
//					+ "filipino4_2 varchar(32), english4_2 varchar(32), mathematics4_2 varchar(32), science4_2 varchar(32), aralingPanlipunan4_2 varchar(32), mapeh4_2 varchar(32),"
//					+ "EsP4_2 varchar(32), TLE4_2 varchar(32), music4_2 varchar(32), arts4_2 varchar(32), PE4_2 varchar(32), health4_2 varchar(32),"
//					+ "filipino4_3 varchar(32), english4_3 varchar(32), mathematics4_3 varchar(32), science4_3 varchar(32), aralingPanlipunan4_3 varchar(32), mapeh4_3 varchar(32),"
//					+ "EsP4_3 varchar(32), TLE4_3 varchar(32), music4_3 varchar(32), arts4_3 varchar(32), PE4_3 varchar(32), health4_3 varchar(32),"
//					+ "filipino4_4 varchar(32), english4_4 varchar(32), mathematics4_4 varchar(32), science4_4 varchar(32), aralingPanlipunan4_4 varchar(32), mapeh4_4 varchar(32),"
//					+ "EsP4_4 varchar(32), TLE4_4 varchar(32), music4_4 varchar(32), arts4_4 varchar(32), PE4_4 varchar(32), health4_4 varchar(32))";
//	    		System.out.println(x);
//			}
//	    	// THIS IS HOW TO ADD TABLE
//	    			statement.executeUpdate(addTable);
//	    			
	    			
			launch(args);

			
				
//		} catch (Exception e) {
//			System.out.println(e.toString());
//			e.printStackTrace();
//			System.exit(1);
//		}
    	
    	// HIS IS HOW TO ADD TABLE
//    	String sql = "Create Table students (id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY(Start with 1, Increment by 1),"
//				+ "lrn varchar(128), name varchar(128))";
    	
    	
    			
//    		JOptionPane.showMessageDialog(null, "Fill in the fields.");
    		
    		
		
	}
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		
	}
}
