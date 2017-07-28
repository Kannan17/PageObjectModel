package com.webapp.wgreen.pom.testcases.set1;

import java.io.*;

public class WriterDemo {

   public static void main(String[] args) {
      String str = "Hello world!";

      // create a new writer
      Writer writer = new PrintWriter(System.out);

      try {
      
         // write a string portion
         writer.write(str, 0, 5);

         // flush the writer
         writer.flush();

         // write another string portion
         writer.write(str, 5, 6);

         // flush the stream again
         writer.flush();

      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}