
package com.application.settings.orginal;




import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by json2pojo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cyptometrics {

  private Long miniumeyedistanceinpixels;
  private Long maximumeyedistanceinpixels;
  private Long numberoffacestofind;
  private String biodetector;
  private Double minimumfaceonlyconfidence;
  private Long minimumfacefeatconfidence;
  private Headtiltsearch headtiltsearch;
  private String headturnsearch;
  private Long detectone;
  private Facepoints facepoints;
  private String facescans;
  private String featscans;
  private Long accuracy;
  private Long eyeprecision;
  private String borders;
  private Long extendedlm;
  private Long initscale;
  private Long debugprint;
  private Long landmarkscale;
  private Long minimumfacevariance;
  private Long findportrait;
  private Long usemirrored;
  private Long boxdetect;
  private Long filter;


  public Long getMiniumeyedistanceinpixels() {
    return miniumeyedistanceinpixels;
  }
  
  public void setMiniumeyedistanceinpixels(Long miniumeyedistanceinpixels) {
    this.miniumeyedistanceinpixels = miniumeyedistanceinpixels;
  }

  public Long getMaximumeyedistanceinpixels() {
    return maximumeyedistanceinpixels;
  }
  
  public void setMaximumeyedistanceinpixels(Long maximumeyedistanceinpixels) {
    this.maximumeyedistanceinpixels = maximumeyedistanceinpixels;
  }

  public Long getNumberoffacestofind() {
    return numberoffacestofind;
  }
  
  public void setNumberoffacestofind(Long numberoffacestofind) {
    this.numberoffacestofind = numberoffacestofind;
  }

  public String getBiodetector() {
    return biodetector;
  }
  
  public void setBiodetector(String biodetector) {
    this.biodetector = biodetector;
  }

  public Double getMinimumfaceonlyconfidence() {
    return minimumfaceonlyconfidence;
  }
  
  public void setMinimumfaceonlyconfidence(Double minimumfaceonlyconfidence) {
    this.minimumfaceonlyconfidence = minimumfaceonlyconfidence;
  }

  public Long getMinimumfacefeatconfidence() {
    return minimumfacefeatconfidence;
  }
  
  public void setMinimumfacefeatconfidence(Long minimumfacefeatconfidence) {
    this.minimumfacefeatconfidence = minimumfacefeatconfidence;
  }

  public Headtiltsearch getHeadtiltsearch() {
    return headtiltsearch;
  }
  
  public void setHeadtiltsearch(Headtiltsearch headtiltsearch) {
    this.headtiltsearch = headtiltsearch;
  }

  public String getHeadturnsearch() {
    return headturnsearch;
  }
  
  public void setHeadturnsearch(String headturnsearch) {
    this.headturnsearch = headturnsearch;
  }

  public Long getDetectone() {
    return detectone;
  }
  
  public void setDetectone(Long detectone) {
    this.detectone = detectone;
  }

  public Facepoints getFacepoints() {
    return facepoints;
  }
  
  public void setFacepoints(Facepoints facepoints) {
    this.facepoints = facepoints;
  }

  public String getFacescans() {
    return facescans;
  }
  
  public void setFacescans(String facescans) {
    this.facescans = facescans;
  }

  public String getFeatscans() {
    return featscans;
  }
  
  public void setFeatscans(String featscans) {
    this.featscans = featscans;
  }

  public Long getAccuracy() {
    return accuracy;
  }
  
  public void setAccuracy(Long accuracy) {
    this.accuracy = accuracy;
  }

  public Long getEyeprecision() {
    return eyeprecision;
  }
  
  public void setEyeprecision(Long eyeprecision) {
    this.eyeprecision = eyeprecision;
  }

  public String getBorders() {
    return borders;
  }
  
  public void setBorders(String borders) {
    this.borders = borders;
  }

  public Long getExtendedlm() {
    return extendedlm;
  }
  
  public void setExtendedlm(Long extendedlm) {
    this.extendedlm = extendedlm;
  }

  public Long getInitscale() {
    return initscale;
  }
  
  public void setInitscale(Long initscale) {
    this.initscale = initscale;
  }

  public Long getDebugprint() {
    return debugprint;
  }
  
  public void setDebugprint(Long debugprint) {
    this.debugprint = debugprint;
  }

  public Long getLandmarkscale() {
    return landmarkscale;
  }
  
  public void setLandmarkscale(Long landmarkscale) {
    this.landmarkscale = landmarkscale;
  }

  public Long getMinimumfacevariance() {
    return minimumfacevariance;
  }
  
  public void setMinimumfacevariance(Long minimumfacevariance) {
    this.minimumfacevariance = minimumfacevariance;
  }

  public Long getFindportrait() {
    return findportrait;
  }
  
  public void setFindportrait(Long findportrait) {
    this.findportrait = findportrait;
  }

  public Long getUsemirrored() {
    return usemirrored;
  }
  
  public void setUsemirrored(Long usemirrored) {
    this.usemirrored = usemirrored;
  }

  public Long getBoxdetect() {
    return boxdetect;
  }
  
  public void setBoxdetect(Long boxdetect) {
    this.boxdetect = boxdetect;
  }

  public Long getFilter() {
    return filter;
  }
  
  public void setFilter(Long filter) {
    this.filter = filter;
  }

}
