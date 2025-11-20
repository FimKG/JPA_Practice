package com.acc.ui;

import javax.persistence.*;

import com.acc.model.EmployeEntity;

public class UI_Crud {

	public static void main(String[] args) {
         //TestConnection.mainConn();
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("JPA_Practice");

		EntityManager entityManager =
				entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		// Insert
		EmployeEntity employeEntity = new EmployeEntity();

		employeEntity.setEmpName("Hloni");
		employeEntity.setEmpRole("Child");
		employeEntity.setEmpSalary(35000.00);
        entityTransaction.begin();
        entityManager.persist(employeEntity);
        entityTransaction.commit();

		// Find
        EmployeEntity found = entityManager.find(EmployeEntity.class, employeEntity.getEmpId());
        System.out.println("Found Employee Id: " + found.getEmpId());
        System.out.println("Found Employee Name: " + found.getEmpName());
        System.out.println("Found Employee Role: " + found.getEmpRole());
        System.out.println("Found Employee Salary: " + found.getEmpSalary());

        // Update
        entityManager.getTransaction().begin();
        found.setEmpRole("Senior Developer");
        entityManager.merge(found);
        entityManager.getTransaction().commit();

        // Delete
        entityManager.getTransaction().begin();
        entityManager.remove(found);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }

}
