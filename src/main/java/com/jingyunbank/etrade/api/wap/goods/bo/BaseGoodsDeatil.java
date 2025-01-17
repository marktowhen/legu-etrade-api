package com.jingyunbank.etrade.api.wap.goods.bo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
* Title: BaseGoodsDeatil  商品详情页展示属性
* @author    duanxf
* @date      2016年4月7日
 */
public class BaseGoodsDeatil implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String GID;
	private String name;
	private String MID;
	private String mName;
	private String mQQ;
	private String TID;
	private String tname;
	private BigDecimal price;
	private BigDecimal salePrice;
	private String content;
	private int volume;
	private int comment;
	private String about;
	private boolean isSale;
	private String path;
	
	
	
	
	
	
	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	public boolean isSale() {
		return isSale;
	}

	public void setSale(boolean isSale) {
		this.isSale = isSale;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getGID() {
		return GID;
	}

	public void setGID(String gID) {
		GID = gID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMID() {
		return MID;
	}

	public void setMID(String mID) {
		MID = mID;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmQQ() {
		return mQQ;
	}

	public void setmQQ(String mQQ) {
		this.mQQ = mQQ;
	}

	public String getTID() {
		return TID;
	}

	public void setTID(String tID) {
		TID = tID;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getComment() {
		return comment;
	}

	public void setComment(int comment) {
		this.comment = comment;
	}

}
