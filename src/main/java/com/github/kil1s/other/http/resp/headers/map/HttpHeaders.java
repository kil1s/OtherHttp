package com.github.kil1s.other.http.resp.headers.map;

import com.github.kil1s.other.http.map.HttpMap;
import com.github.kil1s.other.http.resp.headers.keys.HttpRespHeadKey;
import com.github.kil1s.other.http.resp.headers.keys.wellknow.HttpRespHeadEntry;
import com.github.kil1s.other.http.resp.headers.keys.wellknow.HttpRespUnknownHeadEntry;

public interface HttpHeaders<
    K extends HttpRespHeadKey,
    V extends HttpRespHeadEntry,
    U extends HttpRespUnknownHeadEntry,
    H extends HttpHeader<V, U>,
    S extends Iterable
> extends HttpMap<K, H, H, S, H> {
}
