/*At a busy train station, passengers are queued up to board the train. However, senior citizens (age 60 and above) should be allowed to board first, regardless of when they entered the queue. Others follow the FIFO order.
You are to build a Queue Management System that supports:
1.Add a passenger (name, age, ticketType)
2.Board the next passenger (Senior first, then others in order)
3.Display passengers in both queues
4.Check if all queues are empty*/

import java.util.*;
class Passenger {
    String name;
    int age;
    String ticketType;

    public Passenger(String name, int age, String ticketType) {
        this.name = name;
        this.age = age;
        this.ticketType = ticketType;
    }
    public String toString() {
        return name + " (" + age + ", " + ticketType + ")";
    }
}
public class QueueManagementSystem {
    private Queue<Passenger> sq = new LinkedList<>();
    private Queue<Passenger> rq = new LinkedList<>();
    public void addPassenger(String name, int age, String ticketType) {
        Passenger p = new Passenger(name, age, ticketType);
        if (age >= 60) {
            sq.add(p);
        } else {
            rq.add(p);
        }
    }
    public void boardNextPassenger() {
        if (!sq.isEmpty()) {
            Passenger p = sq.remove();
            System.out.println("Boarding (Senior): " + p);
        } else if (!rq.isEmpty()) {
            Passenger p = rq.remove();
            System.out.println("Boarding: " + p);
        } else {
            System.out.println("No passengers to board.");
        }
    }
    public void displayQueues() {
        System.out.println("Senior Queue: ");
        if (sq.isEmpty()) System.out.println("Empty");
        for (Passenger p : sq) {
            System.out.println(p);
        }
        System.out.println("Regular Queue: ");
        if (rq.isEmpty()) System.out.println("Empty");
        for (Passenger p : rq) {
            System.out.println(p);
        }
    }
    public boolean AllEmpty() {
        return sq.isEmpty() && rq.isEmpty();
    }
    public static void main(String[] args) {
        QueueManagementSystem qms = new QueueManagementSystem();
        qms.addPassenger("Vipul", 20, "3A");
        qms.addPassenger("Shivaji", 65, "2A");
        qms.displayQueues();
        qms.boardNextPassenger();
        qms.boardNextPassenger();
        if(qms.AllEmpty()) {
        	System.out.println("queues are empty");
        }else {
        	System.out.println("queues are not empty");
        }
    }
}
