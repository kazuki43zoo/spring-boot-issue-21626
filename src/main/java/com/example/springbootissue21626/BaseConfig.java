package com.example.springbootissue21626;

public class BaseConfig {
  private boolean boolValue;
  private int intValue;
  private final Nest nest = new Nest();

  public boolean isBoolValue() {
    return boolValue;
  }

  public void setBoolValue(boolean boolValue) {
    this.boolValue = boolValue;
  }

  public int getIntValue() {
    return intValue;
  }

  public void setIntValue(int intValue) {
    this.intValue = intValue;
  }

  public Nest getNest() {
    return nest;
  }

  public static class Nest {
    private boolean boolValue;
    private int intValue;

    public boolean isBoolValue() {
      return boolValue;
    }

    public void setBoolValue(boolean boolValue) {
      this.boolValue = boolValue;
    }

    public int getIntValue() {
      return intValue;
    }

    public void setIntValue(int intValue) {
      this.intValue = intValue;
    }
  }

}
