package com.kj.crosstrade.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author qiankeqin
 * @Description: TbResultInfo
 * @date 2019-04-02 22:05
 */
public class TbResultInfo implements Serializable {

    private String TRADE_CODE;

    private String VOYAGE_NO;

    private String BILL_NO;

    private String ECMDCODE;

    private String LINE_NO;

    private Date LINE_TIME;

    private Integer READ_MARK;
}