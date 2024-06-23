rootProject.name = "MapKit-DivKit-Server"

include(":common:view")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
        google()
        flatDir {
            dirs("libs")
        }
    }
}