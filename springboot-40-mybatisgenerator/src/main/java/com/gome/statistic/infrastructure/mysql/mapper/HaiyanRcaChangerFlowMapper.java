package com.gome.statistic.infrastructure.mysql.mapper;

import static com.gome.statistic.infrastructure.mysql.mapper.HaiyanRcaChangerFlowDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.gome.statistic.infrastructure.mysql.entity.HaiyanRcaChangerFlow;
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
public interface HaiyanRcaChangerFlowMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.008+08:00", comments="Source Table: haiyan_rca_changer_flow")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.009+08:00", comments="Source Table: haiyan_rca_changer_flow")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.009+08:00", comments="Source Table: haiyan_rca_changer_flow")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<HaiyanRcaChangerFlow> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.010+08:00", comments="Source Table: haiyan_rca_changer_flow")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HaiyanRcaChangerFlowResult")
    HaiyanRcaChangerFlow selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.011+08:00", comments="Source Table: haiyan_rca_changer_flow")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HaiyanRcaChangerFlowResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="rca_id", property="rcaId", jdbcType=JdbcType.VARCHAR),
        @Result(column="change_id", property="changeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="person_name", property="personName", jdbcType=JdbcType.VARCHAR),
        @Result(column="person_account", property="personAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="person_plan_status", property="personPlanStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="change_flow_status", property="changeFlowStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="is_finished", property="isFinished", jdbcType=JdbcType.INTEGER),
        @Result(column="feedback_result", property="feedbackResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="report_detail", property="reportDetail", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="person_feedback", property="personFeedback", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<HaiyanRcaChangerFlow> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.011+08:00", comments="Source Table: haiyan_rca_changer_flow")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.011+08:00", comments="Source Table: haiyan_rca_changer_flow")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(haiyanRcaChangerFlow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.012+08:00", comments="Source Table: haiyan_rca_changer_flow")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, haiyanRcaChangerFlow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.012+08:00", comments="Source Table: haiyan_rca_changer_flow")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, haiyanRcaChangerFlow)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.012+08:00", comments="Source Table: haiyan_rca_changer_flow")
    default int insert(HaiyanRcaChangerFlow record) {
        return insert(SqlBuilder.insert(record)
                .into(haiyanRcaChangerFlow)
                .map(rcaId).toProperty("rcaId")
                .map(changeId).toProperty("changeId")
                .map(personName).toProperty("personName")
                .map(personAccount).toProperty("personAccount")
                .map(personPlanStatus).toProperty("personPlanStatus")
                .map(changeFlowStatus).toProperty("changeFlowStatus")
                .map(isFinished).toProperty("isFinished")
                .map(feedbackResult).toProperty("feedbackResult")
                .map(reportDetail).toProperty("reportDetail")
                .map(personFeedback).toProperty("personFeedback")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.013+08:00", comments="Source Table: haiyan_rca_changer_flow")
    default int insertSelective(HaiyanRcaChangerFlow record) {
        return insert(SqlBuilder.insert(record)
                .into(haiyanRcaChangerFlow)
                .map(rcaId).toPropertyWhenPresent("rcaId", record::getRcaId)
                .map(changeId).toPropertyWhenPresent("changeId", record::getChangeId)
                .map(personName).toPropertyWhenPresent("personName", record::getPersonName)
                .map(personAccount).toPropertyWhenPresent("personAccount", record::getPersonAccount)
                .map(personPlanStatus).toPropertyWhenPresent("personPlanStatus", record::getPersonPlanStatus)
                .map(changeFlowStatus).toPropertyWhenPresent("changeFlowStatus", record::getChangeFlowStatus)
                .map(isFinished).toPropertyWhenPresent("isFinished", record::getIsFinished)
                .map(feedbackResult).toPropertyWhenPresent("feedbackResult", record::getFeedbackResult)
                .map(reportDetail).toPropertyWhenPresent("reportDetail", record::getReportDetail)
                .map(personFeedback).toPropertyWhenPresent("personFeedback", record::getPersonFeedback)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.013+08:00", comments="Source Table: haiyan_rca_changer_flow")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HaiyanRcaChangerFlow>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, rcaId, changeId, personName, personAccount, personPlanStatus, changeFlowStatus, isFinished, feedbackResult, reportDetail, personFeedback)
                .from(haiyanRcaChangerFlow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.014+08:00", comments="Source Table: haiyan_rca_changer_flow")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HaiyanRcaChangerFlow>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, rcaId, changeId, personName, personAccount, personPlanStatus, changeFlowStatus, isFinished, feedbackResult, reportDetail, personFeedback)
                .from(haiyanRcaChangerFlow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.014+08:00", comments="Source Table: haiyan_rca_changer_flow")
    default HaiyanRcaChangerFlow selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, rcaId, changeId, personName, personAccount, personPlanStatus, changeFlowStatus, isFinished, feedbackResult, reportDetail, personFeedback)
                .from(haiyanRcaChangerFlow)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.014+08:00", comments="Source Table: haiyan_rca_changer_flow")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HaiyanRcaChangerFlow record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanRcaChangerFlow)
                .set(rcaId).equalTo(record::getRcaId)
                .set(changeId).equalTo(record::getChangeId)
                .set(personName).equalTo(record::getPersonName)
                .set(personAccount).equalTo(record::getPersonAccount)
                .set(personPlanStatus).equalTo(record::getPersonPlanStatus)
                .set(changeFlowStatus).equalTo(record::getChangeFlowStatus)
                .set(isFinished).equalTo(record::getIsFinished)
                .set(feedbackResult).equalTo(record::getFeedbackResult)
                .set(reportDetail).equalTo(record::getReportDetail)
                .set(personFeedback).equalTo(record::getPersonFeedback);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.015+08:00", comments="Source Table: haiyan_rca_changer_flow")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HaiyanRcaChangerFlow record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanRcaChangerFlow)
                .set(rcaId).equalToWhenPresent(record::getRcaId)
                .set(changeId).equalToWhenPresent(record::getChangeId)
                .set(personName).equalToWhenPresent(record::getPersonName)
                .set(personAccount).equalToWhenPresent(record::getPersonAccount)
                .set(personPlanStatus).equalToWhenPresent(record::getPersonPlanStatus)
                .set(changeFlowStatus).equalToWhenPresent(record::getChangeFlowStatus)
                .set(isFinished).equalToWhenPresent(record::getIsFinished)
                .set(feedbackResult).equalToWhenPresent(record::getFeedbackResult)
                .set(reportDetail).equalToWhenPresent(record::getReportDetail)
                .set(personFeedback).equalToWhenPresent(record::getPersonFeedback);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.015+08:00", comments="Source Table: haiyan_rca_changer_flow")
    default int updateByPrimaryKey(HaiyanRcaChangerFlow record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanRcaChangerFlow)
                .set(rcaId).equalTo(record::getRcaId)
                .set(changeId).equalTo(record::getChangeId)
                .set(personName).equalTo(record::getPersonName)
                .set(personAccount).equalTo(record::getPersonAccount)
                .set(personPlanStatus).equalTo(record::getPersonPlanStatus)
                .set(changeFlowStatus).equalTo(record::getChangeFlowStatus)
                .set(isFinished).equalTo(record::getIsFinished)
                .set(feedbackResult).equalTo(record::getFeedbackResult)
                .set(reportDetail).equalTo(record::getReportDetail)
                .set(personFeedback).equalTo(record::getPersonFeedback)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.016+08:00", comments="Source Table: haiyan_rca_changer_flow")
    default int updateByPrimaryKeySelective(HaiyanRcaChangerFlow record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanRcaChangerFlow)
                .set(rcaId).equalToWhenPresent(record::getRcaId)
                .set(changeId).equalToWhenPresent(record::getChangeId)
                .set(personName).equalToWhenPresent(record::getPersonName)
                .set(personAccount).equalToWhenPresent(record::getPersonAccount)
                .set(personPlanStatus).equalToWhenPresent(record::getPersonPlanStatus)
                .set(changeFlowStatus).equalToWhenPresent(record::getChangeFlowStatus)
                .set(isFinished).equalToWhenPresent(record::getIsFinished)
                .set(feedbackResult).equalToWhenPresent(record::getFeedbackResult)
                .set(reportDetail).equalToWhenPresent(record::getReportDetail)
                .set(personFeedback).equalToWhenPresent(record::getPersonFeedback)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}