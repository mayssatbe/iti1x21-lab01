public class Q3_SquareArray {
	public static int[] createArray(int size) {
		int[] anArray = new int [size];
		for(int i=0;i<size;i++){
			anArray[i]=(int) Math.pow(i, 2);
		}
		return anArray;
			
	}
	public static void main(String[] args) {
			int[] array = createArray(13);
			for(int i=0;i<13;i++){
			System.out.println("the square of " +i+  " is: " +array[i]);
		    }
		
		}
}