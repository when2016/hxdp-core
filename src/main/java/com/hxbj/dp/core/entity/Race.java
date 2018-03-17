package com.hxbj.dp.core.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * wang 2018/1/29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "t_race")
public class Race implements Serializable {

  @Id
  private String id;
  private String name;
  private String eventId;
  private String eventName;
  private String scheduleId;
  private String scheduleName;
  private String redId;
  private String redName;
  private String redClubId;
  private String redClubName;
  private String redHeight;
  private String redWeight;
  private String redArm;
  private String redAreaId;
  private String redAreaName;

  private String blueId;
  private String blueName;
  private String blueClubId;
  private String blueClubName;
  private String blueHeight;
  private String blueWeight;
  private String blueArm;
  private String blueAreaId;
  private String blueAreaName;

  private String boxingId;
  private String boxingName;
  private String kgId;
  private String kgName;
  //场次
  private int orderId;
  private String result;
  //获胜方式
  private String method;
  private String skills;
  //几分几秒
  private int minute;
  private int second;
  private int duration;//单位分秒
  private String baby;
  private String refereeId;
  private String refereeName;
  private String type;
  private String keyWord;
  private String createTime;
  private String updateTime;
  private String scoreType;
  private String scoreDetail;
  private String roundEndTime;

  public Race(String id) {
    this.id = id;
  }
}
