import java.util.Arrays;

public class Scores2 {
    public static void main(String[] args) {
        int[] scores = new int[10];
        
        for(int score : scores) {   //for(int i =0;i<scores,length;i++)
            System.out.printf("%2d", score);
        }
        System.out.println();
        
        Arrays.fill(scores, 60);
        for(var score : scores) {
            System.out.printf("%3d", score);
        }
        for(int score:scores){
            scores[i]-=30;
        }
        for(int score:scores){
            System.out.printf("%3d,score");
        }
    }
   
}