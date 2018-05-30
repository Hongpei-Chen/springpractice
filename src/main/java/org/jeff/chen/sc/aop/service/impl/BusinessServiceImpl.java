package org.jeff.chen.sc.aop.service.impl;

import org.jeff.chen.sc.aop.service.BusinessService;
import org.springframework.stereotype.Service;

/**
 * @author jeff
 * <p>Date 2018/5/30 17:51</p>
 */
@Service
public class BusinessServiceImpl implements BusinessService {

    @Override
    public String findProductById(String productName) {
        return productName;
    }
}
