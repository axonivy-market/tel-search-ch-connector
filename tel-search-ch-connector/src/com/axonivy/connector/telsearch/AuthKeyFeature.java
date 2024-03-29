package com.axonivy.connector.telsearch;

import javax.ws.rs.Priorities;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;

public class AuthKeyFeature implements Feature {

  @Override
  public boolean configure(FeatureContext context) {
    context.register(new APIKeyFilter(), Priorities.AUTHENTICATION);
    return true;
  }

}
