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
import javax.swing.JOptionPane;

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
        String fecha = this.pdf.getCadFecha();
        String nombre = this.pdf.getNom(), cd = this.pdf.getCd(), ing = this.pdf.getIng(), sal = this.pdf.getSal();
        String tipo = this.pdf.getTipo(), ct = this.pdf.getCosto(), totp = this.pdf.getTothosDias(), textra = this.pdf.getEx();
        int dias = this.pdf.getDias();
        String []cargos = this.pdf.getExtC();
        String Cargos = "";
        boolean band = false;
        if(Integer.parseInt(textra) == 0){
             band = false;
            Cargos = "No hubo cargos extra";
        }
        else{
            band = true;
        }

        Document documento = new Document();
        FileOutputStream ficheroPdf;
         try {
            ficheroPdf = new FileOutputStream("src/ticket/Ticket de pago.pdf");//crea el archivo
        } catch (FileNotFoundException ex) {
            System.out.println("Error al generar el archivo PDF");
            return;
        }
        PdfWriter.getInstance(documento, ficheroPdf).setInitialLeading(20);

        documento.open();//abre pdf

        try {
            Image foto = Image.getInstance("src/imagenes/logo3.png");//crea obj de imagen 
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
        documento.add(new Paragraph("La mejor manera de encontrarte a ti mismo es perderte en el servicio de los demás\n", FontFactory.getFont("Times New Roman", 12, Font.BOLDITALIC, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Itzamna Mza 26 Lt B88, 77760 Tulum, Q.R.\n", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph(fecha, FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Nombre del huesped: "+nombre, FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Ciudad de origen: "+cd, FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Fecha de ingreso: "+ing, FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Fecha de salida: "+sal, FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Tipo de habitacion: "+tipo, FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Costos de habitacion: "+ct, FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Dias que se queda en el Hotel: "+dias, FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Total a pagar sin cargos extra: "+totp, FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(50);
        documento.add(new Paragraph("Total a pagar con cargos extra: "+textra, FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        
        if(band == false){
            documento.add(new Paragraph("Lista de cargos Extra: "+Cargos, FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
            tit.setAlignment(Element.ALIGN_CENTER);
        }else{
            documento.add(new Paragraph("Lista de cargos Extra:", FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
            documento.add(new Paragraph(cargos[0], FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
            documento.add(new Paragraph(cargos[1], FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
            documento.add(new Paragraph(cargos[2], FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
            documento.add(new Paragraph(cargos[3], FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
            documento.add(new Paragraph(cargos[4], FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
            documento.add(new Paragraph(cargos[5], FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        }
        
        try {
            Image foto = Image.getInstance("src/imagenes/firma.png");//crea obj de imagen 
            foto.scaleToFit(85, 85);//tamaño de imagen
            foto.setAlignment(Chunk.ALIGN_CENTER);//alineacion
            documento.add(foto);//agrega imagen al pdf
        } catch (Exception e) {
            e.printStackTrace();
        }
        documento.add(new Paragraph("                                                                                            Les deseamos un viaje agradable y que regresen pronto", FontFactory.getFont("Times New Roman", 7, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph(""));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.add(new Paragraph("Salida completada"+textra, FontFactory.getFont("Times New Roman", 12, Font.BOLD, BaseColor.BLACK)));//tit variable paragraph
        tit.setAlignment(Element.ALIGN_CENTER);
        documento.close();
        System.out.println("**************************************************");
        System.out.println("Archivo creado exitosamente");
        JOptionPane.showMessageDialog(null, "Su recibo de pago se ha generado", "Recibo de pago", JOptionPane.INFORMATION_MESSAGE);
        
    }

}
