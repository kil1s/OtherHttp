package com.github.kil1s.other.http.resp.status;

public interface HttpResponseStatus {
    String getMessage();
    boolean isValidStatus();
    Integer getStatus();
    String getOriginalStatus();
}
