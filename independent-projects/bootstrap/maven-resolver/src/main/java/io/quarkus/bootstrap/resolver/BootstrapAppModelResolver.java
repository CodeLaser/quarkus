package io.quarkus.bootstrap.resolver;

import java.util.Properties;

import io.quarkus.bootstrap.resolver.maven.MavenArtifactResolver;

/**
 * @deprecated moved to {@link io.quarkus.bootstrap.resolver.maven.BootstrapAppModelResolver}. This type remains so that code
 *             written
 *             against the old name keeps working; it will be removed.
 */
@Deprecated(forRemoval = true, since = "4.1")
public class BootstrapAppModelResolver extends io.quarkus.bootstrap.resolver.maven.BootstrapAppModelResolver {
    public BootstrapAppModelResolver(MavenArtifactResolver mvn) {
        super(mvn);
    }

    public static boolean isLegacyModelResolver(Properties projectProperties) {
        return io.quarkus.bootstrap.resolver.maven.BootstrapAppModelResolver.isLegacyModelResolver(projectProperties);
    }

    @Override
    public BootstrapAppModelResolver setLegacyModelResolver(boolean legacyModelResolver) {
        super.setLegacyModelResolver(legacyModelResolver);
        return this;
    }

    @Override
    public BootstrapAppModelResolver setDevMode(boolean devmode) {
        super.setDevMode(devmode);
        return this;
    }

    @Override
    public BootstrapAppModelResolver setTest(boolean test) {
        super.setTest(test);
        return this;
    }

    @Override
    public BootstrapAppModelResolver setCollectReloadableDependencies(boolean collectReloadableDeps) {
        super.setCollectReloadableDependencies(collectReloadableDeps);
        return this;
    }

    @Override
    public BootstrapAppModelResolver setRuntimeModelOnly(boolean runtimeModelOnly) {
        super.setRuntimeModelOnly(runtimeModelOnly);
        return this;
    }
}
