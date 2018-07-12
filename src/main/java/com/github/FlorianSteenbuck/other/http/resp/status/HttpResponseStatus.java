package com.github.FlorianSteenbuck.other.http.resp.status;

public interface HttpResponseStatus {
    String getMessage();
    boolean isValidStatus();
    Integer getStatus();
    String getOriginalStatus();
}
