package github.bubble.learn.practice;

/**
 * Created by wangshuang on 2015/4/14.
 *
 * 5 pence a rooster, 3 pence a hen and chickens 3 only a penny,
 * With 100 pence to buy one hundred chickens,
 * the rooster, hen, the chicken must have,
 * ask the rooster, hen, chicken how much to buy only just fill 100 pence.
 *
 */
public abstract class Chickens {
    public static int chickens(){
        int number=0;
        for(int x = 1; x < 20; x++){
            for(int y = 1; y < 33; y++){
                int z = 100 - x - y;
                if((z % 3 == 0) && (x * 5 + y * 3 + z / 3 ==100)){
                    System.out.println("公鸡："+x+"母鸡："+y+"小鸡："+z);
                    number++;
                }
            }
        }
        return number;
    }

    /**
     * @return  the kinds of buy chickens method
     */
    public static int bestChickes(){
        int x,y,z,number=0;
        for(int k=1;k<3;k++){
            x=4*k;
            y=25-7*k;
            z=75+3*k;
            System.out.println("公鸡：" + x + "母鸡：" + y + "小鸡：" + z);
            number++;
        }
        return number;
    }

}
