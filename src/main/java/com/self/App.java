package com.self;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Student student = new Student();
        
        student.setId(101);
        student.setName("Abhishek");
        student.setCity("Mehkar");
        
         Session session = factory.openSession();
         
         Transaction transaction = session.beginTransaction();
         
         session.save(student);
         
         transaction.commit();
         
         session.close();
    }
}
