package com.gome.statistic.infrastructure.mysql.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HaiyanAppEntityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.285+08:00", comments="Source Table: haiyan_app")
    public static final HaiyanAppEntity haiyanAppEntity = new HaiyanAppEntity();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.286+08:00", comments="Source field: haiyan_app.id")
    public static final SqlColumn<Long> id = haiyanAppEntity.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.286+08:00", comments="Source field: haiyan_app.name")
    public static final SqlColumn<String> name = haiyanAppEntity.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.286+08:00", comments="Source field: haiyan_app.code")
    public static final SqlColumn<String> code = haiyanAppEntity.code;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.286+08:00", comments="Source field: haiyan_app.port")
    public static final SqlColumn<Integer> port = haiyanAppEntity.port;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.286+08:00", comments="Source field: haiyan_app.mem")
    public static final SqlColumn<String> mem = haiyanAppEntity.mem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.286+08:00", comments="Source field: haiyan_app.middleware")
    public static final SqlColumn<String> middleware = haiyanAppEntity.middleware;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.287+08:00", comments="Source field: haiyan_app.jdk")
    public static final SqlColumn<String> jdk = haiyanAppEntity.jdk;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.287+08:00", comments="Source field: haiyan_app.sre")
    public static final SqlColumn<Byte> sre = haiyanAppEntity.sre;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.287+08:00", comments="Source field: haiyan_app.create_time")
    public static final SqlColumn<Date> createTime = haiyanAppEntity.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.287+08:00", comments="Source field: haiyan_app.update_time")
    public static final SqlColumn<Date> updateTime = haiyanAppEntity.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.287+08:00", comments="Source field: haiyan_app.work_id")
    public static final SqlColumn<String> workId = haiyanAppEntity.workId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.287+08:00", comments="Source field: haiyan_app.note")
    public static final SqlColumn<String> note = haiyanAppEntity.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T11:00:07.285+08:00", comments="Source Table: haiyan_app")
    public static final class HaiyanAppEntity extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);

        public final SqlColumn<Integer> port = column("port", JDBCType.INTEGER);

        public final SqlColumn<String> mem = column("mem", JDBCType.VARCHAR);

        public final SqlColumn<String> middleware = column("middleware", JDBCType.VARCHAR);

        public final SqlColumn<String> jdk = column("jdk", JDBCType.VARCHAR);

        public final SqlColumn<Byte> sre = column("sre", JDBCType.TINYINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> workId = column("work_id", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public HaiyanAppEntity() {
            super("haiyan_app");
        }
    }
}