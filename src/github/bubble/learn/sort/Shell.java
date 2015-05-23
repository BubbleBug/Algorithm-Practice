package github.bubble.learn.sort;

/**
 * Created by Administrator on 2015/5/23.
 */
public class Shell {
    public static void sort(int[] a){
        int N=a.length;
        int h=1;
        while (h<N/3){
            h=h*3+1;
        }

        while (h>=1){
            for (int i=h;i<N;i++){
                for (int j=i;j>=h && less(a[j],a[j-h]);j-=h){
                    exch(a,j,j-h);
                }
            }
            h=h/3;
        }
    }

    private static boolean less(int v,int w){
        return v<w;
    }
    private static void exch(int[] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
