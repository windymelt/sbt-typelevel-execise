// https://typelevel.org/sbt-typelevel/faq.html#what-is-a-base-version-anyway
ThisBuild / tlBaseVersion := "0.0" // your current series x.y

ThisBuild / organization := "dev.capslock"
ThisBuild / organizationName := "capslock.dev"
ThisBuild / startYear := Some(2024)
ThisBuild / licenses := Seq(License.Apache2)
ThisBuild / developers := List(
  // your GitHub handle and name
  tlGitHubDev("windymelt", "Windymelt")
)

// publish to s01.oss.sonatype.org (set to true to publish to oss.sonatype.org instead)
ThisBuild / tlSonatypeUseLegacyHost := false

// publish website from this branch
ThisBuild / tlSitePublishBranch := Some("main")

val Scala213 = "2.13.14"
ThisBuild / crossScalaVersions := Seq(Scala213, "3.5.0")
ThisBuild / scalaVersion := Scala213 // the default Scala

lazy val root = tlCrossRootProject.aggregate(core)

lazy val core = crossProject(JVMPlatform, JSPlatform)
  .crossType(CrossType.Pure)
  .in(file("core"))
  .settings(
    name := "sbt-typelevel-exercise",
    libraryDependencies ++= Seq(
      "org.typelevel" %%% "cats-core" % "2.12.0",
      "org.typelevel" %%% "cats-effect" % "3.5.4",
      "org.scalameta" %%% "munit" % "1.0.1" % Test,
      "org.typelevel" %%% "munit-cats-effect" % "2.0.0" % Test
    )
  )

lazy val docs = project
  .in(file("site"))
  .enablePlugins(TypelevelSitePlugin)
  .settings(
    tlSiteHelium ~= {
      import laika.helium.config._
      import laika.theme.config.Color

      val primary = Color.hex("385a70")
      val primaryMedium = Color.hex("8ebac7")
      val primaryLight = Color.hex("f4f8fa")
      val secondary = Color.hex("fe4559")
      val text = Color.hex("21303f")
      val background = Color.hex("ffffff")
      val landingPageGradient = Color.hex("b0cfd8")
      val info = Color.hex("ddeaed")
      val warning = Color.hex("f9f5d9")
      val error = Color.hex("ffe7e7")

      _.site
        .mainNavigation(appendLinks = Seq())
        .site.darkMode.disabled
        .site
        .themeColors(
          primary = primary,
          secondary = secondary,
          primaryMedium = primaryMedium,
          primaryLight = primaryLight,
          text = text,
          background = background,
          bgGradient = (landingPageGradient, primaryLight)
        )
    }
  )
