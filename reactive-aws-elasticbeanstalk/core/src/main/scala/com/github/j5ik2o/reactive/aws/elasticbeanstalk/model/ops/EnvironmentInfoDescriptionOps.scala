// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class EnvironmentInfoDescriptionBuilderOps(val self: EnvironmentInfoDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def infoTypeAsScala(value: Option[EnvironmentInfoType]): EnvironmentInfoDescription.Builder = {
    value.fold(self) { v =>
      self.infoType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ec2InstanceIdAsScala(value: Option[String]): EnvironmentInfoDescription.Builder = {
    value.fold(self) { v =>
      self.ec2InstanceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sampleTimestampAsScala(value: Option[java.time.Instant]): EnvironmentInfoDescription.Builder = {
    value.fold(self) { v =>
      self.sampleTimestamp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): EnvironmentInfoDescription.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  }

}

final class EnvironmentInfoDescriptionOps(val self: EnvironmentInfoDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def infoTypeAsScala: Option[EnvironmentInfoType] = Option(self.infoType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ec2InstanceIdAsScala: Option[String] = Option(self.ec2InstanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sampleTimestampAsScala: Option[java.time.Instant] = Option(self.sampleTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnvironmentInfoDescriptionOps {

  implicit def toEnvironmentInfoDescriptionBuilderOps(
      v: EnvironmentInfoDescription.Builder
  ): EnvironmentInfoDescriptionBuilderOps = new EnvironmentInfoDescriptionBuilderOps(v)

  implicit def toEnvironmentInfoDescriptionOps(v: EnvironmentInfoDescription): EnvironmentInfoDescriptionOps =
    new EnvironmentInfoDescriptionOps(v)

}
