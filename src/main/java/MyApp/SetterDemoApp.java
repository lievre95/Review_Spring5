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

        //setters OK
      theCoach.setTeam("ku");
      theCoach.setEmailAddress("123@mail.ru");

        //call our new methods to get literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());


        //close the context
        context.close();



    }
}
