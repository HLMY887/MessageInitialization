package xyz.hlmy.constant;

/**
 * @author 信息枚举
 */
public enum RC {

    SUCCESS(200),

    FAIL(400),


    ABNORMAL(500),
    ;

    private final int code;

    RC(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
