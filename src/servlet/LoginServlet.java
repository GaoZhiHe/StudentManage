package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import dao.FindStudentDao;
import dao.LoginDao;
import model.Admin;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private LoginDao loginDao = null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//处理中文乱码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		loginDao = new LoginDao();
		Admin loginUser = loginDao.login(userName, password);
		if (loginUser == null) {
			//System.out.println("********用户错误**********");
			response.getWriter().print("用户名或密码错误，请重新登录。");
			response.setHeader("refresh", "2;url=/StudentManage/view/login.jsp");
		}
		
		else {
			//System.out.println("***********登陆成功**********");
			session.setAttribute("loginUserInfo", loginUser);
			Admin testAdmin = (Admin) session.getAttribute("loginUserInfo");
			FindStudentDao stu = new FindStudentDao();
			try {
				session.setAttribute("Students", stu.FindAllStudent());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("***********登陆信息："+testAdmin.toString());
			response.sendRedirect("/StudentManage/view/main.jsp");
		}
		
	}

}
