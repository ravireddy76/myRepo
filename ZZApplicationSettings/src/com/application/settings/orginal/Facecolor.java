
package com.application.settings.orginal;




import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Facecolor {

  private String facecoloralgorithm;
  private Facergb facergb;


  public String getFacecoloralgorithm() {
    return facecoloralgorithm;
  }
  
  public void setFacecoloralgorithm(String facecoloralgorithm) {
    this.facecoloralgorithm = facecoloralgorithm;
  }

  public Facergb getFacergb() {
    return facergb;
  }
  
  public void setFacergb(Facergb facergb) {
    this.facergb = facergb;
  }

}
