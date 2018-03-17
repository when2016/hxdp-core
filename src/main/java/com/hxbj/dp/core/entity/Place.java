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
@Document(collection = "t_place")
public class Place implements Serializable {

  @Id
  private String id;
  private String name;
  private String areaName;
  private String areaId;
  private String country;
  private String province;
  private String city;
  private String district;
  private String address;
  private String description;
  private String keyWord;
  private String createTime;
  private String updateTime;
  private String size;

  public Place(String id) {
    this.id = id;
  }
}
