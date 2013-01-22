
package com.application.settings.orginal;




import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Facergb {

  private String lut;


  public String getLut() {
    return lut;
  }
  
  public void setLut(String lut) {
    this.lut = lut;
  }

}
