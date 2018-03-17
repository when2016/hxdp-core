package com.hxbj.dp.core.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * wang 2018/1/15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tb_login_log")
public class LoginLog implements Serializable {

  @Id
  private String id;
  private String name;
  private String loginName;
  private String ip;
  private Date loginTime;
  private String startTime;
  private String endTime;
  private String browser;
  private String keyWord;

  public LoginLog(String id) {
    this.id = id;
  }

  public LoginLog(String loginName, String name, String ip, String browser) {
    this.loginName = loginName;
    this.name = name;
    this.ip = ip;
    this.browser = browser;
  }

}
