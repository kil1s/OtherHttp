package com.github.FlorianSteenbuck.other.http.resp;

import com.github.FlorianSteenbuck.other.http.resp.status.HttpResponseStatus;

public interface HttpResponse {
    HttpResponseStatus getStatus();

}
