package com.ilyanders.aop;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.ilyanders.aop.MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);

        uniLibrary.getBook();
        uniLibrary.addBook("Ilya", book);
        uniLibrary.addMagazine();

        /*uniLibrary.getMagazine();*/
        /*uniLibrary.returnMagazine();*/

        context.close();
    }
}
