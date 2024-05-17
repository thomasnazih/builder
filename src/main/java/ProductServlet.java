

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/buildProduct")
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String part1 = request.getParameter("part1");
        String part2 = request.getParameter("part2");

        Product product = new Product.ProductBuilder()
                            .setPart1(part1)
                            .setPart2(part2)
                            .build();

        request.setAttribute("product", product);
        request.getRequestDispatcher("product.jsp").forward(request, response);
    }
}
