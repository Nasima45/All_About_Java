package org.example.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceSample {
    public static void main(String[] args) {
        //no need to close files manually
        try(FileReader br = new FileReader("br.text")){
            System.out.println("you are reading me ");
        }
        catch(IOException e){
            System.out.println("stupid you don't even have that file....");
        }
    }
}
