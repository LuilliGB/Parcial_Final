package Examen;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Reportes {

    String nombreArchivo;
    String fecha;
    String rutaImagen;
    ArrayList<Tareas> almacenar;

    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public Reportes(String nombreArchivo, String fecha, String rutaImagen, ArrayList<Tareas> almacenar) {
        this.nombreArchivo = nombreArchivo;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;
        this.almacenar = almacenar;

        documento = new Document();
        titulo = new Paragraph("Reporte Tareas Pendientes");
    }

    public void CrearReporte() {

        try {
            archivo = new FileOutputStream(nombreArchivo + ".pdf");

            PdfWriter.getInstance(documento, archivo);

            documento.open();

            titulo.setAlignment(1);
            documento.add(titulo);

            Image imagen = null;

            try {
                imagen = Image.getInstance(rutaImagen);
                imagen.scaleAbsolute(100, 100);
                imagen.setAbsolutePosition(450, 750);
            } catch (Exception e) {
            }

            documento.add(imagen);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("A continucion se detalla la lista de las tareas creadas"));
            documento.add(Chunk.NEWLINE);
            Paragraph textolargo = new Paragraph("Se indicara cuales estan realizadas y cuales no");
            textolargo.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(textolargo);

            PdfPTable tabla = new PdfPTable(3);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);

            tabla.setWidthPercentage(100);
            PdfPCell fecha = new PdfPCell(new Phrase("Fecha"));
            fecha.setBackgroundColor(BaseColor.LIGHT_GRAY);

            PdfPCell nombre = new PdfPCell(new Phrase("Nombre"));
            nombre.setBackgroundColor(BaseColor.LIGHT_GRAY);

            PdfPCell encargado = new PdfPCell(new Phrase("Encargado"));
            encargado.setBackgroundColor(BaseColor.LIGHT_GRAY);

            tabla.addCell(fecha);
            tabla.addCell(nombre);
            tabla.addCell(encargado);

            for (Tareas p : almacenar) {
                tabla.addCell(p.getFecha());
                tabla.addCell(p.getNombretarea());

                tabla.addCell(p.getEncargado());
            }

            documento.add(tabla);

            documento.add(Chunk.NEWLINE);
            BarcodeQRCode codigoqr = new BarcodeQRCode("Gracias por utilizar el sistema de tareas", 1, 1, null);
            Image qrimagen = codigoqr.getImage();
            qrimagen.scalePercent(400);
            documento.add(qrimagen);

            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha));

            documento.close();

            JOptionPane.showMessageDialog(null, "Reporte creado");

        } catch (Exception e) {

        }
    }
}
