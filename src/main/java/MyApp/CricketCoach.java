package MyApp;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    //creating a no-arg constructor
    public CricketCoach() {
        System.out.println("Cricket: inside no-arg constructor");
    }
// our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket: inside no-arg constructor - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
