package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Details;
import dmacc.beans.Phone;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PhoneRepository;

//(exclude = {DataSourceAutoConfiguration.class })

@SpringBootApplication
public class SpringPhonesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringPhonesApplication.class, args);

	}
	
	@Autowired
	PhoneRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Phone p = appContext.getBean("phone", Phone.class);
		p.setColor("matte black");
		repo.save(p);
		
		Phone i = new Phone("iPhone", "12 Pro", "gold");
		Details d = new Details("Tony Rufial", "515-999-1234", "US Cellular");
		i.setDetails(d);
		repo.save(i);
		
		List<Phone> allMyTypes = repo.findAll();
		for(Phone types : allMyTypes) {
			System.out.println(types.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}

}
