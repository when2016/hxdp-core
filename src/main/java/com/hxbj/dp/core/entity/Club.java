package com.hxbj.dp.core.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * wang 2018/1/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "t_club")
public class Club implements Serializable {

  @Id
  private String id;
  private String name;
  private String founder;
  private String createTime;
  private String starCoach;
  private String starPlayer;
  private String honor;
  private String areaName;
  private String areaId;
  private String country;
  private String province;
  private String city;
  private String district;
  private String address;
  private String phone;
  private String englishName;
  private String abbrName;
  private String email;
  private String logoUrl;
  private String info;
  private String keyWord;
  private String coachName;
  private String playerName;
  //培训项目：培训项目：（实际是拳种，名字显示培训项目），可多选，展示在列表中
  private String boxingId;
  private String boxingName;
  private String savePath;

  public Club(String id) {
    this.id = id;
  }
}
