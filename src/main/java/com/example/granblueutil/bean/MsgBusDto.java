package com.example.granblueutil.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class MsgBusDto implements Serializable {


    public String getDataClass() {
        return dataClass;
    }

    public void setDataClass(String dataClass) {
        this.dataClass = dataClass;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public MsgCondition getCondition() {
        return condition;
    }

    public void setCondition(MsgCondition condition) {
        this.condition = condition;
    }

    public List<MsgData> getData() {
        return data;
    }

    public void setData(List<MsgData> data) {
        this.data = data;
    }

    /**
     * defalut: realdata
     */
    @JsonProperty("data_class")
    private String dataClass;

    /**
     * analog 遥测 state 遥信 alarm 告警
     */
    @JsonProperty("data_type")
    private String dataType;

    /**
     * 操作类型: subscribe_emergency 数据周期上送 subscribe_cycle 数据变化上送
     */
    @JsonProperty("op_type")
    private String opType;

    private MsgCondition condition;

    private List<MsgData> data;

    @Data
    public static class MsgCondition implements Serializable {
        /**
         * 变电站ID（读取集控系统变电站表获取）
         */
        private Long stationID;
        /**
         * 业务中台变电站资源ID（从映射关系接口获取）
         */
        @JsonProperty("station_psr_id")
        private String stationPsrId;

        /**
         * 变电站名称（读取集控系统变电站表获取）
         */
        @JsonProperty("station_name")
        private String stationName;

        /**
         * 周期时间，单位为秒
         */
        @JsonProperty("period_time")
        private Integer periodTime;

        /**
         * 周期时间，单位为秒
         */
        @JsonProperty("alarm_type")
        private String alarmType;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class MsgData implements Serializable {
        /**
         * 调度系统设备ID（可选）（填空字符串）
         */
        @JsonProperty("mRID")
        private String mrid;
        /**
         * 业务中台设备资源ID（从映射关系接口获取）
         */
        @JsonProperty("psr_id")
        private String psrId;
        /**
         * 集控系统设备ID（主设备根据测点ID转换得到设备ID，辅设备根据测点读取对应表中的“所属设备“获取到设备ID）
         */
        @JsonProperty("dev_id")
        private String devId;

        /**
         * 集控系统设备类型（即设备表的表号）
         */
        @JsonProperty("dev_type")
        private String devType;

        /**
         * 参引，对于存量变电站为IEC60870-5-104规约信息体地址（读取“遥信表”或“遥测表”的reference_id域）
         */
        private String reference;
        /**
         * 设置厂站名称
         */
        private String description;
        @JsonProperty("value_type")
        private String valueType;
        /**
         * 量测值，遥测使用double数值，遥信统一使用0、1（0分1合）
         */
        private Double value;


        /**
         * 量测质量码（遵循DL/T 860服务协议或DL/T 634.5104品质位）
         */
        @JsonProperty("Q")
        private Integer q;
        /**
         * 数据时间，格式为yyyy-MM-dd hh:mm:ss.zzz
         */
        @JsonProperty("date_time")
        private String dateTime;

        @JsonProperty("alarm_level")
        private String alarmLevel;

        @JsonProperty("bay_id")
        private String bayId;
        //
        @JsonProperty("warn_key_str")
        private String warnKeyStr;

    }
}