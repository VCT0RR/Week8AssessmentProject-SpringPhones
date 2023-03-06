/**
 * @author abhit - aryan9
 * CIS175 - Spring 2023
 * Mar 5, 2023
 */
package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Phone {
	@Id
	@GeneratedValue
	private int id;
	private String brand;
	private String model;
	private String color;
	@Autowired
	private Details details;
	
	public Phone() {
		// TODO Auto-generated constructor stub
		super();
		this.color = "space grey";
	}
	
	public Phone(String brand) {
		super();
		this.brand = brand;
	}
	
	public Phone(String brand, String model, String color) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
	}
	
	public Phone(int id, String brand, String model, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.color = color;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * @return the details
	 */
	public Details getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(Details details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Phone [id = " +  id + ", brand = " + brand + 
				", model = " + model + ", color = " + color + ", details = " + details + "]";
	}

}
