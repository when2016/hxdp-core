package com.hxbj.dp.core.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * wang 2018/2/3
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tb_role")
public class Role implements Serializable {

  @Id
  private String id;
  private String orgId;
  private String name;
  private Integer isValid;
  private String description;
  private String createTime;
  private String updateTime;
  private String keyWord;

  public Role(String id) {
    this.id = id;
  }
}
