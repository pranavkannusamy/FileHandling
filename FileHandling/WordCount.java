package Threads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

class WordCount implements Runnable
{
	public static BufferedReader reader = null;
	public String filePath;
	public WordCount(String fp)
      {
		filePath=fp;
	}
	public void run()
      {
        int wordCount = 0;
        File file = new File(filePath);
        try
        {
          FileInputStream fileStream = new FileInputStream(file);
          InputStreamReader input = new InputStreamReader(fileStream);
          reader = new BufferedReader(input);
          String data=reader.readLine();
          while(data != null)
          {
            String[] words = data.split(" ");
            wordCount = wordCount + words.length;
            data=reader.readLine();
          }
        }
        catch(Exception e)
        {
    	   e.printStackTrace();
        }
        System.out.print(wordCount + " ");
    }
}