package com.gome.statistic.infrastructure.mysql.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HaiyanRcaChangerFlowDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.006+08:00", comments="Source Table: haiyan_rca_changer_flow")
    public static final HaiyanRcaChangerFlow haiyanRcaChangerFlow = new HaiyanRcaChangerFlow();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.007+08:00", comments="Source field: haiyan_rca_changer_flow.id")
    public static final SqlColumn<Long> id = haiyanRcaChangerFlow.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.007+08:00", comments="Source field: haiyan_rca_changer_flow.rca_id")
    public static final SqlColumn<String> rcaId = haiyanRcaChangerFlow.rcaId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.007+08:00", comments="Source field: haiyan_rca_changer_flow.change_id")
    public static final SqlColumn<String> changeId = haiyanRcaChangerFlow.changeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.007+08:00", comments="Source field: haiyan_rca_changer_flow.person_name")
    public static final SqlColumn<String> personName = haiyanRcaChangerFlow.personName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.007+08:00", comments="Source field: haiyan_rca_changer_flow.person_account")
    public static final SqlColumn<String> personAccount = haiyanRcaChangerFlow.personAccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.008+08:00", comments="Source field: haiyan_rca_changer_flow.person_plan_status")
    public static final SqlColumn<Integer> personPlanStatus = haiyanRcaChangerFlow.personPlanStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.008+08:00", comments="Source field: haiyan_rca_changer_flow.change_flow_status")
    public static final SqlColumn<Integer> changeFlowStatus = haiyanRcaChangerFlow.changeFlowStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.008+08:00", comments="Source field: haiyan_rca_changer_flow.is_finished")
    public static final SqlColumn<Integer> isFinished = haiyanRcaChangerFlow.isFinished;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.008+08:00", comments="Source field: haiyan_rca_changer_flow.feedback_result")
    public static final SqlColumn<String> feedbackResult = haiyanRcaChangerFlow.feedbackResult;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.008+08:00", comments="Source field: haiyan_rca_changer_flow.report_detail")
    public static final SqlColumn<String> reportDetail = haiyanRcaChangerFlow.reportDetail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.008+08:00", comments="Source field: haiyan_rca_changer_flow.person_feedback")
    public static final SqlColumn<String> personFeedback = haiyanRcaChangerFlow.personFeedback;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-02T14:43:33.007+08:00", comments="Source Table: haiyan_rca_changer_flow")
    public static final class HaiyanRcaChangerFlow extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> rcaId = column("rca_id", JDBCType.VARCHAR);

        public final SqlColumn<String> changeId = column("change_id", JDBCType.VARCHAR);

        public final SqlColumn<String> personName = column("person_name", JDBCType.VARCHAR);

        public final SqlColumn<String> personAccount = column("person_account", JDBCType.VARCHAR);

        public final SqlColumn<Integer> personPlanStatus = column("person_plan_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> changeFlowStatus = column("change_flow_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> isFinished = column("is_finished", JDBCType.INTEGER);

        public final SqlColumn<String> feedbackResult = column("feedback_result", JDBCType.VARCHAR);

        public final SqlColumn<String> reportDetail = column("report_detail", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> personFeedback = column("person_feedback", JDBCType.LONGVARCHAR);

        public HaiyanRcaChangerFlow() {
            super("haiyan_rca_changer_flow");
        }
    }
}