import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SumServlet", urlPatterns = "/SumServlet")
public class SumServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Nhập vào 2 số , tính tổng hiện result.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        float a = Float.parseFloat(request.getParameter("a"));
        float b = Float.parseFloat(request.getParameter("b"));
        Float sum = a+b;
        PrintWriter printWriter = response.getWriter();
        request.setAttribute("sum",sum);  // Truyen mot gia tri tu java sang jsp

        dispatcher.forward(request,response);

    }
}
