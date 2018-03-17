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
@Document(collection = "t_player")
public class Player implements Serializable {

  @Id
  private String id;
  private String name;
  private String englishName;
  private String nickName;
  private String sex;
  private String areaName;
  private String areaId;
  private String country;
  private String province;
  private String city;
  private String district;

  private String year;
  private String month;
  private String day;
  private String birthday;
  //身高
  private String height;
  //体重
  private String weight;
  //臂展
  private String arm;
  //拳种，一对多(每个拳手可以对应多个拳种)
  private String boxingId;
  private String boxingName;
  //量级(公斤级)
  private String kgId;
  private String kgName;
  private String honor;
  private String record;//战绩
  private String description;//战绩描述
  private String clubId;
  private String clubName;
  private String coach;//教练
  private String skills;//技术特点
  private String logoUrl;//个人图片
  private String event;//签约赛事--手工填写
  private String info;//简介
  private String keyWord;//关键字
  private String createTime;
  private String updateTime;

  public Player(String id) {
    this.id = id;
  }
}
