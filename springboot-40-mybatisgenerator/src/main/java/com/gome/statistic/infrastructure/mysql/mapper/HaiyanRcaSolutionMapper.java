package com.gome.statistic.infrastructure.mysql.mapper;

import static com.gome.statistic.infrastructure.mysql.mapper.HaiyanRcaSolutionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.gome.statistic.infrastructure.mysql.entity.HaiyanRcaSolution;
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
public interface HaiyanRcaSolutionMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.284+08:00", comments="Source Table: haiyan_rca_solution")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.285+08:00", comments="Source Table: haiyan_rca_solution")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.285+08:00", comments="Source Table: haiyan_rca_solution")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<HaiyanRcaSolution> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.286+08:00", comments="Source Table: haiyan_rca_solution")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HaiyanRcaSolutionResult")
    HaiyanRcaSolution selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.286+08:00", comments="Source Table: haiyan_rca_solution")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HaiyanRcaSolutionResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="rca_id", property="rcaId", jdbcType=JdbcType.VARCHAR),
        @Result(column="rcaid_to_changeid", property="rcaidToChangeid", jdbcType=JdbcType.BIGINT),
        @Result(column="change_id", property="changeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="person_account", property="personAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="person_name", property="personName", jdbcType=JdbcType.VARCHAR),
        @Result(column="person_email", property="personEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="plan_finish_time", property="planFinishTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="finished_time", property="finishedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_finished", property="isFinished", jdbcType=JdbcType.INTEGER),
        @Result(column="change_status", property="changeStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="is_useable", property="isUseable", jdbcType=JdbcType.INTEGER),
        @Result(column="change_context", property="changeContext", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<HaiyanRcaSolution> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.287+08:00", comments="Source Table: haiyan_rca_solution")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.287+08:00", comments="Source Table: haiyan_rca_solution")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(haiyanRcaSolution);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.287+08:00", comments="Source Table: haiyan_rca_solution")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, haiyanRcaSolution);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.288+08:00", comments="Source Table: haiyan_rca_solution")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, haiyanRcaSolution)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.288+08:00", comments="Source Table: haiyan_rca_solution")
    default int insert(HaiyanRcaSolution record) {
        return insert(SqlBuilder.insert(record)
                .into(haiyanRcaSolution)
                .map(rcaId).toProperty("rcaId")
                .map(rcaidToChangeid).toProperty("rcaidToChangeid")
                .map(changeId).toProperty("changeId")
                .map(personAccount).toProperty("personAccount")
                .map(personName).toProperty("personName")
                .map(personEmail).toProperty("personEmail")
                .map(planFinishTime).toProperty("planFinishTime")
                .map(finishedTime).toProperty("finishedTime")
                .map(isFinished).toProperty("isFinished")
                .map(changeStatus).toProperty("changeStatus")
                .map(isUseable).toProperty("isUseable")
                .map(changeContext).toProperty("changeContext")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.289+08:00", comments="Source Table: haiyan_rca_solution")
    default int insertSelective(HaiyanRcaSolution record) {
        return insert(SqlBuilder.insert(record)
                .into(haiyanRcaSolution)
                .map(rcaId).toPropertyWhenPresent("rcaId", record::getRcaId)
                .map(rcaidToChangeid).toPropertyWhenPresent("rcaidToChangeid", record::getRcaidToChangeid)
                .map(changeId).toPropertyWhenPresent("changeId", record::getChangeId)
                .map(personAccount).toPropertyWhenPresent("personAccount", record::getPersonAccount)
                .map(personName).toPropertyWhenPresent("personName", record::getPersonName)
                .map(personEmail).toPropertyWhenPresent("personEmail", record::getPersonEmail)
                .map(planFinishTime).toPropertyWhenPresent("planFinishTime", record::getPlanFinishTime)
                .map(finishedTime).toPropertyWhenPresent("finishedTime", record::getFinishedTime)
                .map(isFinished).toPropertyWhenPresent("isFinished", record::getIsFinished)
                .map(changeStatus).toPropertyWhenPresent("changeStatus", record::getChangeStatus)
                .map(isUseable).toPropertyWhenPresent("isUseable", record::getIsUseable)
                .map(changeContext).toPropertyWhenPresent("changeContext", record::getChangeContext)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.289+08:00", comments="Source Table: haiyan_rca_solution")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HaiyanRcaSolution>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, rcaId, rcaidToChangeid, changeId, personAccount, personName, personEmail, planFinishTime, finishedTime, isFinished, changeStatus, isUseable, changeContext)
                .from(haiyanRcaSolution);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.289+08:00", comments="Source Table: haiyan_rca_solution")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HaiyanRcaSolution>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, rcaId, rcaidToChangeid, changeId, personAccount, personName, personEmail, planFinishTime, finishedTime, isFinished, changeStatus, isUseable, changeContext)
                .from(haiyanRcaSolution);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.290+08:00", comments="Source Table: haiyan_rca_solution")
    default HaiyanRcaSolution selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, rcaId, rcaidToChangeid, changeId, personAccount, personName, personEmail, planFinishTime, finishedTime, isFinished, changeStatus, isUseable, changeContext)
                .from(haiyanRcaSolution)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.290+08:00", comments="Source Table: haiyan_rca_solution")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HaiyanRcaSolution record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanRcaSolution)
                .set(rcaId).equalTo(record::getRcaId)
                .set(rcaidToChangeid).equalTo(record::getRcaidToChangeid)
                .set(changeId).equalTo(record::getChangeId)
                .set(personAccount).equalTo(record::getPersonAccount)
                .set(personName).equalTo(record::getPersonName)
                .set(personEmail).equalTo(record::getPersonEmail)
                .set(planFinishTime).equalTo(record::getPlanFinishTime)
                .set(finishedTime).equalTo(record::getFinishedTime)
                .set(isFinished).equalTo(record::getIsFinished)
                .set(changeStatus).equalTo(record::getChangeStatus)
                .set(isUseable).equalTo(record::getIsUseable)
                .set(changeContext).equalTo(record::getChangeContext);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.291+08:00", comments="Source Table: haiyan_rca_solution")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HaiyanRcaSolution record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanRcaSolution)
                .set(rcaId).equalToWhenPresent(record::getRcaId)
                .set(rcaidToChangeid).equalToWhenPresent(record::getRcaidToChangeid)
                .set(changeId).equalToWhenPresent(record::getChangeId)
                .set(personAccount).equalToWhenPresent(record::getPersonAccount)
                .set(personName).equalToWhenPresent(record::getPersonName)
                .set(personEmail).equalToWhenPresent(record::getPersonEmail)
                .set(planFinishTime).equalToWhenPresent(record::getPlanFinishTime)
                .set(finishedTime).equalToWhenPresent(record::getFinishedTime)
                .set(isFinished).equalToWhenPresent(record::getIsFinished)
                .set(changeStatus).equalToWhenPresent(record::getChangeStatus)
                .set(isUseable).equalToWhenPresent(record::getIsUseable)
                .set(changeContext).equalToWhenPresent(record::getChangeContext);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.291+08:00", comments="Source Table: haiyan_rca_solution")
    default int updateByPrimaryKey(HaiyanRcaSolution record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanRcaSolution)
                .set(rcaId).equalTo(record::getRcaId)
                .set(rcaidToChangeid).equalTo(record::getRcaidToChangeid)
                .set(changeId).equalTo(record::getChangeId)
                .set(personAccount).equalTo(record::getPersonAccount)
                .set(personName).equalTo(record::getPersonName)
                .set(personEmail).equalTo(record::getPersonEmail)
                .set(planFinishTime).equalTo(record::getPlanFinishTime)
                .set(finishedTime).equalTo(record::getFinishedTime)
                .set(isFinished).equalTo(record::getIsFinished)
                .set(changeStatus).equalTo(record::getChangeStatus)
                .set(isUseable).equalTo(record::getIsUseable)
                .set(changeContext).equalTo(record::getChangeContext)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.291+08:00", comments="Source Table: haiyan_rca_solution")
    default int updateByPrimaryKeySelective(HaiyanRcaSolution record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanRcaSolution)
                .set(rcaId).equalToWhenPresent(record::getRcaId)
                .set(rcaidToChangeid).equalToWhenPresent(record::getRcaidToChangeid)
                .set(changeId).equalToWhenPresent(record::getChangeId)
                .set(personAccount).equalToWhenPresent(record::getPersonAccount)
                .set(personName).equalToWhenPresent(record::getPersonName)
                .set(personEmail).equalToWhenPresent(record::getPersonEmail)
                .set(planFinishTime).equalToWhenPresent(record::getPlanFinishTime)
                .set(finishedTime).equalToWhenPresent(record::getFinishedTime)
                .set(isFinished).equalToWhenPresent(record::getIsFinished)
                .set(changeStatus).equalToWhenPresent(record::getChangeStatus)
                .set(isUseable).equalToWhenPresent(record::getIsUseable)
                .set(changeContext).equalToWhenPresent(record::getChangeContext)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}