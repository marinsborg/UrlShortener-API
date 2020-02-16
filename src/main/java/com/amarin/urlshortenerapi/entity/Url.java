package com.amarin.urlshortenerapi.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "url")
public class Url {

    private long id;
    private String longUrl;
    private Date createdDate;
    private Date expiresDate;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    @Column(nullable = false)
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getExpiresDate() {
        return expiresDate;
    }

    public void setExpiresDate(Date expireDate) {
        this.expiresDate = expireDate;
    }
}
