package com.dailuobo.ic.api.enums;

import org.springframework.util.StringUtils;

/**
 * CommonStatusEnum
 *
 * @author <a href="mailto:zhangchengdong@mallcai.com">张成栋</a>
 * @date 2019-08-20 10:30<br/>
 */
public enum CommonStatus {
    ENABLE(1, "启用"),
    DISABLE(0, "停用"),
    BANNED(-1, "禁用");

    public int getValue() {
        return value;
    }

    public String getDescribe() {
        return describe;
    }

    private final int value;
    private final String describe;

    CommonStatus(int value, String describe) {
        this.value = value;
        this.describe = describe;
    }

    public static CommonStatus fromName(String name) {
        return fromName(name, null);
    }

    public static CommonStatus fromName(String name, CommonStatus defaultValue) {
        if (StringUtils.isEmpty(name)) {
            return defaultValue;
        }
        for (CommonStatus t : CommonStatus.values()) {
            if (name.equalsIgnoreCase(t.name())) {
                return t;
            }
        }
        return defaultValue;
    }
}
