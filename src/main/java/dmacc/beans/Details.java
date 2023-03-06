/**
 * @author abhit - aryan9
 * CIS175 - Spring 2023
 * Mar 5, 2023
 */
package dmacc.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class Details {

	private String name;
	private String phone;
	private String carrier;
	
	public Details() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Details(String name, String phone, String carrier) {
		super();
		this.name = name;
		this.phone = phone;
		this.carrier = carrier;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the carrier
	 */
	public String getCarrier() {
		return carrier;
	}

	/**
	 * @param carrier the carrier to set
	 */
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	@Override
	public String toString() {
		return "Details [name = " + name + ", phone = " + phone + ", carrier = " + carrier + "]";
	}

}
