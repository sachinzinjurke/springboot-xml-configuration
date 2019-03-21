package com.bny.boot.springbootxmlconfiguration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bny.boot.*")
public class SpringbootXmlConfigurationApplication implements CommandLineRunner{

	@Autowired
    private ApplicationContext appContext;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootXmlConfigurationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String[] beans = appContext.getBeanDefinitionNames();
        Arrays.sort(beans);
        for (String bean : beans) {
            System.out.println(bean);
        }
	}

}
