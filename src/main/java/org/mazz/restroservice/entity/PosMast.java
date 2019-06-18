package org.mazz.restroservice.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the PosMast database table.
 * 
 */
@Table(name = "posmast")
@Entity(name = "PosMast")
@NamedQuery(name = "PosMast.findAll", query = "SELECT p FROM PosMast p")
public class PosMast implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "poscode")
	private int posCode;

	@Column(name = "posname")
	private String posName;

	public int getPosCode() {
		return posCode;
	}

	public void setPosCode(int posCode) {
		this.posCode = posCode;
	}

	public String getPosName() {
		return posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}

}