import java.util.*;
/*Написать алгоритм сортировки массивов пузырьком.
Есть неотсортированный массив интов.
С ним нужно провести некие действия так, чтобы значения массива шли от меньшего [0] к большему[massive.lenght]
 */
public class Lesson6next3 {
    public static void main(String[] args) {
         int []massiv = {1 ,3 ,2 ,4, 5, 7, 6, 8,};
         boolean flazhok = false;
         int tmp;
         while (!flazhok){
             flazhok = true;
             for(int i = 0;i< massiv.length-1;i++){
                 if(massiv[i]>massiv[i+1]){
                     flazhok =false;
                     tmp = massiv[i];
                     massiv[i]=massiv[i+1];
                     massiv[i+1]= tmp;
                 }
             }
         }
        System.out.println(Arrays.toString(massiv));
    }
}
