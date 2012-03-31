package algorithm;

public class QuickSeacrh extends Algorithm {

    public static void main(String[] args) {
        QuickSeacrh algorithm = new QuickSeacrh();
        algorithm.fill(array);
        algorithm.useAlgorithm();
    }

    @Override
    public void useAlgorithm() {
        for (int i = 0; i < testArray.length; i++) {
            p = testArray[i][0];
            q = testArray[i][1];

            int t = array[p];
            if (t == array[q]) {
                continue;
            }
            for (int j = 0; j < array.length; j++) {
                if (array[j] == t) {
                    array[j] = array[q];
                }
            }
            printArray(array);
        }
    }
}
