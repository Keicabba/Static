package it.figuccia;

import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }
    private String generateBadgeIdCode() {
        Random rand = new Random();
        String randomString1 = "XYZ" + rand.nextInt(100);
        String randomString2 = "ZYX" + rand.nextInt(100);
        return randomString1 + employee.name + employee.surname + randomString2;

    }
    public void showBadgeDetails() {
        System.out.println("Number of employees: " + totalNumberOfEmployees);
        System.out.println("Employee details: " + employee.getEmployeeDetails());
        System.out.println("ID badge: " + badgeIdCode);
    }
    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }
}
