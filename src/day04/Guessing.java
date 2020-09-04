package day04;
import java.util.Scanner;
public class Guessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int)(Math.random()*1000+1);
        System.out.println(num);
        int guess;
        do{
            System.out.println("一个数，1-1000猜猜看");
              guess = scan.nextInt();
             if (guess>num){
                 System.out.println("太大了");
             }else if(guess<num){
                 System.out.println("太小了");
             }else{
                 System.out.println("恭喜猜中了！");
             }
        }while (guess!=num);
        System.out.println("over");
    }
}
