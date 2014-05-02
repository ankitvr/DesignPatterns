package datastructures;

import java.util.Random;

public class DataStructures {
	static Integer[] array  = new Integer[10];
	public static void main(String[] args) {
		generateArray();
		//linearSearch(array[7]);
		bubbleSort();
	}
	private static void bubbleSort() {
		for(int i =0;i<array.length;i++){
			for (int j = 0; j < 10; j++) {
				
			}
		}
		
	}
	private static void linearSearch(Integer integer) {
		
		for(int i=0;i<array.length;i++){
			displayArray(i);
			if(array[i].equals(integer)){
			   System.out.println("Found at "+(i+1) +" position");
			   break;
			}
		}
		
	}
	private static void generateArray() {
		Random random = new Random();
		for(int i=0;i<10;i++){
			array[i]=random.nextInt(100);
		}
	}
	private static void displayArray(int traversionIndex) {
		String pointer = "Traversing at: \t";
		String indexes = "Indexes:\t";
		String result =  "Values: \t";
		for(int i=0;i<10;i++){
			indexes+=i+"\t|";
			result += array[i]+"\t|";
		}
		for (int i = 0; i < traversionIndex; i++) {
			pointer+="\t";
		}
		pointer+="|"+traversionIndex;
		System.out.println(pointer);
		System.out.println(indexes);
		System.out.println(result);
	}
	private static void insertionSort(Integer[] array2) {
		// TODO Auto-generated method stub
		
	}
}
