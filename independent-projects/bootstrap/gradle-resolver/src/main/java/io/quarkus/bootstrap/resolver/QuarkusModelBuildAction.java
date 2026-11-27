package io.quarkus.bootstrap.resolver;

/**
 * @deprecated moved to {@link io.quarkus.bootstrap.resolver.gradle.QuarkusModelBuildAction}. This type remains so that code
 *             written
 *             against the old name keeps working; it will be removed.
 */
@Deprecated(forRemoval = true, since = "4.1")
public class QuarkusModelBuildAction extends io.quarkus.bootstrap.resolver.gradle.QuarkusModelBuildAction {
    public QuarkusModelBuildAction(String mode) {
        super(mode);
    }
}
