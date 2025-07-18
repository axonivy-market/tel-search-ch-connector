package com.axonivy.connector.telsearch.test;

import static org.assertj.core.api.Assertions.assertThat;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

import com.axonivy.connector.telsearch.tel.search.connector.PhoneDirectoryData;

import ch.ivyteam.ivy.bpm.engine.client.BpmClient;
import ch.ivyteam.ivy.bpm.engine.client.ExecutionResult;
import ch.ivyteam.ivy.bpm.engine.client.element.BpmElement;
import ch.ivyteam.ivy.bpm.engine.client.element.BpmProcess;
import ch.ivyteam.ivy.bpm.exec.client.IvyProcessTest;
import ch.ivyteam.ivy.environment.AppFixture;
import ch.ivyteam.ivy.environment.Ivy;
import ch.telsearch.DirectoryMock;
import constant.TelSearchTestConstant;
import context.MultiEnvironmentContextProvider;
import utils.TelSearchTestUtils;

@IvyProcessTest(enableWebServer = true)
@ExtendWith(MultiEnvironmentContextProvider.class)
public class PhoneDirectoryTest {

  private static final BpmProcess testeePhoneDirectoryRequest = BpmProcess.path("PhoneDirectory");
  private boolean isRealContext = false;

  @BeforeEach
  void beforeEach(ExtensionContext context, AppFixture fixture) {
    TelSearchTestUtils.setUpConfigForContext(context.getDisplayName(), fixture);
    isRealContext = context.getDisplayName().equals(TelSearchTestConstant.REAL_CALL_CONTEXT_DISPLAY_NAME);
  }

  @TestTemplate
  public void performRequest(ExtensionContext context, BpmClient bpmClient) {
    BpmElement requestStartable = testeePhoneDirectoryRequest.elementName("search(String,String)");
    ExecutionResult requestResult = bpmClient.start().subProcess(requestStartable).execute("John Meier", "");
    PhoneDirectoryData requestData = requestResult.data().last();
    if (isRealContext) {
      assertThat(requestData.getMatches().size()).isGreaterThan(1);
    } else {
      assertThat(requestData.getMatches().size()).isEqualTo(8);
      assertThat(requestData.getMatches().get(0)).startsWith("Meier, John");
    }
  }

  @TestTemplate
  public void authKeyFeature(ExtensionContext context, AppFixture fixture) {
    Response response = Ivy.rest().client("tel-search").queryParam("was", "Müller").request().get();
    if (!isRealContext) {
      assertThat(response.getHeaderString(DirectoryMock.MY_KEY)).isEqualTo("123_test");
    }
    assertThat(response.getStatus()).isEqualTo(200);
  }
}
