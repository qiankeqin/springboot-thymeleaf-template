package com.kj.crosstrade.controller;

import com.alibaba.fastjson.JSONObject;
import com.kj.crosstrade.dao.TbExpInfoMapper;
import com.kj.crosstrade.dao.TbResultInfoMapper;
import com.kj.crosstrade.domain.TbExpInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-04-02 23:13
 */
@Controller
@RequestMapping("/cust")
public class TbExpInfoController {

    @Autowired
    private TbExpInfoMapper tbExpInfoMapper;

    @Autowired
    private TbResultInfoMapper tbResultInfoMapper;

    /**
     * 首页
     * @return
     */
    @RequestMapping(value="/index",method= RequestMethod.GET)
    public String index(){
        return "list";
    }

    @RequestMapping(value="/queryCust")
    @ResponseBody
    public Object queryCust(@PathParam(value="voyageNo") String voyageNo,@PathParam(value="billNo") String billNo){
        List<TbExpInfo> tbExpInfos = null;
        if((null==voyageNo || "".equals(voyageNo)) && (null==billNo || "".equals(billNo))){
            tbExpInfos = new ArrayList<>();
        } else {
            tbExpInfos = tbExpInfoMapper.queryByVoyageNoOrBillNo(voyageNo,billNo);
        }
        if(null==tbExpInfos){
            tbExpInfos = new ArrayList<>();
        }
        JSONObject json = new JSONObject();
        json.put("rows", tbExpInfos);
        json.put("total", tbExpInfos.size());
        return json.toJSONString();
    }

    @RequestMapping(value="/queryCustNoLine")
    @ResponseBody
    public Object queryCustNoLine(){
        List<TbExpInfo> expInfoList = tbResultInfoMapper.getCustButNoLine();
        if(null==expInfoList){
            expInfoList = new ArrayList<>();
        }

        JSONObject json = new JSONObject();
        json.put("rows", expInfoList);
        json.put("total", expInfoList.size());
        return json.toJSONString();
    }

}