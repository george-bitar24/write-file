import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String input = "hello malaka";
        String input2 = "hello mounoskylo";

        bufferedWriter.write(input);

        bufferedWriter.newLine();
        bufferedWriter.write(input2);

        bufferedWriter.close();
    }
}
