package utils;

import ch.ivyteam.ivy.environment.AppFixture;
import constant.TelSearchConstant;

public class TelSearchUtils {
  public static void setUpConfigForContext(String contextName, AppFixture fixture) {
    switch (contextName) {
      case TelSearchConstant.REAL_CALL_CONTEXT_DISPLAY_NAME:
        setUpConfigForApiTest(fixture);
        break;
      case TelSearchConstant.MOCK_SERVER_CONTEXT_DISPLAY_NAME:
        setUpConfigForMockServer(fixture);
        break;
      default:
        break;
    }
  }

  private static void setUpConfigForApiTest(AppFixture fixture) {
    String apiKey = System.getProperty(TelSearchConstant.API_KEY);
    fixture.var("tel.search.api.key", apiKey);
  }

  private static void setUpConfigForMockServer(AppFixture fixture) {
    fixture.var("tel.search.api.key", "123_test");
    fixture.config("RestClients.tel-search.Url", "{ivy.app.baseurl}/api/telMock");
  }

}
