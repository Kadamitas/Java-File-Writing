import java.io.FileWriter;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException 
    { 
  
        // attach a file to FileWriter  
        FileWriter fw = new FileWriter("test.txt"); 
        fw.write("whatever"); 
        fw.close(); 
    } 

}


