package com.ilyanders.hibernate;

import com.ilyanders.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test2 {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Sidorov", "HR", 6000);
            session.beginTransaction();
            session.persist(employee);
            /*session.getTransaction().commit();*/

            int id = employee.getId();

            /*session = sessionFactory.getCurrentSession();*/
            /*session.getTransaction().begin();*/
            Employee employee2 = session.get(Employee.class, id);
            session.getTransaction().commit();
            System.out.println(employee2);

        }
    }
}
