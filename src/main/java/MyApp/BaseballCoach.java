package MyApp;

public class BaseballCoach implements Coach {
//def a private field for the dependency
    private FortuneService fortuneService;

//def a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on coding";
    }

    @Override
    public String getDailyFortune() {
       //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
