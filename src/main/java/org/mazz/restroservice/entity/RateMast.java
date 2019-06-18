package org.mazz.restroservice.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the RateMast database table.
 * 
 */
@Table(name = "ratemast")
@Entity(name = "RateMast")
@NamedQuery(name = "RateMast.findAll", query = "SELECT r FROM RateMast r")
public class RateMast implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	RateMastPk id;

	@Column(name = "rate")
	private BigDecimal rate;

	@Column(name = "taxrate")
	private BigDecimal taxRate;

	@Column(name = "acposcode")
	private int ACPosCode;

	@Column(name = "stockfactor")
	private BigDecimal stockFactor;

	public RateMastPk getId() {
		return id;
	}

	public void setId(RateMastPk id) {
		this.id = id;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	public int getACPosCode() {
		return ACPosCode;
	}

	public void setACPosCode(int aCPosCode) {
		ACPosCode = aCPosCode;
	}

	public BigDecimal getStockFactor() {
		return stockFactor;
	}

	public void setStockFactor(BigDecimal stockFactor) {
		this.stockFactor = stockFactor;
	}

}
