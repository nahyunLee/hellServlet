package kr.ac.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    //주소값만을 사용해서 httpServletRequet에 접근가능
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Read form data
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		//Process:access to database, perform business logic
		
		//Build HTMLcode(respose)만듬
		PrintWriter out= response.getWriter();
		String htmlResponse="<html>";
		htmlResponse+="<h2> Your username is "+username+"<br>";
		htmlResponse+="<h2> Your password is "+password+"<br>";
		htmlResponse+="</html>";
		out.println(htmlResponse);//ctrl+space
		
		//동적-> 사용자가 입력한 username password를 통해서 달라지니까
		
	}

}
