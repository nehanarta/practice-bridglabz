package EmpWage;

public class EmpWage4 {
    public static void main(String[] args) {
        int full_Time = 8;
        int part_Time = 4;
        int EmpPerHrsWage = 20;
        int TotalWorkingDay = 2;
        int Totalwage = 0;
        int day = 1;
        while (day < TotalWorkingDay) {
            {
                int empcheck = (int) (Math.random() * 10 % 3);
                switch (empcheck) {
                    case 1:
                        Totalwage = full_Time * EmpPerHrsWage;
                        System.out.println("fullTime");
                        break;
                    case 2:
                        Totalwage = part_Time * EmpPerHrsWage;
                        System.out.println("partTime");
                    default:
                        System.out.println("default");
                        break;
                }
                empcheck = EmpPerHrsWage * full_Time;
                System.out.println(Totalwage);
                day++;
                System.out.println(day);
            }
        }
    }
}