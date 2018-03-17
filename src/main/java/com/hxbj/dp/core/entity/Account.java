package com.hxbj.dp.core.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * wang 2018/2/2
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tb_account")
public class Account implements Serializable {

  @Id
  private String id;
  private String loginName;
  private String password;
  private String salt;
  private String name;
  private String picUrl;
  private String skin;
  private String roleId;
  private String roleName;
  private String email;
  private String description;
  private Integer isValid;
  private String createTime;
  private String updateTime;
  private String keyWord;

  public Account(String id) {
    this.id = id;
  }
}
