package com.kj.crosstrade.dao;

import com.kj.crosstrade.domain.TbExpInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-04-03 13:53
 */
@Repository
public interface TbExpInfoMapper {
    List<TbExpInfo> getExpInfoById(@Param(value="VOYAGE_NO") String VOYAGE_NO);

    List<TbExpInfo> getExpInfoList();

}