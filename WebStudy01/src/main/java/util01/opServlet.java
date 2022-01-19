package util01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class opServlet
 */
@WebServlet("/opServlet")
public class opServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public opServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		String val1=req.getParameter("value1");
		String val2=req.getParameter("value2");
		String op=req.getParameter("operator");
		int a=Integer.parseInt(val1);
		int b=Integer.parseInt(val2);

		
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title>operate</title></head><body>");
		out.println("<body>");
		if(op.equals("+")) {
			out.println(a+"+"+b+"="+(a+b));
		}else if(op.equals("-")) {
			out.println(a+"-"+b+"="+(a-b));
		}else if(op.equals("*")) {
			out.println(a+"X"+b+"="+(a*b));
		}else {
			out.println(a+"/"+b+"="+(a/b));}
		out.println("</body></html>");

// 샘이하는 설명문
//		
//		String val1=req.getParameter("value1");
//		String val2=req.getParameter("value2");
//		String op=req.getParameter("operator");
//		if(val1==null || val2==null|| op==null) {
//			return;
//		}
//		int v1=Integer.parseInt(val1);
//		int v2=Integer.parseInt(val2);
//		int result=0;
//		
//		if(op.equals("+")){
//			result=v1+v2
//		}else if(op.equals("-")){
//			result=v1-v2
//		}else if(op.equals("*")){
//			result=v1*v2
//		}else{
//			result=v1/v2}
//		
	}

}
