package EmpWage;

public class EmpWage3 {
    public static void main(String[] args) {
        int fullTime=8;
        int partTime=4;
         int Empperwage=20;
         int totalwage=0;
         int empcheck=(int)(Math.random()*10%3);
         switch(empcheck){
             case 1:
                 totalwage=fullTime*Empperwage;
                 System.out.println("fullTime");
                 break;
             case 2:
                 totalwage=partTime*Empperwage;
                 System.out.println("partTime");
             default:
                 Empperwage=0;
                 System.out.println("default");
                 break;
         }
         empcheck=Empperwage*fullTime;
         System.out.println(totalwage);
    }
}
