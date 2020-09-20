import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class ClubStats {

    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        Club newClub = new Club();


        System.out.println("Welcome to the Club");
        while (true) {
            System.out.println("\n");
            System.out.println("Please choose from the below list when making your choice");
            System.out.println("Choose 1 to enter the information for a climber and the information of the mountain they climbed");
            System.out.println("Choose option 2 to see which climber has recorded the highest average mountain height");
            System.out.println("Choose option 3 to see the highest mountain recorded");
            System.out.println("Choose option 4 to see all mountains with a height greater than a given level");
            System.out.println("Choose option 5 to exit the program");
            int choice = menu.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please enter the first name of the Climber who wants to join the club");
                    String climberName = menu.next();
                    System.out.println("Please enter the age of the climber");
                    int climberAge = menu.nextInt();
                    System.out.println("Please enter their gender. Male, Female or Unknown are the choices");
                    String gender = menu.next();
                    if(!gender.equalsIgnoreCase("Male")) {
                        if (!gender.equalsIgnoreCase("Female")) {
                            if (!gender.equalsIgnoreCase("Unknown")) {
                                System.out.println("The gender you have entered is not recognised");
                                continue;
                            }
                        }
                    }
                    Climber climber = new Climber(climberName, climberAge, gender);
                    newClub.addClimber(climber);
                    System.out.println("Please enter the name of the Mountain");
                    String mountainName = menu.next();
                    System.out.println("Please enter the height of the mountain");
                    int mountainHeight = menu.nextInt();
                    Mountains mt = new Mountains(mountainName, mountainHeight);
                    climber.addMountain(mt);
                    break;
                case 2:
                    System.out.println("The climber with the highest average height of mountains scaled is: -");
                    newClub.getClimberWithTheHighestAverageMountainHeight();

                    break;
                case 3:
                    System.out.println("The highest mountain recorded: -");
                    newClub.getHighestMountainRecorded();
                    break;
                case 4:
                    System.out.println("To see the mountains with a height greater than a given level");
                    System.out.println("Please type out the level");
                    int givenLevel = menu.nextInt();
                    newClub.getMountainsHigherThanGivenLevel(givenLevel);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("This not an option please try again");
                    break;




            }
        }
    }
}

//Finally, define a class ClubStats, with a main method which does the following:
//        • Presents the user with a menu (printed to the console) of features:
//        o add a new climber to the club, given their name, age and gender;
//        o add details of a mountain (name, height) to the record for a given climber;
//        different climbers may record details for the same mountain: these would be stored as separate objects. There is no need to record a master list of all mountains.
//        o provide statistics: the climber who has recorded the highest average mountain height; the highest mountain recorded by a club member; and all mountains recorded with a height greater than a given level;
//        o exit
//        • Takes user input from the console to choose one of the menu features
//        • Allows the user to input, via the console, the details of climbers and mountains they
//        have recorded
//        • After executing one of the features, returns the user to the menu to choose another
//        option
////


//        Mountains mountain = new Mountains("Blue", 50);
//        Mountains mountain2 = new Mountains("Red", 97);
//        Mountains mountain3 = new Mountains("Orange", 55);
//        Mountains mountain4 = new Mountains("Purple", 29);
//        Mountains mountain5 = new Mountains("Yellow", 84);
//        Mountains mountain6 = new Mountains("Black", 72);
//        Climber climber = new Climber("Mike",22, Gender.MALE);
//        Climber climber2 = new Climber("Bob", 25, Gender.MALE);
//        Climber climber3 = new Climber("Jen", 24, Gender.FEMALE);
//        Club club = new Club("Royal");
//
//
//        climber.addMountain(mountain);
//        climber.addMountain(mountain4);
//        System.out.println(climber.getHighestMountain());
//        climber2.addMountain(mountain2);
//        climber2.addMountain(mountain5);
//        System.out.println(climber2.getHighestMountain());
//        climber3.addMountain(mountain3);
//        climber3.addMountain(mountain6);
//        System.out.println(climber3.getHighestMountain());
//        System.out.println("***********************");
//        System.out.println(climber.getAverageHeightOfMountain());
//        System.out.println(climber2.getAverageHeightOfMountain());
//        System.out.println(climber3.getAverageHeightOfMountain());
//        climber.mountainHigherThanGivenLevel(50);
//
//        System.out.println("**************************");
//        club.addClimber(climber);
//        club.addClimber(climber2);
//        club.addClimber(climber3);
//        club.getClimberWithTheHighestAverageMountainHeight();
//        club.getHighestMountainRecorded();
//        System.out.println("*********************");
//        club.getMountainsHigherThanGivenLevel(20);
//
//	// write your code here
//    }

