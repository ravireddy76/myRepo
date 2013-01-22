
package com.application.settings.orginal;




import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fujifilm {

  private String inplane;
  private String outplane;
  private String lockangle;
  private String locksize;
  private String detectmode;
  private String processingmode;
  private Long facesize;
  private Long thresh;
  private Long maxfacenumber;


  public String getInplane() {
    return inplane;
  }
  
  public void setInplane(String inplane) {
    this.inplane = inplane;
  }

  public String getOutplane() {
    return outplane;
  }
  
  public void setOutplane(String outplane) {
    this.outplane = outplane;
  }

  public String getLockangle() {
    return lockangle;
  }
  
  public void setLockangle(String lockangle) {
    this.lockangle = lockangle;
  }

  public String getLocksize() {
    return locksize;
  }
  
  public void setLocksize(String locksize) {
    this.locksize = locksize;
  }

  public String getDetectmode() {
    return detectmode;
  }
  
  public void setDetectmode(String detectmode) {
    this.detectmode = detectmode;
  }

  public String getProcessingmode() {
    return processingmode;
  }
  
  public void setProcessingmode(String processingmode) {
    this.processingmode = processingmode;
  }

  public Long getFacesize() {
    return facesize;
  }
  
  public void setFacesize(Long facesize) {
    this.facesize = facesize;
  }

  public Long getThresh() {
    return thresh;
  }
  
  public void setThresh(Long thresh) {
    this.thresh = thresh;
  }

  public Long getMaxfacenumber() {
    return maxfacenumber;
  }
  
  public void setMaxfacenumber(Long maxfacenumber) {
    this.maxfacenumber = maxfacenumber;
  }

}
