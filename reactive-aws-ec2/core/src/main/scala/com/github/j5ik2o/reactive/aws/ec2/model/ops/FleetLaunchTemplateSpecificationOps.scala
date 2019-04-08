// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FleetLaunchTemplateSpecificationBuilderOps(val self: FleetLaunchTemplateSpecification.Builder)
    extends AnyVal {

  final def launchTemplateIdAsScala(value: Option[String]): FleetLaunchTemplateSpecification.Builder = {
    value.fold(self) { v =>
      self.launchTemplateId(v)
    }
  }

  final def launchTemplateNameAsScala(value: Option[String]): FleetLaunchTemplateSpecification.Builder = {
    value.fold(self) { v =>
      self.launchTemplateName(v)
    }
  }

  final def versionAsScala(value: Option[String]): FleetLaunchTemplateSpecification.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

}

final class FleetLaunchTemplateSpecificationOps(val self: FleetLaunchTemplateSpecification) extends AnyVal {

  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  final def versionAsScala: Option[String] = Option(self.version)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFleetLaunchTemplateSpecificationOps {

  implicit def toFleetLaunchTemplateSpecificationBuilderOps(
      v: FleetLaunchTemplateSpecification.Builder
  ): FleetLaunchTemplateSpecificationBuilderOps = new FleetLaunchTemplateSpecificationBuilderOps(v)

  implicit def toFleetLaunchTemplateSpecificationOps(
      v: FleetLaunchTemplateSpecification
  ): FleetLaunchTemplateSpecificationOps = new FleetLaunchTemplateSpecificationOps(v)

}
