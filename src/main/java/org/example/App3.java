package org.example;

import org.example.repository.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App3 {
    public static void main( String[] args ) {
        //load the spring configuration file
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        Coach theCoach = classPathXmlApplicationContext.getBean("myCoach", Coach.class);
        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        //call fortune method
        System.out.println(theCoach.getDailyFortune());
        //close the context
        classPathXmlApplicationContext.close();
    }
}
