package se.agilecourse.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/

@Document(collection="users")
public class User {

    public User(){
    }

    public User(String username, String password, String emailaddress){
        this.username = username;
        this.password = password;
        this.emailaddress = emailaddress;

    }

    public User(String username, String password, String emailaddress,String role,String companyId){
        this.username = username;
        this.password = password;
        this.emailaddress = emailaddress;
        this.role = role;
        this.companyId = companyId;
    }


    private String id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String emailaddress;
    private String companyId;
    private String role;
    private String authorizedSP="0";
    private String receiveMessage = "0"; //0:unReceive, 1:receive
    private List<String> likedProducts;
    private List<String> likedCompanies;
    private List<String> ratedMaterials;



    private String teleNumber;
    public String getTeleNumber() {
        return teleNumber;
    }

    public void setTeleNumber(String teleNumber) {
        this.teleNumber = teleNumber;
    }

    public String getAuthorizedSP() {
        return authorizedSP;
    }

    public void setAuthorizedSP(String authorizedSP) {
        this.authorizedSP = authorizedSP;
    }
    public String getReceiveMessage() {
        return receiveMessage;
    }

    public void setReceiveMessage(String receiveMessage) {
        this.receiveMessage = receiveMessage;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<String> getLikedProducts() {
        return likedProducts;
    }

    public void setLikedProducts(List<String> likedProducts) {
        this.likedProducts = likedProducts;
    }

    public List<String> getRatedMaterials() {
        return ratedMaterials;
    }

    public void setRatedMaterials(List<String> ratedMaterials) {
        this.ratedMaterials = ratedMaterials;
    }

    public List<String> getLikedCompanies() {
        return likedCompanies;
    }

    public void setLikedCompanies(List<String> likedCompanies) {
        this.likedCompanies = likedCompanies;
    }



    @Override
    public String toString() {

        if(id != null && !id.equalsIgnoreCase("")){
            return String.format(
                    "User[id='%s', username='%s', password='%s , emailaddress='%s' , role='%s' , companyId='%s']",
                    id,username, password, emailaddress, role,companyId);
        }else {
            return String.format(
                    "User[ username='%s', password='%s , emailaddress='%s' , role='%s']",
                    username, password, emailaddress, role);
        }
    }
}
