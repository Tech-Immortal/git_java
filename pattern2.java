import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        
    
    Scanner myobj = new Scanner(System.in);
    System.out.print("enter the input: ");
    int n = myobj.nextInt();
    myobj.close();
    int num = 65;
    
        for( int i = n; i >= 1; i-- ){
            char a = (char) num;
            for( int j = 1; j <= i; j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
