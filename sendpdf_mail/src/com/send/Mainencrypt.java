package com.send;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
public class Mainencrypt {
public static void main(String[] args) throws FileNotFoundException, DocumentException, IOException {
       PdfReader reader = new PdfReader("D:\\harsh_Swift\\dummy-pdf_2.pdf");
       String password = "1234";
       String owner_password = "harsh";
       String time = String.valueOf(System.currentTimeMillis());// millisecond addition to prevent overriding
       PdfStamper stamper = new PdfStamper(reader, new FileOutputStream("D:\\harsh_Swift\\encrypted\\dummyE-pdf_2"+time+".pdf"));
       stamper.setEncryption(password.getBytes(), owner_password.getBytes(),PdfWriter.ALLOW_COPY, PdfWriter.ENCRYPTION_AES_256);
       stamper.close();
       reader.close();
       System.out.println("Successfully Done");
}
}