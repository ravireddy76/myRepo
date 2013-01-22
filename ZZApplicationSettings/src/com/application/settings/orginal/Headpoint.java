
package com.application.settings.orginal;

import java.util.List;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Headpoint {

  private List<HeadPoin> headPoint;


  public List<HeadPoin> getHeadPoint() {
    return headPoint;
  }
  
  public void setHeadPoint(List<HeadPoin> headPoint) {
    this.headPoint = headPoint;
  }

}
