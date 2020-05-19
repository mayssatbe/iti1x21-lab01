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
			int i, j, argMin, tmp;
			double temp;
			double med=0;
6
7		for (i = 0; i < notes.length - 1; i++) {
8			argMin = i;
9			for (j = i + 1; j < notes.length; j++) {
10				if (notes[j] < notes[argMin]) {
11					argMin = j;
12				}
13			}
14
15			tmp = notes[argMin];
16			notes[argMin] = notes[i];
17			notes[i] = tmp;
18		}
			for (notes.length%2==0) {
				 med=(notes[notes.length/2]+note[notes.legth/2-1])/2;
			}return med;
		}
19
20	
			
			

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