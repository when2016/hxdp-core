package com.hxbj.dp.core.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * wang 2018/2/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tb_resources")
public class Resources implements Serializable {

  @Id
  private String id;
  private String name;
  private String parentId;
  private String parentName;
  private String btnId;
  private String btnFun;
  private Integer type;
  private String resUrl;
  private String icon;
  private int sort;
  private Integer isValid;
  private Integer layer;

  private List<Resources> nodes = new ArrayList<>();

  private String createTime;

  private String updateTime;

  private String description;

  private String keyWord;

  public Resources(String id) {
    this.id = id;
  }

}
