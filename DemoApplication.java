package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private YAMLConfig ymlConfig;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.run();
	}
	public void run(String... args) throws Exception{
		System.out.println("Name :"+ymlConfig.getName());
		System.out.println("Integer list :"+ymlConfig.getIntList());
		System.out.println("String list :" + ymlConfig.getStrList());
		System.out.println("Integer Set:" +ymlConfig.getIntSet());
		System.out.println("String set :"+ymlConfig.getStrSet());
		System.out.println("Another string list"+ymlConfig.getMyMap());
	}
}
