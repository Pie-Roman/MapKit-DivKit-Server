import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlinJvm
    springFrameworkBoot
    springDependencyManagement
    kotlinSpring
}

group = "ru.pyroman.mapkit"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

dependencies {
    useCommonLibraries()
    useModule(ProjectModules.Feature.mapFeature)
}

allprojects {
    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "17"
            freeCompilerArgs += "-Xcontext-receivers"
        }
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
