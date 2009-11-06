

/* First created by JCasGen Fri Nov 06 23:49:06 CET 2009 */
package org.apache.uima.alchemy.ts.entity;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Fri Nov 06 23:49:06 CET 2009
 * XML source: /Users/tommaso/Documents/workspaces/uima_ws/alchemy-annotator/src/main/resources/TextRankedEntityExtractionAEDescriptor.xml
 * @generated */
public class NaturalDisaster extends TOP {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(NaturalDisaster.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NaturalDisaster() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NaturalDisaster(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NaturalDisaster(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets 
   * @generated */
  public String getText() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets  
   * @generated */
  public void setText(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_text, v);}    
   
    
  //*--------------*
  //* Feature: relevance

  /** getter for relevance - gets 
   * @generated */
  public String getRelevance() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_relevance == null)
      jcasType.jcas.throwFeatMissing("relevance", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_relevance);}
    
  /** setter for relevance - sets  
   * @generated */
  public void setRelevance(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_relevance == null)
      jcasType.jcas.throwFeatMissing("relevance", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_relevance, v);}    
   
    
  //*--------------*
  //* Feature: count

  /** getter for count - gets 
   * @generated */
  public String getCount() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_count == null)
      jcasType.jcas.throwFeatMissing("count", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_count);}
    
  /** setter for count - sets  
   * @generated */
  public void setCount(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_count == null)
      jcasType.jcas.throwFeatMissing("count", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_count, v);}    
   
    
  //*--------------*
  //* Feature: disambiguation

  /** getter for disambiguation - gets 
   * @generated */
  public String getDisambiguation() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_disambiguation == null)
      jcasType.jcas.throwFeatMissing("disambiguation", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_disambiguation);}
    
  /** setter for disambiguation - sets  
   * @generated */
  public void setDisambiguation(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_disambiguation == null)
      jcasType.jcas.throwFeatMissing("disambiguation", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_disambiguation, v);}    
   
    
  //*--------------*
  //* Feature: subType

  /** getter for subType - gets 
   * @generated */
  public String getSubType() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_subType == null)
      jcasType.jcas.throwFeatMissing("subType", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_subType);}
    
  /** setter for subType - sets  
   * @generated */
  public void setSubType(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_subType == null)
      jcasType.jcas.throwFeatMissing("subType", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_subType, v);}    
   
    
  //*--------------*
  //* Feature: website

  /** getter for website - gets 
   * @generated */
  public String getWebsite() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_website == null)
      jcasType.jcas.throwFeatMissing("website", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_website);}
    
  /** setter for website - sets  
   * @generated */
  public void setWebsite(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_website == null)
      jcasType.jcas.throwFeatMissing("website", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_website, v);}    
   
    
  //*--------------*
  //* Feature: geo

  /** getter for geo - gets 
   * @generated */
  public String getGeo() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_geo == null)
      jcasType.jcas.throwFeatMissing("geo", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_geo);}
    
  /** setter for geo - sets  
   * @generated */
  public void setGeo(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_geo == null)
      jcasType.jcas.throwFeatMissing("geo", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_geo, v);}    
   
    
  //*--------------*
  //* Feature: dbpedia

  /** getter for dbpedia - gets 
   * @generated */
  public String getDbpedia() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_dbpedia == null)
      jcasType.jcas.throwFeatMissing("dbpedia", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_dbpedia);}
    
  /** setter for dbpedia - sets  
   * @generated */
  public void setDbpedia(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_dbpedia == null)
      jcasType.jcas.throwFeatMissing("dbpedia", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_dbpedia, v);}    
   
    
  //*--------------*
  //* Feature: yago

  /** getter for yago - gets 
   * @generated */
  public String getYago() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_yago == null)
      jcasType.jcas.throwFeatMissing("yago", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_yago);}
    
  /** setter for yago - sets  
   * @generated */
  public void setYago(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_yago == null)
      jcasType.jcas.throwFeatMissing("yago", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_yago, v);}    
   
    
  //*--------------*
  //* Feature: opencyc

  /** getter for opencyc - gets 
   * @generated */
  public String getOpencyc() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_opencyc == null)
      jcasType.jcas.throwFeatMissing("opencyc", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_opencyc);}
    
  /** setter for opencyc - sets  
   * @generated */
  public void setOpencyc(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_opencyc == null)
      jcasType.jcas.throwFeatMissing("opencyc", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_opencyc, v);}    
   
    
  //*--------------*
  //* Feature: umbel

  /** getter for umbel - gets 
   * @generated */
  public String getUmbel() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_umbel == null)
      jcasType.jcas.throwFeatMissing("umbel", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_umbel);}
    
  /** setter for umbel - sets  
   * @generated */
  public void setUmbel(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_umbel == null)
      jcasType.jcas.throwFeatMissing("umbel", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_umbel, v);}    
   
    
  //*--------------*
  //* Feature: freebase

  /** getter for freebase - gets 
   * @generated */
  public String getFreebase() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_freebase == null)
      jcasType.jcas.throwFeatMissing("freebase", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_freebase);}
    
  /** setter for freebase - sets  
   * @generated */
  public void setFreebase(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_freebase == null)
      jcasType.jcas.throwFeatMissing("freebase", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_freebase, v);}    
   
    
  //*--------------*
  //* Feature: ciaFactbook

  /** getter for ciaFactbook - gets 
   * @generated */
  public String getCiaFactbook() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_ciaFactbook == null)
      jcasType.jcas.throwFeatMissing("ciaFactbook", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_ciaFactbook);}
    
  /** setter for ciaFactbook - sets  
   * @generated */
  public void setCiaFactbook(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_ciaFactbook == null)
      jcasType.jcas.throwFeatMissing("ciaFactbook", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_ciaFactbook, v);}    
   
    
  //*--------------*
  //* Feature: census

  /** getter for census - gets 
   * @generated */
  public String getCensus() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_census == null)
      jcasType.jcas.throwFeatMissing("census", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_census);}
    
  /** setter for census - sets  
   * @generated */
  public void setCensus(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_census == null)
      jcasType.jcas.throwFeatMissing("census", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_census, v);}    
   
    
  //*--------------*
  //* Feature: geonames

  /** getter for geonames - gets 
   * @generated */
  public String getGeonames() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_geonames == null)
      jcasType.jcas.throwFeatMissing("geonames", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_geonames);}
    
  /** setter for geonames - sets  
   * @generated */
  public void setGeonames(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_geonames == null)
      jcasType.jcas.throwFeatMissing("geonames", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_geonames, v);}    
   
    
  //*--------------*
  //* Feature: musicBrainz

  /** getter for musicBrainz - gets 
   * @generated */
  public String getMusicBrainz() {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_musicBrainz == null)
      jcasType.jcas.throwFeatMissing("musicBrainz", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_musicBrainz);}
    
  /** setter for musicBrainz - sets  
   * @generated */
  public void setMusicBrainz(String v) {
    if (NaturalDisaster_Type.featOkTst && ((NaturalDisaster_Type)jcasType).casFeat_musicBrainz == null)
      jcasType.jcas.throwFeatMissing("musicBrainz", "org.apache.uima.alchemy.ts.entity.NaturalDisaster");
    jcasType.ll_cas.ll_setStringValue(addr, ((NaturalDisaster_Type)jcasType).casFeatCode_musicBrainz, v);}    
  }

    