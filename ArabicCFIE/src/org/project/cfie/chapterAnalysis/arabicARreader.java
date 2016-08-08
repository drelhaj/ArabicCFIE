package org.project.cfie.chapterAnalysis;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/*import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;*/

public class arabicARreader {

	
	public static File dir = new File("E:\\workspace\\ArabicAnnualReports\\tadawulReports");
	public static int DocumentID = 1;	

	public static String FileName = "";

	static PrintWriter writer;

	
	public static void main(String args[]) throws IOException, SQLException{

				    
		if(dir.isDirectory()){
			  for (File child : dir.listFiles()) {
				try{
				  FileName = child.getName();
				  if(!(FileName.indexOf("pdf")<=0)){
					  ++DocumentID;
					  System.out.println(DocumentID);
		    String pdfFile = dir+"\\"+FileName;
		    //test to see if the file is readable (digital PDF)
		    System.out.println(pdfFile);
	//String contents = readArabicPDF(pdfFile);
	
	String outputFile = dir + "\\text\\" +DocumentID+".txt";//name of the output CSV file
	writer = new PrintWriter(outputFile, "UTF-8");
	writer.flush();
	writer.close();
					 }
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			  }
		}
	}
		
	
	
/*	public static String readArabicPDF(String file) throws IOException{
		
		PDDocument pddDocument = PDDocument.load(new File(file));
	    PDFTextStripper textStripper = new PDFTextStripper();
	    String Text = textStripper.getText(pddDocument);
    
	    return Text;
	}
	
	
	*//**
	 * Method to extract text from specific page range in PDF
	 * 
	 * @param src
	 *            location of the pdf file
	 * @param from
	 * @param to
	 *            pages from to
	 * @return output extracted text
	 * @throws IOException
	 *//*
	public static String readContent(String src)
			throws IOException {
int from = 1;
		String output = "";
		try {
			PdfReader reader = new PdfReader(src);
			int to = reader.getNumberOfPages();
			PdfReaderContentParser parser = new PdfReaderContentParser(reader);
			TextExtractionStrategy strategy;
			for (int i = from; i <= to; i++) {
				if (to > reader.getNumberOfPages()
						|| from > reader.getNumberOfPages()
						|| i > reader.getNumberOfPages()) {
				} else {
					strategy = parser.processContent(i,
							new SimpleTextExtractionStrategy());
					output = output + " " + (strategy.getResultantText());
				}
			}
		} catch (Exception E) {
			System.out.println("Error_Code: " + E);
		}
		return output;
	}
*/
	
}
