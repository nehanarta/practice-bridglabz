package Practice.Example;

public class ArrayLarg {
    public static void main(String[] args){
        int[]x={65,87,98,1000,756};
        int max=x[0];
        int min=x[0];
        for (int i=0; i<x.length;i++){
            if(x[i]>max)
                max=x[i];
         else if(x[i]<min);
            min=x[i];
        }
                System.out.println("largest element: " +max);
                System.out.println("smallest element: " +min);
    }

}
