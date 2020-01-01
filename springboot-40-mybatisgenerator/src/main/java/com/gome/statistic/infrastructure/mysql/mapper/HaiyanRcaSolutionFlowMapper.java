package com.gome.statistic.infrastructure.mysql.mapper;

import static com.gome.statistic.infrastructure.mysql.mapper.HaiyanRcaSolutionFlowDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.gome.statistic.infrastructure.mysql.entity.HaiyanRcaSolutionFlow;
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
public interface HaiyanRcaSolutionFlowMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.307+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.308+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.308+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<HaiyanRcaSolutionFlow> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.309+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HaiyanRcaSolutionFlowResult")
    HaiyanRcaSolutionFlow selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.310+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HaiyanRcaSolutionFlowResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="racId", property="racid", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_name", property="fileName", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_path", property="filePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="isFinished", property="isfinished", jdbcType=JdbcType.INTEGER),
        @Result(column="isUseable", property="isuseable", jdbcType=JdbcType.INTEGER),
        @Result(column="ext", property="ext", jdbcType=JdbcType.VARCHAR)
    })
    List<HaiyanRcaSolutionFlow> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.310+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.310+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(haiyanRcaSolutionFlow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.311+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, haiyanRcaSolutionFlow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.311+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    default int deleteByPrimaryKey(Long id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, haiyanRcaSolutionFlow)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.311+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    default int insert(HaiyanRcaSolutionFlow record) {
        return insert(SqlBuilder.insert(record)
                .into(haiyanRcaSolutionFlow)
                .map(racid).toProperty("racid")
                .map(fileName).toProperty("fileName")
                .map(filePath).toProperty("filePath")
                .map(createtime).toProperty("createtime")
                .map(updatetime).toProperty("updatetime")
                .map(isfinished).toProperty("isfinished")
                .map(isuseable).toProperty("isuseable")
                .map(ext).toProperty("ext")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.312+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    default int insertSelective(HaiyanRcaSolutionFlow record) {
        return insert(SqlBuilder.insert(record)
                .into(haiyanRcaSolutionFlow)
                .map(racid).toPropertyWhenPresent("racid", record::getRacid)
                .map(fileName).toPropertyWhenPresent("fileName", record::getFileName)
                .map(filePath).toPropertyWhenPresent("filePath", record::getFilePath)
                .map(createtime).toPropertyWhenPresent("createtime", record::getCreatetime)
                .map(updatetime).toPropertyWhenPresent("updatetime", record::getUpdatetime)
                .map(isfinished).toPropertyWhenPresent("isfinished", record::getIsfinished)
                .map(isuseable).toPropertyWhenPresent("isuseable", record::getIsuseable)
                .map(ext).toPropertyWhenPresent("ext", record::getExt)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.312+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HaiyanRcaSolutionFlow>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, racid, fileName, filePath, createtime, updatetime, isfinished, isuseable, ext)
                .from(haiyanRcaSolutionFlow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.313+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<HaiyanRcaSolutionFlow>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, racid, fileName, filePath, createtime, updatetime, isfinished, isuseable, ext)
                .from(haiyanRcaSolutionFlow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.313+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    default HaiyanRcaSolutionFlow selectByPrimaryKey(Long id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, racid, fileName, filePath, createtime, updatetime, isfinished, isuseable, ext)
                .from(haiyanRcaSolutionFlow)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.314+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(HaiyanRcaSolutionFlow record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanRcaSolutionFlow)
                .set(racid).equalTo(record::getRacid)
                .set(fileName).equalTo(record::getFileName)
                .set(filePath).equalTo(record::getFilePath)
                .set(createtime).equalTo(record::getCreatetime)
                .set(updatetime).equalTo(record::getUpdatetime)
                .set(isfinished).equalTo(record::getIsfinished)
                .set(isuseable).equalTo(record::getIsuseable)
                .set(ext).equalTo(record::getExt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.314+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(HaiyanRcaSolutionFlow record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanRcaSolutionFlow)
                .set(racid).equalToWhenPresent(record::getRacid)
                .set(fileName).equalToWhenPresent(record::getFileName)
                .set(filePath).equalToWhenPresent(record::getFilePath)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .set(updatetime).equalToWhenPresent(record::getUpdatetime)
                .set(isfinished).equalToWhenPresent(record::getIsfinished)
                .set(isuseable).equalToWhenPresent(record::getIsuseable)
                .set(ext).equalToWhenPresent(record::getExt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.314+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    default int updateByPrimaryKey(HaiyanRcaSolutionFlow record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanRcaSolutionFlow)
                .set(racid).equalTo(record::getRacid)
                .set(fileName).equalTo(record::getFileName)
                .set(filePath).equalTo(record::getFilePath)
                .set(createtime).equalTo(record::getCreatetime)
                .set(updatetime).equalTo(record::getUpdatetime)
                .set(isfinished).equalTo(record::getIsfinished)
                .set(isuseable).equalTo(record::getIsuseable)
                .set(ext).equalTo(record::getExt)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.315+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    default int updateByPrimaryKeySelective(HaiyanRcaSolutionFlow record) {
        return UpdateDSL.updateWithMapper(this::update, haiyanRcaSolutionFlow)
                .set(racid).equalToWhenPresent(record::getRacid)
                .set(fileName).equalToWhenPresent(record::getFileName)
                .set(filePath).equalToWhenPresent(record::getFilePath)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .set(updatetime).equalToWhenPresent(record::getUpdatetime)
                .set(isfinished).equalToWhenPresent(record::getIsfinished)
                .set(isuseable).equalToWhenPresent(record::getIsuseable)
                .set(ext).equalToWhenPresent(record::getExt)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}