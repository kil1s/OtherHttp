package com.github.kil1s.other.http.resp.headers;

public enum HttpHeadExecutionTyp {
    RANGE,
    METHOD,
    FULL_BODY;

    public static HttpHeadExecutionTyp[] defaults() {
        return new HttpHeadExecutionTyp[] {RANGE, METHOD};
    }
}
