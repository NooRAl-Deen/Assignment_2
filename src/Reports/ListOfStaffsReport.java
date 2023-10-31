package Reports;

import Users.Director;
import Users.ManagerUser;
import Users.User;

public class ListOfStaffsReport implements IReportGenerator {
    private final ManagerUser user;

    public ListOfStaffsReport(ManagerUser user) {
        this.user = user;
    }

    @Override
    public void generate() {
        System.out.println("<< Staffs Report >>");
        System.out.println("---------------------------------------------------------");
        System.out.println("List of employees managed by [ " + user.getName() + " ].");
        for(User employee : user.getEmployees()) {
            employee.printInformation();
        }
        System.out.println("---------------------------------------------------------");
    }
}
