package com.github.kil1s.other.http.resp;

import com.github.kil1s.other.http.resp.headers.map.HttpHeaders;

public interface HttpInline<H extends HttpHeaders<?, ?, ?, ?, ?>> extends HttpBody {
    HttpGeneric getBody();
    String getDelimiter();
    H getHeaders();
}
