package github.bubble.learn.practice;

/**
 * Created by wangshuang on 2015/4/14.
 *
 * The monkey on the first day remove several peaches and promptly ate a half,
 * is not enough just to eat a. The next morning and the rest of the peaches ate a half,
 * or not enough again Eat a. After every day to eat the rest of the day plus a half.
 * Just left a to 10 days. Ask the monkeys on the first day of how many peaches?
 */
public abstract class Monkeys {
    public static int getOneDayPeaches(int day){
        if(day==10){
            return 1;
        }
        return 2*(getOneDayPeaches(day+1)+1);
    }

    public static int getOneDayPeachesByLoop(){
       int peaches=1;
        for(int i=1;i<10;i++){
            peaches=(peaches+1)*2;
        }
        return peaches;
    }

}
