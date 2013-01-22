
package com.application.settings.orginal;

import java.util.List;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Headtiltsearch {

  private List<Long> headtiltsearchcriteriaindegrees;


  public List<Long> getHeadtiltsearchcriteriaindegrees() {
    return headtiltsearchcriteriaindegrees;
  }
  
  public void setHeadtiltsearchcriteriaindegrees(List<Long> headtiltsearchcriteriaindegrees) {
    this.headtiltsearchcriteriaindegrees = headtiltsearchcriteriaindegrees;
  }

}
