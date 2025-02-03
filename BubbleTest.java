package bubble;

import java.util.Arrays;

public class BubbleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {64,34,25,12,22,11,9};
		System.out.println("정렬전");
		for(int number: numbers) {
			System.out.print(number+" ");
		}
		System.out.println();
		
		bubbleSort(numbers);
		System.out.println(Arrays.toString(numbers));
		
	}

	private static void bubbleSort(int[] numbers) {
		// 버블정렬처리하세요
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=0; j<numbers.length-i-1; j++) {
			if(numbers[j]>numbers[j+1]) {
				int temp=numbers[j];
				numbers[j] = numbers[j+1];
				numbers[j+1]=temp;
				temp=0;
			}
		}
	}
}
		
	}

