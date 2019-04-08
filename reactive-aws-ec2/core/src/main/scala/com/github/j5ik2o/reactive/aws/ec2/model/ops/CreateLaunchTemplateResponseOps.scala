// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateLaunchTemplateResponseBuilderOps(val self: CreateLaunchTemplateResponse.Builder) extends AnyVal {

  final def launchTemplateAsScala(value: Option[LaunchTemplate]): CreateLaunchTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.launchTemplate(v)
    }
  }

}

final class CreateLaunchTemplateResponseOps(val self: CreateLaunchTemplateResponse) extends AnyVal {

  final def launchTemplateAsScala: Option[LaunchTemplate] = Option(self.launchTemplate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateLaunchTemplateResponseOps {

  implicit def toCreateLaunchTemplateResponseBuilderOps(
      v: CreateLaunchTemplateResponse.Builder
  ): CreateLaunchTemplateResponseBuilderOps = new CreateLaunchTemplateResponseBuilderOps(v)

  implicit def toCreateLaunchTemplateResponseOps(v: CreateLaunchTemplateResponse): CreateLaunchTemplateResponseOps =
    new CreateLaunchTemplateResponseOps(v)

}
