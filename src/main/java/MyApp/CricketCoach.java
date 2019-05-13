package MyApp;

public class CricketCoach implements Coach{
//    public CricketCoach(String emailAddress, String team) {
//        super();
//        this.emailAddress = emailAddress;
//        this.team = team;
//    }

    //add new fields for emailAddress and team
    private String emailAddress;
    private String team;
    private FortuneService fortuneService;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method-setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method-setTeam");
        this.team = team;
    }

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

    public void setMyCoach() {
    }
}
