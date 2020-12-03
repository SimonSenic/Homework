package sk.kosickaacademic.simon.homework2;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class FileC {
    public void createFile(ArrayList<Integer> arrA, ArrayList<Integer> arrB){
        try{
            File file = new File("output/c.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i:arrA) if(!arr.contains(i)) arr.add(i);
            for(int i:arrB) if(!arr.contains(i)) arr.add(i);
            for(int i:arr) writer.write(String.valueOf(i) +'\n');
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void sortNumbers(){
        ArrayList<String> arr = new ArrayList<>();
        try{
            FileReader fr = new FileReader("output/c.txt");
            BufferedReader read = new BufferedReader(fr);
            String line = read.readLine();
            while(line!=null){
                arr.add(line);
                line = read.readLine();
            }
            arr.sort(Comparator.comparingInt(Integer::parseInt));
            System.out.println("c: " +arr);
            fr.close();
            read.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
