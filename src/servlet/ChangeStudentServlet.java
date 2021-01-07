package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AddStudentDao;
import dao.ChangeStudentDao;
import dao.FindStudentDao;

/**
 * Servlet implementation class ChangeStudentServlet
 */
public class ChangeStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//处理中文乱码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//接收用户参数
		String sno = request.getParameter("sno");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		HttpSession session = request.getSession();
		//修改学生信息
		ChangeStudentDao stu = new ChangeStudentDao();
		try {
			stu.ChangeStudent(sno, name, age);
			FindStudentDao students = new FindStudentDao();
			session.setAttribute("Students", students.FindAllStudent());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("/view/main.jsp").forward(request, response);
	}
}
