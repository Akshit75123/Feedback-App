package feedback_app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//get form data
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String message = req.getParameter("feedback_message");
		
		//connection with the database
		Form form = new Form(email,phone,message);
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession() ;
		Transaction tx = s.beginTransaction();
		s.save(form);
		tx.commit();
		s.close();
		sf.close();
		
		//process form data
		
		//response to form data
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Feedback servlet working</h1>");
		writer.print("""
				 
				<h2>Form details</h2>
				<h3>Email address : %s</h3>
				<h3>Contact : %s</h3>
				<h3>Message : %s</h3>
				
				""".formatted(email,phone,message));
		resp.sendRedirect("/feedback_app/");
	}
}
