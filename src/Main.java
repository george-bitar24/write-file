import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
//
//




        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String input = "hello ";
        String input2 = "hello 2";
        bufferedWriter.newLine();

        bufferedWriter.write(input);

        bufferedWriter.newLine();
        bufferedWriter.write(input2);

        bufferedWriter.close();
    }
}
