package org.mazz.restroservice.entity;

import java.io.Serializable;
import javax.persistence.*;


@Table(name = "numbermaster")
@Entity(name = "NumberMaster")
@NamedQuery(name = "NumberMaster.findAll", query = "SELECT n FROM NumberMaster n")
public class NumberMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "posarea")
	private int posArea;

	@Column(name = "billno")
	private int billNo;

	@Column(name = "edrbillno")
	private int edrBillNo;

	@Column(name = "edrkotno")
	private int edrKotNo;

	@Column(name = "KotNo")
	private int kotNo;

	private int tkey;

	public int getPosArea() {
		return posArea;
	}

	public void setPosArea(int posArea) {
		this.posArea = posArea;
	}

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public int getEdrBillNo() {
		return edrBillNo;
	}

	public void setEdrBillNo(int edrBillNo) {
		this.edrBillNo = edrBillNo;
	}

	public int getEdrKotNo() {
		return edrKotNo;
	}

	public void setEdrKotNo(int edrKotNo) {
		this.edrKotNo = edrKotNo;
	}

	public int getKotNo() {
		return kotNo;
	}

	public void setKotNo(int kotNo) {
		this.kotNo = kotNo;
	}

	public int getTkey() {
		return tkey;
	}

	public void setTkey(int tkey) {
		this.tkey = tkey;
	}

}