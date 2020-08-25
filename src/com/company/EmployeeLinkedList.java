package com.company;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addTOFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if(head == null){
            tail = node;
        }else {

            head.setPrev(node);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

        if(tail == null){
            head = node;
        }else {
            node.setPrev(tail);
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public EmployeeNode removeFromEnd(){
        if(isEmpy()){
            return  null;
        }

        EmployeeNode removedNode = tail;

        if(tail.getPrev() == null){
            head = null;
        }else {
            tail.getPrev().setNext(null);
        }
        tail = tail.getPrev();
        size--;
        removedNode.setPrev(null);
        return removedNode;
    }

    public EmployeeNode removeFromFront(){
        if (isEmpy()){
            return null;
        }

        EmployeeNode removedNode = head;

        if (head.getNext() == null){
            tail = null;
        }else {
            head.getNext().setPrev(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public boolean isEmpy(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");

        while (current != null){
            System.out.print(current);
            System.out.print(" <=> ");
            current =  current.getNext();
        }
        System.out.println("null");


    }

}
