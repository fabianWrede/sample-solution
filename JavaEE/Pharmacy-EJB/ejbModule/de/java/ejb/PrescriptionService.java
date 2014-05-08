package de.java.ejb;

import java.util.Collection;

import javax.ejb.Remote;

import de.java.domain.prescription.Prescription;
import de.java.domain.prescription.PrescriptionState;

@Remote
public interface PrescriptionService {

  Collection<Prescription> getAllPrescriptions();
  
  Collection<Prescription> getPrescriptionsInState(
      PrescriptionState filterForState);

  Prescription getPrescription(long id);

}