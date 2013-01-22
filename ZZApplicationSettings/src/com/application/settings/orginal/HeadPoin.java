
package com.application.settings.orginal;




import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeadPoin {

  private String headProperty;
  private Long x;
  private Long y;


  public String getHeadProperty() {
    return headProperty;
  }
  
  public void setHeadProperty(String headProperty) {
    this.headProperty = headProperty;
  }

  public Long getX() {
    return x;
  }
  
  public void setX(Long x) {
    this.x = x;
  }

  public Long getY() {
    return y;
  }
  
  public void setY(Long y) {
    this.y = y;
  }

}
