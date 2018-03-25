package io.bdrc;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.IOException;

public class App {

    public static void main(String args[]) throws IOException {
        final String notoPath = "/usr/share/fonts/truetype/noto/NotoSansTibetan-Regular.ttf";
        final PdfWriter writer = new PdfWriter("tibttest.pdf");
        final PdfDocument pdfDoc = new PdfDocument(writer);
        final Document doc = new Document(pdfDoc);
        PdfFont f = PdfFontFactory.createFont(notoPath, PdfEncodings.IDENTITY_H, true);
        doc.add(new Paragraph("༄༅། །སྒྲུབ།").setFont(f));
        doc.close();
    }

}
