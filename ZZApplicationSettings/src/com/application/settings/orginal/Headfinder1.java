
package com.application.settings.orginal;




import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Headfinder1 {

  private Long sampledivisor;
  private Long filtersize;
  private Long numchromadeviations;
  private Long brightnessdarkdeviations;
  private Long minfilterratio;
  private Long outersidefactor;
  private Long outertopfactor;
  private Long minchromadeviation;


  public Long getSampledivisor() {
    return sampledivisor;
  }
  
  public void setSampledivisor(Long sampledivisor) {
    this.sampledivisor = sampledivisor;
  }

  public Long getFiltersize() {
    return filtersize;
  }
  
  public void setFiltersize(Long filtersize) {
    this.filtersize = filtersize;
  }

  public Long getNumchromadeviations() {
    return numchromadeviations;
  }
  
  public void setNumchromadeviations(Long numchromadeviations) {
    this.numchromadeviations = numchromadeviations;
  }

  public Long getBrightnessdarkdeviations() {
    return brightnessdarkdeviations;
  }
  
  public void setBrightnessdarkdeviations(Long brightnessdarkdeviations) {
    this.brightnessdarkdeviations = brightnessdarkdeviations;
  }

  public Long getMinfilterratio() {
    return minfilterratio;
  }
  
  public void setMinfilterratio(Long minfilterratio) {
    this.minfilterratio = minfilterratio;
  }

  public Long getOutersidefactor() {
    return outersidefactor;
  }
  
  public void setOutersidefactor(Long outersidefactor) {
    this.outersidefactor = outersidefactor;
  }

  public Long getOutertopfactor() {
    return outertopfactor;
  }
  
  public void setOutertopfactor(Long outertopfactor) {
    this.outertopfactor = outertopfactor;
  }

  public Long getMinchromadeviation() {
    return minchromadeviation;
  }
  
  public void setMinchromadeviation(Long minchromadeviation) {
    this.minchromadeviation = minchromadeviation;
  }

}
