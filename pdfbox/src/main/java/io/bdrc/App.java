package io.bdrc;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

/**
 * Creates a simple document with a TrueType font.
 */
public final class App
{
    public static void main(String[] args) throws IOException
    {
        String pdfPath = "tibtest.pdf";
        String message = "༄༅། །སྒྲུབ།";
        String ttfPath = "/usr/share/fonts/truetype/noto/NotoSansTibetan-Regular.ttf";
        
        try (PDDocument doc = new PDDocument())
        {
            PDPage page = new PDPage();
            doc.addPage(page);
            
            PDFont font = PDType0Font.load(doc, new File(ttfPath));

            try (PDPageContentStream contents = new PDPageContentStream(doc, page))
            {
                contents.beginText();
                contents.setFont(font, 12);
                contents.newLineAtOffset(100, 700);
                contents.showText(message);
                contents.endText();
            }
            doc.save(pdfPath);
        }
    }
}
