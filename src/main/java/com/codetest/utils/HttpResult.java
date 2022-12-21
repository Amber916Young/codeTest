package com.codetest.utils;
import lombok.Data;

/**
 * HTTP结果封装
 */
@Data
public class HttpResult {

    private int code = 200;
    private String msg;
    private Object data;

    public static HttpResult error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "No exceptions known, please contact administrator");
    }

    public static HttpResult error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static HttpResult error(int code, String msg) {
        HttpResult r = new HttpResult();
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }

    public static HttpResult invalid( String msg) {
        HttpResult r = new HttpResult();
        r.setCode(-1);
        r.setMsg(msg);
        return r;
    }

    public static HttpResult invalid() {
        HttpResult r = new HttpResult();
        r.setCode(-1);
        return r;
    }
    public static HttpResult ok(String msg) {
        HttpResult r = new HttpResult();
        r.setMsg(msg);
        return r;
    }


    public static HttpResult ok(String msg,Object data) {
        HttpResult r = new HttpResult();
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
    public static HttpResult ok(Object data) {
        HttpResult r = new HttpResult();
        r.setData(data);
        return r;
    }

    public static HttpResult ok() {
        return new HttpResult();
    }


}