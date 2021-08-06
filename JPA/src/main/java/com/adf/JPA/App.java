package com.adf.JPA;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App 
{
    @SuppressWarnings({ "resource", "unchecked" })
	public static void main( String[] args )
    {
    	
    	Scanner sc = new Scanner(System.in);
    	int id = sc.nextInt();
		System.out.println("Enter account number");
		long acc_no = sc.nextLong();
		System.out.println("Enter account holder name");
		String name = sc.next();
		System.out.println("Enter account type");
		String type = sc.next();
		System.out.println("Enter balance amount");
		int balance = sc.nextInt();
		System.out.println("Enter Transaction fee");
		int fee = sc.nextInt();
		
		
		Account acc = new Account(id,acc_no,name,type,balance,fee);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(acc);
		
		Account a = em.find(Account.class, id);
		
		System.out.println(a);
		
		System.out.println("Displaying all accounts....");
		
		//Query query = em.createQuery("SELECT ac FROM Account ac");
		
		Query query = em.createNamedQuery("findAccountNo");
		
		List<Account> list = query.getResultList();
		
		for(Account account:list) {
			System.out.println(account);
		}
		
		
		em.getTransaction().commit();
		
    }
}
