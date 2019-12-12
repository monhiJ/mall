package com.mj.alipay.service.impl;

import com.alipay.api.AlipayApiException;
import com.mj.alipay.bean.AlipayBean;
import com.mj.alipay.config.AlipayUtil;
import com.mj.alipay.service.PayService;
import org.springframework.stereotype.Service;

/* 支付服务 */
@Service(value = "alipayOrderService")
public class PayServiceImpl implements PayService {
 @Override
 public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
    return AlipayUtil.connect(alipayBean);
}
}