package com.gome.statistic.infrastructure.mysql.mapper;

import static com.gome.statistic.infrastructure.mysql.mapper.HaiyanWorkOrderEntityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.gome.statistic.infrastructure.mysql.entity.HaiyanWorkOrderEntity;
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
public interface HaiyanWorkOrderEntityMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.412+08:00", comments="Source Table: haiyan_work_order")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.413+08:00", comments="Source Table: haiyan_work_order")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.413+08:00", comments="Source Table: haiyan_work_order")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<HaiyanWorkOrderEntity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.414+08:00", comments="Source Table: haiyan_work_order")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HaiyanWorkOrderEntityResult")
    HaiyanWorkOrderEntity selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.414+08:00", comments="Source Table: haiyan_work_order")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HaiyanWorkOrderEntityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="work_id", property="workId", jdbcType=JdbcType.VARCHAR),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="center", property="center", jdbcType=JdbcType.VARCHAR),
        @Result(column="ip_list", property="ipList", jdbcType=JdbcType.VARCHAR),
        @Result(column="sys_args", property="sysArgs", jdbcType=JdbcType.VARCHAR),
        @Result(column="diamond_content", property="diamondContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="domain", property="domain", jdbcType=JdbcType.VARCHAR),
        @Result(column="domain_rule", property="domainRule", jdbcType=JdbcType.VARCHAR),
        @Result(column="cdn_domain", property="cdnDomain", jdbcType=JdbcType.VARCHAR),
        @Result(column="cdn_note", property="cdnNote", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="resource", property="resource", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_cn", property="userCn", jdbcType=JdbcType.VARCHAR),
        @Result(column="audit_note", property="auditNote", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<HaiyanWorkOrderEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.415+08:00", comments="Source Table: haiyan_work_order")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.415+08:00", comments="Source Table: haiyan_work_order")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(haiyanWorkOrderEntity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.415+08:00", comments="Source Table: haiyan_work_order")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, haiyanWorkOrderEntity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.416+08:00", comments="Source Table: haiyan_work_order")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, haiyanWorkOrderEntity)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.416+08:00", comments="Source Table: haiyan_work_order")
    default int insert(HaiyanWorkOrderEntity record) {
        return insert(SqlBuilder.insert(record)
                .into(haiyanWorkOrderEntity)
                .map(workId).toProperty("workId")
                .map(account).toProperty("account")
                .map(email).toProperty("email")
                .map(time).toProperty("time")
                .map(center).toProperty("center")
                .map(ipList).toProperty("ipList")
                .map(sysArgs).toProperty("sysArgs")
                .map(diamondContent).toProperty("diamondContent")
                .map(domain).toProperty("domain")
                .map(domainRule).toProperty("domainRule")
                .map(cdnDomain).toProperty("cdnDomain")
                .map(cdnNote).toProperty("cdnNote")
                .map(note).toProperty("note")
                .map(status).toProperty("status")
                .map(createTime).toProperty("createTime")
                .map(resource).toProperty("resource")
                .map(userCn).toProperty("userCn")
                .map(auditNote).toProperty("auditNote")
                .map(updateTime).toProperty("updateTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.417+08:00", comments="Source Table: haiyan_work_order")
    default int insertSelective(HaiyanWorkOrderEntity record) {
        return insert(SqlBuilder.insert(record)
                .into(haiyanWorkOrderEntity)
                .map(workId).toPropertyWhenPresent("workId", record::getWorkId)
                .map(account).toPropertyWhenPresent("account", record::getAccount)
                .map(email).toPropertyWhenPresent("email", record::getEmail)
                .map(time).toPropertyWhenPresent("time", record::getTime)
                .map(center).toPropertyWhenPresent("center", record::getCenter)
                .map(ipList).toPropertyWhenPresent("ipList", record::getIpList)
                .map(sysArgs).toPropertyWhenPresent("sysArgs", record::getSysArgs)
                .map(diamondContent).toPropertyWhenPresent("diamondContent", record::getDiamondContent)
                .map(domain).toPropertyWhenPresent("domain", record::getDomain)
                .map(domainRule).toPropertyWhenPresent("domainRule", record::getDomainRule)
                .map(cdnDomain).toPropertyWhenPresent("cdnDomain", record::getCdnDomain)
                .map(cdnNote).toPropertyWhenPresent("cdnNote", record::getCdnNote)
                .map(note).toPropertyWhenPresent("note", record::getNote)
                .map(status).toPropertyWhenPresent("status", record::getStatus)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(resource).toPropertyWhenPresent("resource", record::getResource)
                .map(userCn).toPropertyWhenPresent("userCn", record::getUserCn)
                .map(auditNote).toPropertyWhenPresent("auditNote", record::getAuditNote)
                .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.417+08:00", comments="Source Table: haiyan_work_order")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HaiyanWorkOrderEntity>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, workId, account, email, time, center, ipList, sysArgs, diamondContent, domain, domainRule, cdnDomain, cdnNote, note, status, createTime, resource, userCn, auditNote, updateTime)
                .from(haiyanWorkOrderEntity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.417+08:00", comments="Source Table: haiyan_work_order")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HaiyanWorkOrderEntity>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, workId, account, email, time, center, ipList, sysArgs, diamondContent, domain, domainRule, cdnDomain, cdnNote, note, status, createTime, resource, userCn, auditNote, updateTime)
                .from(haiyanWorkOrderEntity);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.418+08:00", comments="Source Table: haiyan_work_order")
    default HaiyanWorkOrderEntity selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, workId, account, email, time, center, ipList, sysArgs, diamondContent, domain, domainRule, cdnDomain, cdnNote, note, status, createTime, resource, userCn, auditNote, updateTime)
                .from(haiyanWorkOrderEntity)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.418+08:00", comments="Source Table: haiyan_work_order")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HaiyanWorkOrderEntity record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanWorkOrderEntity)
                .set(workId).equalTo(record::getWorkId)
                .set(account).equalTo(record::getAccount)
                .set(email).equalTo(record::getEmail)
                .set(time).equalTo(record::getTime)
                .set(center).equalTo(record::getCenter)
                .set(ipList).equalTo(record::getIpList)
                .set(sysArgs).equalTo(record::getSysArgs)
                .set(diamondContent).equalTo(record::getDiamondContent)
                .set(domain).equalTo(record::getDomain)
                .set(domainRule).equalTo(record::getDomainRule)
                .set(cdnDomain).equalTo(record::getCdnDomain)
                .set(cdnNote).equalTo(record::getCdnNote)
                .set(note).equalTo(record::getNote)
                .set(status).equalTo(record::getStatus)
                .set(createTime).equalTo(record::getCreateTime)
                .set(resource).equalTo(record::getResource)
                .set(userCn).equalTo(record::getUserCn)
                .set(auditNote).equalTo(record::getAuditNote)
                .set(updateTime).equalTo(record::getUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.418+08:00", comments="Source Table: haiyan_work_order")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HaiyanWorkOrderEntity record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanWorkOrderEntity)
                .set(workId).equalToWhenPresent(record::getWorkId)
                .set(account).equalToWhenPresent(record::getAccount)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(time).equalToWhenPresent(record::getTime)
                .set(center).equalToWhenPresent(record::getCenter)
                .set(ipList).equalToWhenPresent(record::getIpList)
                .set(sysArgs).equalToWhenPresent(record::getSysArgs)
                .set(diamondContent).equalToWhenPresent(record::getDiamondContent)
                .set(domain).equalToWhenPresent(record::getDomain)
                .set(domainRule).equalToWhenPresent(record::getDomainRule)
                .set(cdnDomain).equalToWhenPresent(record::getCdnDomain)
                .set(cdnNote).equalToWhenPresent(record::getCdnNote)
                .set(note).equalToWhenPresent(record::getNote)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(resource).equalToWhenPresent(record::getResource)
                .set(userCn).equalToWhenPresent(record::getUserCn)
                .set(auditNote).equalToWhenPresent(record::getAuditNote)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.419+08:00", comments="Source Table: haiyan_work_order")
    default int updateByPrimaryKey(HaiyanWorkOrderEntity record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanWorkOrderEntity)
                .set(workId).equalTo(record::getWorkId)
                .set(account).equalTo(record::getAccount)
                .set(email).equalTo(record::getEmail)
                .set(time).equalTo(record::getTime)
                .set(center).equalTo(record::getCenter)
                .set(ipList).equalTo(record::getIpList)
                .set(sysArgs).equalTo(record::getSysArgs)
                .set(diamondContent).equalTo(record::getDiamondContent)
                .set(domain).equalTo(record::getDomain)
                .set(domainRule).equalTo(record::getDomainRule)
                .set(cdnDomain).equalTo(record::getCdnDomain)
                .set(cdnNote).equalTo(record::getCdnNote)
                .set(note).equalTo(record::getNote)
                .set(status).equalTo(record::getStatus)
                .set(createTime).equalTo(record::getCreateTime)
                .set(resource).equalTo(record::getResource)
                .set(userCn).equalTo(record::getUserCn)
                .set(auditNote).equalTo(record::getAuditNote)
                .set(updateTime).equalTo(record::getUpdateTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.419+08:00", comments="Source Table: haiyan_work_order")
    default int updateByPrimaryKeySelective(HaiyanWorkOrderEntity record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanWorkOrderEntity)
                .set(workId).equalToWhenPresent(record::getWorkId)
                .set(account).equalToWhenPresent(record::getAccount)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(time).equalToWhenPresent(record::getTime)
                .set(center).equalToWhenPresent(record::getCenter)
                .set(ipList).equalToWhenPresent(record::getIpList)
                .set(sysArgs).equalToWhenPresent(record::getSysArgs)
                .set(diamondContent).equalToWhenPresent(record::getDiamondContent)
                .set(domain).equalToWhenPresent(record::getDomain)
                .set(domainRule).equalToWhenPresent(record::getDomainRule)
                .set(cdnDomain).equalToWhenPresent(record::getCdnDomain)
                .set(cdnNote).equalToWhenPresent(record::getCdnNote)
                .set(note).equalToWhenPresent(record::getNote)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(resource).equalToWhenPresent(record::getResource)
                .set(userCn).equalToWhenPresent(record::getUserCn)
                .set(auditNote).equalToWhenPresent(record::getAuditNote)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}