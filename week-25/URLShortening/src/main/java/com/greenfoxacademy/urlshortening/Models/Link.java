package com.greenfoxacademy.urlshortening.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Link {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long linkId;
  private String url;
  private String alias;
  @JsonIgnore
  private int secretCode;
  private int hitCount;

  public Link() {
  }

  public Link(String url, String alias) {
    this.url = url;
    this.alias = alias;
    this.secretCode = secretCode;
    this.hitCount = 0;
  }

  public void incrementHitCount() {
    hitCount++;
  }

  public long getLinkId() {
    return linkId;
  }

  public void setLinkId(long id) {
    this.linkId = linkId;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public int getSecretCode() {
    return secretCode;
  }

  public void setSecretCode(int secretCode) {
    this.secretCode = secretCode;
  }

  public int getHitCount() {
    return hitCount;
  }

  public void setHitCount(int hitCount) {
    this.hitCount = hitCount;
  }
}
