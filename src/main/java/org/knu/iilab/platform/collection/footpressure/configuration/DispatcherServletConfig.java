package org.knu.iilab.platform.collection.footpressure.configuration;

import org.knu.iilab.platform.collection.footpressure.servlet.PatientServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebServlet;

@Configuration
public class DispatcherServletConfig{
//    @Override
//    public void onStartup(ServletContext container) throws ServletException {
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.register(DispatcherServletConfig.class);
//        container.addListener(new ContextLoaderListener(context));
//        ServletRegistration.Dynamic dispatcher = container.addServlet("Servlet test",)
//    }
    @Bean
    public ServletRegistrationBean patientServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new PatientServlet());
        registrationBean.addUrlMappings("/fhir/*");
        return registrationBean;
    }
}
