

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import model.Emaillistuser;

@ManagedBean
@RequestScoped
public class EmailList {
    private Emaillistuser user;
    private String message;
    
    public EmailList() {
    }
    
    @PostConstruct
    public void init() {
        user = new Emaillistuser();
    }
    
    public String addToEmailList() {
        if (EmailDB.emailExists(user.getEmail())) {
            message = "This email address already exists. " +
                    "Please enter another email address";
            return "index";
        } else {
        	EmailDB.insert(user);
            return "thanks";
        }
    }

    public Emaillistuser getUser() {
        return user;
    }

    public void setUser(Emaillistuser user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }
}