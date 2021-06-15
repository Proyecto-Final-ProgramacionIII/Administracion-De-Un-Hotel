/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
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

    private PDF_Const pdf;

    public PDF(PDF_Const p) {
        this.pdf = p;
        try {
            main();
        } catch (DocumentException ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void main() throws DocumentException, FileNotFoundException {
        // TODO code application logic here

        Document documento = new Document();
        FileOutputStream ficheroPdf = new FileOutputStream("src/ticket/Ticket de pago.pdf");//crea pdf y da nomobre
        PdfWriter.getInstance(documento, ficheroPdf).setInitialLeading(20);

        documento.open();//abre pdf

        try {
            Image foto = Image.getInstance("logo3.png");//crea obj de imagen 
            foto.scaleToFit(85, 85);//tamaño de imagen
            foto.setAlignment(Chunk.ALIGN_LEFT);//alineacion
            documento.add(foto);//agrega imagen al pdf
        } catch (Exception e) {
            e.printStackTrace();
        }
        //tipo           tam   estilo    color  
        Paragraph tit = new Paragraph();//tit variable paragraph
        documento.add(new Paragraph("Posada del Sol", FontFactory.getFont("Times New Roman", 20, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("La mejor manera de encontrarte a ti mismo es perderte en el servicio de los demás", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Aguascalientes", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Fecha", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Nombre del Huesped:", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Ciudad de origen:", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Fecha de ingreso:", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Fecha de salida:", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Tipo de habitacion:", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Costos de habitacion: ", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Dias que se queda en el Hotel:", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Total a pagar sin cargos extra:", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(50);
        documento.add(new Paragraph("Total a pagar con cargos extra:", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Lista de cargos Extra:", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);

        try {
            Image foto = Image.getInstance("firma.png");//crea obj de imagen 
            foto.scaleToFit(85, 85);//tamaño de imagen
            foto.setAlignment(Chunk.ALIGN_CENTER);//alineacion
            documento.add(foto);//agrega imagen al pdf
        } catch (Exception e) {
            e.printStackTrace();
        }
        documento.add(new Paragraph("                                                                                            Les deseamos un viaje agradable y que regresen pronto", FontFactory.getFont("Times New Roman", 6, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.close();
    }

}
