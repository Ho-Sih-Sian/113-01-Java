import java.util.Scanner;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1(14, 05, 32);

        System.out.print("24小時制時間：");
        time.printUniversal();

        System.out.print("12小時制時間：");
        time.printStandard();

        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入時間過了幾秒：");
        int seconds = scanner.nextInt();

        for (int i = 0; i < seconds ; i++) {
            time.tick();
        }

        System.out.print("\n經過" + seconds + "秒後的24小時制時間：");
        time.printUniversal();

        System.out.print("經過" + seconds + "秒後的12小時制時間：");
        time.printStandard();

        scanner.close();
    }
}
//Time1 time=new...

//呼叫printUniversal()

//呼叫printStander()

//使用者輸入時間過了幾秒，用迴圈呼叫tick

 //呼叫printUniversal()

//呼叫printStander()



