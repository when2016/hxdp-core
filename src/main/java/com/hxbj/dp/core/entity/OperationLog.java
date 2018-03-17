package com.hxbj.dp.core.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * wang 2018/3/2
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tb_operation_log")
public class OperationLog implements Serializable {

  @Id
  private String id;
  private String loginName;
  private String name;
  private String args;
  private String url;
  private String headMethod;
  private String classMethod;
  private String methodName;
  private String ip;
  private String type;
  private String operationDate;
  private Date operationTime;
  private String response;

  public OperationLog(String id) {
    this.id = id;
  }

  public OperationLog(String loginName, String name, String args, String url, String headMethod,
      String classMethod, String methodName, String ip, String type, String operationDate) {
    this.loginName = loginName;
    this.name = name;
    this.args = args;
    this.url = url;
    this.headMethod = headMethod;
    this.classMethod = classMethod;
    this.methodName = methodName;
    this.ip = ip;
    this.type = type;
    this.operationDate = operationDate;
  }

  public OperationLog(String loginName, String name, String response, String type,
      String operationDate) {
    this.loginName = loginName;
    this.name = name;
    this.response = response;
    this.type = type;
    this.operationDate = operationDate;
  }
}
