package practice;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * DemoFileWriter
 */
public class DemoFileWriter {

    public static void main(String[] args) {
        String content = "India a power country";
        String userInputContent="";

        System.out.println("Enter any String: ");
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader br =  new BufferedReader(inputStreamReader);
            userInputContent = br.readLine();
            
        } catch (IOException e) {
           System.out.println(e);
        }
        //System.out.println(userInputContent);
        try {
        	//System.out.println("inside filewriting section");
            FileWriter fileWriter = new FileWriter("d:/info.txt");
            //System.out.println("after filewriting");
            fileWriter.write(content+userInputContent);
            //System.out.println("after writing");
            fileWriter.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
}