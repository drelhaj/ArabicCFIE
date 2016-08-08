package org.project.cfie.contentpage;

public class ArabicTextCleaner {

	public ArabicTextCleaner() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Clean Arabic text from PDF legature and converts Arabic numbers to English
	 * @param text
	 * @return
	 */
	public static String cleanArabicText(String text){
		
		text = text.replace("٠","0").replace("١","1").replace("٢","2")
		.replace("٣","3")	.replace("٤","4").replace("٥","5")
		.replace("٦","6").replace("٧","7").replace("٨","8").replace("٩","9").
		replace(")"," ").replace("("," ").replace("-"," ").replace("–"," ")
		.replace(")"," ").replace("†", "").replace(" ù", "").replace(" ü", "")
		.replaceAll("[۰-۹]"," ").replaceAll("[\\p{P}\\p{Digit}]"," ")
		.replaceAll(" [^\\p{InArabic}]","").replace("�", " ").replace("􀁼 ", "").replace("ــ","").replace("+","").replace("ـ","")
		.replace("􀁼", " ").replaceAll(" +", " ").trim();
		
		return text;
	}
	
}
