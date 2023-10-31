package Users;

import java.util.List;

public class Manager extends ManagerUser {
    public Manager(int ID, String name, int age, double hourlyRate, int totalHoursPerMonth, List<User> employees) {
        super(ID, name, age, hourlyRate, totalHoursPerMonth, employees);
    }
}
