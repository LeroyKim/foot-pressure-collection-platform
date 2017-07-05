package org.knu.iilab.platform.collection.footpressure;

import org.knu.iilab.platform.collection.footpressure.configuration.DispatcherServletConfig;
import org.knu.iilab.platform.collection.footpressure.resourceprovider.RestfulPatientResourceProvider;
import org.knu.iilab.platform.collection.footpressure.servlet.PatientServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
        basePackageClasses = {
                DispatcherServletConfig.class,
                RestfulPatientResourceProvider.class,
                PatientServlet.class
        })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
