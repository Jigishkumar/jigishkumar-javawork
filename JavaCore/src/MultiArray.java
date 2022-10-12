
import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = new int[3][3];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter ten values for rows and cols");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				nums[i][j] = scn.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println("");
		}
		scn.close();
	}
}
