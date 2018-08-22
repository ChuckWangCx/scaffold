package com.wcx.common;

import lombok.Getter;

/**
 * @author: chuck
 * @Date: 2018/8/22
 * @Time: 10:42
 * @Description: 状态码枚举
 * @modified:
 */
@Getter
public enum Status {
    /**
     * 成功
     */
    SUCCESS(200, "成功"),

    /**
     * 请求错误
     */
    BAD_REQUEST(400, "请求错误"),

    /**
     * 尚未登录
     */
    UNAUTHORIZED(401, "尚未登录"),

    /**
     * 权限不够
     */
    FORBIDDEN(403, "权限不够"),

    /**
     * 请求不存在
     */
    REQUEST_NOT_FOUND(404, "请求不存在"),

    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500, "服务器内部错误"),

    /**
     * 登录失败
     */
    LOGIN_ERROR(50000, "登录失败");

    private Integer code;
    private String msg;

    Status(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
