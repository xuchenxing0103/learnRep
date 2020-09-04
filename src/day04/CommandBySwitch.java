package day04;
import java.util.Scanner;
public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择功能：1：查询余额 2：取款 3：存款 4：退卡");
        int command = scan.nextInt();
        switch (command){
            case 1:
                System.out.println("余额为：1000000元");
                break;
            case 2:
                System.out.println("请将纸币放入验钞机内");
                break;
            case 3:
                System.out.println("请输入取款金额：");
                break;
            case 4:
                System.out.println("正在退出卡片，请稍后...");

        }
        System.out.println("over");
    }
}
