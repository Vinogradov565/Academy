package departments;

public class Department {
    public int idEmployee;
    public String nameOfDepartment;
    public int amountOfWorkers;

    public double coefficientOfEfficiency;
    public double salary;

    public double countSalary() {
        if(coefficientOfEfficiency > 1.0) {
            salary = salary * 2;
        }
        else if(coefficientOfEfficiency < 1.0) {
            salary = salary * 0.8;
        }

        return salary;
    }
}
