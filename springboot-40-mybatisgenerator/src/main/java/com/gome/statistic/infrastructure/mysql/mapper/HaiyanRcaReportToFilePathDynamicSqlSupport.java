package com.gome.statistic.infrastructure.mysql.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HaiyanRcaReportToFilePathDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:24:46.920+08:00", comments="Source Table: haiyan_rca_report_to_filepath")
    public static final HaiyanRcaReportToFilePath haiyanRcaReportToFilePath = new HaiyanRcaReportToFilePath();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:24:46.921+08:00", comments="Source field: haiyan_rca_report_to_filepath.id")
    public static final SqlColumn<Long> id = haiyanRcaReportToFilePath.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:24:46.921+08:00", comments="Source field: haiyan_rca_report_to_filepath.racId")
    public static final SqlColumn<String> racid = haiyanRcaReportToFilePath.racid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:24:46.921+08:00", comments="Source field: haiyan_rca_report_to_filepath.file_name")
    public static final SqlColumn<String> fileName = haiyanRcaReportToFilePath.fileName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:24:46.921+08:00", comments="Source field: haiyan_rca_report_to_filepath.file_path")
    public static final SqlColumn<String> filePath = haiyanRcaReportToFilePath.filePath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:24:46.921+08:00", comments="Source field: haiyan_rca_report_to_filepath.createTime")
    public static final SqlColumn<Date> createtime = haiyanRcaReportToFilePath.createtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:24:46.921+08:00", comments="Source field: haiyan_rca_report_to_filepath.updateTime")
    public static final SqlColumn<Date> updatetime = haiyanRcaReportToFilePath.updatetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:24:46.921+08:00", comments="Source field: haiyan_rca_report_to_filepath.isFinished")
    public static final SqlColumn<Integer> isfinished = haiyanRcaReportToFilePath.isfinished;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:24:46.922+08:00", comments="Source field: haiyan_rca_report_to_filepath.isUseable")
    public static final SqlColumn<Integer> isuseable = haiyanRcaReportToFilePath.isuseable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:24:46.922+08:00", comments="Source field: haiyan_rca_report_to_filepath.ext")
    public static final SqlColumn<String> ext = haiyanRcaReportToFilePath.ext;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-12T18:24:46.920+08:00", comments="Source Table: haiyan_rca_report_to_filepath")
    public static final class HaiyanRcaReportToFilePath extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> racid = column("racId", JDBCType.VARCHAR);

        public final SqlColumn<String> fileName = column("file_name", JDBCType.VARCHAR);

        public final SqlColumn<String> filePath = column("file_path", JDBCType.VARCHAR);

        public final SqlColumn<Date> createtime = column("createTime", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updatetime = column("updateTime", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> isfinished = column("isFinished", JDBCType.INTEGER);

        public final SqlColumn<Integer> isuseable = column("isUseable", JDBCType.INTEGER);

        public final SqlColumn<String> ext = column("ext", JDBCType.VARCHAR);

        public HaiyanRcaReportToFilePath() {
            super("haiyan_rca_report_to_filepath");
        }
    }
}