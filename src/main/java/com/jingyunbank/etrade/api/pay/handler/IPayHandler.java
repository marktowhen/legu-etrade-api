package com.jingyunbank.etrade.api.pay.handler;

import java.util.List;
import java.util.Map;

import com.jingyunbank.etrade.api.pay.bo.OrderPayment;

public interface IPayHandler {

	public Map<String, String> prepare(List<OrderPayment> payments, String bankCode) throws Exception;
	
}