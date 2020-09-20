import java.util.ArrayList;

public class Climber {

    private String climberName;
    private int climberAge;
    private String gender;
    ArrayList<Mountains>mountains = new ArrayList<>();

    public Climber(String climberName, int climberAge, String gender) {
        this.climberName = climberName;
        this.climberAge = climberAge;
        this.gender = gender;
    }

    public String getClimberName(){
        return climberName;
    }

    public int getClimberAge() {
        return climberAge;
    }

    public String getGender() {
        return gender;
    }

    public void addMountain(Mountains mountain){
        mountains.add(mountain);
    }

    public int getHighestMountain(){
        int highestMountain = 0;
        for(Mountains mountain: mountains){
            if(highestMountain < mountain.getHeight()){
                highestMountain = mountain.getHeight();
            }
        }
        return highestMountain;
    }

    public int getAverageHeightOfMountain(){
        int averageHeight = 0;
        int totalMountainHeight = 0;
        for(Mountains mountain: mountains){
            totalMountainHeight = totalMountainHeight + mountain.getHeight();
            averageHeight = totalMountainHeight/mountains.size();
        }
        return averageHeight;
    }

    public void mountainHigherThanGivenLevel(int givenLevel){
            for (Mountains mountain : mountains) {
                if (mountain.getHeight() > givenLevel) {
                    System.out.println(mountain.getName() + " "+ mountain.getHeight());
                }
            }
    }

}
//    Define a Java class Climber with appropriate fields, methods and constructor to store and retrieve the name of the climber, their age and gender, and a list of Mountains that they have climbed. Note that different climbers may record details for the same mountain: these would be stored as separate objects. There is no need to record a master list of all mountains. Include methods to return:
//        • The highest mountain recorded by this climber.
//        • The average height mountain recorded by this climber.
//        • A list of all mountains recorded by the climber with a height greater than a given
//        level.