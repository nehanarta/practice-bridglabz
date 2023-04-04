package Day5Assignment;

public class Largest {
    public static void main(String[] args){
        int n1=30;
        int n2=40;
        int n3=20;
        if (n1>n2 && n1>n3) {
            System.out.println(n1 + "=is largest number");
        }else if (n2>n1 && n2>n3){
            System.out.println( n2 + "=is largest number");
        }else
            System.out.println(n3 + "=is a lagest number");
    }
}
