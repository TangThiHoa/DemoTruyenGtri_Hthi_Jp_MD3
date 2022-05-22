import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListServlet",urlPatterns = "/L")
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String>list = new ArrayList<>();
        list.add("Apple");
        list.add("Lemon");
        list.add("Orange");
        list.add("Mango");
        list.add("Cherry");
        RequestDispatcher dispatcher= request.getRequestDispatcher("list.jsp");
        request.setAttribute("dSach",list);     //Truyen dsach lish tu java sang jsp
        dispatcher.forward(request,response);
    }
}
