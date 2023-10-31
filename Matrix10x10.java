//Лабораторная №15
import java.util.Scanner;

public class Matrix10x10 {
    public static int[][] check(int[][] arr,int y){
        int b = 0;
        int[] buff = new int[y];
        for (int i = 0;i< arr.length;i++){
            int a = 0;
            for (int j = 0;j< arr.length;j++){
                buff[j] = arr[j][i];
            }
            for (int j = 0;j< arr.length;j++){
                if(buff[j] > 0){
                    a++;
                }
            }
            if (a==buff.length){
                System.out.println(i+1+" Столбик положительный");
                b++;
            }
        }
        if (b==0){
            System.out.println("Положительных стлобцов нет");;
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ширина 1 массива");
        int n = scanner.nextInt();
        System.out.println("Высота 1 массива");
        int m = scanner.nextInt();
        System.out.println("Ширина 2 массива");
        int l = scanner.nextInt();
        System.out.println("Высота 2 массива");
        int t = scanner.nextInt();
        int[][] arr0 = new int[n][m];
        int[][] arr1 = new int[l][t];
        System.out.println("Ввод 1 массива");
        for (int i =0;i<arr0.length;i++){
            for (int j =0;j<arr0[i].length;j++){
                arr0[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ввод 2 массива");
        for (int i =0;i<arr0.length;i++){
            for (int j =0;j<arr0[i].length;j++){
                arr1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Результаты по 1 массиву:");
        check(arr0,m);
        System.out.println();
        System.out.println("Результаты по 2 массиву: ");
        check(arr1,t);
    }
}
