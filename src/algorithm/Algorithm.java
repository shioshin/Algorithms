package algorithm;

public abstract class Algorithm {

    protected int p, q;
    protected static int[] array = new int[10];
    protected int[][] testArray = new int[][]{{3, 4}, {4, 9}, {8, 0}, {2, 3}, {5, 6}, {2, 9}, {5, 9}, {7, 3}, {4, 8}, {4, 8}, {5, 6}, {0, 2}, {6, 1}};

    public void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
    public abstract  void useAlgorithm();
}
