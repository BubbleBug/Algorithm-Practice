package github.bubble.learn.analysis;

/**
 * Created by wangshuang on 2015/4/24.
 *
 * The use of keyword "final"
 */
public class UserOfFinal {
    public static void main(String args[]) {

        final int lenght=4;
        //lenght=6; //This is not allowed

        final Object object=new Object();
        //object=new Object(); //This is not allowed

        String a="Hello world";
        final  String b="Hello";
        String c="Hello";
        String d=b+" world";
        String e=c+" world";
        System.out.println("1."+(a==d));//return true
        System.out.println("2."+(a==e));//return false

       final String f=getWord();
        String g=f+" world";
        System.out.println("3."+(a==g));//return false

        final MyClass myClass=new MyClass();
        //myClass=new MyClass();//This is not allowed
        System.out.println(myClass.i++);
        System.out.println(++myClass.i);//but this is allowed

        //The difference between final and static
        MyClass myClass1=new MyClass();
        MyClass myClass2=new MyClass();
        System.out.println("myClass1 f="+myClass1.f);
        System.out.println("myClass1 s="+myClass1.s);
        System.out.println("myClass2 f="+myClass2.f);
        System.out.println("myClass2 s="+myClass2.s);

        //about final parameter
        MyClass myClass3=new MyClass();
        StringBuffer buffer = new StringBuffer("hello");
        myClass3.changeValue(buffer);
        System.out.println(buffer);//return "hello world"

        int test=0;
        myClass3.changeValue(test);
        System.out.println(test);
    }

    static String getWord(){
        return "Hello";
    }

}

class MyClass{
    public int i=0;
    public final double f=Math.random();
    public static double s=Math.random();
    void changeValue(final int j){
        //j++; //error
    }
    void changeValue(final StringBuffer buffer){
        buffer.append(" world");
    }
}
