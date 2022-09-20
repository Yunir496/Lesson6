import java.util.*;
//Изображение: пустой ромб в квадрате символов
public class Lesson6next2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int i,j;
        for(i=-n+1;i<n;i++){
            for(j=-n+1;j<n;j++){
                if(Math.abs(j)+1>=n-Math.abs(i))
                    System.out.print((char)(64+(n-Math.abs(j)))+" "+"\t");
                else System.out.print(" "+"\t");
            }
            System.out.println("");
        }
    }
}
