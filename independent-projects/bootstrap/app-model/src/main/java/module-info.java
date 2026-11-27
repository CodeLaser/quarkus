module io.quarkus.bootstrap.app.model {
    requires io.smallrye.classfile;
    requires transitive io.quarkus.fs.util;
    requires transitive org.jboss.logging;
    exports io.quarkus.bootstrap;
    exports io.quarkus.bootstrap.model;
    exports io.quarkus.bootstrap.model.gradle;
    exports io.quarkus.bootstrap.model.gradle.impl;
    exports io.quarkus.bootstrap.resolver;
    exports io.quarkus.bootstrap.util;
    exports io.quarkus.bootstrap.workspace;
    exports io.quarkus.maven;
    exports io.quarkus.maven.dependency;
    exports io.quarkus.paths;
    exports io.quarkus.sbom;
    exports io.quarkus.util;
}
