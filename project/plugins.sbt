resolvers ++= Seq(
  "Seasar Repository" at "https://maven.seasar.org/maven2/",
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.7")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.12")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.6")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.4.3")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.4.3")

addSbtPlugin("com.github.j5ik2o" % "sbt-wrapper-gen" % "1.0.7")
