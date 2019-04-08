// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TargetCapacitySpecificationRequestBuilderOps(val self: TargetCapacitySpecificationRequest.Builder)
    extends AnyVal {

  final def totalTargetCapacityAsScala(value: Option[Int]): TargetCapacitySpecificationRequest.Builder = {
    value.fold(self) { v =>
      self.totalTargetCapacity(v)
    }
  }

  final def onDemandTargetCapacityAsScala(value: Option[Int]): TargetCapacitySpecificationRequest.Builder = {
    value.fold(self) { v =>
      self.onDemandTargetCapacity(v)
    }
  }

  final def spotTargetCapacityAsScala(value: Option[Int]): TargetCapacitySpecificationRequest.Builder = {
    value.fold(self) { v =>
      self.spotTargetCapacity(v)
    }
  }

  final def defaultTargetCapacityTypeAsScala(
      value: Option[DefaultTargetCapacityType]
  ): TargetCapacitySpecificationRequest.Builder = {
    value.fold(self) { v =>
      self.defaultTargetCapacityType(v)
    }
  }

}

final class TargetCapacitySpecificationRequestOps(val self: TargetCapacitySpecificationRequest) extends AnyVal {

  final def totalTargetCapacityAsScala: Option[Int] = Option(self.totalTargetCapacity)

  final def onDemandTargetCapacityAsScala: Option[Int] = Option(self.onDemandTargetCapacity)

  final def spotTargetCapacityAsScala: Option[Int] = Option(self.spotTargetCapacity)

  final def defaultTargetCapacityTypeAsScala: Option[DefaultTargetCapacityType] = Option(self.defaultTargetCapacityType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTargetCapacitySpecificationRequestOps {

  implicit def toTargetCapacitySpecificationRequestBuilderOps(
      v: TargetCapacitySpecificationRequest.Builder
  ): TargetCapacitySpecificationRequestBuilderOps = new TargetCapacitySpecificationRequestBuilderOps(v)

  implicit def toTargetCapacitySpecificationRequestOps(
      v: TargetCapacitySpecificationRequest
  ): TargetCapacitySpecificationRequestOps = new TargetCapacitySpecificationRequestOps(v)

}
