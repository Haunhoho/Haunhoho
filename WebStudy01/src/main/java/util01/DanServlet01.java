package util01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DanServlet01
 */
@WebServlet("/DanServlet01")
public class DanServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanServlet01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest dan, HttpServletResponse response) throws ServletException, IOException {
		String str1=dan.getParameter("num1");
		int num1=Integer.parseInt(str1);
		
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>multi</title></head>");
		out.println("<body>");
		for(int num2=1;num2<=9;num2++){
			out.println(num1+"X"+num2+"="+num1*num2);}
		out.println("</body></html>");
//		PrintWriter out=dan.getWriter();
//		out.println(out);
//		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
