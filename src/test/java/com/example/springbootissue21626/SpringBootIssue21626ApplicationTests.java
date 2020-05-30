package com.example.springbootissue21626;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootIssue21626ApplicationTests {


  @Test
  void shouldBindToBaseConfig(@Autowired BaseConfig baseConfig) {
    Assertions.assertThat(baseConfig.getIntValue()).isEqualTo(100);
    Assertions.assertThat(baseConfig.isBoolValue()).isTrue();
    Assertions.assertThat(baseConfig.getNest().getIntValue()).isEqualTo(200);
    Assertions.assertThat(baseConfig.getNest().isBoolValue()).isTrue();
  }

  @Test
  void shouldBindToChildConfig(@Autowired ChildConfig childConfig) {
    Assertions.assertThat(childConfig.getIntValue()).isEqualTo(300);
    Assertions.assertThat(childConfig.isBoolValue()).isTrue();
    Assertions.assertThat(childConfig.getLongValue()).isEqualTo(10000);
    Assertions.assertThat(childConfig.getNest().getIntValue()).isEqualTo(400);
    Assertions.assertThat(childConfig.getNest().isBoolValue()).isTrue();
    Assertions.assertThat(childConfig.getChildNest().getIntValue()).isEqualTo(500);
    Assertions.assertThat(childConfig.getChildNest().isBoolValue()).isTrue();
  }

  @Test
  void shouldBindToOverrideChildConfig(@Autowired OverrideChildConfig overrideChildConfig) {
    Assertions.assertThat(overrideChildConfig.getIntValue()).isEqualTo(600);
    Assertions.assertThat(overrideChildConfig.isBoolValue()).isTrue();
    Assertions.assertThat(overrideChildConfig.getLongValue()).isEqualTo(20000);
    Assertions.assertThat(overrideChildConfig.getNest().getIntValue()).isEqualTo(700);
    Assertions.assertThat(overrideChildConfig.getNest().isBoolValue()).isTrue();
    Assertions.assertThat(overrideChildConfig.getNest().getLongValue()).isEqualTo(30000);
  }

}
