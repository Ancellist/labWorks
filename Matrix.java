import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Создание ввода
        int n = scanner.nextInt();//Ввод переменной
        int m = scanner.nextInt();//Ввод переменной
        int[][] arr = new int[n][m];//2-х мерный массив
        int buff = 0;//Главная диагональ сумма элементов
        int buff1 = 0;//Побочная диагональ сумма элементов

        for (int i = 0 ;i < arr.length;i++ ){
            for (int j = 0;j<arr[i].length; j++){
                arr[i][j]=scanner.nextInt();
            }
        }//Цикл ввода матрицы построчено

        for (int i =0;i < arr.length;i++){
            System.out.println(arr[i][i]);
            buff += arr[i][i];
        }//Цикл вывода диагонали

        for (int i =0;i < arr.length;i++){
            int j = arr.length-i-1;
            System.out.println(arr[i][j]);
            buff1 += arr[i][j];
        }//Цикл вывода побочной диагонали

        System.out.println(buff);
        System.out.println(buff1);
    }
}
