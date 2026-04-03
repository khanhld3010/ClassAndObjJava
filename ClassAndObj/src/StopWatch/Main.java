package StopWatch;

import java.util.Random;

public class Main {
    static void main(String[] args) {
        int[] numbers = new Random().ints(100000).toArray();
        SelectionSort selectionSort = new SelectionSort();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort.selectionSort(numbers);
        stopWatch.stop();
        Long time = stopWatch.getElapsedTime();
        System.out.println("Time: "+time+" ms");
    }
}
