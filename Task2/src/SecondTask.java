import java.util.Arrays;
import java.util.Scanner;


public class SecondTask {

	public static void main(String[] args) {

		 
		try {
		  System.out.println("Выберите одно из подзаданий (1: массивы; 2: вывод матрицы, 3: преобразования матриц):");	   
	        Scanner start = new Scanner(System.in);
			int st =start.nextInt();
						
		    switch(st) {
		      case 1:
		    	  intNums();  
		        break;
		      case 2: 
		    	  matrixOutPut();
		        break;
		      case 3: 
		    	  inpMatrix();
		        break;
		      default: 
		        System.out.println("Такой подзадачи не существует!");
		        main(args);
		        break;
		    }	
		}catch (Exception ex) {
			System.out.println("Неверный ввод!");
			main(args);
		}
	}

	public static void intNums() {
		int m=0;
		
		System.out.println("Введите количество элементов: ");
		Scanner scn2 = new Scanner(System.in);
		m =scn2.nextInt();
		int intMass[] = new int[m];
		
		if (m!=0) {
		System.out.println("\nВведите элементы массива: ");
		Scanner scn3 = new Scanner(System.in);		
		for (int i = 0; i < intMass.length; i++) {
			intMass[i] = scn3.nextInt();		
		}		
	
		intLength(intMass);
		lenSort(intMass);
		avgLength(intMass);
		noDiffNumb(intMass);
		oddNums(intMass);
		diffNumb(intMass);
		higherNums(intMass);
		
		}
		else {System.out.println("Слишком короткий массив!");
		intNums();}
	}
	
	public static void intLength(int[] intMass) {
		String arrVal;
		int lng, tmp_lng=0, tmpElem = 0, tmp_lngmax=0, tmpElemMax = 0;

		tmp_lng= Integer.toString(intMass[0]).length();
		for(int k : intMass) {
			arrVal = Integer.toString(k);
			lng = arrVal.length();
			if (tmp_lng>=lng) {
				tmp_lng=lng;
				tmpElem=k;
			}
			if (tmp_lngmax<=lng) {
				tmp_lngmax=lng;
				tmpElemMax=k;
			}
				
		}
		System.out.println("Наименьшее по длинне число: "+tmpElem+" размерность: "+tmp_lng+ " символов");
		System.out.println("Наибольшее по длинне число: "+tmpElemMax+" размерность: "+tmp_lngmax+ " символов");
}
	
	public static void lenSort(int[] intMass) {
		String newMass[] = new String[intMass.length];  
		 	     String elem;  
		 	     int i;
 	      for(i=0; i<newMass.length; i++) {
 	    	 newMass[i]=Integer.toString(intMass[i]);
 	      }
 	     for (i = 0; i < newMass.length-1; i++){
 	        for (int j = i+1; j < newMass.length; j++){
 	            if (newMass[i].length() > newMass[j].length()) {
 	                String tmp = newMass[i];
 	                newMass[i] = newMass[j];
 	                newMass[j] = tmp;
 	            }
 	        }
 	    }
 	
 	  	System.out.println("Сортировка по длинне элементов: "+Arrays.toString(newMass));
 	   for (i = 0; i < newMass.length-1; i++){
	        for (int j = i+1; j < newMass.length; j++){
	            if (newMass[i].length() < newMass[j].length()) {
	                String tmp = newMass[i];
	                newMass[i] = newMass[j];
	                newMass[j] = tmp;
	            }
	        }
	    }
 	  	System.out.println("Сортировка по длинне элементов (в обратном порядке): "+Arrays.toString(newMass));
	}

	public static void avgLength(int[] intMass) {
		String arrVal;
		String less=" ", more=" ";
		int len=0;
		for(int k : intMass) {
			arrVal = Integer.toString(k);
			len=len+arrVal.length();
		}
		len=len/intMass.length;
		for(int k : intMass) {
			arrVal = Integer.toString(k);
			if (arrVal.length()<len) less=less+" "+arrVal+" длинна: "+arrVal.length()+"; ";
				
			else if (arrVal.length()>len) more=more+" "+arrVal+" длинна: "+arrVal.length()+"; ";
		}
		System.out.println("Элементы меньше средней длинны: "+less);
		System.out.println("Элементы больше средней длинны: "+more);
	}

	public static void noDiffNumb(int[] intMass) {
		String[] numArr = new String[intMass.length];
		String arrVal, difVal, subStr;
		int i,j=0;
		for(i=0; i<intMass.length; i++) {
			difVal="";
			arrVal = Integer.toString(intMass[i]);
			for (j=0; j<arrVal.length(); j++){
				subStr=String.valueOf(arrVal.charAt(j));
				if (difVal.contains(subStr)) {
					continue;
				} else { difVal=difVal+subStr;}
			}
			 numArr[i]=difVal;
		}
		subStr=numArr[0];
		j=0;
		for(i=0; i<numArr.length; i++) {
			if (numArr[i].length()<subStr.length()) {
				subStr=numArr[i];
				j=i;
			}
			
		}
		System.out.println("Число с минимальным колличеством различных цифр: "+intMass[j]);
	}

	public static void oddNums(int[] intMass) {
		String arrVal;
		int res1, res2, r;
		System.out.print("\nЧисла с одинаковым количеством odd и even цифр: ");
		for(int k : intMass) {
			arrVal = Integer.toString(k);
			res1=0;
			res2=0;
				if ((arrVal.length()%2==0) && (k%2==0)) {
					while (k>0) {
						r=k%10;
						k=k/10;
						if (r%2==0) {
							
							res1++;
							}
						else {res2++;}	
					
				}
					
					if (res1==res2) System.out.print(arrVal+" ");	
		}
				
		}
}

	public static void higherNums(int[] intMass) {
		String arrVal;
		int res1, r, k, counter;
		System.out.print("\nЧисло с цифрами по возрастанию: ");
		
			for (int i = 0; i < intMass.length; i++) {
				
			arrVal = Integer.toString(intMass[i]);
			res1=0;
			
				if (arrVal.length()>1) {
					while (intMass[i]>0) {
						r=intMass[i]%10;
						intMass[i]=intMass[i]/10;
						k=intMass[i]%10;
						if (r>k) {
							
							res1++;
							}
						else break;	
					
				}
					
					if (res1==arrVal.length()) 
						{System.out.print(" "+arrVal);	
						break;
						}
		}
			}	
		}

	public static void diffNumb(int[] intMass) {
		String arrVal,elem;
		System.out.print("\nЧисла без одинаковых цифр: ");
		int i;
		for (i = 0; i < intMass.length; i++){

			int m=0;
			
			int much = 0;
			arrVal = Integer.toString(intMass[i]);
			
				for (int j = 0; j < arrVal.length(); j++) {	
					elem = String.valueOf(arrVal.charAt(j));
					m = arrVal.split(elem).length - 1;
					much=much+m;
					}
				if (much==arrVal.length()-1) {
					System.out.print(intMass[i]+" ");
					break;
				}			
		}
	
	}

	public static void matrixOutPut() {
		 System.out.println("Выберите размерность матрицы:");	   
	        Scanner scn = new Scanner(System.in);
			int n =scn.nextInt();
			int k=1;
		int mass[][] = new int[n][n]; 
			for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass.length; j++) {
					mass[i][j]=k++;
				}
			}
			
			for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass.length; j++)
					System.out.print(mass[i][j]+ "  ");
					System.out.println();
			
			}
			System.out.println("----------------------------");
			
			for (int j = 0; j < mass.length; j++) {
				for (int i = 0; i < mass.length; i++)
					System.out.print(mass[i][j]+ "  ");
					System.out.println();
			
			}
	}


	
	public static void inpMatrix() {
		 System.out.println("Выберите размерность матрицы:");	   
	        Scanner scn = new Scanner(System.in);
			int n =scn.nextInt();
			
		int mass[][] = new int[n][n]; 
		double mass1[][] = new double[n][n]; 
			for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass.length; j++) {
					mass[i][j]=-n+(int)(Math.random()*(n+n)+1);
				}
			}
			
			for (int i = 0; i < mass1.length; i++) {
				for (int j = 0; j < mass1.length; j++) {
					mass1[i][j]=-n+(int)(Math.random()*(n+n)+1);
				}
			}
			
			for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass.length; j++)
					System.out.print(mass[i][j]+ "  ");
					System.out.println();
			
				
			}
			
			
			System.out.println("----------Сортировка по строкам----------");
				sortByRow(mass);
			System.out.println("----------Сортировка по столбцам----------");
				sortByCol(mass);
			System.out.println("----------Сдвиг вниз----------");
				moveDown(mass, 7);
			System.out.println("----------Сдвиг ввверх----------");
				moveUp(mass, 2);
			System.out.println("----------Сдвиг вправо----------");
				moveRight(mass, 2);
			System.out.println("----------Сдвиг влево----------");
				moveRight(mass, 2);
			System.out.println("----------Последовательность возрастающих элементов----------");
				elemsSummHigh(mass);
			System.out.println("----------Последовательность убывающих элементов----------");
				elemsSummLow(mass);
			System.out.println("----------Cуммы между положительными элементами----------");
				elemsSummBetween(n);
			System.out.println("----------Поворот матрицы----------");
			System.out.println("ДО:");
			  for (int i = 0; i < mass.length; i++) {
					for (int  j = 0; j < mass.length; j++)
						System.out.print(mass[i][j]+ "  ");
						System.out.println();		
				}
			  System.out.println("Поворот на 90 градусов:");
				rotation(mass);
				  System.out.println("Поворот на 180 градусов:");
					rotation(mass);
					  System.out.println("Поворот на 270 градусов:");
						rotation(mass);
			System.out.println("----------Матрица минус среднее арифметическое----------");	
			System.out.println("ДО:");
			for (int i = 0; i < mass1.length; i++) {
				for (int j = 0; j < mass1.length; j++)
					System.out.print(mass1[i][j]+ "  ");
					System.out.println();
							
			}
			
						subtrAvg(mass1);
						
						compress();
						System.out.println("----------Матрица c нулями в конце----------");
						zeroS(mass);
						
						
	}
	

		
	 public static void sortByRow(int[][] mass) {

	        for(int k = 0; k < mass.length; k++)
	        for(int i = 0; i < mass.length; i++) {
	            for(int j = 0; j < mass[i].length-1; j++) {
	                if( mass[i][j] >  mass[i][j+1]) {
	                    int temp =  mass[i][j];
	                    mass[i][j] =  mass[i][j+1];
	                    mass[i][j+1] = temp;
	                }
	            }
	        }
	        for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass.length; j++)
					System.out.print(mass[i][j]+ "  ");
					System.out.println();
			
				
			}
	 }
	 
	
	 public static void sortByCol(int[][] mass) {

		 for (int j = 0; j < mass.length; j++) {
	       for (int i = 0; i < mass.length; i++) {
				
	    	   for (int x = 0; x < mass.length; x++) {
	    		   if( mass[i][j] <  mass[x][j]) {
	    		   int temp=mass[i][j];
	    		   mass[i][j]=mass[x][j];
	    		   mass[x][j]=temp;
	    	   }
			}
		}
		 }
	        for (int i = 0; i < mass.length; i++) {
				for (int  j = 0; j < mass.length; j++)
					System.out.print(mass[i][j]+ "  ");
					System.out.println();
			
				
			}
	 }

	 public static void moveDown(int[][] mass, int pos) {
	        int g;
			for (g = 0; g < mass.length; g++) {
			int size = mass.length;
	        for (int i = 0; i < pos; i++) {
	            int temp = mass[size - 1][g];
	            for (int j = size - 1; j > 0; j--) {
	                mass[j][g] = mass[j-1][g];
	            }
	            mass[0][g] = temp;
	        }
		}
			
			for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass.length; j++)
					System.out.print(mass[i][j]+ "  ");
					System.out.println();
			
				
			}
	   }

	 public static void moveUp(int[][] mass, int pos) {
		 int temp;
		 for (int i = 0; i < pos; i++) {
			for (int j = 0; j < mass.length; j++) {
				temp=mass[0][j];
				
				for (int x = 0; x < mass.length-1; x++) {
					mass[x][j]=mass[x+1][j];
				}
				mass[mass.length-1][j]=temp;
			}
		}
		 for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass.length; j++)
					System.out.print(mass[i][j]+ "  ");
					System.out.println();
			
				
			}
	   }
	 
	 public static void moveRight(int[][] mass, int pos) {
	        int g;
			for (g = 0; g < mass.length; g++) {
			int size = mass.length;
	        for (int i = 0; i < pos; i++) {
	            int temp = mass[g][size - 1];
	            for (int j = size - 1; j > 0; j--) {
	                mass[g][j] = mass[g][j-1];
	            }
	            mass[g][0] = temp;
	        }
		}
			
			for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass.length; j++)
					System.out.print(mass[i][j]+ "  ");
					System.out.println();
			
				
			}
	   }

	 public static void moveLeft(int[][] mass, int pos) {
		 int temp;
		 for (int i = 0; i < pos; i++) {
			for (int j = 0; j < mass.length; j++) {
				temp=mass[j][0];
				
				for (int x = 0; x < mass.length-1; x++) {
					mass[j][x]=mass[j][x+1];
				}
				mass[j][mass.length-1]=temp;
			}
		}
		 for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass.length; j++)
					System.out.print(mass[i][j]+ "  ");
					System.out.println();
			
				
			}
	   }

	 public static void elemsSummHigh(int[][] mass) {
		 int counter=0, res=0;
		
		 for (int i = 0; i < mass.length; i++) {
			 for (int j = 0; j < mass.length-1; j++) {
				if (mass[i][j]<mass[i][j+1]) {
					counter++;
				} 
				else  {
					if (counter>res) {
						res=counter+1
								;
						
					}
					counter=0;
				}
			}
		}
		 System.out.println(res);
	 }

	 public static void elemsSummLow(int[][] mass) {
		 int counter=0, res=0;
		
		 for (int i = 0; i < mass.length; i++) {
			 for (int j = 0; j < mass.length-1; j++) {
				if (mass[i][j]>mass[i][j+1]) {
					counter++;
				} 
				else  {
					if (counter>res) {
						res=counter+1
								;
						
					}
					counter=0;
				}
			}
		}
		 System.out.println(res);
	 }

	 public static void elemsSummBetween(int n) {
	
		
			
		int mass[][] = new int[n][n]; 
			for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass.length; j++) {
					mass[i][j]=-n+(int)(Math.random()*(n+n)+1);
				}
			}
			
			for (int i = 0; i < mass.length; i++) {
				for (int j = 0; j < mass.length; j++)
					System.out.print(mass[i][j]+ "  ");
					System.out.println();
			}
			
			int summ;
		label1:for (int i = 0; i < mass.length; i++) {
			summ=0;
				for (int j = 0; j < mass.length; j++) {
					if (mass[i][j]>=0) {
						for (int x = j+1; x < mass.length; x++) {
							if (mass[i][x]<0) {
								summ=summ+mass[i][x];
							}
							else {
								System.out.println("Сумма в "+i+" строке: "+summ);
								continue label1;
							}
						}
					}
					
				}
			
				
			}
	 }

	 public static void rotation(int[][] mass) {
		
		 
		 int size=mass.length;
		  for (int i=0; i<size/2; i++)  {
	            for (int j=i; j<size-1-i; j++)
	            {
	               
	                int tmp = mass[i][j];
	                mass[i][j] = mass[j][size-1-i];
	                mass[j][size-1-i] = mass[size-1-i][size-1-j];
	                mass[size-1-i][size-1-j] = mass[size-1-j][i];
	                mass[size-1-j][i] = tmp;
	            }
	        }
		  
		  for (int i = 0; i < mass.length; i++) {
				for (int  j = 0; j < mass.length; j++)
					System.out.print(mass[i][j]+ "  ");
					System.out.println();
			
				
			}
	 }

	 public static void subtrAvg(double[][] mass) {
		 
		 double summa=0;
		 int n=mass.length;
		
		 for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass.length; j++) {
				
				summa=summa+(double)mass[i][j];
				
			}
		}
		 double avg= summa/(n*n);
		 System.out.println("ПОСЛЕ:");
		  for (int i = 0; i < mass.length; i++) {
				for (int  j = 0; j < mass.length; j++){
					mass[i][j]=mass[i][j]-avg;
					System.out.print(mass[i][j]+ "  ");
				
				}
					System.out.println();
			
				
			}
		  
	 }

	 public static void compress() {

	        System.out.println("-----Матрица до сжатия-----");
	        int[][] nullArr = {
					 {1,6,0,6,3},
					 {0,0,0,0,0},
					 {1,6,0,6,3},
					 {0,0,0,0,0},
					 {0,0,0,0,0},
		        };
			 
				for (int k = 0; k < nullArr.length; k++) {
					for (int m = 0; m < nullArr.length; m++)
						System.out.print(nullArr[k][m]+ "  ");
						System.out.println();
				}
	        boolean[] horizontalZeros = new boolean[nullArr.length];
	        boolean[] verticalZeros = new boolean[nullArr.length];
	        int horizontalLength = nullArr.length;
	        int verticalLength = nullArr.length;
	        boolean flag = true;
	        for (int i = 0; i < nullArr.length; i++) {
	            for (int j = 0; j < nullArr.length; j++) {
	                if (nullArr[i][j] != 0) {
	                    flag = false;
	                }
	            }
	            if (flag) {
	                horizontalLength--;
	            }
	            verticalZeros[i] = !flag;
	            flag = true;
	        }
	        for (int i = 0; i < nullArr.length; i++) {
	            for (int j = 0; j < nullArr.length; j++) {
	                if (nullArr[j][i] != 0) {
	                    flag = false;
	                }
	            }
	            if (flag) {
	                verticalLength--;
	            }
	            horizontalZeros[i] = !flag;
	            flag = true;
	        }
	        int[][] result = new int[horizontalLength][verticalLength];
	        for (int i = 0, i1 = 0; i < nullArr.length; i++) {
	            if (verticalZeros[i]) {
	                for (int j = 0, j1 = 0; j < nullArr.length; j++) {
	                    if (horizontalZeros[j]) {
	                        result[i1][j1++] = nullArr[i][j];
	                    }
	                }
	                i1++;
	            }
	        }
	        System.out.println("-----Сжатая матрица-----");
	        System.out.println(Arrays.deepToString(result));
	    }
	 
	 
	 public static void zeroS(int[][] mass) {
		 int tmp,x=0,y=0;
		 int[][] newMass = new int[mass.length][mass.length];
		 for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass.length; j++) {
				if (mass[i][j]!=0) {
					newMass[x][y]=mass[i][j];
					y++;
					if (y==mass.length) {
						y=0;
						x++;
					}
					
				}
			}
		}
		 for (int i = 0; i <  newMass.length; i++) {
				for (int  j = 0; j <  newMass.length; j++)
					System.out.print( newMass[i][j]+ "  ");
					System.out.println();		
			}
	 }
	 
	

}
