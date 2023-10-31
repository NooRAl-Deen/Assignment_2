import DB.Database;
import Reports.BudgetReport;
import Reports.ListOfStaffsReport;
import Users.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User ahmad = new User(1, "ahmad", 22, 8, 30);
        User ali = new User(2, "ali", 24, 7, 45);
        User rajab = new User(3, "rajab", 21, 7, 35);
        User samer = new User(4, "samer", 27, 10, 38);
        User murad = new User(5, "murad", 25, 9, 48);
        User hasan = new User(6, "hasan", 26, 10, 40);
        User omar = new User(7, "omar", 20, 6, 32);
        User waseem = new User(8, "waseem", 23, 8, 36);
        User mousa = new User(9, "mousa", 24, 9, 39);

        ManagerUser jamal = new Manager(10, "jamal", 22, 12, 33, List.of(mousa, murad, rajab, samer, hasan));
        ManagerUser yazan = new Manager(11, "yazan", 30, 11, 35, List.of(ahmad, ali, omar, waseem));

        ManagerUser noor = new Director(1111, "noor", 22, 13, 50, List.of(jamal, yazan));

        Database db = Database.getDb();
        db.save(noor);
        db.save(yazan);
        db.save(jamal);
        db.save(mousa);
        db.save(waseem);
        db.save(omar);
        db.save(hasan);
        db.save(murad);
        db.save(samer);
        db.save(rajab);
        db.save(ali);
        db.save(ahmad);

        BudgetReport noorReport = new BudgetReport(noor);
        noorReport.generate();

        ListOfStaffsReport noorStaffsReport = new ListOfStaffsReport(noor);
        noorStaffsReport.generate();

        ListOfStaffsReport yazanStaffsReport = new ListOfStaffsReport(yazan);
        yazanStaffsReport.generate();

        BudgetReport yazanReport = new BudgetReport(yazan);
        yazanReport.generate();
    }
}