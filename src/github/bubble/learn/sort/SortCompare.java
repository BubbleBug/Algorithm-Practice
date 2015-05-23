package github.bubble.learn.sort;

/**
 * Created by Administrator on 2015/5/23.
 */
public class SortCompare {
    public static void time(String alg,int[] a){
       // StopWatch timer=new Stopwatch();
        if(alg.equals("Shell")){
            Shell.sort(a);
        }
    }
    public static double timeRandomInput(String alg,int N,int T){
        double total=0.0;
        int[] a=new int[N];
        for(int i=0;i<T;i++){
            for (int j=0;j<N;j++){
                a[j]=(int)(Math.random()*100);
            }
            time(alg,a);
        }
        return total;
    }
}
