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

    public TbResultInfo() {
    }

    public TbResultInfo(String TRADE_CODE, String VOYAGE_NO, String BILL_NO, String ECMDCODE, String LINE_NO, Date LINE_TIME, Integer READ_MARK) {
        this.TRADE_CODE = TRADE_CODE;
        this.VOYAGE_NO = VOYAGE_NO;
        this.BILL_NO = BILL_NO;
        this.ECMDCODE = ECMDCODE;
        this.LINE_NO = LINE_NO;
        this.LINE_TIME = LINE_TIME;
        this.READ_MARK = READ_MARK;
    }

    public String getTRADE_CODE() {
        return TRADE_CODE;
    }

    public void setTRADE_CODE(String TRADE_CODE) {
        this.TRADE_CODE = TRADE_CODE;
    }

    public String getVOYAGE_NO() {
        return VOYAGE_NO;
    }

    public void setVOYAGE_NO(String VOYAGE_NO) {
        this.VOYAGE_NO = VOYAGE_NO;
    }

    public String getBILL_NO() {
        return BILL_NO;
    }

    public void setBILL_NO(String BILL_NO) {
        this.BILL_NO = BILL_NO;
    }

    public String getECMDCODE() {
        return ECMDCODE;
    }

    public void setECMDCODE(String ECMDCODE) {
        this.ECMDCODE = ECMDCODE;
    }

    public String getLINE_NO() {
        return LINE_NO;
    }

    public void setLINE_NO(String LINE_NO) {
        this.LINE_NO = LINE_NO;
    }

    public Date getLINE_TIME() {
        return LINE_TIME;
    }

    public void setLINE_TIME(Date LINE_TIME) {
        this.LINE_TIME = LINE_TIME;
    }

    public Integer getREAD_MARK() {
        return READ_MARK;
    }

    public void setREAD_MARK(Integer READ_MARK) {
        this.READ_MARK = READ_MARK;
    }
}