package org.mazz.restroservice.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the WAITERMAST database table.
 * 
 */
@Entity(name = "WaiterMast")
@Table(name = "waitermast")
@NamedQuery(name = "WaiterMast.findAll", query = "SELECT w FROM WaiterMast w")
public class WaiterMast implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "waiterno")
	private long waiterNo;

	@Column(name = "Waitercode")
	private String waiterCode;

	@Column(name = "Waitername")
	private String waiterName;

	@Column(name = "poscode")
	private int poscode;

	public long getWaiterNo() {
		return waiterNo;
	}

	public void setWaiterNo(long waiterNo) {
		this.waiterNo = waiterNo;
	}

	public String getWaiterCode() {
		return waiterCode;
	}

	public void setWaiterCode(String waiterCode) {
		this.waiterCode = waiterCode;
	}

	public String getWaiterName() {
		return waiterName;
	}

	public void setWaiterName(String waiterName) {
		this.waiterName = waiterName;
	}

	public int getPoscode() {
		return poscode;
	}

	public void setPoscode(int poscode) {
		this.poscode = poscode;
	}

}