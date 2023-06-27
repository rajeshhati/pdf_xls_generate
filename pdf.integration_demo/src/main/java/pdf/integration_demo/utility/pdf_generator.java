package pdf.integration_demo.utility;

import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class pdf_generator {
	 private static final String FILE_NAME = "C:\\Users\\Rajesha Hati\\pdf.integration_demo\\pdfdocs\\sample3.pdf";


	    public void writeUsingIText() {

	        Document document = new Document();

	        try {

	            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

	            //open
	            document.open();

	            Paragraph p = new Paragraph();
	            p.add("Indian Airline Ticket Service");
	            p.setAlignment(Element.ALIGN_CENTER);

	            document.add(p);


	            Font f = new Font();
	            f.setStyle(Font.BOLD);
	            f.setSize(8);

	            document.add(new Paragraph("Here is your ticket Details", f));
	            
	            PdfPTable table = new PdfPTable(2);
	            
	            table.setWidthPercentage(100);
	            
	            table.setSpacingBefore(10f);
	            table.setSpacingAfter(10f);
	            
	            PdfPCell cell1 = new PdfPCell(new Paragraph("cell1"));
	            PdfPCell cell2 = new PdfPCell(new Paragraph("cell2"));
	            
	            cell1.setColspan(2);
	            
	            table.addCell(cell1);
	            table.addCell(cell2);
	            
	            document.add(table);
	            
	            document.close();

	            System.out.println("Done");
	         
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
