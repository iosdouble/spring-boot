package com.gome.statistic.infrastructure.mysql.mapper;

import static com.gome.statistic.infrastructure.mysql.mapper.HaiyanAppEntityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.gome.statistic.infrastructure.mysql.entity.HaiyanAppEntity;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface HaiyanAppEntityMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.288+08:00", comments="Source Table: haiyan_app")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.288+08:00", comments="Source Table: haiyan_app")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.289+08:00", comments="Source Table: haiyan_app")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<HaiyanAppEntity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.290+08:00", comments="Source Table: haiyan_app")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HaiyanAppEntityResult")
    HaiyanAppEntity selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.290+08:00", comments="Source Table: haiyan_app")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HaiyanAppEntityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="port", property="port", jdbcType=JdbcType.INTEGER),
        @Result(column="mem", property="mem", jdbcType=JdbcType.VARCHAR),
        @Result(column="middleware", property="middleware", jdbcType=JdbcType.VARCHAR),
        @Result(column="jdk", property="jdk", jdbcType=JdbcType.VARCHAR),
        @Result(column="sre", property="sre", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR)
    })
    List<HaiyanAppEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.290+08:00", comments="Source Table: haiyan_app")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.291+08:00", comments="Source Table: haiyan_app")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(haiyanAppEntity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.291+08:00", comments="Source Table: haiyan_app")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, haiyanAppEntity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.291+08:00", comments="Source Table: haiyan_app")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, haiyanAppEntity)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.292+08:00", comments="Source Table: haiyan_app")
    default int insert(HaiyanAppEntity record) {
        return insert(SqlBuilder.insert(record)
                .into(haiyanAppEntity)
                .map(name).toProperty("name")
                .map(code).toProperty("code")
                .map(port).toProperty("port")
                .map(mem).toProperty("mem")
                .map(middleware).toProperty("middleware")
                .map(jdk).toProperty("jdk")
                .map(sre).toProperty("sre")
                .map(createTime).toProperty("createTime")
                .map(updateTime).toProperty("updateTime")
                .map(workId).toProperty("workId")
                .map(note).toProperty("note")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.292+08:00", comments="Source Table: haiyan_app")
    default int insertSelective(HaiyanAppEntity record) {
        return insert(SqlBuilder.insert(record)
                .into(haiyanAppEntity)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(code).toPropertyWhenPresent("code", record::getCode)
                .map(port).toPropertyWhenPresent("port", record::getPort)
                .map(mem).toPropertyWhenPresent("mem", record::getMem)
                .map(middleware).toPropertyWhenPresent("middleware", record::getMiddleware)
                .map(jdk).toPropertyWhenPresent("jdk", record::getJdk)
                .map(sre).toPropertyWhenPresent("sre", record::getSre)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .map(workId).toPropertyWhenPresent("workId", record::getWorkId)
                .map(note).toPropertyWhenPresent("note", record::getNote)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.293+08:00", comments="Source Table: haiyan_app")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HaiyanAppEntity>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, code, port, mem, middleware, jdk, sre, createTime, updateTime, workId, note)
                .from(haiyanAppEntity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.293+08:00", comments="Source Table: haiyan_app")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HaiyanAppEntity>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, code, port, mem, middleware, jdk, sre, createTime, updateTime, workId, note)
                .from(haiyanAppEntity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.294+08:00", comments="Source Table: haiyan_app")
    default HaiyanAppEntity selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, code, port, mem, middleware, jdk, sre, createTime, updateTime, workId, note)
                .from(haiyanAppEntity)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.294+08:00", comments="Source Table: haiyan_app")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HaiyanAppEntity record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanAppEntity)
                .set(name).equalTo(record::getName)
                .set(code).equalTo(record::getCode)
                .set(port).equalTo(record::getPort)
                .set(mem).equalTo(record::getMem)
                .set(middleware).equalTo(record::getMiddleware)
                .set(jdk).equalTo(record::getJdk)
                .set(sre).equalTo(record::getSre)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(workId).equalTo(record::getWorkId)
                .set(note).equalTo(record::getNote);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.295+08:00", comments="Source Table: haiyan_app")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HaiyanAppEntity record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanAppEntity)
                .set(name).equalToWhenPresent(record::getName)
                .set(code).equalToWhenPresent(record::getCode)
                .set(port).equalToWhenPresent(record::getPort)
                .set(mem).equalToWhenPresent(record::getMem)
                .set(middleware).equalToWhenPresent(record::getMiddleware)
                .set(jdk).equalToWhenPresent(record::getJdk)
                .set(sre).equalToWhenPresent(record::getSre)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(workId).equalToWhenPresent(record::getWorkId)
                .set(note).equalToWhenPresent(record::getNote);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.295+08:00", comments="Source Table: haiyan_app")
    default int updateByPrimaryKey(HaiyanAppEntity record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanAppEntity)
                .set(name).equalTo(record::getName)
                .set(code).equalTo(record::getCode)
                .set(port).equalTo(record::getPort)
                .set(mem).equalTo(record::getMem)
                .set(middleware).equalTo(record::getMiddleware)
                .set(jdk).equalTo(record::getJdk)
                .set(sre).equalTo(record::getSre)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(workId).equalTo(record::getWorkId)
                .set(note).equalTo(record::getNote)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.295+08:00", comments="Source Table: haiyan_app")
    default int updateByPrimaryKeySelective(HaiyanAppEntity record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanAppEntity)
                .set(name).equalToWhenPresent(record::getName)
                .set(code).equalToWhenPresent(record::getCode)
                .set(port).equalToWhenPresent(record::getPort)
                .set(mem).equalToWhenPresent(record::getMem)
                .set(middleware).equalToWhenPresent(record::getMiddleware)
                .set(jdk).equalToWhenPresent(record::getJdk)
                .set(sre).equalToWhenPresent(record::getSre)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(workId).equalToWhenPresent(record::getWorkId)
                .set(note).equalToWhenPresent(record::getNote)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}