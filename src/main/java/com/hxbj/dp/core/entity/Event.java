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
@Document(collection = "t_event")
public class Event implements Serializable {

  @Id
  private String id;
  private String name;
  private String company;
  private String station;
  private String firstTime;
  private String level;
  private String areaName;
  private String areaId;
  private String country;
  private String province;
  private String city;
  private String district;
  private String logoUrl;
  private String info;
  private String keyWord;
  private String createTime;
  private String updateTime;

  public Event(String id) {
    this.id = id;
  }
}
