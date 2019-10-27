package com.github.alexey1gavrilov.jdbitest;

import java.math.BigDecimal;
import java.util.UUID;

public class Bean {
  private long id;

  private String string1;
  private String string2;
  private String string3;
  private String string4;
  private String string5;
  private String string6;
  private String string7;
  private String string8;

  private long long1;
  private long long2;
  private long long3;
  private long long4;
  private long long5;
  private long long6;
  private long long7;
  private long long8;

  private BigDecimal decimal1;
  private BigDecimal decimal2;
  private BigDecimal decimal3;
  private BigDecimal decimal4;
  private BigDecimal decimal5;
  private BigDecimal decimal6;
  private BigDecimal decimal7;
  private BigDecimal decimal8;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getString1() {
    return string1;
  }

  public void setString1(String string1) {
    this.string1 = string1;
  }

  public String getString2() {
    return string2;
  }

  public void setString2(String string2) {
    this.string2 = string2;
  }

  public String getString3() {
    return string3;
  }

  public void setString3(String string3) {
    this.string3 = string3;
  }

  public String getString4() {
    return string4;
  }

  public void setString4(String string4) {
    this.string4 = string4;
  }

  public String getString5() {
    return string5;
  }

  public void setString5(String string5) {
    this.string5 = string5;
  }

  public String getString6() {
    return string6;
  }

  public void setString6(String string6) {
    this.string6 = string6;
  }

  public String getString7() {
    return string7;
  }

  public void setString7(String string7) {
    this.string7 = string7;
  }

  public String getString8() {
    return string8;
  }

  public void setString8(String string8) {
    this.string8 = string8;
  }

  public long getLong1() {
    return long1;
  }

  public void setLong1(long long1) {
    this.long1 = long1;
  }

  public long getLong2() {
    return long2;
  }

  public void setLong2(long long2) {
    this.long2 = long2;
  }

  public long getLong3() {
    return long3;
  }

  public void setLong3(long long3) {
    this.long3 = long3;
  }

  public long getLong4() {
    return long4;
  }

  public void setLong4(long long4) {
    this.long4 = long4;
  }

  public long getLong5() {
    return long5;
  }

  public void setLong5(long long5) {
    this.long5 = long5;
  }

  public long getLong6() {
    return long6;
  }

  public void setLong6(long long6) {
    this.long6 = long6;
  }

  public long getLong7() {
    return long7;
  }

  public void setLong7(long long7) {
    this.long7 = long7;
  }

  public long getLong8() {
    return long8;
  }

  public void setLong8(long long8) {
    this.long8 = long8;
  }

  public BigDecimal getDecimal1() {
    return decimal1;
  }

  public void setDecimal1(BigDecimal decimal1) {
    this.decimal1 = decimal1;
  }

  public BigDecimal getDecimal2() {
    return decimal2;
  }

  public void setDecimal2(BigDecimal decimal2) {
    this.decimal2 = decimal2;
  }

  public BigDecimal getDecimal3() {
    return decimal3;
  }

  public void setDecimal3(BigDecimal decimal3) {
    this.decimal3 = decimal3;
  }

  public BigDecimal getDecimal4() {
    return decimal4;
  }

  public void setDecimal4(BigDecimal decimal4) {
    this.decimal4 = decimal4;
  }

  public BigDecimal getDecimal5() {
    return decimal5;
  }

  public void setDecimal5(BigDecimal decimal5) {
    this.decimal5 = decimal5;
  }

  public BigDecimal getDecimal6() {
    return decimal6;
  }

  public void setDecimal6(BigDecimal decimal6) {
    this.decimal6 = decimal6;
  }

  public BigDecimal getDecimal7() {
    return decimal7;
  }

  public void setDecimal7(BigDecimal decimal7) {
    this.decimal7 = decimal7;
  }

  public BigDecimal getDecimal8() {
    return decimal8;
  }

  public void setDecimal8(BigDecimal decimal8) {
    this.decimal8 = decimal8;
  }

  @Override
  public String toString() {
    return "Bean1{" +
        "id=" + id +
        ", string1='" + string1 + '\'' +
        ", string2='" + string2 + '\'' +
        ", string3='" + string3 + '\'' +
        ", string4='" + string4 + '\'' +
        ", string5='" + string5 + '\'' +
        ", string6='" + string6 + '\'' +
        ", string7='" + string7 + '\'' +
        ", string8='" + string8 + '\'' +
        ", long1=" + long1 +
        ", long2=" + long2 +
        ", long3=" + long3 +
        ", long4=" + long4 +
        ", long5=" + long5 +
        ", long6=" + long6 +
        ", long7=" + long7 +
        ", long8=" + long8 +
        ", decimal1=" + decimal1 +
        ", decimal2=" + decimal2 +
        ", decimal3=" + decimal3 +
        ", decimal4=" + decimal4 +
        ", decimal5=" + decimal5 +
        ", decimal6=" + decimal6 +
        ", decimal7=" + decimal7 +
        ", decimal8=" + decimal8 +
        '}';
  }

  static Bean create() {
    final Bean bean = new Bean();

    bean.setString1(UUID.randomUUID().toString());
    bean.setString2(UUID.randomUUID().toString());
    bean.setString3(UUID.randomUUID().toString());
    bean.setString4(UUID.randomUUID().toString());
    bean.setString5(UUID.randomUUID().toString());
    bean.setString6(UUID.randomUUID().toString());
    bean.setString7(UUID.randomUUID().toString());
    bean.setString8(UUID.randomUUID().toString());

    bean.setLong1(UUID.randomUUID().getLeastSignificantBits());
    bean.setLong2(UUID.randomUUID().getLeastSignificantBits());
    bean.setLong3(UUID.randomUUID().getLeastSignificantBits());
    bean.setLong4(UUID.randomUUID().getLeastSignificantBits());
    bean.setLong5(UUID.randomUUID().getLeastSignificantBits());
    bean.setLong6(UUID.randomUUID().getLeastSignificantBits());
    bean.setLong7(UUID.randomUUID().getLeastSignificantBits());
    bean.setLong8(UUID.randomUUID().getLeastSignificantBits());

    bean.setDecimal1(BigDecimal.TEN);
    bean.setDecimal2(BigDecimal.TEN);
    bean.setDecimal3(BigDecimal.TEN);
    bean.setDecimal4(BigDecimal.TEN);
    bean.setDecimal5(BigDecimal.TEN);
    bean.setDecimal6(BigDecimal.TEN);
    bean.setDecimal7(BigDecimal.TEN);
    bean.setDecimal8(BigDecimal.TEN);

    return bean;
  }
}
