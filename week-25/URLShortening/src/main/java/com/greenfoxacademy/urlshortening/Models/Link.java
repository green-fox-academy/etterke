package com.greenfoxacademy.urlshortening.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Link {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String url;
  private String alias;
  private int secretCode;
  private int hitCount;

  public Link() {
  }

  public Link(long id, String url, String alias, int secretCode, int hitCount) {
    this.id = id;
    this.url = url;
    this.alias = alias;
    this.secretCode = generateSecretCode();
    this.hitCount = hitCount;
  }

  public int generateSecretCode(){
    int secretCode = (int) (Math.random() * 9000 + 1000);
    return secretCode;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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
