package MyApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //load the spring conf file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("file:C:/Users/Professional/IdeaProjects/spring-di-example-master/src/main/java/MyApp/applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //call our new method for fortune
        System.out.println(theCoach.getDailyWorkout());

        //call methods
        System.out.println(theCoach.getDailyFortune());
        //close the context
        context.close();
    }
}
