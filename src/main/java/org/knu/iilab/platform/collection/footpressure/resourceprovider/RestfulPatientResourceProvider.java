package org.knu.iilab.platform.collection.footpressure.resourceprovider;

import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.annotation.IdParam;
import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.server.IResourceProvider;
import org.hl7.fhir.dstu3.model.ContactPoint;
import org.hl7.fhir.dstu3.model.Enumerations;
import org.hl7.fhir.dstu3.model.Patient;

import java.util.Date;

public class RestfulPatientResourceProvider implements IResourceProvider{
    @Override
    public Class<Patient> getResourceType() {
        return Patient.class;
    }

    @Read()
    public Patient getResourceById(@IdParam IdDt theId) {
        Patient patient = new Patient();

        // Search patient with theId

        patient.addIdentifier();
        patient.getIdentifier().get(0).setSystem("http://hl7.org/fhir/sid/kr-rrn"); // false system uri for Korea Resident Registration Number
        patient.getIdentifier().get(0).setValue("920731-1111111");
        patient.addName().setFamily("Kim").addGiven("Leroy");
        patient.setGender(Enumerations.AdministrativeGender.MALE);
        patient.setBirthDate(new Date(92,7,31));
        patient.addTelecom().setSystem(ContactPoint.ContactPointSystem.PHONE).setValue("010-7777-7777");

        return patient;
    }
}