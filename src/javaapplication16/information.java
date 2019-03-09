
package javaapplication16;

public class information {
    private String firstname;
    private String lastname;
    private String clas;
    private String section;
    private String gender;
    private String countryid;
    private String roll;
    
    
    public information(String firstname,String lastname,String clas, String section,String gender,String countryid, String roll){
        this.firstname = firstname;
        this.lastname = lastname;
        this.clas = clas;
        this.section = section;
         this.gender = gender;
        this.countryid = countryid;
         this.roll = roll;
        
    }
    
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
     public String getclas(){
        return clas;
    }
    public String getsection(){
    return section;
    
}
     public String getgender(){
        return gender;
   
     }
         public String getcountryid(){
        return firstname;
    }
    public String getroll(){
        
    return roll;   
    } }
    
