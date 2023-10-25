import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Создание ввода
        int n = scanner.nextInt();//Ввод переменной
        int m = scanner.nextInt();//Ввод переменной
        int[][] arr = new int[n][m];//2-х мерный массив

        for (int i = 0 ;i < arr.length;i++ ){
            for (int j = 0;j<arr[i].length; j++){
                arr[i][j]=scanner.nextInt();
            }
        }//Цикл ввода матрицы построчено

        for (int i = 0 ;i < arr[i].length;i++ ){
            for (int j = 0;j<arr.length; j++){
                System.out.println(arr[j][i]);
            }
            System.out.println();//Пробел между столбиками
        }//Цикл вывода матрицы по столбцам
    }
}