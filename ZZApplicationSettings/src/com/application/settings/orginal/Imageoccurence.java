
package com.application.settings.orginal;

import java.util.List;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Imageoccurence {

  private Image image;
  private Facecolor facecolor;
  private Facefinding facefinding;
  private Chinfinding chinfinding;
  private Headfinding headfinding;
  private String measurefacechroma;
  private String findhead;
  private List<Headpoint> headpoints;
  private String findimageoffedge;


  public Image getImage() {
    return image;
  }
  
  public void setImage(Image image) {
    this.image = image;
  }

  public Facecolor getFacecolor() {
    return facecolor;
  }
  
  public void setFacecolor(Facecolor facecolor) {
    this.facecolor = facecolor;
  }

  public Facefinding getFacefinding() {
    return facefinding;
  }
  
  public void setFacefinding(Facefinding facefinding) {
    this.facefinding = facefinding;
  }

  public Chinfinding getChinfinding() {
    return chinfinding;
  }
  
  public void setChinfinding(Chinfinding chinfinding) {
    this.chinfinding = chinfinding;
  }

  public Headfinding getHeadfinding() {
    return headfinding;
  }
  
  public void setHeadfinding(Headfinding headfinding) {
    this.headfinding = headfinding;
  }

  public String getMeasurefacechroma() {
    return measurefacechroma;
  }
  
  public void setMeasurefacechroma(String measurefacechroma) {
    this.measurefacechroma = measurefacechroma;
  }

  public String getFindhead() {
    return findhead;
  }
  
  public void setFindhead(String findhead) {
    this.findhead = findhead;
  }

  public List<Headpoint> getHeadpoints() {
    return headpoints;
  }
  
  public void setHeadpoints(List<Headpoint> headpoints) {
    this.headpoints = headpoints;
  }

  public String getFindimageoffedge() {
    return findimageoffedge;
  }
  
  public void setFindimageoffedge(String findimageoffedge) {
    this.findimageoffedge = findimageoffedge;
  }

}
