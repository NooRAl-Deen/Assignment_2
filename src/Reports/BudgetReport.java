package Reports;

import Users.ManagerUser;
import Users.User;

public class BudgetReport implements IReportGenerator {
    private final ManagerUser user;

    public BudgetReport(ManagerUser user) {
        this.user = user;
    }

    @Override
    public void generate() {
        double sum = 0;
        System.out.println("<< Budget Report >>");
        System.out.println("---------------------------------------------------------");
        for(User employee : user.getEmployees()) {
            sum += employee.getHourlyRate() * employee.getTotalHoursPerMonth();
        }
        System.out.println("Budget for [ " + user.getName() + " ] is : $" + sum + ".");
        System.out.println("---------------------------------------------------------");
    }
}
