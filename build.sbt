import sbt.internal.IvyConsole.Dependencies

name := "Scala_Paradox"

version := "0.1"

scalaVersion := "2.13.6"

lazy val root = (project in file(".")).
  enablePlugins(ParadoxPlugin).
  settings(
      name := "Scala_Paradox",
      paradoxTheme := Some(builtinParadoxTheme("generic"))
  )

paradoxProperties ++= Map(
  "github.base_url" -> s"https://github.com",
  "scaladoc" -> s"https://github.com",

)
paradoxProperties += ("canonical.base_url" -> "https://developer.lightbend.com/docs/paradox/current")

