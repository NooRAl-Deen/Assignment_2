package Users;

import java.util.List;

public class Director extends ManagerUser {
    public Director(int ID, String name, int age, double hourlyRate, int totalHoursPerMonth, List<User> employees) {
        super(ID, name, age, hourlyRate, totalHoursPerMonth, employees);
    }
}
