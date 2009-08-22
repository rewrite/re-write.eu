package org.rewrite.eu;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Re_write_euServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println(".");
	}
}
