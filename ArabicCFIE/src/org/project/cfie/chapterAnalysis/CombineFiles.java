
	package org.project.cfie.chapterAnalysis;

	import java.io.File;
	import java.io.IOException;
	import java.io.PrintWriter;

	import org.apache.commons.io.FileUtils;

	public class CombineFiles {

		
		static String dirFrom = "E:\\workspace\\OsmanCorpus\\ART";
		static String dirTo = "E:\\workspace\\OsmanCorpus\\ART\\docs";
		static int wordCount = 0;
		static String content = "";
		static int fileCount = 0;
		static String fileName = "";
		static String fileNameTmp = "";

		public static void main(String[] args) throws IOException{
		
			
			File folder = new File(dirFrom);
			File[] listOfFiles = folder.listFiles();

			for (int i = 0; i < listOfFiles.length; i++) {
			  File file = listOfFiles[i];
			  if (file.isFile()) {
				  if(i==0){fileNameTmp = file.getName().substring(0,file.getName().indexOf("_"));;
				  content = FileUtils.readFileToString(file);}
				  else{
					  fileName = file.getName().substring(0,file.getName().indexOf("_"));
					  if(fileNameTmp.equals(fileName)){
			    content += FileUtils.readFileToString(file);
			    fileNameTmp = file.getName().substring(0,file.getName().indexOf("_"));
				  }
					  else{
						    PrintWriter out = new PrintWriter(dirTo+File.separator+fileNameTmp+".txt");
						    out.println(content);
						    out.flush();
						  content = FileUtils.readFileToString(file);
						    fileNameTmp = file.getName().substring(0,file.getName().indexOf("_"));
					  }
				  }
	/*		    if(wordCount>=1000000){
			    PrintWriter out = new PrintWriter(dirTo+File.separator+(++fileCount)+".txt");
			    out.println(content);
			    content = "";
			    wordCount = 0;
			    }*/
			    /* do somthing with content */
		  } 
			}
		    PrintWriter out = new PrintWriter(dirTo+File.separator+fileNameTmp+".txt");
		    out.println(content);
		    out.flush();
			
			out.close();
			
	}
	}

