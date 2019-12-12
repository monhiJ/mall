package com.mj.alipay.service;


import com.alipay.api.AlipayApiException;
import com.mj.alipay.bean.AlipayBean;

/*支付服务*/
public interface PayService {
    /*支付宝*/
    String aliPay(AlipayBean alipayBean) throws AlipayApiException;
}
