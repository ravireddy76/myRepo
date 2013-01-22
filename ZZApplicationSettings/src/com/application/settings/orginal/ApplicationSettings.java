package com.application.settings.orginal;




import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationSettings {

  private Imageoccurence imageoccurence;


  public Imageoccurence getImageoccurence() {
    return imageoccurence;
  }
  
  public void setImageoccurence(Imageoccurence imageoccurence) {
    this.imageoccurence = imageoccurence;
  }

}
