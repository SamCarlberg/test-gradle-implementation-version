import org.gradle.api.tasks.bundling.Jar

plugins {
    java
    application
}

application {
    mainClassName = "testpackage.TestClass"
}

version = "version_from_project_config"

tasks.withType<Jar> {
    manifest {
        attributes["Implementation-Version"] = "version_from_jar_task"
        attributes["Main-Class"] = application.mainClassName
    }
}
