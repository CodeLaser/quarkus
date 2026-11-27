package io.quarkus.amazon.lambda.runtime;

/**
 * @deprecated moved to {@link io.quarkus.amazon.lambda.runtime.events.rest.MockRestEventServer}. This type remains so that code
 *             written
 *             against the old name keeps working; it will be removed.
 */
@Deprecated(forRemoval = true, since = "4.1")
public class MockRestEventServer extends io.quarkus.amazon.lambda.runtime.events.rest.MockRestEventServer {
    public static final String CONTINUE = io.quarkus.amazon.lambda.runtime.events.rest.MockRestEventServer.CONTINUE;

    public MockRestEventServer() {
        super();
    }
}
