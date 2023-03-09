plugins {
    id("base")
}

allprojects {
    group = "br.dev.pedrolamarao"
    version = "1.0-SNAPSHOT"
}

tasks.named<Wrapper>("wrapper").configure() {
    this.gradleVersion = "8.0.1"
}