
package com.application.settings.orginal;




import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Chinfinding {

  private String chinfindingalgorithmchooser;
  private Chinfinder1 chinfinder1;


  public String getChinfindingalgorithmchooser() {
    return chinfindingalgorithmchooser;
  }
  
  public void setChinfindingalgorithmchooser(String chinfindingalgorithmchooser) {
    this.chinfindingalgorithmchooser = chinfindingalgorithmchooser;
  }

  public Chinfinder1 getChinfinder1() {
    return chinfinder1;
  }
  
  public void setChinfinder1(Chinfinder1 chinfinder1) {
    this.chinfinder1 = chinfinder1;
  }

}
