package com.gome.statistic.controller;

import com.gome.statistic.infrastructure.mysql.entity.HaiyanAppEntity;
import com.gome.statistic.infrastructure.mysql.mapper.HaiyanAppEntityMapper;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import static com.gome.statistic.infrastructure.mysql.mapper.HaiyanAppEntityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2019/11/11 11:00 AM
 * @Created by nihui
 */
@RestController
public class HelloController {

    @Autowired
    public HaiyanAppEntityMapper haiyanAppEntityMapper;

    @GetMapping("/hello")
    public HaiyanAppEntity getHaiyanAppEntiry(){

        SelectStatementProvider selectStatement = select(id,name,code)
                .from(haiyanAppEntity)
                .where(id,isEqualTo(94L))
                .build()
                .render(RenderingStrategy.MYBATIS3);

        return haiyanAppEntityMapper.selectOne(selectStatement);
    }


}
