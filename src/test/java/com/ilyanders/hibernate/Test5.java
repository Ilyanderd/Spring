package com.ilyanders.hibernate;

import com.ilyanders.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test5 {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            session.createMutationQuery("delete Employee where name = 'Petr'").executeUpdate();
            /*
            Employee employee = session.get(Employee.class, 8);
            session.remove(employee);*/

            session.getTransaction().commit();
        }
    }
}
