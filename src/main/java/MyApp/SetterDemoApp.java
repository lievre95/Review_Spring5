package MyApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //load the spring conf file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("file:C:/Users/Professional/IdeaProjects/spring-di-example-master/src/main/java/MyApp/applicationContext.xml");

        //retrieve bean from spring container
        CricketCoach theCoach=context.getBean("myCricketCoach", CricketCoach.class);


        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());


        //close the context
        context.close();



    }
}
