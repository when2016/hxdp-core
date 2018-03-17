package com.hxbj.dp.core.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * wang 2018/1/26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "t_schedule")
public class Schedule implements Serializable {

  @Id
  private String id;
  private String name;
  private String subject;
  private String eventId;//赛事id
  private String eventName;//赛事名称
  private String areaName;
  private String areaId;
  private String country;
  private String province;
  private String city;
  private String district;
  private String duration;//持续天数
  private String placeId;//场馆id
  private String placeName;//场馆名称
  //直播时间变更为开始时间
  private String liveTime;
  private String liveType;//直播类型(网络直播、电视直播、同时直播)
  private String keyWord;
  private String createTime;
  private String updateTime;
  private String mc;
  private String narrator;

  public Schedule(String id) {
    this.id = id;
  }
}
