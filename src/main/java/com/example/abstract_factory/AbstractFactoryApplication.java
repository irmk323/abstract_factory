package com.example.abstract_factory;

import com.example.abstract_factory.app.Application;
import com.example.abstract_factory.factories.GUIFactory;
import com.example.abstract_factory.factories.MacOSFactory;
import com.example.abstract_factory.factories.WindowsFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryApplication {
	private static Application configureApplication() {
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
		} else {
			factory = new WindowsFactory();
		}
		app = new Application(factory);
		return app;
	}
	public static void main(String[] args) {
		SpringApplication.run(AbstractFactoryApplication.class, args);
		Application app = configureApplication();
		app.paint();
	}

}
