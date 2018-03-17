package com.hxbj.dp.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * wang 2018/2/26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataDictItem {

  private String dictId;//字典id值(DataDict)
  private String value;//字典value值(组合主键)
  private String name;//字典名字
  private int sort;//排序

  public DataDictItem(String value, String name) {
    this.value = value;
    this.name = name;
  }

}
