package bootApp.patterns.chofresp;

public class Competition {

    public static void main(String... args) {
        CustomerData data1 = new CustomerData("bob", 275, 10);
        CustomerData data2 = new CustomerData("julia", 265, 40);

        QualificationLevel firstLevel = new FirstLevel();
        QualificationLevel secondLevel = new SecondLevel();
        QualificationLevel thirdLevel = new ThirdLevel();
        firstLevel.setNextLevel(secondLevel);
        secondLevel.setNextLevel(thirdLevel);

        firstLevel.processRequest(data1);

        System.out.println("----------");

        firstLevel.processRequest(data2);


    }

}
