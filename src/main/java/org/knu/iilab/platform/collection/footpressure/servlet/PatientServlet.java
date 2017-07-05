package org.knu.iilab.platform.collection.footpressure.servlet;

import ca.uhn.fhir.rest.server.IResourceProvider;
import ca.uhn.fhir.rest.server.RestfulServer;
import org.knu.iilab.platform.collection.footpressure.resourceprovider.RestfulPatientResourceProvider;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/fhir/*"}, displayName = "Servlet test")
public class PatientServlet extends RestfulServer{

    @Override
    protected void initialize() throws ServletException {
        List<IResourceProvider> resourceProviders = new ArrayList<>();
        resourceProviders.add(new RestfulPatientResourceProvider());
        setResourceProviders(resourceProviders);
    }
}
