package OrientationTask1_4;

import OrientationTask1_3.Customer;
import java.util.Scanner;
import java.util.LinkedList;

public class OrientationTask1_4 {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();

        Scanner input = new Scanner(System.in);
        // q refers to adding the customer
        // d refers to removing customer from queue
        // updated the total size of que when customer is added or removed
        // x = exit from program and stop task there


        System.out.println("Commands : q = enqueue , d = dequeue, s = queue size and x =  exit");
        while (true) {
            System.out.print("Command : ");
            String command = input.nextLine().trim().toLowerCase();

            switch (command) {
                case "q": {
                    Customer customer = new Customer();
                    customer.setStartTime(System.nanoTime());
                    queue.add(customer);
                    System.out.println(" Enqueued Customer : " + customer.getId());
                    break;
                }
                case "d": {
                   if (queue.isEmpty()) {
                       System.out.println("There is no enqueued Customer ");
                   }else  {
                       Customer customer1 = queue.removeLast(); // remove customer from queue from last (FIFO)
                       customer1.setEndTime(System.nanoTime()); // departure time
                       double spentTime = customer1.getTimeSpent();
                       System.out.printf("Dequeued Customer %d, waited %.3f ms%n " , customer1.getId() , spentTime );
                   }
                   break;
                }
                case "s": {
                    System.out.println( " Queue size : " + queue.size());
                    break;
                }
                case "x": {
                    System.out.println( " Exit ");
                    input.close();
                    return;
                }
                default: {
                    System.out.println("Unknown command. Use 'q' or 'd' or 's' or 'x'");
                }
            }
        }

    }

}