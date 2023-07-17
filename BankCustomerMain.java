package BankCustomer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class BankCustomerMain {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("manisha");
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();
    
   Customer c1= new Customer();
   c1.setId(1);
   c1.setName("Sangita");
   c1.setAccno(4656565l);
   c1.setPhoneno(4646557l);
   
   Customer c2= new Customer();
   c2.setId(2);
   c2.setName("Pavan");
   c2.setAccno(4654685l);
   c2.setPhoneno(46987557l);
   
   List<Customer> customers=new ArrayList<Customer>();
   customers.add(c1);
   customers.add(c2);
   
   
   Bank b1=new Bank();
   b1.setId(1);
   b1.setName("SBI");
   b1.setCustomer(customers);
   
   entityTransaction.begin();
   entityManager.persist(b1);
   entityManager.persist(c1);
   entityManager.persist(c2);
   entityTransaction.commit();
   
   
   
   
   
   
   
   
    
	}
}
