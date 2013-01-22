
package com.application.settings.orginal;

import java.util.List;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Facepoints {

  private List<String> requiredfacepoints;


  public List<String> getRequiredfacepoints() {
    return requiredfacepoints;
  }
  
  public void setRequiredfacepoints(List<String> requiredfacepoints) {
    this.requiredfacepoints = requiredfacepoints;
  }

}
