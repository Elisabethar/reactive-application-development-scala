lazy val common = project
lazy val chapter3_001_messaging = project.dependsOn(common % "test->test;compile->compile")
lazy val chapter3_002_elasticity = project.dependsOn(common % "test->test;compile->compile")
lazy val chapter3_003_faulty = project.dependsOn(common % "test->test;compile->compile")
lazy val chapter3_004_resilience = project.dependsOn(common % "test->test;compile->compile")

lazy val chapter5_001_remoting_catalog = project.dependsOn(common % "test->test;compile->compile")

lazy val chapter5_001_remoting_customer = project.dependsOn(
  common % "test->test;compile->compile",
  chapter5_001_remoting_catalog % "compile->compile")

lazy val chapter5_001_remoting_rarebooks = project.dependsOn(
  common % "test->test;compile->compile",
  chapter5_001_remoting_catalog % "compile->compile")

