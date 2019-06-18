package org.mazz.restroservice.custommodal;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TableCustomModal {

	private int unqNo;

	private String tableNo;

	private int posCode;

	private int tableStatus;

	private int pax;

	private String sitTime;

	private int waiterNo;
	private String waiterName;

	private int Discount;

	private String sitActive;

	private String sitHour;

	private String sitMin;

	private String sit;
	private BigDecimal totalAmount;

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

	

	public int getTableStatus() {
		return tableStatus;
	}

	public void setTableStatus(int tableStatus) {
		this.tableStatus = tableStatus;
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

	public String getWaiterName() {
		return waiterName;
	}

	public void setWaiterName(String waiterName) {
		this.waiterName = waiterName;
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

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "TableCustomModal [unqNo=" + unqNo + ", tableNo=" + tableNo + ", posCode=" + posCode + ", tableStatus="
				+ tableStatus + ", pax=" + pax + ", sitTime=" + sitTime + ", waiterNo=" + waiterNo + ", waiterName="
				+ waiterName + ", Discount=" + Discount + ", sitActive=" + sitActive + ", sitHour=" + sitHour
				+ ", sitMin=" + sitMin + ", sit=" + sit + ", totalAmount=" + totalAmount + "]";
	}

}
