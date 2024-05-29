// Name: Rashmi Wagde
// Class: CS 3305/Section 04
// Term: Spring 2024
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: Replit
public class TestMyStack {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //variables
        int choice;
        int num;
        //new stack of integers
        Stack<Integer> stack = new Stack<Integer>();
        //prints menu while choice is not 7
        do {
            System.out.println("\n--------MAIN MENU-------");
            System.out.println("1 - Push element");
            System.out.println("2 - Pop element");
            System.out.println("3 - Top element");
            System.out.println("4 - Size of stack");
            System.out.println("5 - Is Empty stack?");
            System.out.println("6 - Print stack content");
            System.out.println("7 - Exit program\n");
            System.out.print("Enter option number: ");
            choice = input.nextInt();

            //switch output choices
            switch(choice) {
                //pushes element into stack
                case 1: System.out.print("Enter the number you want to add: ");
                num = input.nextInt();
                System.out.println("Adding element to stack");
                System.out.print("Stack before push: ");
                stack.printStack();
                System.out.println();
                stack.push(num);  //push method
                System.out.print("Stack after push:  ");
                stack.printStack();
                System.out.println();
                break;

                //pops element from stack
                case 2:
                    if(stack.size() == 0) {
                        System.out.println("The stack is empty");
                        break;
                    }
                    System.out.println("\nRemoving top element");
                    System.out.print("Stack before pop: ");
                    stack.printStack();
                    System.out.println();
                    stack.pop();  //pop method
                    System.out.print("Stack after pop:  ");
                    stack.printStack();
                    System.out.println();
                    break;

                //prints the element at the top of stack
                case 3:
                    //if stack is empty, print stack is empty
                    if(stack.size() == 0) {
                    System.out.println("The stack is empty");
                    break;
                }
                    System.out.println("\nPrinting top element");
                System.out.println("Top element in the stack is: " + stack.top()); //top method
                break;

                //prints the size of the stack
                case 4: System.out.println("\nPrinting size of the stack");
                    if(stack.size() == 0) {
                        System.out.println("The stack is empty");
                        break;
                    }
                System.out.println("The size of the stack is: " + stack.size()); //size method
                break;

                //checks if the stack is empty
                case 5: System.out.println("\nChecking if the stack is empty");
                if(stack.isEmpty() == true) {
                    System.out.println("The stack is empty");
                }
                else {
                    System.out.println("The stack is not empty");
                }
                break;

                //prints all the elements in the stack
                case 6:
                    if(stack.size() == 0) {
                    System.out.println("The stack is empty");
                    break;
                }
                    System.out.println("\nPrinting elements in the stack");
                System.out.print("The elements in the stack are: ");
                stack.printStack();   //printStack method
                break;
            }
        }
        //if 7 is entered, the program ends
        while(choice != 7);
        if(choice == 7) {
            System.exit(0);
        }
    }
}