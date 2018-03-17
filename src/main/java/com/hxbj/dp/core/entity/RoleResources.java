package com.hxbj.dp.core.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * wang 2018/2/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tb_role_resources")
public class RoleResources implements Serializable {

  @Id
  private String id;
  private String roleId;
  private String resourcesId;
}
