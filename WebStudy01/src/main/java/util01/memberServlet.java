package util01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class memberServlet
 */
@WebServlet("/memberServlet")
public class memberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public memberServlet() {
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
		req.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String name=req.getParameter("name");
		String login_id=req.getParameter("login_id");
		String gender=req.getParameter("gender");
		String password=req.getParameter("password");
		String password_ch=req.getParameter("password_ch");
		String mobile=req.getParameter("mobile");
		
		
		String outstr="<html><head><title>사용자 정보</title></head><body>";
		outstr+="실명 :"+"&nbsp"+name+"<br>"+"성별 :"+"&nbsp"+gender+"<br>";
		outstr+="아이디 :"+"&nbsp"+login_id+"<br>"
				      +"비밀번호 :"+"&nbsp"+password+"<br>"+"비밀번호 확인 :"+"&nbsp"+password_ch+"<br>"
				      +"모바일 번호 :"+"&nbsp"+mobile+"<br>";
		
		String[] arItem =req.getParameterValues("interesting");
		if(arItem==null) {
			outstr+="선책된게 없습니다.";
		}else{
			outstr+="관심분야 :";
			for(int i=0;i<arItem.length;i++) {
				outstr+=arItem[i]+"<br>";
			}

		}
outstr+="</body></html>";
PrintWriter out = response.getWriter();
out.println(outstr);

	}

}
