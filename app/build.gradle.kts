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

java.modularity.inferModulePath.set(true)

tasks.named<Jar>("jar").configure {
    manifest.attributes["Automatic-Module-Name"] = "br.dev.pedrolamarao.app"
}