package org.mazz.restroservice.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the UserMast database table.
 * 
 */
@Table(name = "usermast")
@Entity(name = "UserMast")
@NamedQuery(name = "UserMast.findAll", query = "SELECT u FROM UserMast u")
public class UserMast implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "usercode")
	private long userCode;

	@Column(name = "passwrd")
	private String passWrd;

	@Column(name = "Rights")
	private int rights;

	@Column(name = "username")
	private String userName;

	public UserMast() {
	}

	public String getPassWrd() {
		return this.passWrd;
	}

	public void setPassWrd(String passWrd) {
		this.passWrd = passWrd;
	}

	public int getRights() {
		return this.rights;
	}

	public void setRights(int rights) {
		this.rights = rights;
	}

	public long getUserCode() {
		return this.userCode;
	}

	public void setUserCode(long userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}