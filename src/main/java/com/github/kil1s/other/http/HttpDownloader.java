package com.github.kil1s.other.http;

import com.github.kil1s.other.http.resp.headers.HttpHeadExecutionTyp;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/*
 * Created by Christian Schabesberger on 28.01.16.
 *
 * Copyright (C) Christian Schabesberger 2016 <chris.schabesberger@mailbox.org>
 * HttpDownloader.java is part of NewPipe.
 *
 * NewPipe is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * NewPipe is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with NewPipe.  If not, see <http://www.gnu.org/licenses/>.
 */

public interface HttpDownloader {

    /**
     * Download the text file at the supplied URL as in download(String),
     * but set the HTTP header field "Accept-Language" to the supplied string.
     *
     * @param siteUrl  the URL of the text file to return the contents of
     * @param language the language (usually a 2-character code) to set as the preferred language
     * @return the contents of the specified text file
     * @throws IOException
     */
    String download(String siteUrl, String language, byte[] body) throws IOException;


    /**
     * Download the text file at the supplied URL as in download(String),
     * but set the HTTP header field "Accept-Language" to the supplied string.
     *
     * @param siteUrl  the URL of the text file to return the contents of
     * @param language the language (usually a 2-character code) to set as the preferred language
     * @return the contents of the specified text file
     * @throws IOException
     */
    String download(String siteUrl, String language) throws IOException;

    /**
     * Download the text file at the supplied URL as in download(String),
     * but set the HTTP header field "Accept-Language" to the supplied string.
     *
     * @param siteUrl          the URL of the text file to return the contents of
     * @param customProperties set request header properties
     * @return the contents of the specified text file
     * @throws IOException
     */
    String download(String siteUrl, Map<String, String> customProperties) throws IOException;

    /**
     * Download the text file at the supplied URL as in download(String),
     * but custom body and headers.
     *
     * @param siteUrl          the URL of the text file to return the contents of
     * @param customProperties set request header properties
     * @param body set request body
     * @return the contents of the specified text file
     * @throws IOException
     */
    String download(String siteUrl, Map<String, String> customProperties, byte[] body) throws IOException;


    /**
     * Download (via HTTP) the text file located at the supplied URL, and return its contents.
     * Primarily intended for downloading web pages.
     *
     * @param siteUrl the URL of the text file to download
     * @return the contents of the specified text file
     * @throws IOException
     */
    String download(String siteUrl) throws IOException;

    /**
     * Download (via HTTP) the text file located at the supplied URL, and return its contents.
     * Primarily intended for downloading web pages.
     *
     * @param siteUrl the URL of the text file to download
     * @return the contents of the specified text file
     * @throws IOException
     */
    String download(String siteUrl, byte[] body) throws IOException;

    /**
     * Download the headers at the supplied URL as in download(String),
     * but set the HTTP header field "Accept-Language" to the supplied string.
     *
     * @param siteUrl  the URL of the text file to return the contents of
     * @param language the language (usually a 2-character code) to set as the preferred language
     * @return headers
     * @throws IOException
     */
    Map<String, List<String>> downloadHead(String siteUrl, String language, byte[] body, HttpHeadExecutionTyp...typs) throws IOException;


    /**
     * Download the text file at the supplied URL as in download(String),
     * but set the HTTP header field "Accept-Language" to the supplied string.
     *
     * @param siteUrl  the URL of the text file to return the contents of
     * @param language the language (usually a 2-character code) to set as the preferred language
     * @return the contents of the specified text file
     * @throws IOException
     */
    Map<String, List<String>> downloadHead(String siteUrl, String language, HttpHeadExecutionTyp...typs) throws IOException;

    /**
     * Download the headers at the supplied URL as in download(String),
     * but set the HTTP header field "Accept-Language" to the supplied string.
     *
     * @param siteUrl          the URL of the text file to return the contents of
     * @param customProperties set request header properties
     * @return headers
     * @throws IOException
     */
    Map<String, List<String>> downloadHead(String siteUrl, Map<String, String> customProperties, HttpHeadExecutionTyp...typs) throws IOException;

    /**
     * Download the headers at the supplied URL as in download(String),
     * but custom body and headers.
     *
     * @param siteUrl          the URL of the text file to return the contents of
     * @param customProperties set request header properties
     * @param body set request body
     * @return headers
     * @throws IOException
     */
    Map<String, List<String>> downloadHead(String siteUrl, Map<String, String> customProperties, byte[] body, HttpHeadExecutionTyp...typs) throws IOException;


    /**
     * Download (via HTTP) the headers located at the supplied URL, and return its contents.
     * Primarily intended for downloading web pages.
     *
     * @param siteUrl the URL of the text file to download
     * @return headers
     * @throws IOException
     */
    Map<String, List<String>> downloadHead(String siteUrl, HttpHeadExecutionTyp...typs) throws IOException;

    /**
     * Download (via HTTP) the headers located at the supplied URL, and return its contents.
     * Primarily intended for downloading web pages.
     *
     * @param siteUrl the URL of the text file to download
     * @return headers
     * @throws IOException
     */
    Map<String, List<String>> downloadHead(String siteUrl, byte[] body, HttpHeadExecutionTyp...typs) throws IOException;
}