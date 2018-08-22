package com.wcx.exception;

import com.wcx.common.Status;
import lombok.Getter;

/**
 * @author: chuck
 * @Date: 2018/8/22
 * @Time: 10:29
 * @Description: 通用全局异常
 * @modified:
 */
@Getter
public class ScaffoldException extends Exception {
    /**
     * 模块名称
     */
    private String module;

    /**
     * 异常码
     */
    private Integer code;

    /**
     * 返回内容
     */
    private Object data;

    public ScaffoldException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public ScaffoldException(Integer code, String msg, Object data) {
        super(msg);
        this.code = code;
        this.data = data;
    }

    public ScaffoldException(String module, Integer code, String msg, Object data) {
        super(msg);
        this.module = module;
        this.code = code;
        this.data = data;
    }

    public ScaffoldException(Status status) {
        super(status.getMsg());
        this.code = status.getCode();
    }

    public ScaffoldException(Status status, Object data) {
        super(status.getMsg());
        this.code = status.getCode();
        this.data = data;
    }

}
