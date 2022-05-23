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

class Print implements Runnable{
	public String filePath;
	public Print(String fp)
	{
		filePath=fp;
	}
	public void run(){ 
		System.out.println(filePath);
	}
}