package com.axonivy.connector.telsearch.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.axonivy.connector.telsearch.tel.search.connector.PhoneDirectoryData;

import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.application.IApplicationInternal;
import ch.ivyteam.ivy.bpm.engine.client.BpmClient;
import ch.ivyteam.ivy.bpm.engine.client.ExecutionResult;
import ch.ivyteam.ivy.bpm.engine.client.element.BpmElement;
import ch.ivyteam.ivy.bpm.engine.client.element.BpmProcess;
import ch.ivyteam.ivy.bpm.exec.client.IvyProcessTest;
import ch.ivyteam.ivy.environment.AppFixture;
import ch.ivyteam.ivy.environment.Ivy;
import ch.telsearch.DirectoryMock;

@IvyProcessTest
public class PhoneDirectoryTest {

  private static final BpmProcess testeePhoneDirectoryRequest = BpmProcess.path("PhoneDirectory");

  @BeforeAll
  static void setup() {
    System.setProperty("ivy.Applications.test.RestClients.tel-search.Url", "{ivy.app.baseurl}/api/telMock");
    ((IApplicationInternal) IApplication.current()).reloadConfig();
  }

  @Test
  public void performRequest(BpmClient bpmClient) {
    BpmElement requestStartable = testeePhoneDirectoryRequest.elementName("search(String,String)");
    ExecutionResult requestResult = bpmClient.start().subProcess(requestStartable).execute("John Meier", "");
    PhoneDirectoryData requestData = requestResult.data().last();
    assertThat(requestData.getMatches().size()).isEqualTo(8);
    assertThat(requestData.getMatches().get(0)).startsWith("Meier, John");
  }

  @Test
  public void authKeyFeature(AppFixture fixture) {
    fixture.var("tel.search.api.key", "123_test");

    Response response = Ivy.rest()
            .client(UUID.fromString("20621516-9434-437b-8a8d-d41da2e7917b"))
            .queryParam("was", "Müller")
            .request().get();
    assertThat(response.getStatus()).isEqualTo(200);
    assertThat(response.getHeaderString(DirectoryMock.MY_KEY)).isEqualTo("123_test");
  }
}
