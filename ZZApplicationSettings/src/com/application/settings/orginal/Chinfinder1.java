
package com.application.settings.orginal;




import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Chinfinder1 {

  private Long searchrange;
  private Long searchincrements;
  private Long chinmapheight;
  private Long chinmapwidth;
  private Long weightdeviation;
  private Long searchboxheight;
  private Long searchboxwidth;
  private Long maxslope;
  private Double minslope;
  private Long calculateattributeslightpercentile;
  private Long calculateattributesdarkpercentile;
  private Long mineyechinratio;
  private Long maxeyechinratio;


  public Long getSearchrange() {
    return searchrange;
  }
  
  public void setSearchrange(Long searchrange) {
    this.searchrange = searchrange;
  }

  public Long getSearchincrements() {
    return searchincrements;
  }
  
  public void setSearchincrements(Long searchincrements) {
    this.searchincrements = searchincrements;
  }

  public Long getChinmapheight() {
    return chinmapheight;
  }
  
  public void setChinmapheight(Long chinmapheight) {
    this.chinmapheight = chinmapheight;
  }

  public Long getChinmapwidth() {
    return chinmapwidth;
  }
  
  public void setChinmapwidth(Long chinmapwidth) {
    this.chinmapwidth = chinmapwidth;
  }

  public Long getWeightdeviation() {
    return weightdeviation;
  }
  
  public void setWeightdeviation(Long weightdeviation) {
    this.weightdeviation = weightdeviation;
  }

  public Long getSearchboxheight() {
    return searchboxheight;
  }
  
  public void setSearchboxheight(Long searchboxheight) {
    this.searchboxheight = searchboxheight;
  }

  public Long getSearchboxwidth() {
    return searchboxwidth;
  }
  
  public void setSearchboxwidth(Long searchboxwidth) {
    this.searchboxwidth = searchboxwidth;
  }

  public Long getMaxslope() {
    return maxslope;
  }
  
  public void setMaxslope(Long maxslope) {
    this.maxslope = maxslope;
  }

  public Double getMinslope() {
    return minslope;
  }
  
  public void setMinslope(Double minslope) {
    this.minslope = minslope;
  }

  public Long getCalculateattributeslightpercentile() {
    return calculateattributeslightpercentile;
  }
  
  public void setCalculateattributeslightpercentile(Long calculateattributeslightpercentile) {
    this.calculateattributeslightpercentile = calculateattributeslightpercentile;
  }

  public Long getCalculateattributesdarkpercentile() {
    return calculateattributesdarkpercentile;
  }
  
  public void setCalculateattributesdarkpercentile(Long calculateattributesdarkpercentile) {
    this.calculateattributesdarkpercentile = calculateattributesdarkpercentile;
  }

  public Long getMineyechinratio() {
    return mineyechinratio;
  }
  
  public void setMineyechinratio(Long mineyechinratio) {
    this.mineyechinratio = mineyechinratio;
  }

  public Long getMaxeyechinratio() {
    return maxeyechinratio;
  }
  
  public void setMaxeyechinratio(Long maxeyechinratio) {
    this.maxeyechinratio = maxeyechinratio;
  }

}
