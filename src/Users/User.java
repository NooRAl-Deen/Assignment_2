package Users;

public class User {
    private int ID;
    private String name;
    private int age;
    private double hourlyRate;
    private int totalHoursPerMonth;

    public User(int ID, String name, int age, double hourlyRate, int totalHoursPerMonth) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.totalHoursPerMonth = totalHoursPerMonth;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getTotalHoursPerMonth() {
        return totalHoursPerMonth;
    }

    public void setTotalHoursPerMonth(int totalHoursPerMonth) {
        this.totalHoursPerMonth = totalHoursPerMonth;
    }

    public void printInformation() {
        System.out.println("[ ID : " + this.ID + ", Name : " + this.name + ", Age : " + this.age + ", Hours rate : $" + this.hourlyRate + ", Total hours in month : " + this.totalHoursPerMonth + " ]");
    }

    @Override
    public String toString() {
        return "[ ID : " + this.ID + ", Name : " + this.name + ", Age : " + this.age + ", Hours rate : $" + this.hourlyRate + ", Total hours in month : " + this.totalHoursPerMonth + " ]";
    }
}
