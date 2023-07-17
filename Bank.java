package BankCustomer;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	private int id;
	private String name;
	
	@OneToMany
	private List<Customer> customer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", customer=" + customer + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getCustomer()=" + getCustomer() + "]";
	}
	
	
	
	
	
	
	

	
	
}
