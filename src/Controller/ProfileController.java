package Controller;
import java.sql.ResultSet;
import database.DbConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ProfileController{
    DbConnection dbconnection;
    
    public int updateprofilemod(int id,String username,String email,String contact ){
            int Id = id;
            String Username = username;
            String Email = email;
            String Contact= contact;       
            String updateQuery = String.format("UPDATE register SET  username = '%s' , email = '%s', contact = '%s' WHERE id = %d " ,Username,Email,Contact,Id);
            dbconnection = new DbConnection();
            int result = dbconnection.manipulate(updateQuery);
            return result;  
    }
    public int insertImage(int id,String image1){ //inserting the image form local storage
        int Id=id;
        String image=image1;
     
        String updateQuery=String.format(
        "update register set tr_image='%s' where id=%d",image,Id);
    
    dbconnection = new DbConnection();
    int result = dbconnection.manipulate(updateQuery);
    return result;     
     }
    public String getImage(int id){
        String Query = String.format ("SELECT tr_image from register where id=%d",id );
        dbconnection = new DbConnection();
        ResultSet result = dbconnection.retrieve(Query);
        try {
            if(result.next()){
                return (result.getString("tr_image"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfileController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "false";
    }
    
    }


   

