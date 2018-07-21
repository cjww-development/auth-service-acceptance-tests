name          := "auth-service-acceptance-tests"
version       := "0.1.0"
scalaVersion  := "2.11.11"
scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers ++= Seq(
  "Typesafe repository"    at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)

libraryDependencies ++= TestDependencies()