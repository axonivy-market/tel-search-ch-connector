package com.axonivy.connector.telsearch.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.axonivy.connector.telsearch.tel.search.connector.PhoneDirectoryData;

import ch.ivyteam.ivy.bpm.engine.client.BpmClient;
import ch.ivyteam.ivy.bpm.engine.client.ExecutionResult;
import ch.ivyteam.ivy.bpm.engine.client.element.BpmElement;
import ch.ivyteam.ivy.bpm.engine.client.element.BpmProcess;
import ch.ivyteam.ivy.bpm.exec.client.IvyProcessTest;
import ch.ivyteam.ivy.environment.AppFixture;

@IvyProcessTest
public class PhoneDirectoryTest {

  private static final BpmProcess testeePhoneDirectoryRequest = BpmProcess.path("PhoneDirectory");

  @Test
  public void performnRequest(BpmClient bpmClient, AppFixture fixture) {
    fixture.environment("mock");
    BpmElement requestStartable = testeePhoneDirectoryRequest.elementName("search(String)");
    ExecutionResult requestResult = bpmClient.start().subProcess(requestStartable).execute("John Meier");
    PhoneDirectoryData requestData = requestResult.data().last();
    assertThat(requestData.getMatches().size()).isEqualTo(8);
  }

}
