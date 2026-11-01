import java.util.Scanner;

class Node {
int id;
String name;
Node next;

Node(int id, String name) {
    this.id = id;
    this.name = name;
    this.next = null;
}

}

public class Practical6 {
static Node top = null;
static Scanner sc = new Scanner(System.in);

static void push() {
    System.out.print("Enter Patient ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Patient Name: ");
    String name = sc.nextLine();

    Node newNode = new Node(id, name);
    newNode.next = top;
    top = newNode;

    System.out.println("Patient added successfully.");
}

static void pop() {
    if (top == null) {
        System.out.println("Stack is empty!");
        return;
    }

    System.out.println("Removed Patient: "
            + top.id + " - " + top.name);

    top = top.next;
}

static void peek() {
    if (top == null) {
        System.out.println("Stack is empty!");
    } else {
        System.out.println("Top Patient: "
                + top.id + " - " + top.name);
    }
}

static void display() {
    if (top == null) {
        System.out.println("No patient records available.");
        return;
    }

    Node temp = top;

    System.out.println("Patient Records:");

    while (temp != null) {
        System.out.println(
                "ID: " + temp.id + ", Name: " + temp.name);
        temp = temp.next;
    }
}

public static void main(String[] args) {
    Scanner input = sc;
    int choice;

    do {
        System.out.println("\n--- Hospital Patient Stack ---");
        System.out.println("1. Add Patient (Push)");
        System.out.println("2. Remove Patient (Pop)");
        System.out.println("3. View Top Patient (Peek)");
        System.out.println("4. Display All Patients");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");

        choice = input.nextInt();

        switch (choice) {
            case 1:
                push();
                break;
            case 2:
                pop();
                break;
            case 3:
                peek();
                break;
            case 4:
                display();
                break;
            case 5:
                System.out.println("Program ended.");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    } while (choice != 5);

    sc.close();
}

}