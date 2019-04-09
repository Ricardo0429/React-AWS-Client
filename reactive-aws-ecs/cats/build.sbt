import Settings._

scalaWrapperGenBaseSettings("CatsIO", "cats")

sdkBaseName := "Ecs"

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-cats"

libraryDependencies ++= Seq(
  )

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value
