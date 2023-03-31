package Practice.Example;

public class Palin {
    public static void main(String[]args){
        int x;
        int sum=0,p;
        int n=343;
                p=n;
                while(n>0) {
                    x= n% 10;
                    sum = (sum * 10)+x;
                    n= n / 10;
                }
                if(p==sum)
                    System.out.println("palindrome no");
                else
                    System.out.println("not palindrome no");
                }
    }


