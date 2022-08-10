package kvv.laptop;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static java.lang.Math.abs;

public class Main {
    private static final String inputFile = "input.txt";
    private static final String outputFile = "output.txt";

    public static void main(String[] args) throws IOException {

        HashMap alphAndNume = new HashMap<Integer, String>();
        AtomicInteger i = new AtomicInteger(0);
        for(char alphabet = 'a'; alphabet <='z'; alphabet++ ){
            alphAndNume.put(i.incrementAndGet(), Character.toString(alphabet));
        }
        alphAndNume.put(27, " ");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        int n = Integer.parseInt(reader.readLine());
        List<Integer> numList =Arrays.stream(reader.readLine().split(" ")).map(t->Integer.parseInt(t)).collect(Collectors.toList());
        reader.close();

        int current = 0;
        int processedNum = 0;
        int counter = 0;
        int preExisting = 0;
        StringBuilder sb = new StringBuilder("");

        for (Iterator<Integer> it = numList.listIterator(); it.hasNext();){
            processedNum = it.next().intValue();
            current = abs(processedNum - preExisting);
            while (current !=0 ){
                counter++;
                current = current >> 1;
            }
            System.out.println(alphAndNume.get(counter));
            sb.append(alphAndNume.get(counter));
            preExisting = processedNum;
            counter = 0;
        }


        FileWriter file = new FileWriter(outputFile);
        file.write(sb.substring(0));
        file.close();

    }
}
