package com.hxbj.dp.core.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * wang 2018/2/26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataDict {

  private String id;//主键
  private String dataKey;//字典key值
  private String name;
  private Integer isValid;
  private String description;
  private List<DataDictItem> items = new ArrayList<>();

  public DataDict(String dataKey, String name) {
    this.dataKey = dataKey;
    this.name = name;
  }
}
