package io.bdrc;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.IOException;

public class App {

    public static void main(String args[]) throws IOException {
        //Initialize writer
        PdfWriter writer = new PdfWriter("tibttest.pdf");
        //Initialize document
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document doc = new Document(pdfDoc);
        //Add paragraph to the document
        doc.add(new Paragraph("Hello!"));
        doc.add(new Paragraph("༄༅། །སྒྲུབ།"));
        //Close document
        doc.close();
    }

}
