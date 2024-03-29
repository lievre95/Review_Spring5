package MyApp;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    public TrackCoach(){

    }
    @Override
    public String getDailyWorkout(){

        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just DO IT: " + fortuneService.getFortune();
    }
}
