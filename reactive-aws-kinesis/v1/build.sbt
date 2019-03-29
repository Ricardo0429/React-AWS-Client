import Settings._
import com.github.j5ik2o.sbt.wrapper.gen.model.{ ClassDesc, EnumDesc }

coreSettings

scalaWrapperGenKinesisBaseSettings

name := "reactive-aws-kinesis-v1"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-kinesis" % awsSdk1Version
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value

typeDescFilter in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "KinesisAsyncClient"          => true
  case cd if cd.simpleTypeName == "KinesisClient"               => true
  case cd: ClassDesc if cd.simpleTypeName.startsWith("Default") => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Exception") => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Builder")   => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Handler")   => false
  case cd: ClassDesc if cd.simpleTypeName.endsWith("Copier")    => false
  case cd
      if Seq(
        "KinesisResponseMetadata",
        "SubscribeToShardEventStream",
        "SubscribeToShardEvent",
        "StartingPosition",
        "SubscribeToShardRequest",
        "SubscribeToShardResponse"
      ).contains(cd.simpleTypeName) =>
    false
  case cd: EnumDesc if cd.packageName.exists(_.endsWith("model")) => true
  case cd: ClassDesc if cd.packageName.exists(_.endsWith("model")) && !cd.isStatic && !cd.isAbstract =>
    true
  case cd =>
    false
}

packageNameMapper in scalaWrapperGen := {
  _.replace("software.amazon.awssdk.services.kinesis", "com.github.j5ik2o.reactive.aws.kinesis.v1")
}

typeNameMapper in scalaWrapperGen := {
  case cd if cd.simpleTypeName == "KinesisAsyncClient" =>
    Seq("KinesisAsyncClientImpl")
  case cd if cd.simpleTypeName == "KinesisClient" =>
    Seq("KinesisSyncClientImpl")
  case cd if cd.packageName.exists(_.endsWith("model")) => Seq(cd.simpleTypeName + "Ops")
  case cd                                               => Seq(cd.simpleTypeName)
}

templateNameMapper in scalaWrapperGen := {
  case ("KinesisAsyncClient", cd: ClassDesc) if cd.simpleTypeName == "KinesisAsyncClient" =>
    "KinesisAsyncClient.ftl"
  case ("KinesisAsyncClientImpl", cd: ClassDesc) if cd.simpleTypeName == "KinesisAsyncClient" =>
    "KinesisAsyncClientImpl.ftl"
  case ("KinesisSyncClient", cd: ClassDesc) if cd.simpleTypeName == "KinesisClient" =>
    "KinesisSyncClient.ftl"
  case ("KinesisSyncClientImpl", cd: ClassDesc) if cd.simpleTypeName == "KinesisClient" =>
    "KinesisSyncClientImpl.ftl"
  case (_, cd: ClassDesc) if cd.packageName.exists(_.endsWith("model")) && cd.simpleTypeName.endsWith("Request") =>
    "RequestOps.ftl"
  case (_, cd: ClassDesc) if cd.packageName.exists(_.endsWith("model")) && cd.simpleTypeName.endsWith("Response") =>
    "ResponseOps.ftl"
  case (_, cd: ClassDesc) if cd.packageName.exists(_.endsWith("model")) => "ModelOps.ftl"
  case (_, cd: EnumDesc) if cd.packageName.exists(_.endsWith("model"))  => "EnumOps.ftl"
  case (name, cd)                                                       => throw new Exception(s"error: ${name}, ${cd.simpleTypeName}")
}
