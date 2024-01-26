import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree= new BinarySearchTree();
        String [] fileNames={"C:\\Users\\aysel\\Downloads\\input1.txt",
                "C:\\Users\\aysel\\Downloads\\input2.txt",
                "C:\\Users\\aysel\\Downloads\\input3.txt"};

        for(String fileName: fileNames){
            read(binarySearchTree,fileName);
                }
        binarySearchTree.printFrequencies();


        }
        private static void read(BinarySearchTree binarySearchTree, String fileName){
        try(BufferedReader br= new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line= br.readLine())!=null){
                String words [] =line.toLowerCase().split("\\s+");
                for (String word: words){
                    binarySearchTree.insert(word);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        }


}
