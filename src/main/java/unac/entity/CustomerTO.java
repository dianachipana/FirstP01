
package unac.entity;

/**
 *
 * @author Usuario
 */
public class CustomerTO {
    
    private String fname;
    private String lname;
    private String email;
    private String address;
    private String active;
    private String customerid;
    
    public CustomerTO(String fname, String lname, String email, String address, String customerid,String active){
        this.fname=fname;
        this.lname=lname;
        this.email=email;
        this.address=address;
        this.customerid=customerid;
        this.active=active;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }
 
}
