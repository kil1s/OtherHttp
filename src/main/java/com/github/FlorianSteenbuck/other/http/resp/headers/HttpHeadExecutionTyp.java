package com.github.FlorianSteenbuck.other.http.resp.headers;

public enum HttpHeadExecutionTyp {
    RANGE,
    METHOD,
    FULL_BODY;

    public static HttpHeadExecutionTyp[] defaults() {
        return new HttpHeadExecutionTyp[] {RANGE, METHOD};
    }
}
