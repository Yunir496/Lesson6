import java.util.*;
/*Написать программу которая сгенерирует температуру 10 пациентам от 32 до 40 градусов.
Вывести температуры пациентов в 1 строку.
Найти среднее значение температуры для всех пациентов.
Посчитайте количество здоровых пациентов с температурой от 36,2 до 36,9 градусов.*/
public class Lesson6next {
    public static void main(String[] args) {
        double min = 32.0;
        double max = 40.0;
        List<Double> result = new ArrayList<>();
        for(int i =0;i<10;i++){
            result.add((new Random().nextDouble()*(max +1 - min) + min));
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.printf("%.1f  ",result.get(i));
            }
        double sum = 0;
        int j =0;
        for(int i = 0; i < result.size();i++){
            sum=sum+result.get(i);
           if(result.get(i)>36.2 && (result.get(i))<36.9){
               j++;
           }
        }
        System.out.printf("%.1f+\n",sum / result.size());
        System.out.println(j);
    }
    }

