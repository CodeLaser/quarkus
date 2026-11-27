package io.quarkus.bootstrap.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.aether.artifact.Artifact;
import org.eclipse.aether.graph.Dependency;
import org.eclipse.aether.graph.DependencyNode;
import org.eclipse.aether.graph.Exclusion;

import io.quarkus.bootstrap.resolver.maven.BootstrapMavenException;
import io.quarkus.bootstrap.resolver.maven.MavenArtifactResolver;
import io.quarkus.bootstrap.workspace.WorkspaceModule;
import io.quarkus.maven.dependency.ArtifactCoords;
import io.quarkus.maven.dependency.ArtifactKey;
import io.quarkus.maven.dependency.ResolvedDependencyBuilder;

/**
 * @deprecated moved to {@link io.quarkus.bootstrap.resolver.maven.DependencyUtils}. This type remains so that code written
 *             against the old name keeps working; it will be removed.
 */
@Deprecated(forRemoval = true, since = "4.1")
public class DependencyUtils extends io.quarkus.bootstrap.resolver.maven.DependencyUtils {
    public static ArtifactKey getKey(Artifact artifact) {
        return io.quarkus.bootstrap.resolver.maven.DependencyUtils.getKey(artifact);
    }

    public static ArtifactKey getKey(Exclusion exclusion) {
        return io.quarkus.bootstrap.resolver.maven.DependencyUtils.getKey(exclusion);
    }

    public static ArtifactCoords getCoords(Artifact artifact) {
        return io.quarkus.bootstrap.resolver.maven.DependencyUtils.getCoords(artifact);
    }

    public static Map<ArtifactKey, Dependency> toMap(List<Dependency> deps) {
        return io.quarkus.bootstrap.resolver.maven.DependencyUtils.toMap(deps);
    }

    public static void putAll(Map<ArtifactKey, Dependency> map, List<Dependency> deps) {
        io.quarkus.bootstrap.resolver.maven.DependencyUtils.putAll(map, deps);
    }

    public static List<Dependency> mergeDependencies(List<Dependency> dominant, List<Dependency> recessive,
            Map<ArtifactKey, Dependency> managedVersions, Set<String> excludedScopes) {
        return io.quarkus.bootstrap.resolver.maven.DependencyUtils.mergeDependencies(dominant, recessive, managedVersions,
                excludedScopes);
    }

    public static List<Dependency> mergeDependencies(List<Dependency> dominant, List<Dependency> recessive,
            Set<ArtifactKey> excluded, // Not using org.eclipse.aether.graph.Exclusion here because we're not changing transitive deps
            Map<ArtifactKey, Dependency> managedVersions, Set<String> excludedScopes) {
        return io.quarkus.bootstrap.resolver.maven.DependencyUtils.mergeDependencies(dominant, recessive, excluded,
                managedVersions, excludedScopes);
    }

    public static List<Dependency> enforceManagedDependencies(List<Dependency> dominant, List<Dependency> recessive,
            Set<ArtifactKey> excluded,
            Map<ArtifactKey, Dependency> managedVersions, Set<String> excludedScopes) {
        return io.quarkus.bootstrap.resolver.maven.DependencyUtils.enforceManagedDependencies(dominant, recessive, excluded,
                managedVersions, excludedScopes);
    }

    public static Artifact toArtifact(String str) {
        return io.quarkus.bootstrap.resolver.maven.DependencyUtils.toArtifact(str);
    }

    public static ResolvedDependencyBuilder newDependencyBuilder(DependencyNode node, MavenArtifactResolver resolver)
            throws BootstrapMavenException {
        return io.quarkus.bootstrap.resolver.maven.DependencyUtils.newDependencyBuilder(node, resolver);
    }

    public static ResolvedDependencyBuilder toAppArtifact(Artifact artifact, WorkspaceModule module) {
        return io.quarkus.bootstrap.resolver.maven.DependencyUtils.toAppArtifact(artifact, module);
    }

    public static String getType(Artifact artifact) {
        return io.quarkus.bootstrap.resolver.maven.DependencyUtils.getType(artifact);
    }

    public static boolean hasWinner(DependencyNode node) {
        return io.quarkus.bootstrap.resolver.maven.DependencyUtils.hasWinner(node);
    }

    public static DependencyNode getWinner(DependencyNode node) {
        return io.quarkus.bootstrap.resolver.maven.DependencyUtils.getWinner(node);
    }
}
