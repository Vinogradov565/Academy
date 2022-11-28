import departments.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //реализация расчёта зарплаты сотрудникам Вычислительного центра

        try {
            Scanner input = new Scanner(System.in);

            AcountingDepartment calculate = new AcountingDepartment();

            System.out.print("Enter name of Department >> ");
            calculate.nameOfDepartment = input.next();

            System.out.print("Enter amount of workers >> ");
            calculate.amountOfWorkers = input.nextInt();

            System.out.print("Enter ID of Employee >> ");
            calculate.idEmployee = input.nextInt();

            System.out.print("Enter name of employee >> ");
            calculate.nameOfEmployee = input.next();

            System.out.print("Enter surname of Employee >> ");
            calculate.surnameOfEmployee = input.next();

            calculate.checkWorker();

            System.out.print("Enter salary of employee >> ");
            calculate.salary = input.nextInt();

            System.out.print("Enter the employee's utility rate >> ");
            calculate.coefficientOfEfficiency = input.nextDouble();

            System.out.println("\n \n ");

            System.out.println("Name of department: " + calculate.nameOfDepartment);
            System.out.println("\nFull name employee: " + calculate.surnameOfEmployee + " " + calculate.nameOfEmployee);
            System.out.println("Employee salary: " + calculate.salary);

            calculate.countingTheSalary();

            System.out.println("Salary including bonuses and deductions: " + calculate.salary);
        } catch (InputMismatchException e) {
            System.out.println("You write a wrong parameter!");
        }
    }
}