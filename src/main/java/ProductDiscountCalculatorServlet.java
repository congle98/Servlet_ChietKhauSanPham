import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculatorServlet", value = "/ProductDiscountCalculatorServlet")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String describe = request.getParameter("describe");
        double price = Double.parseDouble(request.getParameter("price"));
        double percent = Double.parseDouble(request.getParameter("percent"));
        double discoutAmount = price*percent*0.01;
        double discountPrice = price - discoutAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        writer.println("<h1>Mô tả " + describe + "</h1>");
        writer.println("<h1>Giá ban đầu " + price + "</h1>");
        writer.println("<h1>Lượng chiết khấu: " + discoutAmount+ "</h1>");
        writer.println("<h1>Giá sau khi chiết khấu: " + discountPrice + "</h1>");
        writer.println("</html>");
    }
}
