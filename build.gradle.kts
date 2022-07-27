plugins {
    id("java")
    antlr
}

group = "com.wry"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("org.antlr:antlr4:4.10.1")
}


//tasks.generateGrammarSource {
//    arguments.addAll(listOf("-package", "com.wry.parser", "-Xexact-output-dir"))
//
////    doLast {
////        val parserPackagePath = "${outputDirectory.canonicalPath}/com/wry/parser"
////
////        file(parserPackagePath).mkdirs()
////
////        copy {
////            from(outputDirectory.canonicalPath)
////            into(parserPackagePath)
////            include("SqlEx*")
////        }
//
////        delete(fileTree(outputDirectory.canonicalPath) {
////            include("SqlEx*")
////        })
////    }
//}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}