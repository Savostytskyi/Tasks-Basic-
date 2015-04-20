import java.util.Arrays;
import java.util.Scanner;
public class TaskFirst {

	public static void main(String[] args) {
		
        System.out.println("�������� ��������� (������� ����� �� 1 �� 6):");
        try {
        Scanner start = new Scanner(System.in);
		int st =start.nextInt();
		
		
	    switch(st) {
	      case 1:
	    	  sayHello (args[0]);  	// 1. �������������� ������ ������������ ��� ����� ��� ����� ����� ��������� ������.
	        break;
	      case 2: 
	    	  reverse(args);  		//  2. ���������� � ���� ������� ��������� ��������� ������ � �������� �������.
	        break;
	      case 3:
	    	  randMass();   		//  3. ������� �������� ���������� ��������� ����� � ��������� � ��� �������� �� ����� ������.
	        break;
	      case 4:
	    	  strEquals(); 			//  4. ������ ������ �� ��������� ������ � �������� ��� �� �������-��������.
		        break;
	      case 5:
	    	  multiple(args);   	//  5. ������ ����� ����� ��� ��������� ��������� ������, ���������� �� ����� (������������) � ������� ��������� �� �������.
		        break;
	      case 6:
	    	  intNums(); 			//  6. ������ � ��������. ������ � ������� n ����� �����. �� ������� �������......
	    	
		        break;
	      default: 
	        System.out.println("����� ��������� �� ����������!");
	        break;
	    }	
        }catch (Exception ex) {
			System.out.println("�������� ����!");
			
		}
		
		
	}
	
	private static void sayHello( String name ) {
		System.out.println("������ " + name + " !!!");
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
			System.out.println("\n������� ���������� ��������� �������: ");
			Scanner scn = new Scanner(System.in);
		try {
			n = Integer.parseInt(scn.next());
			if (n<=0) {System.out.println("\n������������ ������ ������! ���������� ������");
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
			System.out.println("�������� ��� ������! ���������� ������");
			randMass();
			
		}
		
	}

	public static void strEquals() {
		String pass = "Admin";
	    String inpPass;
	    System.out.println("\n������� ������: ");
	    Scanner scn1 = new Scanner(System.in);
	    inpPass = scn1.next();
		if(pass.equals(inpPass)) {
			System.out.println("������ ����������! ���!");
		} else {
			System.out.println("�� ����� �������� ������ ���������� ��� ���");
			strEquals();
		}
	}
	
	public static void multiple( String[] mathExec ) {
		int sum=0, multiple = 1;
		for (int i = 0; i < mathExec.length; i++) {
			sum = sum + Integer.parseInt(mathExec[i]);
			multiple = multiple * Integer.parseInt(mathExec[i]);
		}
		System.out.println("����� ���������: "+ sum);
		System.out.println("������������ ���������: "+ multiple);
	}

	public static void intNums() {
		int m=0;
		
		System.out.println("\n������� ���������� ���������: ");
		Scanner scn2 = new Scanner(System.in);
		m =scn2.nextInt();
		int intMass[] = new int[m];
		
		if (m!=0) {
		System.out.println("\n������� �������� �������: ");
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
		else System.out.println("������� �������� ������!");
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
        System.out.println("�������� ��������: "+Arrays.toString(odd));
        System.out.println("������ ��������: "+Arrays.toString(even));
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
		System.out.println("����������� �������: "+min+ "\n������������ �������: "+max);
}

	public static void devidByThree(int[] intMass) {
		
		System.out.print("����� ������� ������� �� 3 ��� 9: ");
		int counter=0;
		for(int k : intMass) {
        	if ((k%3==0) || (k%9==0)) {
        			System.out.print(k+" ");
        	counter++;}
		}
			if (counter==0) System.out.print(" ����� ����� ���!");
			System.out.println("");
	}

	public static void devidByFive(int[] intMass) {
		
		System.out.print("����� ������� ������� �� 5 � 7: ");
		int counter=0;
		for(int k : intMass) {
        	if ((k%5==0) && (k%7==0)) {
        			System.out.print(k+" ");
        	counter++;}
		}
			if (counter==0) System.out.print(" ����� ����� ���!");
	}
	
	public static void diffNumb(int[] intMass) {
		String arrVal,elem;
System.out.print("\n����� ��� ���������� ����: ");
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
		if (counter==0) System.out.print(" ����� ����� ���!");
	}

	public static void goodNums(int[] intMass) {
		String arrVal;
		int res1, res2, r, counter;
		System.out.print("\n���������� �����: ");
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
		System.out.print("\n����� ������ ���������: ");
		for(int i=1; i<intMass.length-1; i++) {
			if ( ((intMass[i-1]+intMass[i+1])%2==0) && (intMass[i]== (intMass[i-1]+intMass[i+1])/2)) System.out.print(" "+intMass[i]);
		}
	}
}