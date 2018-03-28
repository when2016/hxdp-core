package com.hxbj.dp.core.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * wang 2018/1/31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "t_strike")
public class Strike implements Serializable {

  @Id
  private String id;
  private String dataType;
  private String playerId;
  private String playerName;
  private String eventId;
  private String scheduleId;
  private String raceId;
  private int round;

  //第几分几秒
  private int minute;
  private int second;
  //击打时序第多少秒
  private int ordinal;
  private String actionCode;
  private String actionName;
  private int isValid;
  //时长(秒)
  private int duration;
  private String keyWord;
  private String createTime;
  private String updateTime;

  //api接口使用
  private int valid;
  private int invalid;
  private String method;
  private int thump;

  public Strike(String id) {
    this.id = id;
  }

  public Strike(String actionCode, int round, int isValid, String dataType) {
    this.actionCode = actionCode;
    this.round = round;
    this.isValid = isValid;
    this.dataType = dataType;
  }

  public Strike(String actionCode, int round, int isValid, int ordinal, int duration,
      String dataType) {
    this.actionCode = actionCode;
    this.round = round;
    this.isValid = isValid;
    this.ordinal = ordinal;
    this.duration = duration;
    this.dataType = dataType;
  }


  public Strike(String actionCode, int round, int isValid, int ordinal, int minute, int second,
      int duration,
      String dataType, String playerName, String playerId,
      String eventId, String scheduleId, String raceId) {
    this.actionCode = actionCode;
    this.round = round;
    this.isValid = isValid;
    this.ordinal = ordinal;
    this.duration = duration;
    this.dataType = dataType;
    this.playerName = playerName;
    this.playerId = playerId;
    this.eventId = eventId;
    this.scheduleId = scheduleId;
    this.raceId = raceId;
    this.minute = minute;
    this.second = second;
  }


}
