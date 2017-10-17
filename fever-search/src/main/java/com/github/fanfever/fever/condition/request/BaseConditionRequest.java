package com.github.fanfever.fever.condition.request;

import com.github.fanfever.fever.condition.operator.Operator;
import com.github.fanfever.fever.condition.type.ValueType;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by fanfever on 2017/5/10.
 * Email fanfeveryahoo@gmail.com
 * Url https://github.com/fanfever
 */
@Data
public abstract class BaseConditionRequest {

    private String fieldName;
    private ValueType valueType;
    private Operator operator;
    private Object value;

    private Boolean result;
    /**
     * 附属条件，暂时支持and
     */
    private List<BaseConditionRequest> attachmentList;

    protected BaseConditionRequest(String fieldName, ValueType valueType, Operator operator, Object value){
        this.fieldName = fieldName;
        this.valueType = valueType;
        this.operator = operator;
        this.value = value;
    }

    protected BaseConditionRequest(Boolean result){
        this.result = result;
    }

    public String getValueStr() {
        return String.valueOf(value).trim();
    }

    @SuppressWarnings("unchecked")
    public List<String> getValueArray() {
//        return null == value ? new String[]{} : String.valueOf(value).split(",");
        if (null == value) {
            return Collections.emptyList();
        }
        if (value instanceof List) {
            return ((List<?>) value).stream().map(String::valueOf).collect(Collectors.toList());
        }
        if (value instanceof Set) {
            return ((Set<?>) value).stream().map(String::valueOf).collect(Collectors.toList());
        }
        if (value instanceof Object[]) {
            return Arrays.stream((Object[])value).map(String::valueOf).collect(Collectors.toList());
        }
        if (value instanceof String) {
            return Lists.newArrayList(String.valueOf(value).split(","));
        }
        throw new AssertionError();
    }
}
