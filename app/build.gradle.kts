plugins {
    id("application")
}

application {
    mainClass.set("br.dev.pedrolamarao.app.Application")
}

dependencies {
    implementation(project(":api"))
    runtimeOnly(project(":impl"))
}