import Keys._

name := "myproject"

organization := "com.example"

version := "0.1.0-SNAPSHOT"

unmanagedBase <<= baseDirectory { base => base / "lib" }

fork := true

javaOptions += "-Djava.library.path=./lib/native/linux"
