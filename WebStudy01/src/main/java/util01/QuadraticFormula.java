package util01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QuadraticFormula
 */
@WebServlet("/QuadraticFormula")
public class QuadraticFormula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuadraticFormula() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest formula, HttpServletResponse response) throws ServletException, IOException {
		String str1=formula.getParameter("a");
		String str2=formula.getParameter("b");
		String str3=formula.getParameter("c");
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		int c=Integer.parseInt(str3);
		
		double dos=b*b-4*c;
		double sqr=Math.sqrt(dos);
		
		double q1=(-b+sqr)/2*a;
		double q2=(-b-sqr)/2*a;
		
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title>multi</title></head>");
		out.println("<body>");
		out.println(q1+"<br>"+q2);
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
