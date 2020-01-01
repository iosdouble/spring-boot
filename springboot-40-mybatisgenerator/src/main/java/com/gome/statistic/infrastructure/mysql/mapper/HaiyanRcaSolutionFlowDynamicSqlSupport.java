package com.gome.statistic.infrastructure.mysql.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HaiyanRcaSolutionFlowDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.305+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    public static final HaiyanRcaSolutionFlow haiyanRcaSolutionFlow = new HaiyanRcaSolutionFlow();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.306+08:00", comments="Source field: haiyan_rac_report_to_filepath.id")
    public static final SqlColumn<Long> id = haiyanRcaSolutionFlow.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.306+08:00", comments="Source field: haiyan_rac_report_to_filepath.racId")
    public static final SqlColumn<String> racid = haiyanRcaSolutionFlow.racid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.306+08:00", comments="Source field: haiyan_rac_report_to_filepath.file_name")
    public static final SqlColumn<String> fileName = haiyanRcaSolutionFlow.fileName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.306+08:00", comments="Source field: haiyan_rac_report_to_filepath.file_path")
    public static final SqlColumn<String> filePath = haiyanRcaSolutionFlow.filePath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.306+08:00", comments="Source field: haiyan_rac_report_to_filepath.createTime")
    public static final SqlColumn<Date> createtime = haiyanRcaSolutionFlow.createtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.307+08:00", comments="Source field: haiyan_rac_report_to_filepath.updateTime")
    public static final SqlColumn<Date> updatetime = haiyanRcaSolutionFlow.updatetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.307+08:00", comments="Source field: haiyan_rac_report_to_filepath.isFinished")
    public static final SqlColumn<Integer> isfinished = haiyanRcaSolutionFlow.isfinished;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.307+08:00", comments="Source field: haiyan_rac_report_to_filepath.isUseable")
    public static final SqlColumn<Integer> isuseable = haiyanRcaSolutionFlow.isuseable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.307+08:00", comments="Source field: haiyan_rac_report_to_filepath.ext")
    public static final SqlColumn<String> ext = haiyanRcaSolutionFlow.ext;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:22:58.306+08:00", comments="Source Table: haiyan_rac_report_to_filepath")
    public static final class HaiyanRcaSolutionFlow extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> racid = column("racId", JDBCType.VARCHAR);

        public final SqlColumn<String> fileName = column("file_name", JDBCType.VARCHAR);

        public final SqlColumn<String> filePath = column("file_path", JDBCType.VARCHAR);

        public final SqlColumn<Date> createtime = column("createTime", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updatetime = column("updateTime", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> isfinished = column("isFinished", JDBCType.INTEGER);

        public final SqlColumn<Integer> isuseable = column("isUseable", JDBCType.INTEGER);

        public final SqlColumn<String> ext = column("ext", JDBCType.VARCHAR);

        public HaiyanRcaSolutionFlow() {
            super("haiyan_rac_report_to_filepath");
        }
    }
}