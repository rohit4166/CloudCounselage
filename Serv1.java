package pack21;

 

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

@WebServlet("/Serv1")
public class Serv1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Serv1() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());

        String host = "smtp.gmail.com";
        final String user = "rd10311031@gmail.com"; // change accordingly
        final String password = "cjym ojwh tapj fhjh"; // change accordingly
        String to = "rd10311031@gmail.com"; // change accordingly

        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");

       Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

         try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("JAVAMailAPI");
            message.setText("This is a simple program of sending email using JavaMail API");

            Transport.send(message);

            System.out.println("Message sent successfully...");

            response.getWriter().println("<html><body>");
            response.getWriter().println("<h2>Email sent successfully to " + to + "</h2>");
            response.getWriter().println("</body></html>");
        } catch (MessagingException e) {
            e.printStackTrace();
            response.getWriter().println("<html><body>");
            response.getWriter().println("<h2>Error sending email: " + e.getMessage() + "</h2>");
            response.getWriter().println("</body></html>");
        } 
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
