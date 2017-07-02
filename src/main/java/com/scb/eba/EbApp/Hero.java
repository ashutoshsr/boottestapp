package com.scb.eba.EbApp;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

//@Document(collection = "mydb")
public class Hero {

  private final long id;
  private String name;

  public Hero(long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Hero() {
    this.id = 111111;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  @Override
  public boolean equals(Object obj) {
    return Objects.equal(name, this.name) && Objects.equal(id, this.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.name, this.id);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this).add("id", this.id).add("name", this.name).toString();
  }
}
