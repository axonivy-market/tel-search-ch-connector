package com.axonivy.telsearch;

import javax.ws.rs.Priorities;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

public class AtomXmlFeature implements Feature {

  @Override
  public boolean configure(FeatureContext context) {
    JacksonJaxbJsonProvider provider = new JacksonJaxbJsonProvider();
    context.register(provider, Priorities.ENTITY_CODER);
    return true;
  }

}
