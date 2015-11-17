package com.jingyunbank.etrade.api.merchant.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.merchant.bo.DeliveryType;
import com.jingyunbank.etrade.api.merchant.bo.InvoiceType;
import com.jingyunbank.etrade.api.merchant.bo.Merchant;

/**
 * 提供商家服务
 * @author liug
 *
 */
public interface IMerchantService {
	/**
	 * 查找推荐商家
	 * @param range
	 * @return
	 */
	public List<Merchant> listMerchants() throws IllegalAccessException, InvocationTargetException;
	/**
	 * 商家保存
	 * @param merchant
	 * @return
	 * @throws DataSavingException
	 */
	public boolean saveMerchant(Merchant merchant) throws DataSavingException;
	/**
	 * 查询所有发票类型
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public List<InvoiceType> listInvoiceType() throws IllegalAccessException, InvocationTargetException;
	/**
	 * 商家发票类型的保存
	 * @param merchant
	 * @return
	 * @throws DataSavingException
	 */
	public boolean saveMerchantInvoiceType(Merchant merchant) throws Exception;
	/**
	 * 商家修改
	 * @param merchant
	 * @return
	 * @throws DataRefreshingException
	 */
	public boolean updateMerchant(Merchant merchant) throws DataRefreshingException ;
	/**
	 * 删除商家和类型关联记录
	 * @param merchant
	 * @throws DataRemovingException
	 */
	public boolean removeMerchantInvoiceType(Merchant merchant) throws DataRemovingException;
	/**
	 * 查询所有快递类型
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public List<DeliveryType> listDeliveryType() throws IllegalAccessException, InvocationTargetException ;
	/**
	 * 保存商家快递类型
	 * @param merchant
	 * @return
	 * @throws Exception
	 */
	public boolean saveMerchantDeliveryType(Merchant merchant) throws Exception;
	/**
	 * 删除商家和快递类型关联记录
	 * @param merchant
	 * @return
	 * @throws DataRemovingException
	 */
	public boolean removeMerchantDeliveryType(Merchant merchant) throws DataRemovingException ;
	/**
	 * 根据商家ID查询商家信息
	 * @param mid
	 * @return
	 */
	public Optional<Merchant> getMerchant(String mid);
	/**
	 * 根据MID查询商家的发票类型
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public List<InvoiceType> listInvoiceType(String mid) throws IllegalAccessException, InvocationTargetException;
	/**
	 * 根据MID查询商家的快递类型
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public List<DeliveryType> listDeliveryType(String mid) throws IllegalAccessException, InvocationTargetException ;
}