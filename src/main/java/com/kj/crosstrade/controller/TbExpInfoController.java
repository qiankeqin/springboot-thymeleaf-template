package com.kj.crosstrade.controller;

import com.alibaba.fastjson.JSONObject;
import com.kj.crosstrade.dao.TbExpInfoMapper;
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
@RequestMapping("/tbExpInfo")
public class TbExpInfoController {

    @Autowired
    private TbExpInfoMapper tbExpInfoMapper;

    //查询，通过name查询一条
    @RequestMapping(value="/query/byname", method= RequestMethod.GET)
    @ResponseBody
    public TbExpInfo findContactByName(@PathParam(value="VOYAGE_NO") String VOYAGE_NO) {
        List<TbExpInfo> expInfoById = tbExpInfoMapper.getExpInfoById(VOYAGE_NO);
        if(null==expInfoById || expInfoById.size()==0){
            return null;
        }
        TbExpInfo tbExpInfo = expInfoById.get(0); ;//this.tbExpInfosRepository.findByVOYAGENO(VOYAGE_NO);
        return tbExpInfo;
    }

    @RequestMapping(value="/queryExpInfo")
    @ResponseBody
    public Object findAllExpInfo(){
        List<TbExpInfo> expInfoList = tbExpInfoMapper.getExpInfoList();
        if(null==expInfoList || expInfoList.size()==0){
            expInfoList = new ArrayList<>();
        }

        JSONObject json = new JSONObject();
        json.put("rows", expInfoList);
        json.put("total", expInfoList.size());
        return json.toJSONString();
    }


    /**
     * 首页
     * @return
     */
    @RequestMapping(value="/index",method= RequestMethod.GET)
    public String index(){
        return "list";
    }
}