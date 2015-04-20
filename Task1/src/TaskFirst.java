import java.util.Arrays;
import java.util.Scanner;
public class TaskFirst {

	public static void main(String[] args) {
		
        System.out.println("Выберите подзадачу (введите число от 1 до 6):");
        try {
        Scanner start = new Scanner(System.in);
		int st =start.nextInt();
		
		
	    switch(st) {
	      case 1:
	    	  sayHello (args[0]);  	// 1. Приветствовать любого пользователя при вводе его имени через командную строку.
	        break;
	      case 2: 
	    	  reverse(args);  		//  2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
	        break;
	      case 3:
	    	  randMass();   		//  3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
	        break;
	      case 4:
	    	  strEquals(); 			//  4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
		        break;
	      case 5:
	    	  multiple(args);   	//  5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
		        break;
	      case 6:
	    	  intNums(); 			//  6. Работа с массивом. Ввести с консоли n целых чисел. На консоль вывести......
	    	
		        break;
	      default: 
	        System.out.println("Такой подзадачи не существует!");
	        break;
	    }	
        }catch (Exception ex) {
			System.out.println("Неверный ввод!");
			
		}
		
		
	}
	
	private static void sayHello( String name ) {
		System.out.println("Привет " + name + " !!!");
	}
	
	private static void reverse( String[] params ) {
		String[] results = new String[params.length];
		for (int i = params.length-1; i >= 0; i--) {
	
			results[i]= params[i];
			System.out.print(results[i]+" ");
		}
	}
		
	public static void randMass() {
		int n;
			System.out.println("\nВведите количество элементов массива: ");
			Scanner scn = new Scanner(System.in);
		try {
			n = Integer.parseInt(scn.next());
			if (n<=0) {System.out.println("\nНедопустимая длинна масива! Попробуйте заново");
			randMass();}
			else {
			int[] mass = new int [n];
			for (int i=0;i<mass.length;i++) {
                mass[i] = (int) ( Math.random() * 10);
                System.out.println(mass[i]);
			}
			for (int i=0;i<mass.length;i++) {
				System.out.print(mass[i]+ " ");
			}
			}
		}catch (Exception ex) {
			System.out.println("Неверный тип данных! Попробуйте заново");
			randMass();
			
		}
		
	}

	public static void strEquals() {
		String pass = "Admin";
	    String inpPass;
	    System.out.println("\nВведите пароль: ");
	    Scanner scn1 = new Scanner(System.in);
	    inpPass = scn1.next();
		if(pass.equals(inpPass)) {
			System.out.println("Пароль правильный! Ура!");
		} else {
			System.out.println("Вы ввели неверный пароль попробуйте еще раз");
			strEquals();
		}
	}
	
	public static void multiple( String[] mathExec ) {
		int sum=0, multiple = 1;
		for (int i = 0; i < mathExec.length; i++) {
			sum = sum + Integer.parseInt(mathExec[i]);
			multiple = multiple * Integer.parseInt(mathExec[i]);
		}
		System.out.println("Сумма элементов: "+ sum);
		System.out.println("Произведение элементов: "+ multiple);
	}

	public static void intNums() {
		int m=0;
		
		System.out.println("\nВведите количество элементов: ");
		Scanner scn2 = new Scanner(System.in);
		m =scn2.nextInt();
		int intMass[] = new int[m];
		
		if (m!=0) {
		System.out.println("\nВведите элементы массива: ");
		Scanner scn3 = new Scanner(System.in);		
		for (int i = 0; i < intMass.length; i++) {
			intMass[i] = scn3.nextInt();		
		}		
	
		evenOdd(intMass);
		maxMin(intMass);
		devidByThree(intMass);
		devidByFive(intMass);
		diffNumb(intMass);
		goodNums(intMass); 
		halfSum(intMass);}
		else System.out.println("Слишком короткий массив!");
	}
	
	public static void evenOdd(int[] intMass) {
		int ev = 0, od=0, i=0, j=0;
		
		for(int k : intMass) {
        	if (k%2==0) ev++;
        	else od++;}
		int[] odd = new int[od];
		int[] even = new int[ev];
        for(int k : intMass) {
        	if (k%2==0) {
        	even[i]=k;
        	i++;}
        	else {
        	odd[j]=k;
        	j++;
        	
        	}
        	
        }
        System.out.println("Нечетные элементы: "+Arrays.toString(odd));
        System.out.println("Четные элементы: "+Arrays.toString(even));
	}

	public static void maxMin(int[] intMass) {
		int max, min, i=0;
		max=intMass[i];
		min=intMass[i];
		for(i=0; i<intMass.length; i++) {
        	if (intMass[i]>=max) {
        		max=intMass[i];}
        	else if (intMass[i]<min) {
        		min=intMass[i];
        	};

	}
		System.out.println("Минимальный элемент: "+min+ "\nМаксимальный элемент: "+max);
}

	public static void devidByThree(int[] intMass) {
		
		System.out.print("Числа которые делятся на 3 или 9: ");
		int counter=0;
		for(int k : intMass) {
        	if ((k%3==0) || (k%9==0)) {
        			System.out.print(k+" ");
        	counter++;}
		}
			if (counter==0) System.out.print(" таких чисел нет!");
			System.out.println("");
	}

	public static void devidByFive(int[] intMass) {
		
		System.out.print("Числа которые делятся на 5 и 7: ");
		int counter=0;
		for(int k : intMass) {
        	if ((k%5==0) && (k%7==0)) {
        			System.out.print(k+" ");
        	counter++;}
		}
			if (counter==0) System.out.print(" таких чисел нет!");
	}
	
	public static void diffNumb(int[] intMass) {
		String arrVal,elem;
System.out.print("\nЧисла без одинаковых цифр: ");
int counter = 0;
		for(int k : intMass) {
			int m=0;
			
			int much = 0;
			arrVal = Integer.toString(k);
			if (arrVal.length()==3) {
				for (int i = 0; i < arrVal.length(); i++) {	
					elem = String.valueOf(arrVal.charAt(i));
					m = arrVal.split(elem).length - 1;
					much=much+m;
					}
				if (much==2) {
					System.out.print(k+" ");
					counter++;
				}
				}
				
			
			
		}
		if (counter==0) System.out.print(" таких чисел нет!");
	}

	public static void goodNums(int[] intMass) {
		String arrVal;
		int res1, res2, r, counter;
		System.out.print("\nСчастливые числа: ");
		for(int k : intMass) {
			arrVal = Integer.toString(k);
			res1=0;
			res2=0;
			counter=0;
				if (arrVal.length()%2==0) {
					while (k>0) {
						counter++;
						r=k%10;
						k=k/10;
						if (counter<arrVal.length()/2+1) {
							
							res1=res1+r;
							}
						else {res2=res2+r;}	
					
				}
					
					if (res1==res2) System.out.print(arrVal+" ");	
		}
				
		}
}

	public static void halfSum(int[] intMass) {
		System.out.print("\nЧисла равные полусумме: ");
		for(int i=1; i<intMass.length-1; i++) {
			if ( ((intMass[i-1]+intMass[i+1])%2==0) && (intMass[i]== (intMass[i-1]+intMass[i+1])/2)) System.out.print(" "+intMass[i]);
		}
	}
}