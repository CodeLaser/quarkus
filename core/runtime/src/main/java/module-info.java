module io.quarkus.core {
    requires transitive io.smallrye.config;
    requires transitive org.jboss.logmanager;
    requires transitive jakarta.cdi;
    requires transitive java.logging;
    requires transitive org.graalvm.nativeimage;
    requires transitive io.quarkus.dev.spi;
    requires transitive java.desktop;
    requires transitive jdk.jfr;
    requires transitive org.eclipse.microprofile.config;
    requires transitive io.quarkus.bootstrap.runner;
    requires transitive org.jboss.threads;
    requires transitive io.smallrye.common.net;
    requires transitive io.smallrye.config.common;
    requires java.management;
    requires transitive org.wildfly.common;
    requires transitive io.quarkus.value.registry;
    requires io.smallrye.common.os;
    requires jakarta.inject;
    requires transitive org.jboss.logging;
    requires transitive org.slf4j;
    requires io.quarkus.fs.util;
    requires io.smallrye.common.classloader;
    requires io.smallrye.common.constraint;
    requires io.smallrye.common.cpu;
    requires jakarta.annotation;
    requires io.quarkus.launcher;
    exports io.quarkus;
    exports io.quarkus.core;
    exports io.quarkus.core.service.impl;
    exports io.quarkus.core.util;
    exports io.quarkus.devservices.crossclassloader.runtime;
    exports io.quarkus.logging;
    exports io.quarkus.runtime;
    exports io.quarkus.runtime.annotations;
    exports io.quarkus.runtime.configuration;
    exports io.quarkus.runtime.console;
    exports io.quarkus.runtime.dev.io;
    exports io.quarkus.runtime.graal;
    exports io.quarkus.runtime.init;
    exports io.quarkus.runtime.logging;
    exports io.quarkus.runtime.metrics;
    exports io.quarkus.runtime.recording.substitutions;
    exports io.quarkus.runtime.rest;
    exports io.quarkus.runtime.shutdown;
    exports io.quarkus.runtime.ssl;
    exports io.quarkus.runtime.test;
    exports io.quarkus.runtime.types;
    exports io.quarkus.runtime.util;
    uses io.quarkus.runtime.logging.LogFilterFactory;
    uses io.quarkus.value.registry.RuntimeInfoProvider;
    uses io.quarkus.runtime.test.TestHttpEndpointProvider;
    provides io.smallrye.config.SmallRyeConfigFactory with io.quarkus.runtime.configuration.QuarkusConfigFactory;
    provides org.eclipse.microprofile.config.spi.Converter with io.quarkus.runtime.configuration.InetSocketAddressConverter,
        io.quarkus.runtime.configuration.CharsetConverter, io.quarkus.runtime.configuration.CidrAddressConverter,
        io.quarkus.runtime.configuration.InetAddressConverter, io.quarkus.runtime.configuration.RegexConverter,
        io.quarkus.runtime.configuration.PathConverter, io.quarkus.runtime.configuration.DurationConverter,
        io.quarkus.runtime.configuration.LocaleConverter, io.quarkus.runtime.configuration.ZoneIdConverter,
        io.quarkus.runtime.logging.LevelConverter, io.quarkus.runtime.logging.InheritableLevelConverter;
}
