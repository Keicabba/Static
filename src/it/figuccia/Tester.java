package it.figuccia;

public class Tester {
    public static void main(String[] args) {
        Employee employee1= new Employee("Gino" ,"Porello", "via Vai 69");
        Employee employee2= new Employee("Pino" ,"Tornello", "via Vai 69");

        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        System.out.println("Badge 1: ");
        badge1.showBadgeDetails();
        System.out.println();

        System.out.println("Badge 2: ");
        badge2.showBadgeDetails();

    }
}
