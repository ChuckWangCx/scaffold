package com.wcx.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: chuck
 * @Date: 2018/8/22
 * @Time: 14:07
 * @Description: API 统一返回格式封装
 * @modified:
 */
@Data
public class Api implements Serializable{

    private static final long serialVersionUID = 1672493411204459264L;

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private Object data;

    /**
     * 默认构造
     */
    public Api() {
        this.code = Status.SUCCESS.getCode();
        this.msg = Status.SUCCESS.getMsg();
    }

    /**
     * 构造 API 返回对象
     *
     * @param code  返回码
     * @param msg   返回信息
     * @param data  数据
     */
    public Api(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     *  通用构造包含返回信息的 Api
     *
     * @param code  状态码
     * @param msg   信息
     * @param data  数据
     * @return Api
     */
    public static Api of(int code, String msg, Object data) {
        return new Api(code, msg, data);
    }

    /**
     * 通用构造包含返回信息的 Api
     * 主要用于不包含数据时的返回
     *
     * @param code  状态码
     * @param msg   信息
     * @return Api
     */
    public static Api ofMessage(int code, String msg) {
        return new Api(code, msg, null);
    }

    /**
     * 通用构造包含返回信息的 Api <br>
     * 主要用于只包含返回信息
     *
     * @param msg
     * @return Api
     */
    public static Api ofMessage(String msg) {
        return new Api(Status.SUCCESS.getCode(), msg, null);
    }

    /**
     * 通用构造包含返回信息的 Api <br>
     * 主要用于操作成功时的返回
     *
     * @return Api
     */
    public static Api ofSuccess() {
        return new Api(Status.SUCCESS.getCode(), Status.SUCCESS.getMsg(), null);
    }

    /**
     * 通过 Status 构造 Api <br>
     * 主要用于出现异常时的返回
     *
     * @param status
     * @return
     */
    public static Api ofStatus(Status status) {
        return new Api(status.getCode(), status.getMsg(), null);
    }
}
