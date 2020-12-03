package sk.kosickaacademic.simon.homework2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RWFile rwf = new RWFile();
        FileC fc = new FileC();
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        arrA = rwf.readFileA(arrA);
        arrB = rwf.readFileB(arrB);
        rwf.writeFileA(arrA, arrB);
        rwf.writeFileB(arrA, arrB);
        fc.createFile(arrA, arrB);
        fc.sortNumbers();
    }
}
