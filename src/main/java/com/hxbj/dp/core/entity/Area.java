package com.hxbj.dp.core.entity;

import java.io.Serializable;
import java.util.Date;
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
@Document(collection = "t_area")
public class Area implements Serializable {

  @Id
  private String id;
  private String codeId;
  private String parentId;
  private String name;
  private String logo;
  private String description;
  private Date createTime;
  private Date updateTime;
}
