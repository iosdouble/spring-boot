package com.gome.statistic.infrastructure.mysql.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HaiyanWorkOrderEntityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.410+08:00", comments="Source Table: haiyan_work_order")
    public static final HaiyanWorkOrderEntity haiyanWorkOrderEntity = new HaiyanWorkOrderEntity();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.410+08:00", comments="Source field: haiyan_work_order.id")
    public static final SqlColumn<Long> id = haiyanWorkOrderEntity.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.410+08:00", comments="Source field: haiyan_work_order.work_id")
    public static final SqlColumn<String> workId = haiyanWorkOrderEntity.workId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.410+08:00", comments="Source field: haiyan_work_order.account")
    public static final SqlColumn<String> account = haiyanWorkOrderEntity.account;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.411+08:00", comments="Source field: haiyan_work_order.email")
    public static final SqlColumn<String> email = haiyanWorkOrderEntity.email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.411+08:00", comments="Source field: haiyan_work_order.time")
    public static final SqlColumn<Date> time = haiyanWorkOrderEntity.time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.411+08:00", comments="Source field: haiyan_work_order.center")
    public static final SqlColumn<String> center = haiyanWorkOrderEntity.center;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.411+08:00", comments="Source field: haiyan_work_order.ip_list")
    public static final SqlColumn<String> ipList = haiyanWorkOrderEntity.ipList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.411+08:00", comments="Source field: haiyan_work_order.sys_args")
    public static final SqlColumn<String> sysArgs = haiyanWorkOrderEntity.sysArgs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.411+08:00", comments="Source field: haiyan_work_order.diamond_content")
    public static final SqlColumn<String> diamondContent = haiyanWorkOrderEntity.diamondContent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.411+08:00", comments="Source field: haiyan_work_order.domain")
    public static final SqlColumn<String> domain = haiyanWorkOrderEntity.domain;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.411+08:00", comments="Source field: haiyan_work_order.domain_rule")
    public static final SqlColumn<String> domainRule = haiyanWorkOrderEntity.domainRule;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.411+08:00", comments="Source field: haiyan_work_order.cdn_domain")
    public static final SqlColumn<String> cdnDomain = haiyanWorkOrderEntity.cdnDomain;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.411+08:00", comments="Source field: haiyan_work_order.cdn_note")
    public static final SqlColumn<String> cdnNote = haiyanWorkOrderEntity.cdnNote;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.411+08:00", comments="Source field: haiyan_work_order.note")
    public static final SqlColumn<String> note = haiyanWorkOrderEntity.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.411+08:00", comments="Source field: haiyan_work_order.status")
    public static final SqlColumn<String> status = haiyanWorkOrderEntity.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.411+08:00", comments="Source field: haiyan_work_order.create_time")
    public static final SqlColumn<Date> createTime = haiyanWorkOrderEntity.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.412+08:00", comments="Source field: haiyan_work_order.resource")
    public static final SqlColumn<String> resource = haiyanWorkOrderEntity.resource;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.412+08:00", comments="Source field: haiyan_work_order.user_cn")
    public static final SqlColumn<String> userCn = haiyanWorkOrderEntity.userCn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.412+08:00", comments="Source field: haiyan_work_order.audit_note")
    public static final SqlColumn<String> auditNote = haiyanWorkOrderEntity.auditNote;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.412+08:00", comments="Source field: haiyan_work_order.update_time")
    public static final SqlColumn<Date> updateTime = haiyanWorkOrderEntity.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-11-11T10:35:34.410+08:00", comments="Source Table: haiyan_work_order")
    public static final class HaiyanWorkOrderEntity extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> workId = column("work_id", JDBCType.VARCHAR);

        public final SqlColumn<String> account = column("account", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<Date> time = column("time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> center = column("center", JDBCType.VARCHAR);

        public final SqlColumn<String> ipList = column("ip_list", JDBCType.VARCHAR);

        public final SqlColumn<String> sysArgs = column("sys_args", JDBCType.VARCHAR);

        public final SqlColumn<String> diamondContent = column("diamond_content", JDBCType.VARCHAR);

        public final SqlColumn<String> domain = column("domain", JDBCType.VARCHAR);

        public final SqlColumn<String> domainRule = column("domain_rule", JDBCType.VARCHAR);

        public final SqlColumn<String> cdnDomain = column("cdn_domain", JDBCType.VARCHAR);

        public final SqlColumn<String> cdnNote = column("cdn_note", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> resource = column("resource", JDBCType.VARCHAR);

        public final SqlColumn<String> userCn = column("user_cn", JDBCType.VARCHAR);

        public final SqlColumn<String> auditNote = column("audit_note", JDBCType.VARCHAR);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public HaiyanWorkOrderEntity() {
            super("haiyan_work_order");
        }
    }
}