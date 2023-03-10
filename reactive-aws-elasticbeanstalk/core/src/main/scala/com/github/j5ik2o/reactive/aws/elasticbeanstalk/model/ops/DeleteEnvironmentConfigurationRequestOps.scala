// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DeleteEnvironmentConfigurationRequestBuilderOps(val self: DeleteEnvironmentConfigurationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): DeleteEnvironmentConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): DeleteEnvironmentConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

}

final class DeleteEnvironmentConfigurationRequestOps(val self: DeleteEnvironmentConfigurationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteEnvironmentConfigurationRequestOps {

  implicit def toDeleteEnvironmentConfigurationRequestBuilderOps(
      v: DeleteEnvironmentConfigurationRequest.Builder
  ): DeleteEnvironmentConfigurationRequestBuilderOps = new DeleteEnvironmentConfigurationRequestBuilderOps(v)

  implicit def toDeleteEnvironmentConfigurationRequestOps(
      v: DeleteEnvironmentConfigurationRequest
  ): DeleteEnvironmentConfigurationRequestOps = new DeleteEnvironmentConfigurationRequestOps(v)

}
