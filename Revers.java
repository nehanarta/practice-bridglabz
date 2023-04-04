package Day6Assignment;

public class Revers {
    public static void main(String[] args){
     int num=3457;
     int rev=0;
     while(num>0)
     {
         int rem=num %10;
         rev = rev*10 + rem;
         num=num/10;
     }
     System.out.println("The reverse of the given number is:" +rev);
    }

}
