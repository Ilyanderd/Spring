package com.ilyanders.hibernate;

import com.ilyanders.hibernate.entity.Employee;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaUpdate;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Test4 {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            /*Employee emp = session.get(Employee.class, 1);
            emp.setSalary(5000);*/

            session.createMutationQuery("update Employee set salary = 1000 where name = 'Ilya'").executeUpdate();

            session.getTransaction().commit();
        }
    }
}
