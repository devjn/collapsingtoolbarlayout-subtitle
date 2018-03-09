buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.0.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}

/**
./gradlew :collapsingtoolbarlayout-subtitle:clean :collapsingtoolbarlayout-subtitle:build
./gradlew :collapsingtoolbarlayout-subtitle:bintrayUpload -PbintrayUser=hendraanggrian -PdryRun=false -PbintrayKey=
 */