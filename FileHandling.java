package com.pravin.training;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileHandling {
   public static void main( String[] args ) {

      try {
         String data = " Hello user, Happy new year..";
		
		File f1 = new File("test.txt");
         if(!f1.exists()) {
            f1.createNewFile();
         }

         FileWriter fileWritter = new FileWriter(f1.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(data);
         bw.close();
         System.out.println("Done..");
      } catch(IOException e){e.printStackTrace();
      }
   }
}
