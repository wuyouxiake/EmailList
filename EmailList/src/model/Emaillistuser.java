package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.text.*;


/**
 * The persistent class for the EMAILLISTUSER database table.
 * 
 */
@Entity
@NamedQuery(name="Emaillistuser.findAll", query="SELECT e FROM Emaillistuser e")
public class Emaillistuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userid;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	private String email;

	private String firstname;

	private String lastname;

	public Emaillistuser() {
	}

	public long getUserid() {
		return this.userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}