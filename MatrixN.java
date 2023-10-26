import java.util.Random;
import java.util.Scanner;

public class MatrixN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Создание ввода
        int n = scanner.nextInt();//Ввод переменной
        int m = scanner.nextInt();//Ввод переменной
        int[][] arr = new int[n][m];//2-х мерный массив
        int[] buff = new int[arr.length];

        for (int i = 0 ;i < arr.length;i++ ){
            for (int j = 0;j<arr[i].length; j++){
                arr[i][j]= scanner.nextInt();//ввод
            }
        }//Цикл ввода матрицы построчно

        for (int i = 0 ;i < arr.length;i++ ){
            for (int j = 0;j<arr[i].length; j++){
                buff[j] = arr[j][i];
            }
            if (buff[i] < 0 && buff[i+1] < 0 && buff[i+2] < 0){
                    System.out.println("true");
                }
            }
        }//Цикл проверки матрицы по столбцам
    }

