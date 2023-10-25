import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Создание ввода
        int n = scanner.nextInt();//Ввод переменной
        int m = scanner.nextInt();//Ввод переменной
        int[][] arr = new int[n][m];//2-х мерный массив
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int buff = 0;
        int buff1 = 0;

        for (int i = 0 ;i < arr.length;i++ ){
            for (int j = 0;j<arr[i].length; j++){
                arr[i][j]=scanner.nextInt();
            }
        }//Цикл ввода матрицы построчено

        for (int i =0;i < arr.length;i++){
            arr1[i]= arr[i][i];
            System.out.println(arr[i][i]);
        }//Цикл вывода диагонали

        for (int i =0;i < arr.length;i++){
            int j = arr.length-i-1;
            System.out.println(arr[i][j]);
            arr2[i] = arr[i][j];
        }//Цикл вывода побочной диагонали

        for (int i =0;i<arr1.length;i++){
            buff += arr1[i];
            System.out.println(buff);
        }

        for (int i =0;i<arr2.length;i++){
            buff1 += arr2[i];
            System.out.println(buff1);
        }
    }
}
