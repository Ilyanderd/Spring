package com.ilyanders.hibernate;

import com.ilyanders.hibernate.entity.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static jakarta.persistence.criteria.Predicate.BooleanOperator.AND;

@SpringBootTest
class Test3 {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            /*List<Employee> employees = session.createQuery("from Employee").getResultList();*/

            List<Employee> employees = session.createQuery("from Employee where name = 'Ilya' AND salary > 1").getResultList();

            for (Employee employee : employees) {
                System.out.println(employee);
            }

            session.getTransaction().commit();
        }
    }
}
