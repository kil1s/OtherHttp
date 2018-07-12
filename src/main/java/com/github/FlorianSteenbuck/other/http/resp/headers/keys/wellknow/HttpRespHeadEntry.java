package com.github.FlorianSteenbuck.other.http.resp.headers.keys.wellknow;

import com.github.FlorianSteenbuck.other.http.resp.headers.keys.HttpRespHeadKey;
import com.github.FlorianSteenbuck.other.http.resp.headers.keys.HttpRespHeadValue;

public interface HttpRespHeadEntry  {
    String getOriginalName();
    HttpRespHeadKey getKey();
    String getOriginalValue();
    HttpRespHeadValue getValue();
}
