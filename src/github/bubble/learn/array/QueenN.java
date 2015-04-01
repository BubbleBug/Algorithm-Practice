package github.bubble.learn.array;

/**
 * Created by wangshuang on 2015/3/27.
 */
public class QueenN {
    int N = 0;//The queen's number
    int a[] ;//the position of the queens in each row
    int t = 0;

    public QueenN(int n){
        N = n;
        a= new int[n];
    }

    boolean check(int n){
         for (int i=0;i<n;i++){
             if(a[i]==a[n] || Math.abs(n-i)==Math.abs(a[i]-a[n])){
                 return false;
             }
         }
        return true;
    }

    public void backtrack(int n) {
        if (n > N) return;
        for (int i = 0; i < N; i++) {
            a[n] = i;
            if (check(n)) {
                if (n == N - 1) {
                    show();
                } else {
                    backtrack(n + 1);
                }
            }
        }
    }

    void show(){
        t++;
        System.out.println("NO."+t);
        int b[][]=new int[N][N];
        for(int i=0;i<N;i++){
            b[i][a[i]]=1;
        }
        for(int q=0;q<N;q++){
            for (int p=0;p<N;p++){
                String queen=b[q][p]==1?"q ":"- ";
                System.out.print(queen);
            }
            System.out.println("\n");
        }
    }
}
