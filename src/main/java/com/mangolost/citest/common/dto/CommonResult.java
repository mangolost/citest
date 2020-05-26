package com.mangolost.citest.common.dto;

import com.mangolost.citest.common.exception.ApiStatusCode;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by mangolost on 16-9-8.
 */
public class CommonResult implements Serializable {

    private static final long serialVersionUID = 2806462205932577188L;

    /**
     * 状态码
     */
    private int code = ApiStatusCode.SUCCESS; //200

    /**
     * 描述
     */
    private String message = "OK";

    /**
     * 响应数据
     */
    private Object data = null;

    public CommonResult() {

    }

    public CommonResult setCodeAndMessage(int code, String message) {
        this.code = code;
        this.message = message;
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public CommonResult setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
