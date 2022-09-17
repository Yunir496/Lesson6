import java.util.*;
public class Lesson6 {
    /*1.  Создать массив из 5 чисел. Присвоить числам любые значения.
    Вывести массив в консоль.
    2. Массив с 5-ю числами, вывести в консоль в обратном порядке.
    3. Массив с 5ю числами РАЗВЕРНУТЬ в другую сторону. Позиция значений в данном массиве должна измениться. */
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 2, 5, 7};
        //1
        for (int i : array) {
            System.out.println(i);}
        //2
        for (int i = 4; i >= 0; i--) {
            System.out.println(array[i]);}
        //3
        /* Способ №1
        List<Integer> list = new ArrayList<>();
        for(int i:array){list.add(i);}
        Collections.reverse(list);
        for(int i = 0;i<list.size();i++){array[i] = list.get(i);}
        System.out.println(Arrays.toString(array));*/
        /* Способ №2
        int[] tmp = new int[array.length];
        for(int i = 0;i < array.length;i++){
            tmp[array.length-1-i]= array[i];}
        System.out.println(Arrays.toString(tmp));*/
        //Способ №3
        int ar;
        for (int i = array.length-1, j = 0; i >=array.length/2 ; i--,j++) {
            ar = array[j];
            array[j] = array[i];
            array[i] = ar;}
        System.out.println(Arrays.toString(array));}}
