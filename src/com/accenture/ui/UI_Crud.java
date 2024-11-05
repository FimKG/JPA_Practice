package com.accenture.ui;

import javax.persistence.*;

import com.accenture.model.entity.EmployeeEntity;

public class UI_Crud {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("JPA_Practice");
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
		
		// Find
		
			
		
		

	}

}
