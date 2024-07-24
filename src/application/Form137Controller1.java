package application;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

//import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
//import junit.framework.Assert;

public class Form137Controller1 implements Initializable{
	
//	private AddRecordController LRNData;
	String lrn = AddRecordController.LRNData;
	
	
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Connection conn;
		
	 @FXML
	    private TextField EsP1_1Field;

	    @FXML
	    private TextField EsP1_2Field;

	    @FXML
	    private TextField EsP1_3Field;

	    @FXML
	    private TextField EsP1_4Field;

	    @FXML
	    private TextField EsP1_fField;

	    @FXML
	    private TextField EsP1_rField;

	    @FXML
	    private TextField LRNField;

	    @FXML
	    private TextField MAPEH1_1Field;

	    @FXML
	    private TextField MAPEH1_2Field;

	    @FXML
	    private TextField MAPEH1_3Field;

	    @FXML
	    private TextField MAPEH1_4Field;

	    @FXML
	    private TextField MAPEH1_fField;

	    @FXML
	    private TextField MAPEH1_rField;

	    @FXML
	    private TextField PE1_1Field;

	    @FXML
	    private TextField PE1_2Field;

	    @FXML
	    private TextField PE1_3Field;

	    @FXML
	    private TextField PE1_4Field;

	    @FXML
	    private TextField PE1_fField;

	    @FXML
	    private TextField TLE1_1Field;

	    @FXML
	    private TextField TLE1_2Field;

	    @FXML
	    private TextField TLE1_3Field;

	    @FXML
	    private TextField TLE1_4Field;

	    @FXML
	    private TextField TLE1_fField;

	    @FXML
	    private TextField TLE1_rField;

	    @FXML
	    private TextField aralingPanlipunan1_1Field;

	    @FXML
	    private TextField aralingPanlipunan1_2Field;

	    @FXML
	    private TextField aralingPanlipunan1_3Field;

	    @FXML
	    private TextField aralingPanlipunan1_4Field;

	    @FXML
	    private TextField aralingPanlipunan1_fField;

	    @FXML
	    private TextField aralingPanlipunan1_rField;

	    @FXML
	    private TextField arts1_1Field;

	    @FXML
	    private TextField arts1_2Field;

	    @FXML
	    private TextField arts1_3Field;

	    @FXML
	    private TextField arts1_4Field;

	    @FXML
	    private TextField arts1_fField;

	    @FXML
	    private TextField average1Field;

	    @FXML
	    private TextField birthdayField;

	    @FXML
	    private Button closeForm137Button;

	    @FXML
	    private TextField districtField;

	    @FXML
	    private TextField divisionField;

	    @FXML
	    private Button downloadButton;

	    @FXML
	    private TextField english1_1Field;

	    @FXML
	    private TextField english1_2Field;

	    @FXML
	    private TextField english1_3Field;

	    @FXML
	    private TextField english1_4Field;

	    @FXML
	    private TextField english1_fField;

	    @FXML
	    private TextField english1_rField;

	    @FXML
	    private TextField extnNameField;

	    @FXML
	    private TextField filipino1_1Field;

	    @FXML
	    private TextField filipino1_2Field;

	    @FXML
	    private TextField filipino1_3Field;

	    @FXML
	    private TextField filipino1_4Field;

	    @FXML
	    private TextField filipino1_fField;

	    @FXML
	    private TextField filipino1_rField;

	    @FXML
	    private TextField firstNameField;

	    @FXML
	    private TextField health1_1Field;

	    @FXML
	    private TextField health1_2Field;

	    @FXML
	    private TextField health1_3Field;

	    @FXML
	    private TextField health1_4Field;

	    @FXML
	    private TextField health1_fField;

	    @FXML
	    private TextField lastNameField;

	    @FXML
	    private GridPane mainAnchor;

	    @FXML
	    private TextField mathematics1_1Field;

	    @FXML
	    private TextField mathematics1_2Field;

	    @FXML
	    private TextField mathematics1_3Field;

	    @FXML
	    private TextField mathematics1_4Field;

	    @FXML
	    private TextField mathematics1_fField;

	    @FXML
	    private TextField mathematics1_rField;

	    @FXML
	    private TextField middleNameField;

	    @FXML
	    private TextField music1_1Field;

	    @FXML
	    private TextField music1_2Field;

	    @FXML
	    private TextField music1_3Field;

	    @FXML
	    private TextField music1_4Field;

	    @FXML
	    private TextField music1_fField;

	    @FXML
	    private Button nextButton;

	    @FXML
	    private TextField regionField;

	    @FXML
	    private Button saveForm137Button;

	    @FXML
	    private TextField schoolField;

	    @FXML
	    private TextField schoolIDField;

	    @FXML
	    private TextField science1_1Field;

	    @FXML
	    private TextField science1_2Field;

	    @FXML
	    private TextField science1_3Field;

	    @FXML
	    private TextField science1_4Field;

	    @FXML
	    private TextField science1_fField;

	    @FXML
	    private TextField science1_rField;

	    @FXML
	    private TextField sexField;
	    
	    @FXML
	    private Label yearLevel;


	    
	    
	    private String firstName;
	    private String lastName;
	    private String extnName;
	    private String middleName;
	    private String birthday;
	    private String sex;
	    private String school;
	    private String schoolID;
	    private String district;
	    private String division;
	    private String region;
    	
	    private String filipino1_1;
	    private String english1_1;
	    private String mathematics1_1;
	    private String science1_1;
	    private String aralingPanlipunan1_1;
	    private String EsP1_1;
	    private String TLE1_1;
	    private String MAPEH1_1;
	    private String music1_1;
	    private String arts1_1;
	    private String PE1_1;
	    private String health1_1;
	    private String average1;

	    private String filipino1_2;
	    private String english1_2;
	    private String mathematics1_2;
    	private String science1_2;
    	private String aralingPanlipunan1_2;
    	private String EsP1_2;
    	private String TLE1_2;
    	private String MAPEH1_2;
    	private String music1_2;
    	private String arts1_2;
    	private String PE1_2;
    	private String health1_2;
    	
    	private String filipino1_3;
    	private String english1_3;
    	private String mathematics1_3;
    	private String science1_3;
    	private String aralingPanlipunan1_3;
    	private String EsP1_3;
    	private String TLE1_3;
    	private String MAPEH1_3;
    	private String music1_3;
    	private String arts1_3;
    	private String PE1_3;
    	private String health1_3;
    	
    	private String filipino1_4;
    	private String english1_4;
    	private String mathematics1_4;
    	private String science1_4;
    	private String aralingPanlipunan1_4;
    	private String EsP1_4;
    	private String TLE1_4;
    	private String MAPEH1_4;
    	private String music1_4;
    	private String arts1_4;
    	private String PE1_4;
    	private String health1_4;
    	
    	
    	
    	private int filipino1Average;
    	private int english1Average;
    	private int mathematics1Average;
    	private int science1Average;
    	private int aralingPanlipunan1Average;
    	private int EsP1Average;
    	private int TLE1Average;
    	private int MAPEH1Average;
	  
    	
    @FXML
    void computeFilipino(KeyEvent event) {
    	try {
    	filipino1Average = Integer.parseInt(filipino1_1Field.getText()) + Integer.parseInt(filipino1_2Field.getText()) + Integer.parseInt(filipino1_3Field.getText()) + Integer.parseInt(filipino1_4Field.getText());
    	filipino1Average = filipino1Average/4;
    	filipino1_fField.setText(Integer.toString(filipino1Average));
    	if(filipino1Average >= 75) {
    		filipino1_rField.setText("Passed");
    	} else if (filipino1Average < 75) {
    		filipino1_rField.setText("Failed");
    	} else {
    		filipino1_rField.setText("");
    	};
    	} catch (Exception e) {
    		
    	}
    }	
    
    @FXML
    void computeEnglish(KeyEvent event) {
    	try {
    	english1Average = Integer.parseInt(english1_1Field.getText()) + Integer.parseInt(english1_2Field.getText()) + Integer.parseInt(english1_3Field.getText()) + Integer.parseInt(english1_4Field.getText());
    	english1Average = english1Average/4;
    	english1_fField.setText(Integer.toString(english1Average));
    	if(english1Average >= 75) {
    		english1_rField.setText("Passed");
    	} else if (english1Average < 75) {
    		english1_rField.setText("Failed");
    	} else {
    		english1_rField.setText("");
    	};
    	} catch (Exception e) {
    		
    	}
    }	
    
    @FXML
    void computeMathematics(KeyEvent event) {
    	try {
    	mathematics1Average = Integer.parseInt(mathematics1_1Field.getText()) + Integer.parseInt(mathematics1_2Field.getText()) + Integer.parseInt(mathematics1_3Field.getText()) + Integer.parseInt(mathematics1_4Field.getText());
    	mathematics1Average = mathematics1Average/4;
    	mathematics1_fField.setText(Integer.toString(mathematics1Average));
    	if(mathematics1Average >= 75) {
    		mathematics1_rField.setText("Passed");
    	} else if (mathematics1Average < 75) {
    		mathematics1_rField.setText("Failed");
    	} else {
    		mathematics1_rField.setText("");
    	};
    	} catch (Exception e) {
    		
    	}
    }		
    
    @FXML
    void computeScience(KeyEvent event) {
    	try {
    	science1Average = Integer.parseInt(science1_1Field.getText()) + Integer.parseInt(science1_2Field.getText()) + Integer.parseInt(science1_3Field.getText()) + Integer.parseInt(science1_4Field.getText());
    	science1Average = science1Average/4;
    	science1_fField.setText(Integer.toString(science1Average));
    	if(science1Average >= 75) {
    		science1_rField.setText("Passed");
    	} else if (science1Average < 75) {
    		science1_rField.setText("Failed");
    	} else {
    		science1_rField.setText("");
    	};
    	} catch (Exception e) {
    		
    	}
    }	
    
    @FXML
    void computeAralingPanlipunan(KeyEvent event) {
    	try {
    	aralingPanlipunan1Average = Integer.parseInt(aralingPanlipunan1_1Field.getText()) + Integer.parseInt(aralingPanlipunan1_2Field.getText()) + Integer.parseInt(aralingPanlipunan1_3Field.getText()) + Integer.parseInt(aralingPanlipunan1_4Field.getText());
    	aralingPanlipunan1Average = aralingPanlipunan1Average/4;
    	aralingPanlipunan1_fField.setText(Integer.toString(aralingPanlipunan1Average));
    	if(aralingPanlipunan1Average >= 75) {
    		aralingPanlipunan1_rField.setText("Passed");
    	} else if (aralingPanlipunan1Average < 75) {
    		aralingPanlipunan1_rField.setText("Failed");
    	} else {
    		aralingPanlipunan1_rField.setText("");
    	};
    	} catch (Exception e) {
    		
    	}
    }	
    
    @FXML
    void computeEsP(KeyEvent event) {
    	try {
    	EsP1Average = Integer.parseInt(EsP1_1Field.getText()) + Integer.parseInt(EsP1_2Field.getText()) + Integer.parseInt(EsP1_3Field.getText()) + Integer.parseInt(EsP1_4Field.getText());
    	EsP1Average = EsP1Average/4;
    	EsP1_fField.setText(Integer.toString(EsP1Average));
    	if(EsP1Average >= 75) {
    		EsP1_rField.setText("Passed");
    	} else if (EsP1Average < 75) {
    		EsP1_rField.setText("Failed");
    	} else {
    		EsP1_rField.setText("");
    	};
    	} catch (Exception e) {
    		
    	}
    }	
    
    @FXML
    void computeTLE(KeyEvent event) {
    	try {
    	TLE1Average = Integer.parseInt(TLE1_1Field.getText()) + Integer.parseInt(TLE1_2Field.getText()) + Integer.parseInt(TLE1_3Field.getText()) + Integer.parseInt(TLE1_4Field.getText());
    	TLE1Average = TLE1Average/4;
    	TLE1_fField.setText(Integer.toString(TLE1Average));
    	if(TLE1Average >= 75) {
    		TLE1_rField.setText("Passed");
    	} else if (TLE1Average < 75) {
    		TLE1_rField.setText("Failed");
    	} else {
    		TLE1_rField.setText("");
    	};
    	} catch (Exception e) {
    		
    	}
    }	
    
    @FXML
    void computeMAPEH(KeyEvent event) {
    	try {
    	MAPEH1Average = Integer.parseInt(MAPEH1_1Field.getText()) + Integer.parseInt(MAPEH1_2Field.getText()) + Integer.parseInt(MAPEH1_3Field.getText()) + Integer.parseInt(MAPEH1_4Field.getText());
    	MAPEH1Average = MAPEH1Average/4;
    	MAPEH1_fField.setText(Integer.toString(MAPEH1Average));
    	if(MAPEH1Average >= 75) {
    		MAPEH1_rField.setText("Passed");
    	} else if (MAPEH1Average < 75) {
    		MAPEH1_rField.setText("Failed");
    	} else {
    		MAPEH1_rField.setText("");
    	};
    	} catch (Exception e) {
    		
    	}
    }	
    
    @FXML
    void closeForm137(ActionEvent event) throws IOException {
    	
    	root = FXMLLoader.load(getClass().getResource("AddRecord.fxml"));
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();

    }

    @FXML
    void download(ActionEvent event) {
    	
    	firstName = firstNameField.getText();
	    lastName = lastNameField.getText();
    	extnName = extnNameField.getText();
    	middleName = middleNameField.getText();
    	birthday = birthdayField.getText();
    	sex = sexField.getText();
    	school = schoolField.getText();
    	schoolID = schoolIDField.getText();
    	district = districtField.getText();
    	division = divisionField.getText();
    	region = regionField.getText();
    	
    	System.out.println(firstName);
    	System.out.println(lastName);
    	System.out.println(extnName);
    	System.out.println(middleName);
    	System.out.println(birthday);
    	System.out.println(sex);
    	
    	filipino1_1 = filipino1_1Field.getText();
    	english1_1 = english1_1Field.getText();
    	mathematics1_1 = mathematics1_1Field.getText();
    	science1_1 = science1_1Field.getText();
    	aralingPanlipunan1_1 = aralingPanlipunan1_1Field.getText();
    	EsP1_1 = EsP1_1Field.getText();
    	TLE1_1 = TLE1_1Field.getText();
    	MAPEH1_1 = MAPEH1_1Field.getText();
    	music1_1 = music1_1Field.getText();
    	arts1_1 = arts1_1Field.getText();
    	PE1_1 = PE1_1Field.getText();
    	health1_1 = health1_1Field.getText();
    	average1 = average1Field.getText();

    	filipino1_2 = filipino1_2Field.getText();
    	english1_2 = english1_2Field.getText();
    	mathematics1_2 = mathematics1_2Field.getText();
    	science1_2 = science1_2Field.getText();
    	aralingPanlipunan1_2 = aralingPanlipunan1_2Field.getText();
    	EsP1_2 = EsP1_2Field.getText();
    	TLE1_2 = TLE1_2Field.getText();
    	MAPEH1_2 = MAPEH1_2Field.getText();
    	music1_2 = music1_2Field.getText();
    	arts1_2 = arts1_2Field.getText();
    	PE1_2 = PE1_2Field.getText();
    	health1_2 = health1_2Field.getText();
    	
    	filipino1_3 = filipino1_3Field.getText();
    	english1_3 = english1_3Field.getText();
    	mathematics1_3 = mathematics1_3Field.getText();
    	science1_3 = science1_3Field.getText();
    	aralingPanlipunan1_3 = aralingPanlipunan1_3Field.getText();
    	EsP1_3 = EsP1_3Field.getText();
    	TLE1_3 = TLE1_3Field.getText();
    	MAPEH1_3 = MAPEH1_3Field.getText();
    	music1_3 = music1_3Field.getText();
    	arts1_3 = arts1_3Field.getText();
    	PE1_3 = PE1_3Field.getText();
    	health1_3 = health1_3Field.getText();
    	
    	filipino1_4 = filipino1_4Field.getText();
    	english1_4 = english1_4Field.getText();
    	mathematics1_4 = mathematics1_4Field.getText();
    	science1_4 = science1_4Field.getText();
    	aralingPanlipunan1_4 = aralingPanlipunan1_4Field.getText();
    	EsP1_4 = EsP1_4Field.getText();
    	TLE1_4 = TLE1_4Field.getText();
    	MAPEH1_4 = MAPEH1_4Field.getText();
    	music1_4 = music1_4Field.getText();
    	arts1_4 = arts1_4Field.getText();
    	PE1_4 = PE1_4Field.getText();
    	health1_4 = health1_4Field.getText();
    	
    	String name = firstName + " " + lastName;
    	System.out.println(name);
    	
    	
    	if (extnName.equals("JR.") || extnName.equals("SR.") || extnName.equals("JR") || extnName.equals("SR") || extnName.equals("III") || extnName.equals("II")  || extnName.equals("I") || extnName.equals("IV") || extnName.equals("V")) {
    		name = firstName + " " + lastName + " " + extnName;
    		System.out.println("with name extension");
    	} else {
			System.out.println("no name extension");
			extnName = "";
    	}
    	
    	try {
			//Taking file as Input
			XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("C:\\Users\\Autida\\eclipse-workspace\\test3\\src\\test3\\sources\\Form137.xlsx"));
//			XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("C:\\Users\\Autida\\Desktop\\test.xlsx"));
			
			//Reading Sheet
			XSSFSheet sh = wb.getSheet("front");
			
			
//			lrn, name, firstName, lastName, extnName, middleName, birthday, sex, school, schoolID, district, division, region,"
//			+ "filipino1_1, english1_1, mathematics1_1, science1_1, aralingPanlipunan1_1, EsP1_1, TLE1_1, MAPEH1_1, music1_1, arts1_1, PE1_1, health1_1, average1,"
//			+ "filipino1_2, english1_2, mathematics1_2, science1_2, aralingPanlipunan1_2, EsP1_2, TLE1_2, MAPEH1_2, music1_2, arts1_2, PE1_2, health1_2,"
//			+ "filipino1_3, english1_3, mathematics1_3, science1_3, aralingPanlipunan1_3, EsP1_3, TLE1_3, MAPEH1_3, music1_3, arts1_3, PE1_3, health1_3,"
//			+ "filipino1_4, english1_4, mathematics1_4, science1_4, aralingPanlipunan1_4, EsP1_4, TLE1_4, MAPEH1_4, music1_4, arts1_4, PE1_4, health1_4)"
			String pwd=sh.getRow(3).getCell(1).toString();
			System.out.println(pwd);
			System.out.println(firstName);
//			sh.getRow(25).getCell(9).setCellValue("test");
//			sh.getRow(25).createCell(9).setCellValue("test");
			sh.getRow(6).getCell(3).setCellValue(firstName);
			sh.getRow(6).getCell(8).setCellValue(lastName);
			sh.getRow(6).getCell(14).setCellValue(extnName);
			sh.getRow(6).getCell(16).setCellValue(middleName);
			
			sh.getRow(7).getCell(5).setCellValue(lrn);
			sh.getRow(7).getCell(13).setCellValue(birthday);
			sh.getRow(7).getCell(16).setCellValue(sex);
			
			sh.getRow(19).getCell(2).setCellValue(school);
			sh.getRow(19).getCell(8).setCellValue(schoolID);
			sh.getRow(19).getCell(12).setCellValue(district);
			sh.getRow(19).getCell(15).setCellValue(division);
			sh.getRow(19).getCell(18).setCellValue(region);
			
			sh.getRow(24).getCell(9).setCellValue(filipino1_1);
			sh.getRow(25).getCell(9).setCellValue(english1_1);
			sh.getRow(26).getCell(9).setCellValue(mathematics1_1);
			sh.getRow(27).getCell(9).setCellValue(science1_1);
			sh.getRow(28).getCell(9).setCellValue(aralingPanlipunan1_1);
			sh.getRow(29).getCell(9).setCellValue(EsP1_1);
			sh.getRow(30).getCell(9).setCellValue(TLE1_1);
			sh.getRow(31).getCell(9).setCellValue(MAPEH1_1);
			sh.getRow(32).getCell(9).setCellValue(music1_1);
			sh.getRow(33).getCell(9).setCellValue(arts1_1);
			sh.getRow(34).getCell(9).setCellValue(PE1_1);
			sh.getRow(35).getCell(9).setCellValue(health1_1);

//			sh.getRow(6).getCell(14).setCellValue(division);
//			sh.getRow(6).getCell(16).setCellValue(middleName);
			
			wb.write(new FileOutputStream("C:\\Users\\Autida\\Desktop\\test\\" + lrn + ".xlsx"));
			
//			System.out.println(pwd);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		// Specify the path to the original and copied files
//	    File original = new File("C:\\\\Users\\\\Autida\\\\eclipse-workspace\\\\test3\\\\src\\\\test3\\\\sources\\\\Form137.xlsx");
////	    File original = new File("C:\\Users\\Autida\\Desktop\\test.xlsx");
//	    File copied = new File("C:\\Users\\Autida\\Desktop\\" + lrn + ".xlsx");
////	    File copied = new File("C:\\Users\\Autida\\Desktop\\test2.xlsx");
//
//	    // Copy the contents of the original file to the copied file
//	    try {
//			FileUtils.copyFile(original, copied);
//			
//			// Verify that the copied file exists and has the same contents as the original file
//		    Assert.assertTrue(copied.exists());
//		    Assert.assertTrue(FileUtils.contentEquals(original, copied));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    }

    @FXML
    void next(ActionEvent event) {

    }


    @FXML
    void saveForm137(ActionEvent event) {
    	
//    	AddRecordController test = new AddRecordController();
    	
    	firstName = firstNameField.getText();
	    lastName = lastNameField.getText();
    	extnName = extnNameField.getText();
    	middleName = middleNameField.getText();
    	birthday = birthdayField.getText();
    	sex = sexField.getText();
    	school = schoolField.getText();
    	schoolID = schoolIDField.getText();
    	district = districtField.getText();
    	division = divisionField.getText();
    	region = regionField.getText();
    	
    	filipino1_1 = filipino1_1Field.getText();
    	english1_1 = english1_1Field.getText();
    	mathematics1_1 = mathematics1_1Field.getText();
    	science1_1 = science1_1Field.getText();
    	aralingPanlipunan1_1 = aralingPanlipunan1_1Field.getText();
    	EsP1_1 = EsP1_1Field.getText();
    	TLE1_1 = TLE1_1Field.getText();
    	MAPEH1_1 = MAPEH1_1Field.getText();
    	music1_1 = music1_1Field.getText();
    	arts1_1 = arts1_1Field.getText();
    	PE1_1 = PE1_1Field.getText();
    	health1_1 = health1_1Field.getText();
    	average1 = average1Field.getText();

    	filipino1_2 = filipino1_2Field.getText();
    	english1_2 = english1_2Field.getText();
    	mathematics1_2 = mathematics1_2Field.getText();
    	science1_2 = science1_2Field.getText();
    	aralingPanlipunan1_2 = aralingPanlipunan1_2Field.getText();
    	EsP1_2 = EsP1_2Field.getText();
    	TLE1_2 = TLE1_2Field.getText();
    	MAPEH1_2 = MAPEH1_2Field.getText();
    	music1_2 = music1_2Field.getText();
    	arts1_2 = arts1_2Field.getText();
    	PE1_2 = PE1_2Field.getText();
    	health1_2 = health1_2Field.getText();
    	
    	filipino1_3 = filipino1_3Field.getText();
    	english1_3 = english1_3Field.getText();
    	mathematics1_3 = mathematics1_3Field.getText();
    	science1_3 = science1_3Field.getText();
    	aralingPanlipunan1_3 = aralingPanlipunan1_3Field.getText();
    	EsP1_3 = EsP1_3Field.getText();
    	TLE1_3 = TLE1_3Field.getText();
    	MAPEH1_3 = MAPEH1_3Field.getText();
    	music1_3 = music1_3Field.getText();
    	arts1_3 = arts1_3Field.getText();
    	PE1_3 = PE1_3Field.getText();
    	health1_3 = health1_3Field.getText();
    	
    	filipino1_4 = filipino1_4Field.getText();
    	english1_4 = english1_4Field.getText();
    	mathematics1_4 = mathematics1_4Field.getText();
    	science1_4 = science1_4Field.getText();
    	aralingPanlipunan1_4 = aralingPanlipunan1_4Field.getText();
    	EsP1_4 = EsP1_4Field.getText();
    	TLE1_4 = TLE1_4Field.getText();
    	MAPEH1_4 = MAPEH1_4Field.getText();
    	music1_4 = music1_4Field.getText();
    	arts1_4 = arts1_4Field.getText();
    	PE1_4 = PE1_4Field.getText();
    	health1_4 = health1_4Field.getText();
    	
    	
    	String name = firstName + " " + lastName;
    	
    	if (extnName.equals("JR.") || extnName.equals("SR.") || extnName.equals("JR") || extnName.equals("SR") || extnName.equals("III") || extnName.equals("II")  || extnName.equals("I") || extnName.equals("IV") || extnName.equals("V")) {
    		name = firstName + " " + lastName + " " + extnName;
    		System.out.println("with name extension");
    	} else {
			System.out.println("no name extension");
			extnName = "";
    	}
   
    	
			try {
//				String query = "SELECT * FROM studentsfinal2 WHERE (LRN = LRNData)"; 
				
//				Connection conn = dc.Connect();
//				Statement statement = conn.createStatement();
				
//				PreparedStatement pst = conn.prepareStatement("UPDATE studentsfinal2 " +
//			             "SET lastName = newName" +
//			             "WHERE LRN = '09990'");
				
//				PreparedStatement pst = conn.prepareStatement(
//						"UPDATE studentsfinal2 (lrn, name, firstName, lastName, extnName, middleName, birthday, sex, school, schoolID, district, division, region,"
//						+ "filipino1_1, english1_1, mathematics1_1, science1_1, aralingPanlipunan1_1, EsP1_1, TLE1_1, MAPEH1_1, music1_1, arts1_1, PE1_1, health1_1, average1,"
//						+ "filipino1_2, english1_2, mathematics1_2, science1_2, aralingPanlipunan1_2, EsP1_2, TLE1_2, MAPEH1_2, music1_2, arts1_2, PE1_2, health1_2,"
//						+ "filipino1_3, english1_3, mathematics1_3, science1_3, aralingPanlipunan1_3, EsP1_3, TLE1_3, MAPEH1_3, music1_3, arts1_3, PE1_3, health1_3,"
//						+ "filipino1_4, english1_4, mathematics1_4, science1_4, aralingPanlipunan1_4, EsP1_4, TLE1_4, MAPEH1_4, music1_4, arts1_4, PE1_4, health1_4)"
//						+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
//						+ "WHERE LRN = ?");
				
				String sql = "UPDATE studentsfinal2 "
						+ "SET lrn = ?, name = ?, firstName = ?, lastName = ?, extnName = ?, middleName = ?, birthday = ?, sex = ?, school = ?, schoolID = ?, district = ?, division = ?, region = ?, "
						+ "filipino1_1 = ?, english1_1 = ?, mathematics1_1 = ?, science1_1 = ?, aralingPanlipunan1_1 = ?, EsP1_1 = ?, TLE1_1 = ?, MAPEH1_1 = ?, music1_1 = ?, arts1_1 = ?, PE1_1 = ?, health1_1 = ?, average1 = ?, "
						+ "filipino1_2 = ?, english1_2 = ?, mathematics1_2 = ?, science1_2 = ?, aralingPanlipunan1_2 = ?, EsP1_2 = ?, TLE1_2 = ?, MAPEH1_2 = ?, music1_2 = ?, arts1_2 = ?, PE1_2 = ?, health1_2 = ?, "
						+ "filipino1_3 = ?, english1_3 = ?, mathematics1_3 = ?, science1_3 = ?, aralingPanlipunan1_3 = ?, EsP1_3 = ?, TLE1_3 = ?, MAPEH1_3 = ?, music1_3 = ?, arts1_3 = ?, PE1_3 = ?, health1_3 = ?, "
						+ "filipino1_4 = ?, english1_4 = ?, mathematics1_4 = ?, science1_4 = ?, aralingPanlipunan1_4 = ?, EsP1_4 = ?, TLE1_4 = ?, MAPEH1_4 = ?, music1_4 = ?, arts1_4 = ?, PE1_4 = ?, health1_4 = ? "
						+ "WHERE LRN = ?";


//				String sql = "UPDATE studentsfinal2 " +
//			             "SET name = ?, sex = ?"+
//			             "WHERE LRN = ?";
//				
				PreparedStatement pst = conn.prepareStatement(sql);
//				
//				
//				pst.setString(1, name);
//				pst.setString(2, "male");
//				pst.setString(3, LRNData);
//
//				int rowsUpdated = statement.executeUpdate();
		    	
		    	
				//Add
				pst.setString(1, lrn);
				pst.setString(2, name);
				pst.setString(3, firstName);
				pst.setString(4, lastName);
				pst.setString(5, extnName);
				pst.setString(6, middleName);
				pst.setString(7, birthday);
				pst.setString(8, sex);
				pst.setString(9, school);
				pst.setString(10, schoolID);
				pst.setString(11, district);
				pst.setString(12, division);
				pst.setString(13, region);
				pst.setString(14, filipino1_1);
				pst.setString(15, english1_1);
				pst.setString(16, mathematics1_1);
				pst.setString(17, science1_1);
				pst.setString(18, aralingPanlipunan1_1);
				pst.setString(19, EsP1_1);
				pst.setString(20, TLE1_1);
				pst.setString(21, MAPEH1_1);
				pst.setString(22, music1_1);
				pst.setString(23, arts1_1);
				pst.setString(24, PE1_1);
				pst.setString(25, health1_1);
				pst.setString(26, average1);

				pst.setString(27, filipino1_2);
				pst.setString(28, english1_2);
				pst.setString(29, mathematics1_2);
				pst.setString(30, science1_2);
				pst.setString(31, aralingPanlipunan1_2);
				pst.setString(32, EsP1_2);
				pst.setString(33, TLE1_2);
				pst.setString(34, MAPEH1_2);
				pst.setString(35, music1_2);
				pst.setString(36, arts1_2);
				pst.setString(37, PE1_2);
				pst.setString(38, health1_2);

				pst.setString(39, filipino1_3);
				pst.setString(40, english1_3);
				pst.setString(41, mathematics1_3);
				pst.setString(42, science1_3);
				pst.setString(43, aralingPanlipunan1_3);
				pst.setString(44, EsP1_3);
				pst.setString(45, TLE1_3);
				pst.setString(46, MAPEH1_3);
				pst.setString(47, music1_3);
				pst.setString(48, arts1_3);
				pst.setString(49, PE1_3);
				pst.setString(50, health1_3);

				pst.setString(51, filipino1_4);
				pst.setString(52, english1_4);
				pst.setString(53, mathematics1_4);
				pst.setString(54, science1_4);
				pst.setString(55, aralingPanlipunan1_4);
				pst.setString(56, EsP1_4);
				pst.setString(57, TLE1_4);
				pst.setString(58, MAPEH1_4);
				pst.setString(59, music1_4);
				pst.setString(60, arts1_4);
				pst.setString(61, PE1_4);
				pst.setString(62, health1_4);
				
				pst.setString(63, lrn);
				pst.execute();
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
				JOptionPane.showMessageDialog(null, "Data Saved.");
				
    	

    }
    
//    private DatabaseConnection dc;
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	try {
			DatabaseConnection dc = new DatabaseConnection();
			this.conn = dc.Connect();
			this.loadStudent();
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			System.exit(1);
		}
		
	}
    
    private void loadStudent() throws SQLException {
    	String sql = "SELECT * FROM studentsfinal2 WHERE lrn=?";
    	PreparedStatement stmt = conn.prepareStatement(sql);
    	stmt.setString(1, lrn);
    	ResultSet rs = stmt.executeQuery();
    	if(rs.next()) {
    		LRNField.setText(rs.getString("lrn"));
    		lastNameField.setText(rs.getString("lastname"));
    		
        	firstNameField.setText(rs.getString("firstName"));
        	extnNameField.setText(rs.getString("extnName"));
        	middleNameField.setText(rs.getString("middleName"));
        	birthdayField.setText(rs.getString("birthday"));
        	sexField.setText(rs.getString("sex"));
        	schoolField.setText(rs.getString("school"));
        	schoolIDField.setText(rs.getString("schoolID"));
        	districtField.setText(rs.getString("district"));
        	divisionField.setText(rs.getString("division"));
        	regionField.setText(rs.getString("region"));
        	
        	filipino1_1Field.setText(rs.getString("filipino1_1"));
        	english1_1Field.setText(rs.getString("english1_1"));
        	mathematics1_1Field.setText(rs.getString("mathematics1_1"));
        	science1_1Field.setText(rs.getString("science1_1"));
        	aralingPanlipunan1_1Field.setText(rs.getString("aralingPanlipunan1_1"));
        	EsP1_1Field.setText(rs.getString("EsP1_1"));
        	TLE1_1Field.setText(rs.getString("TLE1_1"));
        	MAPEH1_1Field.setText(rs.getString("MAPEH1_1"));
        	music1_1Field.setText(rs.getString("music1_1"));
        	arts1_1Field.setText(rs.getString("arts1_1"));
        	PE1_1Field.setText(rs.getString("PE1_1"));
        	health1_1Field.setText(rs.getString("health1_1"));
        	average1Field.setText(rs.getString("average1"));

        	filipino1_2Field.setText(rs.getString("filipino1_2"));
        	english1_2Field.setText(rs.getString("english1_2"));
        	mathematics1_2Field.setText(rs.getString("mathematics1_2"));
        	science1_2Field.setText(rs.getString("science1_2"));
        	aralingPanlipunan1_2Field.setText(rs.getString("aralingPanlipunan1_2"));
        	EsP1_2Field.setText(rs.getString("EsP1_2"));
        	TLE1_2Field.setText(rs.getString("TLE1_2"));
        	MAPEH1_2Field.setText(rs.getString("MAPEH1_2"));
        	music1_2Field.setText(rs.getString("music1_2"));
        	arts1_2Field.setText(rs.getString("arts1_2"));
        	PE1_2Field.setText(rs.getString("PE1_2"));
        	health1_2Field.setText(rs.getString("health1_2"));
        	
        	filipino1_3Field.setText(rs.getString("filipino1_3"));
        	english1_3Field.setText(rs.getString("english1_3"));
        	mathematics1_3Field.setText(rs.getString("mathematics1_3"));
        	science1_3Field.setText(rs.getString("science1_3"));
        	aralingPanlipunan1_3Field.setText(rs.getString("aralingPanlipunan1_3"));
        	EsP1_3Field.setText(rs.getString("EsP1_3"));
        	TLE1_3Field.setText(rs.getString("TLE1_3"));
        	MAPEH1_3Field.setText(rs.getString("MAPEH1_3"));
        	music1_3Field.setText(rs.getString("music1_3"));
        	arts1_3Field.setText(rs.getString("arts1_3"));
        	PE1_3Field.setText(rs.getString("PE1_3"));
        	health1_3Field.setText(rs.getString("health1_3"));
        	
        	filipino1_4Field.setText(rs.getString("filipino1_4"));
        	english1_4Field.setText(rs.getString("english1_4"));
        	mathematics1_4Field.setText(rs.getString("mathematics1_4"));
        	science1_4Field.setText(rs.getString("science1_4"));
        	aralingPanlipunan1_4Field.setText(rs.getString("aralingPanlipunan1_4"));
        	EsP1_4Field.setText(rs.getString("EsP1_4"));
        	TLE1_4Field.setText(rs.getString("TLE1_4"));
        	MAPEH1_4Field.setText(rs.getString("MAPEH1_4"));
        	music1_4Field.setText(rs.getString("music1_4"));
        	arts1_4Field.setText(rs.getString("arts1_4"));
        	PE1_4Field.setText(rs.getString("PE1_4"));
        	health1_4Field.setText(rs.getString("health1_4"));
    		
        	
        	try {
            	filipino1Average = Integer.parseInt(filipino1_1Field.getText()) + Integer.parseInt(filipino1_2Field.getText()) + Integer.parseInt(filipino1_3Field.getText()) + Integer.parseInt(filipino1_4Field.getText());
            	filipino1Average = filipino1Average/4;
            	filipino1_fField.setText(Integer.toString(filipino1Average));
            	if(filipino1Average >= 75) {
            		filipino1_rField.setText("Passed");
            	} else if (filipino1Average < 75) {
            		filipino1_rField.setText("Failed");
            	} else {
            		filipino1_rField.setText("");
            	};
            	} catch (Exception e) {
            		
            	};
            	
           try {
            	english1Average = Integer.parseInt(english1_1Field.getText()) + Integer.parseInt(english1_2Field.getText()) + Integer.parseInt(english1_3Field.getText()) + Integer.parseInt(english1_4Field.getText());
            	english1Average = english1Average/4;
            	english1_fField.setText(Integer.toString(english1Average));
            	if(english1Average >= 75) {
            		english1_rField.setText("Passed");
            	} else if (english1Average < 75) {
            		english1_rField.setText("Failed");
            	} else {
            		english1_rField.setText("");
            	};
            	} catch (Exception e) {
            		
            	}
            	
            
           try {
	           	mathematics1Average = Integer.parseInt(mathematics1_1Field.getText()) + Integer.parseInt(mathematics1_2Field.getText()) + Integer.parseInt(mathematics1_3Field.getText()) + Integer.parseInt(mathematics1_4Field.getText());
	           	mathematics1Average = mathematics1Average/4;
	           	mathematics1_fField.setText(Integer.toString(mathematics1Average));
           	if(mathematics1Average >= 75) {
           		mathematics1_rField.setText("Passed");
           	} else if (mathematics1Average < 75) {
           		mathematics1_rField.setText("Failed");
           	} else {
           		mathematics1_rField.setText("");
           	};
           	} catch (Exception e) {
           		
           	}
            
            try {
            	science1Average = Integer.parseInt(science1_1Field.getText()) + Integer.parseInt(science1_2Field.getText()) + Integer.parseInt(science1_3Field.getText()) + Integer.parseInt(science1_4Field.getText());
            	science1Average = science1Average/4;
            	science1_fField.setText(Integer.toString(science1Average));
            	if(science1Average >= 75) {
            		science1_rField.setText("Passed");
            	} else if (science1Average < 75) {
            		science1_rField.setText("Failed");
            	} else {
            		science1_rField.setText("");
            	};
            	} catch (Exception e) {
            		
            	}
            
            try {
            	aralingPanlipunan1Average = Integer.parseInt(aralingPanlipunan1_1Field.getText()) + Integer.parseInt(aralingPanlipunan1_2Field.getText()) + Integer.parseInt(aralingPanlipunan1_3Field.getText()) + Integer.parseInt(aralingPanlipunan1_4Field.getText());
            	aralingPanlipunan1Average = aralingPanlipunan1Average/4;
            	aralingPanlipunan1_fField.setText(Integer.toString(aralingPanlipunan1Average));
            	if(aralingPanlipunan1Average >= 75) {
            		aralingPanlipunan1_rField.setText("Passed");
            	} else if (aralingPanlipunan1Average < 75) {
            		aralingPanlipunan1_rField.setText("Failed");
            	} else {
            		aralingPanlipunan1_rField.setText("");
            	};
            	} catch (Exception e) {
            		
            	}
            
           try {
            	EsP1Average = Integer.parseInt(EsP1_1Field.getText()) + Integer.parseInt(EsP1_2Field.getText()) + Integer.parseInt(EsP1_3Field.getText()) + Integer.parseInt(EsP1_4Field.getText());
            	EsP1Average = EsP1Average/4;
            	EsP1_fField.setText(Integer.toString(EsP1Average));
            	if(EsP1Average >= 75) {
            		EsP1_rField.setText("Passed");
            	} else if (EsP1Average < 75) {
            		EsP1_rField.setText("Failed");
            	} else {
            		EsP1_rField.setText("");
            	};
            	} catch (Exception e) {
            		
            	}
            
            try {
            	TLE1Average = Integer.parseInt(TLE1_1Field.getText()) + Integer.parseInt(TLE1_2Field.getText()) + Integer.parseInt(TLE1_3Field.getText()) + Integer.parseInt(TLE1_4Field.getText());
            	TLE1Average = TLE1Average/4;
            	TLE1_fField.setText(Integer.toString(TLE1Average));
            	if(TLE1Average >= 75) {
            		TLE1_rField.setText("Passed");
            	} else if (TLE1Average < 75) {
            		TLE1_rField.setText("Failed");
            	} else {
            		TLE1_rField.setText("");
            	};
            	} catch (Exception e) {
            		
            	}
            
            try {
            	MAPEH1Average = Integer.parseInt(MAPEH1_1Field.getText()) + Integer.parseInt(MAPEH1_2Field.getText()) + Integer.parseInt(MAPEH1_3Field.getText()) + Integer.parseInt(MAPEH1_4Field.getText());
            	MAPEH1Average = MAPEH1Average/4;
            	MAPEH1_fField.setText(Integer.toString(MAPEH1Average));
            	if(MAPEH1Average >= 75) {
            		MAPEH1_rField.setText("Passed");
            	} else if (MAPEH1Average < 75) {
            		MAPEH1_rField.setText("Failed");
            	} else {
            		MAPEH1_rField.setText("");
            	};
            	} catch (Exception e) {
            		
            	}
    		
    	} else {
    		// show error
    	}
    }
    
}
