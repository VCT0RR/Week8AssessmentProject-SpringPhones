/**
 * @author abhit - aryan9
 * CIS175 - Spring 2023
 * Mar 5, 2023
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Details;
import dmacc.beans.Phone;

@Configuration
public class BeanConfiguration {

	@Bean
	public Phone phone() {
		Phone bean = new Phone("Samsung Galaxy S22");
		bean.setBrand("IPhone");
		bean.setModel("14 Pro Max");
		bean.setColor("rose gold");
		return bean;
	}
	
	@Bean
	public Details details() {
		Details bean = new Details("Brandon Lamar", "555-123-8888", "Verizon");
		return bean;
	}

}
