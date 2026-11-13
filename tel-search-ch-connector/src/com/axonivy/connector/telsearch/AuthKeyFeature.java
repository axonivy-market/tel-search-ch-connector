package com.axonivy.connector.telsearch;

import jakarta.ws.rs.Priorities;
import jakarta.ws.rs.core.Feature;
import jakarta.ws.rs.core.FeatureContext;

public class AuthKeyFeature implements Feature {

  @Override
  public boolean configure(FeatureContext context) {
    context.register(new APIKeyFilter(), Priorities.AUTHENTICATION);
    return true;
  }

}
