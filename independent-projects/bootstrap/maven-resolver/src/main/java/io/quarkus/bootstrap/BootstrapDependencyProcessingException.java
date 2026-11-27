package io.quarkus.bootstrap;

/**
 * @deprecated moved to {@link io.quarkus.bootstrap.resolver.maven.BootstrapDependencyProcessingException}. This type remains so
 *             that code written
 *             against the old name keeps working; it will be removed.
 */
@Deprecated(forRemoval = true, since = "4.1")
public class BootstrapDependencyProcessingException
        extends io.quarkus.bootstrap.resolver.maven.BootstrapDependencyProcessingException {
    public BootstrapDependencyProcessingException(String message, Throwable cause) {
        super(message, cause);
    }

    public BootstrapDependencyProcessingException(String message) {
        super(message);
    }
}
