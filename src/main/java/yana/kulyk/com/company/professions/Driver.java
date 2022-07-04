package yana.kulyk.com.company.professions;

public class Driver extends Person {

    private int experience;

    public Driver(String fullName, int age, int experience){
        super(fullName,age);
        this.setExperience(experience);
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                '}';
    }
}
