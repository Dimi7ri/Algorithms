/*
 *  This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * This class is an example of the Practical and Popular way to sort arrays using Bubble sort algorithm.
 * @author Dimitri Vasiliev
 *
 */
public class BubbleSort {

	public static void main(String[] args) {

		int ArrayInt1[] = new int[]{8,3,1,5,0};
		int ArrayInt2[] = new int[]{8,3,1,5,0};
		
		System.out.println("ArrayInt1 not sorted.");
		for(int i = 0; i < ArrayInt1.length ; i++){
			System.out.print(ArrayInt1[i]+" ");
		}
				
		long startTime = System.nanoTime();
		
		ArrayInt1 = bubbleSortPractical(ArrayInt1);
		long stopTime = System.nanoTime();;
	    long elapsedTime = stopTime - startTime;
		
		System.out.println("\n\nArrayInt1 sorted.");
		for(int i = 0; i < ArrayInt1.length ; i++){
			System.out.print(ArrayInt1[i]+" ");
		}
		
	    System.out.println("\n\nExecution time Practical way: "+elapsedTime+" milliseconds.");
	    
	    System.out.println("\n*****************************************************\n");
	    
		System.out.println("ArrayInt2 not sorted.");
		for(int i = 0; i < ArrayInt2.length ; i++){
			System.out.print(ArrayInt2[i]+" ");
		}
				
		startTime = System.nanoTime();
		
		ArrayInt2 = bubbleSortPopular(ArrayInt2);
		stopTime = System.nanoTime();;
	    elapsedTime = stopTime - startTime;
		
		System.out.println("\n\nArrayInt2 sorted.");
		for(int i = 0; i < ArrayInt2.length ; i++){
			System.out.print(ArrayInt2[i]+" ");
		}
		
	    System.out.println("\n\nExecution time Popular way: "+elapsedTime+" milliseconds.");
	}
	
	/**
	 * This method Bubble sorts the Practical way.
	 * @param ArrayInt Array of integers to be sorted.
	 * @return Array of integers sorted.
	 */
	public static int[] bubbleSortPractical (int ArrayInt[]){
		int Temp = 0;
		boolean Swapping = true;
		while(Swapping){
			Swapping = false;
			for(int I = 0 ; I < ArrayInt.length-1 ; I++){
				if(ArrayInt[I] > ArrayInt[I+1]){
					Temp = ArrayInt[I];
					ArrayInt[I] = ArrayInt[I+1];
					ArrayInt[I+1] = Temp;
					Swapping = true;
				}
			}
		}
		return ArrayInt;
	}
	
	/**
	 * This method Bubble sorts the Popular way.
	 * @param ArrayInt Array of integers to be sorted.
	 * @return Array of integers sorted.
	 */
	public static int[] bubbleSortPopular(int ArrayInt[]){
		int Temp = 0;
		for(int J = 0 ; J < ArrayInt.length ; J++){
			for(int I = 0 ; I < ArrayInt.length-1 ; I++){
				if(ArrayInt[I] > ArrayInt[I+1]){
					Temp = ArrayInt[I];
					ArrayInt[I] = ArrayInt[I+1];
					ArrayInt[I+1] = Temp;
				}
			}
		}
		return ArrayInt;
	}

}
