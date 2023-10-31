//Лабораторная №11
import java.util.Random;
import java.util.Scanner;

public class MatrixT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Создание ввода
        int n = scanner.nextInt();//Ввод переменной
        int m = scanner.nextInt();//Ввод переменной
        int[][] arr = new int[n][m];//Матрица
        int[][] arrBuff = new int[m][n];//Матрица для транспорирования

        for (int i = 0 ;i < arr.length;i++ ){
            for (int j = 0;j<arr[i].length; j++){
                arr[i][j]= scanner.nextInt();//ввод
            }
        }//Цикл ввода матрицы построчно

        for (int i = 0 ;i < arr.length;i++ ) {
            for (int j = 0; j < arr[i].length; j++) {
                arrBuff[j][i] = arr[i][j];//Транспорирование
            }
        }//Цикл транспорирования матрицы

        for (int i = 0 ;i < arr.length;i++ ){
            for (int j = 0;j<arr[i].length; j++){
                System.out.print(arrBuff[j][i]+"");
            }
            System.out.println(" Столбик"+(i+1));//Вывод номера столбца
            System.out.println();//Пробел между столбиками
        }//Цикл вывода матрицы по столбцам
        }
    }

