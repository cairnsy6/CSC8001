import java.util.ArrayList;

public class Club {

    ArrayList<Climber>climbers = new ArrayList<>();
    private String club;

    public Club(String club){
        this.club = club;
        ArrayList<Climber>climbers;
    }

    public Club(){}

    public void addClimber(Climber climber){
        climbers.add(climber);
    }

    public void getClimberWithTheHighestAverageMountainHeight() {
        Climber largestAverage = climbers.get(0);
        for (Climber climber : climbers) {
            if (largestAverage.getAverageHeightOfMountain() < climber.getAverageHeightOfMountain()) {
                largestAverage = climber;
                System.out.println(largestAverage.getClimberName());
            }

        }
    }

    public void getHighestMountainRecorded(){
        Climber largestMountain = climbers.get(0);
        for(int i = 0; i<climbers.size(); i++){
           Climber climber = climbers.get(i);
            if(largestMountain.getHighestMountain() < climber.getHighestMountain()){
                largestMountain = climber;
                System.out.println(largestMountain.getHighestMountain());
            }
        }
    }

    public void getMountainsHigherThanGivenLevel(int givenLevel){
        for(Climber climber: climbers){
            climber.mountainHigherThanGivenLevel(givenLevel);
        }
    }
}
//    Define a Java class Club, which holds information about all climbers. Include methods to return:
//        • The climber who has recorded the highest average mountain height.
//        • The highest mountain recorded by a member of the club.
//        • A list of all mountains that have been recorded, that are higher than a given level.//