package Practice.Example;

public class While {
    public static void main(String[]args){
        int num=5, i=1,sum=0;
        while (i <= num)
        {
           sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
