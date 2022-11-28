package departments;

public class AcountingDepartment extends HumanRecourcesDepartment{
    int premium = 0;
    int penalty = 1000;
    boolean penalties = true;

    public double countingTheSalary() {
        countSalary();
        checkingThePenalties();

        if (penalties == true) {
            salary = salary - penalty;
        }
        else {
            salary = salary + premium;
        }

        return salary;
    }

    private void checkingThePenalties() {
        if (coefficientOfEfficiency > 1.0) {
            premium = 500;
        }
        else if (coefficientOfEfficiency == 1.0) {
            premium = 0;
            penalty = 0;
            penalties = false;
        }
        else {
            premium = 0;
            penalty = 1000;
            penalties = true;
        }
    }
}
