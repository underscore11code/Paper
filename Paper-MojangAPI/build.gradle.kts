repositories {
    mavenCentral()
    maven("https://libraries.minecraft.net/")
}

dependencies {
    implementation(project(":Paper-API"))

    implementation("com.mojang:brigadier:1.0.17")
    implementation("org.jetbrains:annotations:18.0.0")
}
