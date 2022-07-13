import java.util.Scanner;

public class MergeSort {

	public void merge(int arr[], int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			leftArr[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightArr[j] = arr[mid + 1 + j];

		int i = 0, j = 0;

		int k = left;
		
		while (i < n1 && j < n2) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}

	public void sort(int arr[], int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;

			sort(arr, left, mid);
			sort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array: ");
		int n = sc.nextInt();

		System.out.println("Enter the values in the array: ");

		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}