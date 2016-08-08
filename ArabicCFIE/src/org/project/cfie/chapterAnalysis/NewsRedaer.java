package org.project.cfie.chapterAnalysis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import org.jsoup.Jsoup;

public class NewsRedaer {

	public static File dir = new File("E:\\workspace\\ArabicAnnualReports\\businessNews");
	public static int DocumentID = 300;	

	public static String FileName = "";

	static PrintWriter writer;
	
	public static void main(String args[]) throws IOException, SQLException{

	    
		if(dir.isDirectory()){
			  for (File child : dir.listFiles()) {
				try{
				  FileName = child.getName();
					  ++DocumentID;
					  System.out.println(DocumentID);
		    String htmlFile = dir+"\\"+FileName;
		    //test to see if the file is readable (digital PDF)
		    System.out.println(htmlFile);
		    
		    File file = new File(htmlFile);
		    FileInputStream fis = new FileInputStream(file);
		    byte[] data = new byte[(int) file.length()];
		    fis.read(data);
		    fis.close();

		    String str = new String(data, "UTF-8");
str = str.substring(str.indexOf("<div id=\"imgCarousel\" class=\"imgCarousel\">"),str.indexOf("<div id=\"floatingH1\""));
String contents = html2text(str);

	String outputFile = dir + "\\text\\" +DocumentID+".txt";//name of the output CSV file
	writer = new PrintWriter(outputFile, "UTF-8");
	writer.print(contents);
	writer.flush();
	writer.close();
					 
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			  }
		}
		

		
	}
	
			public static String html2text(String html) {
		    return Jsoup.parse(html).text();
		}
}
