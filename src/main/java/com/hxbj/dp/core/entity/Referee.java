package com.hxbj.dp.core.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * wang 2018/1/25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "t_referee")
public class Referee implements Serializable {

  @Id
  private String id;
  private String name;
  private String sex;
  private String description;
  private String keyWord;
  private String createTime;
  private String updateTime;
  private String logoUrl;//个人图片

  public Referee(String id) {
    this.id = id;
  }
}
