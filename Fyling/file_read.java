package Fyling;

import java.io.FileReader;

public class file_read {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("Fyling/art.txt");
            int data = reader.read();
            while(data != -1){
                System.out.print((char)data); // Cast to char because read() returns an int
                data = reader.read();
            }
            System.out.println();
            reader.close();
        } catch(Exception e){
            System.out.println("Error reading file :(");
        }
    }
}
