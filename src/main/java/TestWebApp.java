import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class TestWebApp extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("login");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
    ////git test
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>Form Data</h1>");
        printWriter.print("<p> login :: " + login + "</p>");
        printWriter.print("<p> emailId :: " + email + "</p>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();

        System.out.println("login: " + login);
        System.out.println("emailId: " + email);

    }
}
