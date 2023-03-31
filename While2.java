package Practice.Example;

public class While2 {
    public static void main(String[] args){
        int x=5432, rem, rev=0;
        while(x>0)
        {
            rem=x%10;
            x=x/10;
            rem=rev*10+rem;

        }
        System.out.println(rev);
    }
}
