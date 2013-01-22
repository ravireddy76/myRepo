
package com.application.settings.orginal;




import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Facefinding {

  private String facefindingalgorithmchooser;
  private Cyptometrics cyptometrics;
  private Fujifilm fujifilm;


  public String getFacefindingalgorithmchooser() {
    return facefindingalgorithmchooser;
  }
  
  public void setFacefindingalgorithmchooser(String facefindingalgorithmchooser) {
    this.facefindingalgorithmchooser = facefindingalgorithmchooser;
  }

  public Cyptometrics getCyptometrics() {
    return cyptometrics;
  }
  
  public void setCyptometrics(Cyptometrics cyptometrics) {
    this.cyptometrics = cyptometrics;
  }

  public Fujifilm getFujifilm() {
    return fujifilm;
  }
  
  public void setFujifilm(Fujifilm fujifilm) {
    this.fujifilm = fujifilm;
  }

}
