package feedback_app;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.http.Cookie;

@WebServlet("/servlet1")
public class Request1Servlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//we have to create cookie
		String username = "akshit";
		/*String userId = "1234";*/
		Cookie cookie = new Cookie("username", username);
		cookie.setMaxAge(10 * 60);
		resp.addCookie(cookie);
	}
}
