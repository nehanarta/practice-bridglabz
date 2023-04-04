package Day5Assignment;

public class HarmonicNum {
    public static void main(String[] args){
        int n=10;
        double res=0.0;
        System.out.println("Harnomic no.is");
        for(int i=n; i>0; i--){
            res=res +(double)1/i;
            System.out.println(res);
        }

    }
}
