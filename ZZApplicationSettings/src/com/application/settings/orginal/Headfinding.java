
package com.application.settings.orginal;




import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Headfinding {

  private String headfindingalgorithmchooser;
  private Headfinder1 headfinder1;
  private Vegaheadfinder vegaheadfinder;


  public String getHeadfindingalgorithmchooser() {
    return headfindingalgorithmchooser;
  }
  
  public void setHeadfindingalgorithmchooser(String headfindingalgorithmchooser) {
    this.headfindingalgorithmchooser = headfindingalgorithmchooser;
  }

  public Headfinder1 getHeadfinder1() {
    return headfinder1;
  }
  
  public void setHeadfinder1(Headfinder1 headfinder1) {
    this.headfinder1 = headfinder1;
  }

  public Vegaheadfinder getVegaheadfinder() {
    return vegaheadfinder;
  }
  
  public void setVegaheadfinder(Vegaheadfinder vegaheadfinder) {
    this.vegaheadfinder = vegaheadfinder;
  }

}
