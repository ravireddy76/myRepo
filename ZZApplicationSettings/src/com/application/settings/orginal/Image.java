
package com.application.settings.orginal;




import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {

  private String width;
  private String height;
  private String interleave;
  private String channelorder;
  private Long orientation;


  public String getWidth() {
    return width;
  }
  
  public void setWidth(String width) {
    this.width = width;
  }

  public String getHeight() {
    return height;
  }
  
  public void setHeight(String height) {
    this.height = height;
  }

  public String getInterleave() {
    return interleave;
  }
  
  public void setInterleave(String interleave) {
    this.interleave = interleave;
  }

  public String getChannelorder() {
    return channelorder;
  }
  
  public void setChannelorder(String channelorder) {
    this.channelorder = channelorder;
  }

  public Long getOrientation() {
    return orientation;
  }
  
  public void setOrientation(Long orientation) {
    this.orientation = orientation;
  }

}
