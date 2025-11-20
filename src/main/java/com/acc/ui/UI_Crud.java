package com.acc.ui;

import javax.persistence.*;

import com.acc.model.EmployeeEntity;
import com.sun.tools.javac.Main;

import java.net.URL;

public class UI_Crud {

	public static void main(String[] args) {
         TestConnection.mainConn();

		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("JPA_Practice");
        System.out.println("JPA EntityManagerFactory created successfully!");

		EntityManager entityManager =
				entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		// Insert
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setEmpName("Hloni");
		employeeEntity.setEmpSalary(35000.00);

		entityTransaction.begin();
		entityManager.persist(employeeEntity);
		entityTransaction.commit();
//
//		// Find
//
//        entityManagerFactory.close();
        URL resource = UI_Crud.class.getClassLoader().getResource("META-INF/persistence.xml");
        System.out.println("Persistence.xml location: " + resource);



    }

}
