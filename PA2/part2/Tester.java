import java.lang.reflect.Method;
import java.util.Random;

public class Tester {

    public static void main(String[] args) {
        int[] randomArray5K = generateArray(5000, "random");
        int[] randomArray7K = generateArray(7500, "random");
        int[] randomArray10K = generateArray(10000, "random");

        int[] ascendingArray5K = generateArray(5000, "ascending");
        int[] ascendingArray7K = generateArray(7500, "ascending");
        int[] ascendingArray10K = generateArray(10000, "ascending");

        int[] descendingArray5K = generateArray(5000, "descending");
        int[] descendingArray7K = generateArray(7500, "descending");
        int[] descendingArray10K = generateArray(10000, "descending");

        System.out.println("Random: Size 5000:");
        testSortingAlgorithm("Sort1", randomArray5K.clone(), "sort1");
        testSortingAlgorithm("Sort2", randomArray5K.clone(), "sort2");
        testSortingAlgorithm("Sort3", randomArray5K.clone(), "sort3");
        testSortingAlgorithm("Sort4", randomArray5K.clone(), "sort4");
        testSortingAlgorithm("Sort5", randomArray5K.clone(), "sort5");

        System.out.println("Random: Size 7500:");
        testSortingAlgorithm("Sort1", randomArray7K.clone(), "sort1");
        testSortingAlgorithm("Sort2", randomArray7K.clone(), "sort2");
        testSortingAlgorithm("Sort3", randomArray7K.clone(), "sort3");
        testSortingAlgorithm("Sort4", randomArray7K.clone(), "sort4");
        testSortingAlgorithm("Sort5", randomArray7K.clone(), "sort5");

        System.out.println("Random: Size 10000:");
        testSortingAlgorithm("Sort1", randomArray10K.clone(), "sort1");
        testSortingAlgorithm("Sort2", randomArray10K.clone(), "sort2");
        testSortingAlgorithm("Sort3", randomArray10K.clone(), "sort3");
        testSortingAlgorithm("Sort4", randomArray10K.clone(), "sort4");
        testSortingAlgorithm("Sort5", randomArray10K.clone(), "sort5");

        System.out.println("Ascending: Size 5000:");
        testSortingAlgorithm("Sort1", ascendingArray5K.clone(), "sort1");
        testSortingAlgorithm("Sort2", ascendingArray5K.clone(), "sort2");
        testSortingAlgorithm("Sort3", ascendingArray5K.clone(), "sort3");
        testSortingAlgorithm("Sort4", ascendingArray5K.clone(), "sort4");
        testSortingAlgorithm("Sort5", ascendingArray5K.clone(), "sort5");

        System.out.println("Ascending: Size 7500");
        testSortingAlgorithm("Sort1", ascendingArray7K.clone(), "sort1");
        testSortingAlgorithm("Sort2", ascendingArray7K.clone(), "sort2");
        testSortingAlgorithm("Sort3", ascendingArray7K.clone(), "sort3");
        testSortingAlgorithm("Sort4", ascendingArray7K.clone(), "sort4");
        testSortingAlgorithm("Sort5", ascendingArray7K.clone(), "sort5");

        System.out.println("Ascending: Size 10000:");
        testSortingAlgorithm("Sort1", ascendingArray10K.clone(), "sort1");
        testSortingAlgorithm("Sort2", ascendingArray10K.clone(), "sort2");
        testSortingAlgorithm("Sort3", ascendingArray10K.clone(), "sort3");
        testSortingAlgorithm("Sort4", ascendingArray10K.clone(), "sort4");
        testSortingAlgorithm("Sort5", ascendingArray10K.clone(), "sort5");

        System.out.println("Descending: Size 5000:");
        testSortingAlgorithm("Sort1", descendingArray5K.clone(), "sort1");
        testSortingAlgorithm("Sort2", descendingArray5K.clone(), "sort2");
        testSortingAlgorithm("Sort3", descendingArray5K.clone(), "sort3");
        testSortingAlgorithm("Sort4", descendingArray5K.clone(), "sort4");
        testSortingAlgorithm("Sort5", descendingArray5K.clone(), "sort5");

        System.out.println("Descending: Size 7500:");
        testSortingAlgorithm("Sort1", descendingArray7K.clone(), "sort1");
        testSortingAlgorithm("Sort2", descendingArray7K.clone(), "sort2");
        testSortingAlgorithm("Sort3", descendingArray7K.clone(), "sort3");
        testSortingAlgorithm("Sort4", descendingArray7K.clone(), "sort4");
        testSortingAlgorithm("Sort5", descendingArray7K.clone(), "sort5");

        System.out.println("Descending: Size 10000:");
        testSortingAlgorithm("Sort1", descendingArray10K.clone(), "sort1");
        testSortingAlgorithm("Sort2", descendingArray10K.clone(), "sort2");
        testSortingAlgorithm("Sort3", descendingArray10K.clone(), "sort3");
        testSortingAlgorithm("Sort4", descendingArray10K.clone(), "sort4");
        testSortingAlgorithm("Sort5", descendingArray10K.clone(), "sort5");
    }

    private static void testSortingAlgorithm(String algorithmName, int[] array, String sortingMethod) {
        long startTime = System.nanoTime();

        try {
            Class<?> sorterClass = Class.forName("sorter");
            Method method = sorterClass.getMethod(sortingMethod, int[].class);
            method.invoke(null, (Object) array);
        } catch (Exception e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println(algorithmName + " execution time: " + duration + " nanoseconds");
    }

    private static int[] generateArray(int size, String order) {
        int[] array = new int[size];

        switch (order) {
            case "ascending":
                for (int i = 0; i < size; i++) {
                    array[i] = i;
                }
                break;
            case "descending":
                for (int i = 0; i < size; i++) {
                    array[i] = size - i - 1;
                }
                break;
            case "random":
            default:
                Random random = new Random();
                for (int i = 0; i < size; i++) {
                    array[i] = random.nextInt(100);
                }
                break;
        }

        return array;
    }
}
