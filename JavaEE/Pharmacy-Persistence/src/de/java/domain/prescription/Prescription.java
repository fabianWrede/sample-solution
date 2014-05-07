package de.java.domain.prescription;

import static javax.persistence.CascadeType.*;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import de.java.domain.customer.Customer;

@Entity
public class Prescription implements Serializable {

  private static final long serialVersionUID = 4728846105423995587L;

  @Id
  @GeneratedValue
  private long id;

  @ManyToOne(cascade={DETACH,MERGE,PERSIST,REFRESH})
  private Customer customer;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

}