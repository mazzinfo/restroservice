package org.mazz.restroservice.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;




/**
 * The persistent class for the RateMast database table.
 * 
 */


@Embeddable public class RateMastPk  implements Serializable {
	@Column(name = "itempckey")
	private int ItemPckey;
	@Column(name="poscode")
	private long poSCode;
	public int getItemPckey() {
		return ItemPckey;
	}
	public void setItemPckey(int itemPckey) {
		ItemPckey = itemPckey;
	}
	public long getPoSCode() {
		return poSCode;
	}
	public void setPoSCode(long poSCode) {
		this.poSCode = poSCode;
	}
	
}

