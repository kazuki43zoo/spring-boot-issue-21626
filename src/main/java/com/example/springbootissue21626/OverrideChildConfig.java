package com.example.springbootissue21626;

public class OverrideChildConfig extends BaseConfig {

  private long longValue;
  private final CustomNest nest = new CustomNest();

  public long getLongValue() {
    return longValue;
  }

  public void setLongValue(long longValue) {
    this.longValue = longValue;
  }

  @Override
  public CustomNest getNest() {
    return nest;
  }

  public static class CustomNest extends Nest {
    private long longValue;

    public long getLongValue() {
      return longValue;
    }

    public void setLongValue(long longValue) {
      this.longValue = longValue;
    }
  }


}
