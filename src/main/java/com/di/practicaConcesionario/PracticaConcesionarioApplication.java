package com.di.practicaConcesionario;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PracticaConcesionarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticaConcesionarioApplication.class, args);
		
		System.out.print("Iniciando proyecto...");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cnf.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		System.out.print(factory);
	}

}
