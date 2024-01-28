package com.dubbo.user.exception;


/**
 * 用户信息异常类
 *
 * @author yuke
 */
public class UserException extends BaseException {

    public UserException(String code, Object... args) {
        super("user", code, args, null);
    }
}
