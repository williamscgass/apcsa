public class Main {
    public static void main(String[] args) {

        // 2d array
        int[][] nums = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // row major?
        // column major ?

        // regular for loop, row-major
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // column major
        for (int i = 0; i < nums[0].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[j][i]);
            }
            System.out.println();
        }

        /* int[][] nums = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        }; */

        System.out.println();

        nums[0] = new int[6];

        // enhanced for loops
        for (int[] row : nums) {
            for (int ele : row) {
                System.out.print(ele);
            }
            System.out.println();
        }
    }
}
