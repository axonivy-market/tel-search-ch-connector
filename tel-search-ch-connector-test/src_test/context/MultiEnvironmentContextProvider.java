package context;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestTemplateInvocationContext;
import org.junit.jupiter.api.extension.TestTemplateInvocationContextProvider;

import constant.TelSearchTestConstant;

public class MultiEnvironmentContextProvider implements TestTemplateInvocationContextProvider {

  @Override
  public boolean supportsTestTemplate(ExtensionContext context) {
    return true;
  }

  @Override
  public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
    String testEnv = System.getProperty(TelSearchTestConstant.END_TO_END_TESTING_ENVIRONMENT_KEY);
    return switch (testEnv) {
    case TelSearchTestConstant.END_TO_END_TESTING_ENVIRONMENT_VALUE ->
      Stream.of(new TestEnironmentInvocationContext(TelSearchTestConstant.REAL_CALL_CONTEXT_DISPLAY_NAME));
    default ->
      Stream.of(new TestEnironmentInvocationContext(TelSearchTestConstant.MOCK_SERVER_CONTEXT_DISPLAY_NAME));
    };
  }
}
