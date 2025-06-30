package CDS.Day7;

import java.util.Scanner;

class Employee {
    String name;
    int baseSalary;

    public int getTotalSalary(int amount) {
        return amount;
    }
}

class Manager extends Employee {
    public void getTotal(String name, int salary, int bonus) {
        System.out.println("Total salary for " + name + " is Rs " + (salary + bonus));
    }
}

public class Emp {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Name: ");
        String name = read.nextLine();

        System.out.print("Base salary: ");
        int amount = read.nextInt();

        System.out.print("Bonus: ");
        int bonus = read.nextInt();

        Manager mn = new Manager();
        mn.getTotal(name, amount, bonus);
    }
}
