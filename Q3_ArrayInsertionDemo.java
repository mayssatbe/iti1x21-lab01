import java.util.Scanner;
public class Q3_ArrayInsertionDemo {

	public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
		int[] afterArray=new int[beforeArray.length+1];
		afterArray[indexToInsert]=valueToInsert;
		for(int i =0;i<indexToInsert;i++) {
			afterArray[i]=beforeArray[i];
		}
		for(int i=indexToInsert+1;i<afterArray.length;i++) {
			afterArray[i]=beforeArray[i-1];
		}
		return afterArray;
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array's size: ");
		int taille= scan.nextInt();
		int[]beforeArray = new int[taille];
		System.out.println("Array before insertion: ");
		for(int i =0;i<taille;i++){
			beforeArray[i]=scan.nextInt();
		}
		int valp;
		System.out.println("position of the value to insert: ");
		do {
		 valp = scan.nextInt();
		 if (valp>taille) System.out.println("error");
		}while(valp>taille);
		System.out.println("value to insert: ");
		int val = scan.nextInt();
		
		
		
		int[] afterArray = insertIntoArray(beforeArray,valp,val);
		System.out.println("Array after insertion: ");
		for(int i=0;i<afterArray.length;i++) {
			System.out.println(afterArray[i]);
			
		}
	}
}