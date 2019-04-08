// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyFleetRequestBuilderOps(val self: ModifyFleetRequest.Builder) extends AnyVal {

  final def excessCapacityTerminationPolicyAsScala(
      value: Option[FleetExcessCapacityTerminationPolicy]
  ): ModifyFleetRequest.Builder = {
    value.fold(self) { v =>
      self.excessCapacityTerminationPolicy(v)
    }
  }

  final def fleetIdAsScala(value: Option[String]): ModifyFleetRequest.Builder = {
    value.fold(self) { v =>
      self.fleetId(v)
    }
  }

  final def targetCapacitySpecificationAsScala(
      value: Option[TargetCapacitySpecificationRequest]
  ): ModifyFleetRequest.Builder = {
    value.fold(self) { v =>
      self.targetCapacitySpecification(v)
    }
  }

}

final class ModifyFleetRequestOps(val self: ModifyFleetRequest) extends AnyVal {

  final def excessCapacityTerminationPolicyAsScala: Option[FleetExcessCapacityTerminationPolicy] =
    Option(self.excessCapacityTerminationPolicy)

  final def fleetIdAsScala: Option[String] = Option(self.fleetId)

  final def targetCapacitySpecificationAsScala: Option[TargetCapacitySpecificationRequest] =
    Option(self.targetCapacitySpecification)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyFleetRequestOps {

  implicit def toModifyFleetRequestBuilderOps(v: ModifyFleetRequest.Builder): ModifyFleetRequestBuilderOps =
    new ModifyFleetRequestBuilderOps(v)

  implicit def toModifyFleetRequestOps(v: ModifyFleetRequest): ModifyFleetRequestOps = new ModifyFleetRequestOps(v)

}
