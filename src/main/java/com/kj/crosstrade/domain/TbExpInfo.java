package com.kj.crosstrade.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-04-02 22:05
 */
public class TbExpInfo implements Serializable {

    private String VOYAGE_NO;

    private String BILL_NO;

    private String SEND_NAME;

    private String SENDER_ADDR;

    private String SENDER_TEL;

    private String OWNER_NAME;

    private String OWNER_ADDR;

    private String OWNER_TEL;

    private String MAIN_G_NAME;

    private Integer PACK_NO;

    private BigDecimal TOTAL_VALUE;

    private String CURR_CODE;

    private BigDecimal GROSS_WT;

    private String TAX_FLAG;

    private String I_E_FLAG;

    private String CUST_ORDER;

    private Date CUST_DATE;

    private String CUST_ER;

    private String TRADE_NAME;

    private String TRADE_CODE;

    private Integer READ_MARK;

    public TbExpInfo() {
    }

    public TbExpInfo(String VOYAGE_NO, String BILL_NO, String SEND_NAME, String SENDER_ADDR, String SENDER_TEL, String OWNER_NAME, String OWNER_ADDR, String OWNER_TEL, String MAIN_G_NAME, Integer PACK_NO, BigDecimal TOTAL_VALUE, String CURR_CODE, BigDecimal GROSS_WT, String TAX_FLAG, String i_E_FLAG, String CUST_ORDER, Date CUST_DATE, String CUST_ER, String TRADE_NAME, String TRADE_CODE, Integer READ_MARK) {
        this.VOYAGE_NO = VOYAGE_NO;
        this.BILL_NO = BILL_NO;
        this.SEND_NAME = SEND_NAME;
        this.SENDER_ADDR = SENDER_ADDR;
        this.SENDER_TEL = SENDER_TEL;
        this.OWNER_NAME = OWNER_NAME;
        this.OWNER_ADDR = OWNER_ADDR;
        this.OWNER_TEL = OWNER_TEL;
        this.MAIN_G_NAME = MAIN_G_NAME;
        this.PACK_NO = PACK_NO;
        this.TOTAL_VALUE = TOTAL_VALUE;
        this.CURR_CODE = CURR_CODE;
        this.GROSS_WT = GROSS_WT;
        this.TAX_FLAG = TAX_FLAG;
        I_E_FLAG = i_E_FLAG;
        this.CUST_ORDER = CUST_ORDER;
        this.CUST_DATE = CUST_DATE;
        this.CUST_ER = CUST_ER;
        this.TRADE_NAME = TRADE_NAME;
        this.TRADE_CODE = TRADE_CODE;
        this.READ_MARK = READ_MARK;
    }

    public String getCUST_ORDER() {
        return CUST_ORDER;
    }

    public void setCUST_ORDER(String CUST_ORDER) {
        this.CUST_ORDER = CUST_ORDER;
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

    public String getSEND_NAME() {
        return SEND_NAME;
    }

    public void setSEND_NAME(String SEND_NAME) {
        this.SEND_NAME = SEND_NAME;
    }

    public String getSENDER_ADDR() {
        return SENDER_ADDR;
    }

    public void setSENDER_ADDR(String SENDER_ADDR) {
        this.SENDER_ADDR = SENDER_ADDR;
    }

    public String getSENDER_TEL() {
        return SENDER_TEL;
    }

    public void setSENDER_TEL(String SENDER_TEL) {
        this.SENDER_TEL = SENDER_TEL;
    }

    public String getOWNER_NAME() {
        return OWNER_NAME;
    }

    public void setOWNER_NAME(String OWNER_NAME) {
        this.OWNER_NAME = OWNER_NAME;
    }

    public String getOWNER_ADDR() {
        return OWNER_ADDR;
    }

    public void setOWNER_ADDR(String OWNER_ADDR) {
        this.OWNER_ADDR = OWNER_ADDR;
    }

    public String getOWNER_TEL() {
        return OWNER_TEL;
    }

    public void setOWNER_TEL(String OWNER_TEL) {
        this.OWNER_TEL = OWNER_TEL;
    }

    public String getMAIN_G_NAME() {
        return MAIN_G_NAME;
    }

    public void setMAIN_G_NAME(String MAIN_G_NAME) {
        this.MAIN_G_NAME = MAIN_G_NAME;
    }

    public Integer getPACK_NO() {
        return PACK_NO;
    }

    public void setPACK_NO(Integer PACK_NO) {
        this.PACK_NO = PACK_NO;
    }

    public BigDecimal getTOTAL_VALUE() {
        return TOTAL_VALUE;
    }

    public void setTOTAL_VALUE(BigDecimal TOTAL_VALUE) {
        this.TOTAL_VALUE = TOTAL_VALUE;
    }

    public String getCURR_CODE() {
        return CURR_CODE;
    }

    public void setCURR_CODE(String CURR_CODE) {
        this.CURR_CODE = CURR_CODE;
    }

    public BigDecimal getGROSS_WT() {
        return GROSS_WT;
    }

    public void setGROSS_WT(BigDecimal GROSS_WT) {
        this.GROSS_WT = GROSS_WT;
    }

    public String getTAX_FLAG() {
        return TAX_FLAG;
    }

    public void setTAX_FLAG(String TAX_FLAG) {
        this.TAX_FLAG = TAX_FLAG;
    }

    public String getI_E_FLAG() {
        return I_E_FLAG;
    }

    public void setI_E_FLAG(String i_E_FLAG) {
        I_E_FLAG = i_E_FLAG;
    }

    public Date getCUST_DATE() {
        return CUST_DATE;
    }

    public void setCUST_DATE(Date CUST_DATE) {
        this.CUST_DATE = CUST_DATE;
    }

    public String getCUST_ER() {
        return CUST_ER;
    }

    public void setCUST_ER(String CUST_ER) {
        this.CUST_ER = CUST_ER;
    }

    public String getTRADE_NAME() {
        return TRADE_NAME;
    }

    public void setTRADE_NAME(String TRADE_NAME) {
        this.TRADE_NAME = TRADE_NAME;
    }

    public String getTRADE_CODE() {
        return TRADE_CODE;
    }

    public void setTRADE_CODE(String TRADE_CODE) {
        this.TRADE_CODE = TRADE_CODE;
    }

    public Integer getREAD_MARK() {
        return READ_MARK;
    }

    public void setREAD_MARK(Integer READ_MARK) {
        this.READ_MARK = READ_MARK;
    }
}