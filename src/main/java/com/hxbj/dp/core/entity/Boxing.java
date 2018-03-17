package com.hxbj.dp.core.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * wang 2018/1/24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "t_boxing")
public class Boxing implements Serializable {

  @Id
  private String id;
  private String name;
  private String description;
  private String keyWord;
  private String createTime;
  private String updateTime;
  //排序
  private int sort;

  public Boxing(String id) {
    this.id = id;
  }
}
