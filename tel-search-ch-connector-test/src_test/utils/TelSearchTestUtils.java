package utils;

import ch.ivyteam.ivy.environment.AppFixture;
import constant.TelSearchTestConstant;

public class TelSearchTestUtils {
  public static void setUpConfigForContext(String contextName, AppFixture fixture) {
    switch (contextName) {
      case TelSearchTestConstant.REAL_CALL_CONTEXT_DISPLAY_NAME:
        setUpConfigForApiTest(fixture);
        break;
      case TelSearchTestConstant.MOCK_SERVER_CONTEXT_DISPLAY_NAME:
        setUpConfigForMockServer(fixture);
        break;
      default:
        break;
    }
  }

  private static void setUpConfigForApiTest(AppFixture fixture) {
    String apiKey = System.getProperty(TelSearchTestConstant.API_KEY);
    fixture.var("tel.search.api.key", apiKey);
  }

  private static void setUpConfigForMockServer(AppFixture fixture) {
    fixture.var("tel.search.api.key", "123_test");
    fixture.config("RestClients.tel-search.Url", "{ivy.app.baseurl}/api/telMock");
  }

}
