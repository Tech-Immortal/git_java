import  java.util.Scanner; 
public class class_practice {
    
    int x = 10;
    static int y = 20;
    // void show(){
    //     System.out.println(x);
    //     System.out.println(y);
    // }

    public static void main(String[] args){
        class_practice obj = new class_practice();
        System.out.println(obj.x);
        System.out.println(y);
        // show();
        // show1();
        // show2();
        // test2.show3();
    }
    static void show1(){
        class_practice obj = new class_practice();
        System.out.println(obj.x);
        System.out.println(y);
    }
    // class test2{
    //     void show2(){
    //         System.out.println("hello");
    //     }
    //     static void show3(){
    //         System.out.println("bye");
    //     }
    // }
}
