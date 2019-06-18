package org.mazz.restroservice.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;

/**
 * The persistent class for the TableMst database table.
 * 
 */
@Table(name = "tablemast")
@Entity(name = "TableMast")
@NamedQuery(name = "TableMast.findAll", query = "SELECT t FROM TableMast t")
public class TableMast implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "unqno")
	private int unqNo;

	@Column(name = "tableno")
	private String tableNo;

	@Column(name = "poscode")
	private int posCode;

	@Column(name = "Active")
	private int Active;

	@Column(name = "pax")
	private int pax;

	@Column(name = "sittime")
	private String sitTime;
	@Column(name = "waiterno")
	private int waiterNo;

	@Column(name = "discount")
	private int Discount;

	@Column(name = "sitactive")
	private String sitActive;

	@Column(name = "sithour")
	private String sitHour;

	@Column(name = "sitmin")
	private String sitMin;

	@Column(name = "sit")
	private String sit;

	public int getUnqNo() {
		return unqNo;
	}

	public void setUnqNo(int unqNo) {
		this.unqNo = unqNo;
	}

	public String getTableNo() {
		return tableNo;
	}

	public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

	public int getPosCode() {
		return posCode;
	}

	public void setPosCode(int posCode) {
		this.posCode = posCode;
	}

	public int getActive() {
		return Active;
	}

	public void setActive(int active) {
		Active = active;
	}

	public int getPax() {
		return pax;
	}

	public void setPax(int pax) {
		this.pax = pax;
	}

	public String getSitTime() {
		return sitTime;
	}

	public void setSitTime(String sitTime) {
		this.sitTime = sitTime;
	}

	public int getWaiterNo() {
		return waiterNo;
	}

	public void setWaiterNo(int waiterNo) {
		this.waiterNo = waiterNo;
	}

	public int getDiscount() {
		return Discount;
	}

	public void setDiscount(int discount) {
		Discount = discount;
	}

	public String getSitActive() {
		return sitActive;
	}

	public void setSitActive(String sitActive) {
		this.sitActive = sitActive;
	}

	public String getSitHour() {
		return sitHour;
	}

	public void setSitHour(String sitHour) {
		this.sitHour = sitHour;
	}

	public String getSitMin() {
		return sitMin;
	}

	public void setSitMin(String sitMin) {
		this.sitMin = sitMin;
	}

	public String getSit() {
		return sit;
	}

	public void setSit(String sit) {
		this.sit = sit;
	}

	@Override
	public String toString() {
		return "TableMast [unqNo=" + unqNo + ", tableNo=" + tableNo + ", posCode=" + posCode + ", Active=" + Active
				+ ", pax=" + pax + ", sitTime=" + sitTime + ", waiterNo=" + waiterNo + ", Discount=" + Discount
				+ ", sitActive=" + sitActive + ", sitHour=" + sitHour + ", sitMin=" + sitMin + ", sit=" + sit + "]";
	}

}