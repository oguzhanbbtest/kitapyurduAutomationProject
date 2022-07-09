import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;



public class ResultLogger implements TestWatcher {

    TestLogger testLogger = new TestLogger();

    @Override
    public void testSuccessful(ExtensionContext context) {
        String testName = context.getDisplayName();
        testLogger.info(testName + " TEST IS PASSED");
    }


    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testName = context.getDisplayName();
        String testCause = cause.getMessage();
        testLogger.error(testName + " TEST IS FAILED : " +testCause);
    }

}
