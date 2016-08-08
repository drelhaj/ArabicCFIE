package org.project.cfie.contentpage;

import java.io.File;
import java.io.IOException;
/*
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;*/

public class TestArabicContents {
	/*
public static void main(String[] args) throws IOException{
	
	
	String[] keywordslist = ContentPage.readLines("E:\\workspace\\keywords\\ArabicKeywords.txt");
	
	for(String word : keywordslist){
		System.out.println(cleanArabicText(word));
	}

	readArabicPDF("E:/workspace/ArabicAnnualReports/20100511_annual-report-arabic-07.pdf");
	
	
	
	
String x = "ال ùسنة المالية ب �إيجاز";
 * .replaceAll("[^\\p{InArabic}]+"," ")
System.out.println(x);

System.out.println(x.replaceAll(" [^\\p{InArabic}]",""));
	

	
}


public static void readArabicPDF(String file) throws IOException{
	
	PDDocument pddDocument = PDDocument.load(new File(file));
    PDFTextStripper textStripper = new PDFTextStripper();
    String Text = textStripper.getText(pddDocument);
    System.out.println(Text);
    
}


*//**
 * Clean Arabic text from PDF legature and converts Arabic numbers to English
 * @param text
 * @return
 *//*
public static String cleanArabicText(String text){
	
	text = text.replace("٠","0").replace("١","1").replace("٢","2")
	.replace("٣","3")	.replace("٤","4").replace("٥","5")
	.replace("٦","6").replace("٧","7").replace("٨","8").replace("٩","9").
	replace(")"," ").replace("("," ").replace("-"," ").replace("–"," ")
	.replace(")"," ").replace("†", "").replace(" ù", "").replace(" ü", "")
	.replaceAll("[۰-۹]"," ").replaceAll("[\\p{P}\\p{Digit}]"," ")
	.replaceAll(" [^\\p{InArabic}]","").replace("�", " ").replace("􀁼 ", "")
	.replaceAll("[^\\p{InArabic}]+"," ").replace("􀁼", " ").replaceAll(" +", " ").trim();
	
	return text;
}*/
}
