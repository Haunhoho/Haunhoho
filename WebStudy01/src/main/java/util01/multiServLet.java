package util01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class multiServLet
 */
@WebServlet("/multiServLet")
public class multiServLet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public multiServLet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String outstr="<html><head><title>다중선택 결과</title></head><body>";
		String[] arItem =req.getParameterValues("item");
		if(arItem==null) {
			outstr+="선책된게 업ㅄ습니다.";
		}else{
			outstr+="선택결과:<br>";
			for(int i=0;i<arItem.length;i++) {
				outstr+=arItem[i]+"<br>";
			}

		}
outstr+="</body></html>";
PrintWriter out = response.getWriter();
out.println(outstr);
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
