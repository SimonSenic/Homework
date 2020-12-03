package sk.kosickaacademic.simon.homework2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RWFile {
    public ArrayList<Integer> readFileA(ArrayList<Integer> arr){
        arr = new ArrayList<>();
        try{
            FileReader fr = new FileReader("resources/a.txt");
            BufferedReader read = new BufferedReader(fr);
            String line = read.readLine();
            while(line!=null){
                String temp[] = line.split("  ");
                for(int i=0; i<temp.length; i++) arr.add(Integer.parseInt(temp[i]));
                line = read.readLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return arr;
    }

    public ArrayList<Integer> readFileB(ArrayList<Integer> arr){
        arr = new ArrayList<>();
        try{
            FileReader fr = new FileReader("resources/b.txt");
            BufferedReader read = new BufferedReader(fr);
            String line = read.readLine();
            while(line!=null){
                String temp[] = line.split("  ");
                for(int i=0; i<temp.length; i++) arr.add(Integer.parseInt(temp[i]));
                line = read.readLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return arr;
    }

    public void writeFileA(ArrayList<Integer> arrA, ArrayList<Integer> arrB){
        ArrayList<Integer> tempA = new ArrayList<>(arrA);
        ArrayList<Integer> tempB = new ArrayList<>(arrB);
        for(int i=0; i<tempB.size(); i++)
            if(tempA.contains(tempB.get(i))) tempA.remove(tempB.get(i));
        System.out.println("a: " +tempA);
    }

    public void writeFileB(ArrayList<Integer> arrA, ArrayList<Integer> arrB){
        ArrayList<Integer> tempA = arrA;
        ArrayList<Integer> tempB = arrB;
        for(int i=0; i<tempA.size(); i++)
            if(tempB.contains(tempA.get(i))) tempB.remove(tempA.get(i));
        System.out.println("b: " +tempB);
    }
}
