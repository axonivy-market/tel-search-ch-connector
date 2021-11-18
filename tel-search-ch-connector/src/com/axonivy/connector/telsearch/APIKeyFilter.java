package com.axonivy.connector.telsearch;

import java.io.IOException;
import java.net.URI;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.UriBuilder;

import org.apache.commons.lang3.StringUtils;

import ch.ivyteam.ivy.environment.Ivy;

public class APIKeyFilter implements ClientRequestFilter {

  @Override
  public void filter(ClientRequestContext context) throws IOException {
    String apiKey = Ivy.var().get("tel.search.api.key");
    if(StringUtils.isBlank(apiKey)) {
      return;
    }
    URI userUri = UriBuilder.fromUri(context.getUri())
            .queryParam("key", apiKey)
            .build();
    context.setUri(userUri);
  }

}