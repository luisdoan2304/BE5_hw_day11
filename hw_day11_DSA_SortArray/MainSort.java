package hw_day11_DSA_SortArray;

public class MainSort {

	public static void main(String[] args) {
		
		int[] array = {2, 0, 2, 1, 1, 0};
        Sort sortColors = new Sort();
        sortColors.sort(array);

        System.out.println("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

	}

}
