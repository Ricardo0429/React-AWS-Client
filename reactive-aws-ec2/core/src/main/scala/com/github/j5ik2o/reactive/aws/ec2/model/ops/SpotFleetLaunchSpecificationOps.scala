// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotFleetLaunchSpecificationBuilderOps(val self: SpotFleetLaunchSpecification.Builder) extends AnyVal {

  final def securityGroupsAsScala(value: Option[Seq[GroupIdentifier]]): SpotFleetLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroups(v.asJava)
    }
  }

  final def addressingTypeAsScala(value: Option[String]): SpotFleetLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.addressingType(v)
    }
  }

  final def blockDeviceMappingsAsScala(value: Option[Seq[BlockDeviceMapping]]): SpotFleetLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.blockDeviceMappings(v.asJava)
    }
  }

  final def ebsOptimizedAsScala(value: Option[Boolean]): SpotFleetLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  final def iamInstanceProfileAsScala(
      value: Option[IamInstanceProfileSpecification]
  ): SpotFleetLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.iamInstanceProfile(v)
    }
  }

  final def imageIdAsScala(value: Option[String]): SpotFleetLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def instanceTypeAsScala(value: Option[InstanceType]): SpotFleetLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def kernelIdAsScala(value: Option[String]): SpotFleetLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  final def keyNameAsScala(value: Option[String]): SpotFleetLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

  final def monitoringAsScala(value: Option[SpotFleetMonitoring]): SpotFleetLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.monitoring(v)
    }
  }

  final def networkInterfacesAsScala(
      value: Option[Seq[InstanceNetworkInterfaceSpecification]]
  ): SpotFleetLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaces(v.asJava)
    }
  }

  final def placementAsScala(value: Option[SpotPlacement]): SpotFleetLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.placement(v)
    }
  }

  final def ramdiskIdAsScala(value: Option[String]): SpotFleetLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.ramdiskId(v)
    }
  }

  final def spotPriceAsScala(value: Option[String]): SpotFleetLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.spotPrice(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): SpotFleetLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  final def userDataAsScala(value: Option[String]): SpotFleetLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.userData(v)
    }
  }

  final def weightedCapacityAsScala(value: Option[Double]): SpotFleetLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.weightedCapacity(v)
    }
  }

  final def tagSpecificationsAsScala(
      value: Option[Seq[SpotFleetTagSpecification]]
  ): SpotFleetLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSpecifications(v.asJava)
    }
  }

}

final class SpotFleetLaunchSpecificationOps(val self: SpotFleetLaunchSpecification) extends AnyVal {

  final def securityGroupsAsScala: Option[Seq[GroupIdentifier]] = Option(self.securityGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def addressingTypeAsScala: Option[String] = Option(self.addressingType)

  final def blockDeviceMappingsAsScala: Option[Seq[BlockDeviceMapping]] = Option(self.blockDeviceMappings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized)

  final def iamInstanceProfileAsScala: Option[IamInstanceProfileSpecification] = Option(self.iamInstanceProfile)

  final def imageIdAsScala: Option[String] = Option(self.imageId)

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def kernelIdAsScala: Option[String] = Option(self.kernelId)

  final def keyNameAsScala: Option[String] = Option(self.keyName)

  final def monitoringAsScala: Option[SpotFleetMonitoring] = Option(self.monitoring)

  final def networkInterfacesAsScala: Option[Seq[InstanceNetworkInterfaceSpecification]] =
    Option(self.networkInterfaces).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def placementAsScala: Option[SpotPlacement] = Option(self.placement)

  final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId)

  final def spotPriceAsScala: Option[String] = Option(self.spotPrice)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  final def userDataAsScala: Option[String] = Option(self.userData)

  final def weightedCapacityAsScala: Option[Double] = Option(self.weightedCapacity)

  final def tagSpecificationsAsScala: Option[Seq[SpotFleetTagSpecification]] = Option(self.tagSpecifications).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotFleetLaunchSpecificationOps {

  implicit def toSpotFleetLaunchSpecificationBuilderOps(
      v: SpotFleetLaunchSpecification.Builder
  ): SpotFleetLaunchSpecificationBuilderOps = new SpotFleetLaunchSpecificationBuilderOps(v)

  implicit def toSpotFleetLaunchSpecificationOps(v: SpotFleetLaunchSpecification): SpotFleetLaunchSpecificationOps =
    new SpotFleetLaunchSpecificationOps(v)

}
