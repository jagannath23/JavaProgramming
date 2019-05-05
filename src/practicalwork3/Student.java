package practicalwork3;

import java.util.Scanner;

public class Student extends Person {
    private String levelOfEnglishExperience;
    private String levelOfFrenchExperience;
    private String levelOfGermanExperience;
    private String levelOfRussianExperience;
    static final String[] LANGUAGES = {"english", "french", "german", "russian"};

    private String getLevelOfEnglishExperience() {
        return levelOfEnglishExperience;
    }

    private void setLevelOfEnglishExperience(String levelOfEnglishExperience) {
        this.levelOfEnglishExperience = levelOfEnglishExperience;
    }

    private String getLevelOfFrenchExperience() {
        return levelOfFrenchExperience;
    }

    private void setLevelOfFrenchExperience(String levelOfFrenchExperience) {
        this.levelOfFrenchExperience = levelOfFrenchExperience;
    }

    private String getLevelOfGermanExperience() {
        return levelOfGermanExperience;
    }

    private void setLevelOfGermanExperience(String levelOfGermanExperience) {
        this.levelOfGermanExperience = levelOfGermanExperience;
    }

    private String getLevelOfRussianExperience() {
        return levelOfRussianExperience;
    }

    private void setLevelOfRussianExperience(String levelOfRussianExperience) {
        this.levelOfRussianExperience = levelOfRussianExperience;
    }

    void enterStudentData(Scanner scanner) {
        this.enterPersonData(scanner);

        Person.showMessage("\nExperience levels: basic level, medium level, advanced level");
        Person.showMessage("\nWhat experience does the student have with the languages? \n");
        for (String language : LANGUAGES) {
            Person.showMessage(language + ": ");
            switch (language) {
                case "english":
                    this.setLevelOfEnglishExperience(scanner.nextLine());
                    break;
                case "french":
                    this.setLevelOfFrenchExperience(scanner.nextLine());
                    break;
                case "german":
                    this.setLevelOfGermanExperience(scanner.nextLine());
                    break;
                case "russian":
                    this.setLevelOfRussianExperience(scanner.nextLine());
                    break;
            }
        }
    }

    void getStudentExperience() {
        for (String language : LANGUAGES) {
            switch (language) {
                case "english":
                    System.out.printf("%12s", this.getLevelOfEnglishExperience());
                    break;
                case "french":
                    System.out.printf(" | %12s", this.getLevelOfFrenchExperience());
                    break;
                case "german":
                    System.out.printf(" | %12s", this.getLevelOfGermanExperience());
                    break;
                case "russian":
                    System.out.printf(" | %12s", this.getLevelOfRussianExperience() + "\n");
                    break;

            }
        }
    }
}
