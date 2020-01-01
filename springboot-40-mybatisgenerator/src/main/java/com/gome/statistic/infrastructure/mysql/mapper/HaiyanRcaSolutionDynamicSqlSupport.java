package com.gome.statistic.infrastructure.mysql.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HaiyanRcaSolutionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.282+08:00", comments="Source Table: haiyan_rca_solution")
    public static final HaiyanRcaSolution haiyanRcaSolution = new HaiyanRcaSolution();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.282+08:00", comments="Source field: haiyan_rca_solution.id")
    public static final SqlColumn<Long> id = haiyanRcaSolution.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.282+08:00", comments="Source field: haiyan_rca_solution.rca_id")
    public static final SqlColumn<String> rcaId = haiyanRcaSolution.rcaId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.283+08:00", comments="Source field: haiyan_rca_solution.rcaid_to_changeid")
    public static final SqlColumn<Long> rcaidToChangeid = haiyanRcaSolution.rcaidToChangeid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.283+08:00", comments="Source field: haiyan_rca_solution.change_id")
    public static final SqlColumn<String> changeId = haiyanRcaSolution.changeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.283+08:00", comments="Source field: haiyan_rca_solution.person_account")
    public static final SqlColumn<String> personAccount = haiyanRcaSolution.personAccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.283+08:00", comments="Source field: haiyan_rca_solution.person_name")
    public static final SqlColumn<String> personName = haiyanRcaSolution.personName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.283+08:00", comments="Source field: haiyan_rca_solution.person_email")
    public static final SqlColumn<String> personEmail = haiyanRcaSolution.personEmail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.283+08:00", comments="Source field: haiyan_rca_solution.plan_finish_time")
    public static final SqlColumn<Date> planFinishTime = haiyanRcaSolution.planFinishTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.283+08:00", comments="Source field: haiyan_rca_solution.finished_time")
    public static final SqlColumn<Date> finishedTime = haiyanRcaSolution.finishedTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.283+08:00", comments="Source field: haiyan_rca_solution.is_finished")
    public static final SqlColumn<Integer> isFinished = haiyanRcaSolution.isFinished;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.283+08:00", comments="Source field: haiyan_rca_solution.change_status")
    public static final SqlColumn<Integer> changeStatus = haiyanRcaSolution.changeStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.283+08:00", comments="Source field: haiyan_rca_solution.is_useable")
    public static final SqlColumn<Integer> isUseable = haiyanRcaSolution.isUseable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.283+08:00", comments="Source field: haiyan_rca_solution.change_context")
    public static final SqlColumn<String> changeContext = haiyanRcaSolution.changeContext;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T10:37:52.282+08:00", comments="Source Table: haiyan_rca_solution")
    public static final class HaiyanRcaSolution extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> rcaId = column("rca_id", JDBCType.VARCHAR);

        public final SqlColumn<Long> rcaidToChangeid = column("rcaid_to_changeid", JDBCType.BIGINT);

        public final SqlColumn<String> changeId = column("change_id", JDBCType.VARCHAR);

        public final SqlColumn<String> personAccount = column("person_account", JDBCType.VARCHAR);

        public final SqlColumn<String> personName = column("person_name", JDBCType.VARCHAR);

        public final SqlColumn<String> personEmail = column("person_email", JDBCType.VARCHAR);

        public final SqlColumn<Date> planFinishTime = column("plan_finish_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> finishedTime = column("finished_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> isFinished = column("is_finished", JDBCType.INTEGER);

        public final SqlColumn<Integer> changeStatus = column("change_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> isUseable = column("is_useable", JDBCType.INTEGER);

        public final SqlColumn<String> changeContext = column("change_context", JDBCType.LONGVARCHAR);

        public HaiyanRcaSolution() {
            super("haiyan_rca_solution");
        }
    }
}