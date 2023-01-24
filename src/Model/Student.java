package model;

public class Student {
        private int id;
        private String Username;
        private String Email;
        private String Contact;
        private String password ;
        private String confirmPassword;
        private int paying_id;
        
        public Student(int id,String username,String email,String contact,int paying_id){
            this.id=id;
            this.Username=username;
            this.Email=email;
            this.Contact=contact;
            this.paying_id=paying_id;
           
        }
        public Student(){
        
        }
        
        
        public Student(int id,String Username,String Email,String Contact,String password,String confirmPassword,int paying_id){
            this.id=id;
            this.Username=Username;
            this.Email=Email;
            this.Contact=Contact;
            this.password=password;
            this.confirmPassword=confirmPassword;
            this.paying_id=paying_id;
            
        }
        public Student(String Username,String Email,String Contact,String password,String confirmPassword){
            
            this.Username=Username;
            this.Email=Email;
            this.Contact=Contact;
            this.password=password;
            this.confirmPassword=confirmPassword;
            
        }
        public void setpaying_id(int paying_id){
            this.paying_id=paying_id;
        }
        public int getpaying_id(){
            return this.paying_id;
        }
        public void setid(int id){
            this.id=id;
        }
        public int getid(){
            return this.id;
        }
        public void setusername(String Username){
            this.Username=Username;
        }
        public void setemail(String Email){
            this.Email=Email;            
        }
        public void setcontact(String Contact){
            this.Contact=Contact;
        }
        public void setpassword(String Password){
            this.password=Password;
        }
        public void setconfirmPassword(String ConfirmPassword){
            this.confirmPassword=ConfirmPassword;
        }
        public String getusername(){
            return this.Username;
        }
        public String getemail(){
            return this.Email;
        }
        public String getcontact(){
            return this.Contact;
        }
        public String getpassword(){
            return this.password;
        }
        public String getconfirmPassword(){
            return this.confirmPassword;
       
        }

    public String getusername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }



