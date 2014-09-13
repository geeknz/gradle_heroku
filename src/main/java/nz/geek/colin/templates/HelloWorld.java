package nz.geek.colin.templates;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {

	@Override
	public void doGet( final HttpServletRequest request, final HttpServletResponse response ) throws IOException {

		final PrintWriter out = response.getWriter();
		out.println( "Hello World!!!" );
	}
}
