package com.example.springbootissue21626;

public class ChildConfig extends BaseConfig {

  private long longValue;
  private final NestInChild childNest = new NestInChild();

  public long getLongValue() {
    return longValue;
  }

  public void setLongValue(long longValue) {
    this.longValue = longValue;
  }

  public NestInChild getChildNest() {
    return childNest;
  }

  public static class NestInChild {
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
