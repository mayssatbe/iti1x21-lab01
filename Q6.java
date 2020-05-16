import java.util.*;
public class Q6 {
 
		public static void main(String[] args){
			Scanner scan=new Scanner (System.in);
			double[] tab=new double[10];
			System.out.println("give the student's grades: ");
			for(int i=0;i<10;i++) {
				double note=tab[i];
				do {
					note=scan.nextDouble();
					tab[i]=note;
					if (note<0 || note>100) 
						System.out.println("error");
				}while(note<0 || note>100);
				
			}
			System.out.println("The average is: " +calculateAverage(tab));
			System.out.println("The median is : " +calculateMedian(tab));
			System.out.println("The number failed is: " +calculateNumberFailed(tab));
			System.out.println("The number passed is : " +calculateNumberPassed(tab));
            

		}

		public static double calculateAverage(double[] notes){
			double avg=0;
			for (int i=0;i<notes.length;i++) {
				avg=avg+notes[i];
				
			}
			avg = avg/notes.length;
			return avg;
		}

		public static double calculateMedian(double[] notes){
			double med=0;
			for (int i=0;i<notes.length;i++) {
				 med=med+notes[i];
		}return med/2;
		}

		public static int calculateNumberFailed(double[] notes){
			int nbFailed=0;
			for(int i=0;i<notes.length;i++) {
				if(notes[i]<calculateMedian(notes)) 
					nbFailed++;
			}return nbFailed;
		}

		public static int calculateNumberPassed(double[] notes){
			return notes.length-calculateNumberFailed(notes);
		}

	}