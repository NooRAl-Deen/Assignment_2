# Assignment_2

Depends on the requirements we have a three type of users :
- **Director.**
- **Manager.**
- **Staff.**

All type of users has the same attributes => [ID, name, age, hourly rate, total number of completed hours for each month].
So we can make a class **[User]** that represents the user and these type of users inherit from it.

Now we have **[Director]** and **[Manager]**:

- **[Director]** => Has a list of Managers and Staff.

- **[Manager]** =>  Has a list of Staff.

both has the same list so i make **[ManagerUser]** class inherit from **[User]** and add **List<User>** to it
So :

- **[Staff]** extends from **[User]**.

- **[ManagerUser]** extends from **[User]**.

- **[Director]** extends from **[ManagerUser]**.

- **[Manager]** extends from **[ManagerUser]**.


Each class of this has attributes and setters and getters and constructors
like a model

The application's primary tasks are to generate a set of reports, should be flexible to allow for the addition of new reports

So i made an interface **[IReportGenerator]** and each report i want to make it must implements this interface

- **[listOfStaffsReport]** implements **[IReportGenerator]**
- **[BudgetReport]** implements **[IReportGenerator]**

For the database i made a **[Database]** class

the requirement => only one connection is open for each user.
so i made it by **singleton design pattern.**

![Screenshot 2023-10-31 191719.png](https://l.top4top.io/p_2860uabc21.png)
