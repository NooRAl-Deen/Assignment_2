package Users;

import java.util.List;

public class ManagerUser extends User {
    List<User> employees;

    public List<User> getEmployees() {
        return employees;
    }
    public ManagerUser(int ID, String name, int age, double hourlyRate, int totalHoursPerMonth, List<User> employees) {
        super(ID, name, age, hourlyRate, totalHoursPerMonth);
        this.employees = employees;
    }
}
