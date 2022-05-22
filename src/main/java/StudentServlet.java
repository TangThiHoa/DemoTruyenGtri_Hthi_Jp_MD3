import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = "/S")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("studentList.jsp");
//        String name = request.getParameter("name");
//        String country = request.getParameter("country");
//        int age = Integer.parseInt(request.getParameter("age"));
        Student s = new Student("TTH", "NA", 20);
        request.setAttribute("list", s);
        dispatcher.forward(request, response);

    }
}
