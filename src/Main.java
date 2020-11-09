import sun.security.util.Length;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;


public class Main {

    final static List<Triangle> listN = new ArrayList<>();
    final static List<RightTriangle> listM = new ArrayList<>();
    final static Random random = new Random();

    public static void main(String[] args)
    {
        System.out.println("Введите N треугольников");
        int N = Input();
        System.out.println("Введите M равнобедренных треугольников");
        int M = Input();

        /*------------------------------------*/
        double TotalSquare = 0;
        for(int i = 0; i < N; i++)
        {
            Triangle triangle = getRandTriangle();
            System.out.println(i + 1 + ".\n" + triangle.toString() + "\n");
            TotalSquare += triangle.getSquare();
            listN.add(triangle);
        }
        TotalSquare /= N;
        System.out.print("Средняя площадь треугольников: " + TotalSquare);
        System.out.println("\n");
        System.out.println("Выводим прямоугольные треугольники:");
        for(int i = 0; i < M; i++)
        {
            RightTriangle rt = getRandTriangleIsosceles();
            System.out.println(i + 1 + ".\n" + rt.toString() + "\n");
        }

    }


    public static RightTriangle getRandTriangleIsosceles()
    {
        return new RightTriangle((double) random.nextInt(8) + 1,(double) random.nextInt(8) + 1,(double) random.nextInt(8) + 1);
    }


    public static Triangle getRandTriangle()
    {

        return new Triangle((double) random.nextInt(10) + 1,(double) random.nextInt(10) + 1,(double) random.nextInt(10) + 1);
    }


    public static int Input() {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                int result = Integer.parseInt(input.next());
                if (result > 0) return result;
                else {
                    System.out.println("Число треугольников должно > 0");
                }
            } catch (Exception e) {
                System.out.println("Введите еще раз");
            }
        }
    }
}
