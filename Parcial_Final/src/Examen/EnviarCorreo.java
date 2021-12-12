
package Examen;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.net.ssl.SSLSession;
import javax.swing.JOptionPane;


public class EnviarCorreo {
    
    static final String FROM = "controlnotas85@gmail.com";
static final String FROMNAME = "Control Notas";
    
private String TO;
private String nombre;
public String usuario;
private String contraseña;

public EnviarCorreo(String TO, String nombre, String usuario, String contraseña) {
this.TO = TO;
this.nombre = nombre;
this.usuario = usuario;
this.contraseña = contraseña;
}

static final String SMTP_USERMANE = "controlnotas85@gmail.com";
static final String SMTP_PASSWORD = "pruebaprueba";

static final String CONFIGSET = "ConfigSet";

static final String HOST = "smtp.gmail.com";

static final int PORT = 587;

static final String SUBJECT = "Creacion de Usuario";

static final String SUBJECT2 = "Se realizó la tarea";

String BODY = (", Gracias por utilizar el sistema de notas, ");

String BODY2 = ("Se completo la tarea de manera satisfactoria ");

public void EnviarCorreo() throws UnsupportedEncodingException, MessagingException {
    
    Properties props = System.getProperties();
props.put("mail.transport.protocol", "smtp");
props.put("mail.smtp.port", PORT);
props.put("mail.smtp.starttls.enable", "true");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

Session session = Session.getDefaultInstance(props);

MimeMessage mg = new MimeMessage(session);
mg.setFrom(new InternetAddress(FROM, FROMNAME));
mg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
mg.setSubject(SUBJECT);
mg.setContent("Hola " + nombre + BODY + " su usuario es: " + usuario + " y su contraseña es: " +contraseña, "text/html");

mg.setHeader("X-SES-CONFIGURARTION-SET", CONFIGSET);

Transport transport = session.getTransport();
System.out.println(TO);

JOptionPane.showMessageDialog(null, "Espere su correo esta por llegar");

try {
transport.connect(HOST, SMTP_USERMANE, SMTP_PASSWORD);
transport.sendMessage(mg, mg.getAllRecipients());
JOptionPane.showMessageDialog(null, "Su correo fue enviado");
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Error");
System.out.println(e.getMessage());
} finally {
transport.close();
}

}

public void Tarea_Realizada() throws MessagingException, UnsupportedEncodingException {
    
 
Properties props = System.getProperties();
props.put("mail.transport.protocol", "smtp");
props.put("mail.smtp.port", PORT);
props.put("mail.smtp.starttls.enable", "true");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

Session session = Session.getDefaultInstance(props);

MimeMessage mg = new MimeMessage(session);
mg.setFrom(new InternetAddress(FROM, FROMNAME));
mg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
mg.setSubject(SUBJECT2);
mg.setContent(BODY2, "text/html");

mg.setHeader("X-SES-CONFIGURARTION-SET", CONFIGSET);

Transport transport = session.getTransport();
System.out.println(TO);

JOptionPane.showMessageDialog(null, "Espere su correo esta por llegar");

try {
transport.connect(HOST, SMTP_USERMANE, SMTP_PASSWORD);
transport.sendMessage(mg, mg.getAllRecipients());
JOptionPane.showMessageDialog(null, "Su correo fue enviado");
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Error");
System.out.println(e.getMessage());
} finally {
transport.close();
}


}


}

    

    

