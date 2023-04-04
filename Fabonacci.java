package Day6Assignment;

public class Fabonacci {
    public static void main(String[] args){
         int n1=10,n2=0,n3=1;
        System.out.println(n2+" "+n3);
        for(int i=1; i<=n1; ++i){
            int n4=n2+n3;
            System.out.println(n4);
            n2=n3;
            n3=n4;
        }
    }
}
