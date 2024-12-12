public class sample1 {
    public void example1() {
        String array1[] = {"name1", "name2", "name3"};
        array1[2] = "dublicated2";
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    public void example2() {
        String[] array2 = new String[5];
        array2[0] = "index1";
        array2[1] = "index2";
        array2[2] = "index3";
        System.out.println();
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + " ");
        }
    }

    public void example3() {
        int[][] array3 = {{2, 5, 6}, {4, 5, 6}, {1, 5, 8}};
        System.out.println();
        for (int z = 0; z < array3.length; z++) {
            for (int x = 0; x < array3[z].length; x++) {
                System.out.print(array3[z][x] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int[] row:array3){
            for (int k : row){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
