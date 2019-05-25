package app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * Servlet implementation class GetDetails
 */
public class GetDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		
		PrintWriter out_oder = response.getWriter();
		String Customer_oder_no = request.getParameter("oderNo");
		
		PrintWriter out_name = response.getWriter();
		String Customer_name = request.getParameter("custemorName");
		
		PrintWriter out_address = response.getWriter();
		String Customer_address = request.getParameter("custemorAddress");
		
		PrintWriter out_contact = response.getWriter();
		String Customer_contactNo = request.getParameter("custemorContactNo");
		
		PrintWriter out_items = response.getWriter();
		String Customer_Items = request.getParameter("custemorItems");
		
		PrintWriter out_amount = response.getWriter();
		String Customer_amount = request.getParameter("custemorAmount");
		
		PrintWriter out_deliveryCharges = response.getWriter();
		String Customer_deliveryCharges = request.getParameter("custemorDeliveryCharges");
		
		PrintWriter out_finalAmount = response.getWriter();
		String Customer_finalAmount = request.getParameter("custemorFinalAmount");
		
		
		
		Connection con= null;
		Statement st=null;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hv","root","");
			st = con.createStatement();
			
			DBConnect connect = new DBConnect();
			String sql = "INSERT INTO `oder`(`oderNo:`, `customerName`, `address`, `telephoneNo.`, `items`, `amount`, `deliveryCharges`, `finalAmount`, `deliveryStatus`)"
					+ " VALUES ('"+Customer_oder_no+"','"+Customer_name+"','"+Customer_address+"','"+Customer_contactNo+"','"+Customer_Items+"','"+Customer_amount+"','"+Customer_deliveryCharges+"','"+Customer_finalAmount+"', 'Pending')";
			st.executeUpdate(sql);
			
			System.out.println("Insert complete.");
			
		}
		catch(Exception ex){
			System.out.println("Error "+ex);
		}
		
		 finally {
			 if (st != null) {
			 try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 }
			 if (con != null) {
			 try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 }
			 }
		 
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
