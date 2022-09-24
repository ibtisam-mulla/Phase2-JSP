package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductData
 */
public class ProductData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductData() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pid = request.getParameter("pid");
        String pname = request.getParameter("pname");
        String pr = request.getParameter("pr");
        String mfr = request.getParameter("mfr");

		HttpSession session=request.getSession();  
        session.setAttribute("pid",  pid);
        session.setAttribute("pname",  pname);
        session.setAttribute("pr",  pr);
        session.setAttribute("mfr",  mfr);
        PrintWriter out=response.getWriter();
        out.println("<html><body>");
        out.println("Click here <a href='ProductDisplay.jsp'>second jsp file</a>");
        out.println("</body></html>");
        
        
        
	}

}
