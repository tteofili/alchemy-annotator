/**
 * 	Licensed to the Apache Software Foundation (ASF) under one
 * 	or more contributor license agreements.  See the NOTICE file
 * 	distributed with this work for additional information
 * 	regarding copyright ownership.  The ASF licenses this file
 * 	to you under the Apache License, Version 2.0 (the
 * 	"License"); you may not use this file except in compliance
 * 	with the License.  You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing,
 * 	software distributed under the License is distributed on an
 * 	"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * 	KIND, either express or implied.  See the License for the
 * 	specific language governing permissions and limitations
 * 	under the License.
 */
package org.apache.uima.alchemy.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.alchemy.digester.domain.AnnotatedResults;
import org.apache.uima.alchemy.digester.domain.CategorizationResults;
import org.apache.uima.alchemy.digester.domain.EntitiesResults;
import org.apache.uima.alchemy.digester.domain.Entity;
import org.apache.uima.alchemy.digester.domain.Results;
import org.apache.uima.alchemy.ts.categorization.Category;
import org.apache.uima.alchemy.utils.exception.MappingException;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.StringArray;

public class Alchemy2TypeSystemMapper {

  public static void mapRankedEntities(EntitiesResults results, JCas aJCas) throws MappingException {
    setLanaguage(results, aJCas);
    for (Entity entity : results.getEntities().getEntities()) {
      try {
        // use reflection to instantiate classes of the proper type in the type system
        Object fsObject;
        try {// usually jcas gen creates the constructor with jcas argument as the second one
          fsObject = Class.forName("org.apache.uima.alchemy.ts.entity." + entity.getType())
                  .getConstructors()[1].newInstance(aJCas);
        } catch (Exception e) { // for exceptional cases in which jcas parameter constructor is the
          // first
          fsObject = Class.forName("org.apache.uima.alchemy.ts.entity." + entity.getType())
                  .getConstructors()[0].newInstance(aJCas);
        }
        FeatureStructure fs = (FeatureStructure) fsObject;

        Type type = fs.getType();

        fs.setFeatureValueFromString(type.getFeatureByBaseName("count"), entity.getCount()); // count
        fs.setFeatureValueFromString(type.getFeatureByBaseName("text"), entity.getText()); // text
        fs.setFeatureValueFromString(type.getFeatureByBaseName("relevance"), entity.getRelevance()); // relevance
        if (entity.getDisambiguated() != null) {
          fs.setFeatureValueFromString(type.getFeatureByBaseName("disambiguation"), entity
                  .getDisambiguated().getName()); // disambiguation name
          fs.setFeatureValueFromString(type.getFeatureByBaseName("dbpedia"), entity
                  .getDisambiguated().getDbpedia()); // dbpedia
          fs.setFeatureValueFromString(type.getFeatureByBaseName("website"), entity
                  .getDisambiguated().getWebsite()); // website
          fs.setFeatureValueFromString(type.getFeatureByBaseName("subType"), entity
                  .getDisambiguated().getSubType()); // subtype
          fs.setFeatureValueFromString(type.getFeatureByBaseName("geo"), entity.getDisambiguated()
                  .getGeo()); // geo
          fs.setFeatureValueFromString(type.getFeatureByBaseName("opencyc"), entity
                  .getDisambiguated().getOpencyc()); // opencyc
          fs.setFeatureValueFromString(type.getFeatureByBaseName("yago"), entity.getDisambiguated()
                  .getYago()); // yago
          fs.setFeatureValueFromString(type.getFeatureByBaseName("umbel"), entity
                  .getDisambiguated().getUmbel()); // umbel
          fs.setFeatureValueFromString(type.getFeatureByBaseName("freebase"), entity
                  .getDisambiguated().getFreebase()); // freebase
          fs.setFeatureValueFromString(type.getFeatureByBaseName("ciaFactbook"), entity
                  .getDisambiguated().getCiaFactbook()); // ciaFactbook
          fs.setFeatureValueFromString(type.getFeatureByBaseName("census"), entity
                  .getDisambiguated().getCensus()); // census
          fs.setFeatureValueFromString(type.getFeatureByBaseName("geonames"), entity
                  .getDisambiguated().getGeonames()); // geonames
          fs.setFeatureValueFromString(type.getFeatureByBaseName("musicBrainz"), entity
                  .getDisambiguated().getMusicBrainz()); // musicBrainz
        }
        if (entity.getQuotations() != null && entity.getQuotations().getQuotations() != null
                && entity.getQuotations().getQuotations().size() > 0) {
          StringArray quotationsFeatureStructure = new StringArray(aJCas, entity.getQuotations()
                  .getQuotations().size());
          int i = 0;
          for (String quotation : entity.getQuotations().getQuotations()) {
            quotationsFeatureStructure.set(i, quotation);
            i++;
          }
          fs.setFeatureValue(type.getFeatureByBaseName("quotatiotans"), quotationsFeatureStructure);
        }
        aJCas.addFsToIndexes(fs);
      } catch (Exception e) {
        throw new MappingException(e);
      }
    }

  }

  private static void setLanaguage(Results results, JCas aJCas) {
    aJCas.setDocumentLanguage(results.getLanguage());
  }

  public static void mapAnnotatedEntities(AnnotatedResults results, JCas aJCas) {
    setLanaguage(results, aJCas);
    String annotatedText = results.getAnnotatedText();
    String currentToken = "";
    List<String> tokens = new ArrayList<String>();

    System.err.println(annotatedText);

    String patternString = ".*(\\[\\w+\\[.+\\]\\])+.*";
    Pattern pattern = Pattern.compile(patternString);

    Matcher matcher = pattern.matcher(annotatedText);

    boolean matchFound = matcher.find();

    if (matchFound) {
      // Get all groups for this match
      for (int i = 0; i <= matcher.groupCount(); i++) {
        String text = matcher.group(i);
        System.err.println("gruppo :" + text);
      }
    }

    // for (String token : tokens) {
    // System.out.println(token);
    // }

    // TODO Auto-generated method stub
    // results.getAnnotatedText()
  }

  public static void mapCategorizationEntity(CategorizationResults results, JCas aJCas)
          throws MappingException {
    setLanaguage(results, aJCas);
    try {
      FeatureStructure fs = new Category(aJCas);
      Type type = fs.getType();
      fs.setFeatureValueFromString(type.getFeatureByBaseName("score"), results.getScore());
      fs.setFeatureValueFromString(type.getFeatureByBaseName("text"), results.getCategory());
      aJCas.addFsToIndexes(fs);
    } catch (Exception e) {
      e.printStackTrace();
      throw new MappingException(e);
    }
  }

}