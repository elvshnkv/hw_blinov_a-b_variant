/*
 *
Написать программу, которая запрашивает с клавиатуры ввод номера месяца и по номеру печатает название данного месяца. 
Программа запрашивает ввод номера месяца до тех пор, пока пользователь не введёт символ ‘q’. 
Для выбора месяца по номеру использовать оператор switch.
*
*/

import java.util.Scanner;

public class Month {

	public static void main(String[] args)  {
		for (;;){
			System.out.println("Введите номер месяца: ");
			Scanner in = new Scanner(System.in);
			String a = in.nextLine();
			if (a.equals("q")||a.equals("Q")) break;
			switch (a) {
		case "1":
			System.out.println("январь");
			break;
		case "2":
			System.out.println("февраль");
			break;
		case "3":
			System.out.println("март");
			break;
		case "4":
			System.out.println("апрель");
			break;
		case "5":
			System.out.println("май");
			break;
		case "6":
			System.out.println("июнь");
			break;
		case "7":
			System.out.println("июль");
			break;
		case "8":
			System.out.println("август");
			break;
		case "9":
			System.out.println("сентябрь");
			break;
		case "10":
			System.out.println("октябрь");
			break;
		case "11":
			System.out.println("ноябрь");
			break;
		case "12":
			System.out.println("декабрь");
			break;
			}
		}
	}
}

//Посчитать сумму чисел от 0 до 100.

public class Sum {

	public static void main(String[] args)  {
		int s=0;
	for (int i=0;i<=100;i++){
		s=s+i;
		System.out.println("Сумма чисел от 0 до 100 равна: " +s);
		}
	}
}

//Написать программу нахождения суммы большего и меньшего из 3х чисел.

import java.util.Scanner;
public class MaxMin {

	public static void main(String[] args)  {
		Scanner in=new Scanner(System.in);
		System.out.println("Введите первое число");
		int a=in.nextInt();
		System.out.println("Введите второе число");
		int b=in.nextInt();
		System.out.println("Введите третье число");
		int c=in.nextInt();
		int s=0;
		s=Math.min(a, Math.min(b, c))+Math.max(a, Math.max(b, c));
		System.out.println("Сумма макисмального и минимального элемента равно "+s);
	}
}

//Программа запрашивает ввод строк текста. Продолжаем ввод до тех пор, пока не будет введено слово “stop”.
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args)  {
		Scanner in=new Scanner(System.in);
		for (;;){
			System.out.println("Введите текст: " );
			String a=in.nextLine();
			if(a.equals("stop")) break;
		}	
		}
}

/******************************* A variant *********************************/

// Ввести пароль из командной строки и сравнить его со строкой-образцом. 

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args)  {
		Scanner in=new Scanner(System.in);
		System.out.println("Введите пароль: " );
		String a=in.nextLine();
		for (;;){
			if(a.equals("right")) break;
			else {
				System.out.println("Неверный пароль!");
			} break; /*можно ли так?*/
		}	
	}
}

// Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
package by.pvt.test;

import java.util.Scanner;
import java.util.Random;

public class Continue {

	public static void main(String[] args) {
		System.out.println("Введите количество случайнх чисел: ");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		Random r = new Random();
		for (int i = 0; i < a; i++) {
			int n = r.nextInt(200);
			System.out.print(n + " ");
		}
	}
}

//Ввести целые числа как аргументы командной строки??, подсчитать их суммы (произведения) и вывести результат на консоль.

package by.pvt.test;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите первое число");
		int a = in.nextInt();
		System.out.println("Введите второе число ");
		int b = in.nextInt();
		System.out.println("Сумма равна " + (a + b));
		System.out.println("Произведение равно " + (a * b));

	}
}

/************************************** B variant *************************************/

/*
Ввести с консоли n целых чисел. На консоль вывести: 
1. Четные и нечетные числа. 
3. Числа, которые делятся на 3 или на 9. 
4. Числа, которые делятся на 5 и на 7. 
9. Отсортированные числа в порядке возрастания и убывания. 
*/

package by.pvt.test;

import java.util.Arrays;
import java.util.Scanner;

public class Continue {
	
	public static void main(String[] args) {
		int m[] = new int[10];
		int i = 0;
		Scanner in = new Scanner(System.in);
		for (i = 0; i <= 9; i++) {
			System.out.print("Введите " + (i + 1) + "-й элемент массива: " + "\n");
			m[i] = in.nextInt();
			System.out.println(Arrays.toString(m));
		}
		// четные и нечетные
		System.out.println("Четные числа:");
		for (i = 0; i <= 9; i++) { 
			if (m[i] % 2 == 0)
				System.out.print(m[i] + " ");
		}
		System.out.println("\n" + "Нечетные числа: ");
		for (i = 0; i <= 9; i++)
			if (m[i] % 2 != 0)
				System.out.print(m[i] + " ");
		// на 3 или на 9
		System.out.println("\n" + "Делятся на 3 или на 9 ");
		for (i = 0; i <= 9; i++)
			if (m[i] % 3 == 0 || m[i] % 9 == 0)
				System.out.print(m[i] + " ");
		// на 5 и на 7
		System.out.println("\n" + "Делятся на 5 и на 7 ");
		for (i = 0; i <= 9; i++)
			if (m[i] % 5 == 0 && m[i] % 7 == 0)
				System.out.print(m[i] + " ");
		// по возрастанию
		Arrays.sort(m);
		System.out.println("\n" + "По возрастанию " + "\n" + Arrays.toString(m));
		// по убыванию
		int j = 0;
		System.out.println("По убыванию");
		for (i = 9; i > 0; i--) {
			for (j = 0; j < i; j++) {
				if (m[j] > m[j + 1]) {
					m[j] = m[j + 1];
				}
			}
			System.out.print(m[i] + " ");
		}

	}

}

