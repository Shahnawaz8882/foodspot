
package profile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class profileDaoImpl implements profileDao {
//profileDaoImpl daoImpl=new profileDaoImpl();
    @Override
    public void insert(profile p) {
   
   
        try{
        Connection conn = loader.loader.getConnection();
        
        String query = "insert into profile ( name, email, password,contact) values(?,?,?,?,)";
             PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, p.getName());
            ps.setString(2, p.getEmail());
            ps.setString(3, p.getPassword());
            ps.setString(4,p.getContact());
            ps.execute();    
        }
         catch(Exception e)
      {
          e.printStackTrace();
         }
    }

    @Override
    public void update(profile p) {
         Connection conn = loader.loader.getConnection();
        
          String query = "update PROFILE SET Name = '" + p.getName() + "' EMAIL = '"+ p.getEmail() + " Contact = '" +p.getContact()+ "'  where Id = " + p.getId();        
        try {
             PreparedStatement ps = conn.prepareStatement(query);
            //Statement stmt = LoadApp.conn.createStatement();
            
            ps.execute(); 
            
            //stmt.executeUpdate(query);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void delete(int pid) {
        Connection conn = loader.loader.getConnection();
        
          String query = "delete from PROFILE where ID = " + pid;
        
        try {
             PreparedStatement ps = conn.prepareStatement(query);
            //Statement stmt = LoadApp.conn.createStatement();
            
            ps.execute(); 
            
            //stmt.executeUpdate(query);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }

    @Override
    public List<profile> getprofile() { 
        List<profile> arrayList=new ArrayList();
        try {
            String s="select * from  Profile";
            Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/sample123", "app","app");
            Statement s1=c.createStatement();
            ResultSet r=s1.executeQuery(s);
            while (r.next()) {

                profile p = new profile();
                
                p.setId(r.getString("ID"));
                p.setName(r.getString("NAME"));
                p.setEmail(r.getString("EMAIL"));
                p.setPassword(r.getString("Password"));
                p.setContact(r.getString("Contact"));
                
                arrayList.add(p);
            }
 } catch (SQLException ex) {
        }
        
        return  arrayList;
    }
    

        
        
         


            }

   
    
