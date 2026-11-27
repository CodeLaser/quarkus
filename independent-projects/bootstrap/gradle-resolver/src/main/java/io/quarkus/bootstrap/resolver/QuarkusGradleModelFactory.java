package io.quarkus.bootstrap.resolver;

import java.io.File;
import java.util.List;

import io.quarkus.bootstrap.model.ApplicationModel;

/**
 * @deprecated moved to {@link io.quarkus.bootstrap.resolver.gradle.QuarkusGradleModelFactory}. This type remains so that code
 *             written
 *             against the old name keeps working; it will be removed.
 */
@Deprecated(forRemoval = true, since = "4.1")
public class QuarkusGradleModelFactory extends io.quarkus.bootstrap.resolver.gradle.QuarkusGradleModelFactory {
    public static ApplicationModel create(File projectDir, String mode, String... tasks) {
        return io.quarkus.bootstrap.resolver.gradle.QuarkusGradleModelFactory.create(projectDir, mode, tasks);
    }

    public static ApplicationModel create(File projectDir, String mode, List<String> jvmArgs, String... tasks) {
        return io.quarkus.bootstrap.resolver.gradle.QuarkusGradleModelFactory.create(projectDir, mode, jvmArgs, tasks);
    }

    public static ApplicationModel createForTasks(File projectDir, String... tasks) {
        return io.quarkus.bootstrap.resolver.gradle.QuarkusGradleModelFactory.createForTasks(projectDir, tasks);
    }
}
