rootProject.name = "MapKit-DivKit-Server"

include(":common:view")
include(":feature:map-feature")

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