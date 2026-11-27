package io.quarkus.amazon.lambda.runtime;

/**
 * @deprecated moved to {@link io.quarkus.amazon.lambda.runtime.events.http.MockHttpEventServer}. This type remains so that code
 *             written
 *             against the old name keeps working; it will be removed.
 */
@Deprecated(forRemoval = true, since = "4.1")
public class MockHttpEventServer extends io.quarkus.amazon.lambda.runtime.events.http.MockHttpEventServer {
    public MockHttpEventServer() {
        super();
    }
}
