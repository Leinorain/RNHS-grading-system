package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class UserDetails {
	private final StringProperty lrn;
	private final StringProperty name;
	
	
	//Default Constructor
	public UserDetails(String lrn, String name) {
		this.lrn = new SimpleStringProperty(lrn);
		this.name = new SimpleStringProperty(name);
		
	}
	
	
	//Getters
	public String getLrn() {
		return lrn.get();
	}
	
	public String getName() {
		return name.get();
	}
	
	//Setters
	public void setLrn(String value) {
		lrn.set(value);
		
	}

	public void setName(String value) {
		name.set(value);
		
	}
	
	
	//Property Values
	public StringProperty lrnProperty() {
		return lrn;
	}

	public StringProperty nameProperty() {
		return name;
	}
}
