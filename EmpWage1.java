package EmpWage;

public class EmpWage1 {
    public static void main(String[]args){
        int Full_Time=1;
        int WagePerHour=20;
        int totalwage;
        int empcheck=(int)(Math.random()*10%2);
        if(empcheck==1) {
          int empHrs=8;
            totalwage = empHrs * WagePerHour;
            System.out.println("present");
            System.out.println(totalwage);
        }else
            System.out.println("absent");

    }
}
