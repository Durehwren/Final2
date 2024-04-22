package com.mycompany.app;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ArrayList<String> todo = new ArrayList<String>();


        boolean checkWhileLoop = true;
        boolean checkLoop = true;
        String line = "";


        Scanner scan = new Scanner(System.in);
        while (checkWhileLoop) {




            System.out.println("Please Enter a task todo.");


            String todoTask = scan.nextLine();
            System.out.println(todoTask);
            System.out.println("Is this the task?");
            System.out.println("Y or N ");


            String fileCheck = scan.nextLine();




            while (checkLoop) {
                if ((fileCheck.equals("y")) || (fileCheck.equals("Y")) || (fileCheck.equals("yes")) || (fileCheck.equals("Yes"))) {
                    System.out.println("Great!");
                    checkLoop = false;
                } else {
                    System.out.println("Please reenter a task.");


                    todoTask = scan.nextLine();
                    System.out.println(todoTask);
                    System.out.println("Is this the task?");
                    System.out.println("Y or N ");
                    fileCheck = scan.nextLine();
                }
            }
            todo.add(todoTask);
            System.out.println(todo);


            System.out.println("Would you like to remove a task? Y/N");




            String removalCheck = scan.nextLine();


            if ((removalCheck.equals("y")) || (removalCheck.equals("Y")) || (removalCheck.equals("yes")) || (removalCheck.equals("Yes"))) {
                System.out.println("Please enter the task  you would like to remove.");
                Integer removalNumber = Integer.valueOf(scan.nextLine());
                todo.remove(removalNumber - 1);
                System.out.println("Number " + removalNumber + " has been removed.");
                System.out.println(todo);
            } else {
                System.out.println("Ok.");
            }
        }
    }
}
