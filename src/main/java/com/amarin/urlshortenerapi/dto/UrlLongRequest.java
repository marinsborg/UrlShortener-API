package com.amarin.urlshortenerapi.dto;

import java.util.Date;

public class UrlLongRequest {

    private String longUrl;
    private Date expiresDate;

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public Date getExpiresDate() {
        return expiresDate;
    }

    public void setExpiresDate(Date expiresDate) {
        this.expiresDate = expiresDate;
    }
}
