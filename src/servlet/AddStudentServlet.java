package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AddStudentDao;
import dao.FindStudentDao;
import model.Student;

/**
 * Servlet implementation class AddStudent
 */

public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
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
				//接收用户参数
				String sno = request.getParameter("sno");
				String name = request.getParameter("name");
				String age = request.getParameter("age");
				HttpSession session = request.getSession();
				//添加学生
				AddStudentDao stu = new AddStudentDao();
				try {
					stu.AddStudent(sno, name, age);
					FindStudentDao students = new FindStudentDao();
					session.setAttribute("Students", students.FindAllStudent());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
				request.getRequestDispatcher("view/main.jsp").forward(request, response);
			}
	}


