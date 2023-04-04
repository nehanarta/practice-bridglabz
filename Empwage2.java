package EmpWage;

public class Empwage2 {
    public static void main(String[] args) {
        int fullTimeHours = 8;
        int partTimeHours = 4;
        int empPerHours = 20;
        int empTotalWage = 0;
        int empCheck = (int) (Math.random() * 10 % 3);
        if (empCheck == 2){
            empTotalWage=fullTimeHours*empPerHours;
            System.out.println(fullTimeHours);
            System.out.println(empTotalWage);
        } else if (empCheck == 1){
            empTotalWage=partTimeHours*empPerHours;
            System.out.println(partTimeHours);
            System.out.println(empTotalWage);
        }
        else{
            System.out.println("absent");
        }

        }

    }

