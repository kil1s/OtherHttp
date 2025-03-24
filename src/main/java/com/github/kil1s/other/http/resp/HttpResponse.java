package com.github.kil1s.other.http.resp;

import com.github.kil1s.other.http.resp.headers.map.HttpHeaders;
import com.github.kil1s.other.http.resp.status.HttpResponseStatus;

public interface HttpResponse<H extends HttpHeaders<?, ?, ?, ?, ?>> {
    HttpResponseStatus getStatus();
    HttpBody getBody();
    H getHeaders();
}
