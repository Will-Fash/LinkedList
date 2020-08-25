package com.company;

public class Main {

    public static void main(String[] args) {

        // write your code here

    Employee janeJones = new Employee("Jane", "Jones", 123);
    Employee johnDoe = new Employee("John", "Doe", 4567);
    Employee marySmith = new Employee("Mary", "Smith", 22);
    Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
    Employee billEnd = new Employee("Bill", "End", 419);

    EmployeeLinkedList list = new EmployeeLinkedList();

    System.out.println(list.isEmpy());

    list.addTOFront(janeJones);
    list.addTOFront(johnDoe);
    list.addTOFront(marySmith);
    list.addTOFront(mikeWilson);
    list.addToEnd(billEnd);

    list.printList();
    System.out.println("SIZE -> " + list.size());

    list.removeFromFront();

    list.printList();
    System.out.println("SIZE -> " + list.size());

    list.removeFromEnd();
    list.printList();
    System.out.println("SIZE -> " + list.size());

    /*list.removeFromFront();
    System.out.println("\nSIZE -> " + list.size());
    list.printList();*/

    }
}
