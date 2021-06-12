/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cesar
 */
public class PDF {
    private    PDF_Const pdf;

    public PDF(PDF_Const p) {
        this.pdf = p;
        try {
            main();
        } catch (DocumentException ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void main() throws DocumentException {
        String fecha = this.pdf.getCadFecha();
        System.out.println(fecha);
        Document documento = new Document();
        FileOutputStream ficheroPdf = null;
        try {
            ficheroPdf = new FileOutputStream("src/ticket/Ticket de pago.pdf");//crea el archivo
        } catch (FileNotFoundException ex) {
            System.out.println("Error al generar el archivo PDF");
            return;
        }
        PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);//espacio entre lineas del pdf
        
        documento.open();
        
        documento.add(new Paragraph("Esto es el primer párrafo, normalito"));
        documento.add(new Paragraph("Este es el segundo y tiene una fuente rara",FontFactory.getFont("arial",22,Font.ITALIC,BaseColor.CYAN)));      
        documento.close();
        System.out.println("Archivo creado exitosamente");
    }

    
}
