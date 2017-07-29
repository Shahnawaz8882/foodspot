
package profile;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})

public class RegisterServlet extends HttpServlet  {
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         
    }

@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp); //To change body of generated methods, choose Tools | Templates.
        
         String name = req.getParameter("name");
         String email = req.getParameter("email");
         String password = req.getParameter("password");
         String contact = req.getParameter("contact");
        
         
         
         ModelMVC m = new ModelMVC();
         m.setName(name);
         m.setEmail(email);
         m.setPassword(password);
         m.setContact(contact) ;
      
         String sql= "insert into profiles(Name,Email,Password,Contact) values(?,?,?,?)";
        
        int i = DaoMVC.registerUser (m,sql);
         
        if(i!=0)
        {
            System.out.println("Value Inserted");
            req.setAttribute("msg", "Registration Successfully..!!  Login Here");
            getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
        }
        else
        {
            System.out.println("Value Not Inserted");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp); //To change body of generated methods, choose Tools | Templates.
    }
    
    
 }

    
    
    
    
  
    
    
