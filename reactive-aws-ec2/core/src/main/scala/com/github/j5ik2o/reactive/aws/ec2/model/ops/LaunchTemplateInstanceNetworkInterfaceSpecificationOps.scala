// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateInstanceNetworkInterfaceSpecificationBuilderOps(
    val self: LaunchTemplateInstanceNetworkInterfaceSpecification.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associatePublicIpAddressAsScala(
      value: Option[Boolean]
  ): LaunchTemplateInstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.associatePublicIpAddress(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteOnTerminationAsScala(
      value: Option[Boolean]
  ): LaunchTemplateInstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.deleteOnTermination(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): LaunchTemplateInstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceIndexAsScala(value: Option[Int]): LaunchTemplateInstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.deviceIndex(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupsAsScala(value: Option[Seq[String]]): LaunchTemplateInstanceNetworkInterfaceSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groups(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressCountAsScala(value: Option[Int]): LaunchTemplateInstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.ipv6AddressCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressesAsScala(
      value: Option[Seq[InstanceIpv6Address]]
  ): LaunchTemplateInstanceNetworkInterfaceSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipv6Addresses(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(
      value: Option[String]
  ): LaunchTemplateInstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala(
      value: Option[String]
  ): LaunchTemplateInstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressesAsScala(
      value: Option[Seq[PrivateIpAddressSpecification]]
  ): LaunchTemplateInstanceNetworkInterfaceSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.privateIpAddresses(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def secondaryPrivateIpAddressCountAsScala(
      value: Option[Int]
  ): LaunchTemplateInstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.secondaryPrivateIpAddressCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): LaunchTemplateInstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

}

final class LaunchTemplateInstanceNetworkInterfaceSpecificationOps(
    val self: LaunchTemplateInstanceNetworkInterfaceSpecification
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associatePublicIpAddressAsScala: Option[Boolean] = Option(self.associatePublicIpAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteOnTerminationAsScala: Option[Boolean] = Option(self.deleteOnTermination)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceIndexAsScala: Option[Int] = Option(self.deviceIndex)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupsAsScala: Option[Seq[String]] = Option(self.groups).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressCountAsScala: Option[Int] = Option(self.ipv6AddressCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressesAsScala: Option[Seq[InstanceIpv6Address]] = Option(self.ipv6Addresses).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressesAsScala: Option[Seq[PrivateIpAddressSpecification]] =
    Option(self.privateIpAddresses).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def secondaryPrivateIpAddressCountAsScala: Option[Int] = Option(self.secondaryPrivateIpAddressCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateInstanceNetworkInterfaceSpecificationOps {

  implicit def toLaunchTemplateInstanceNetworkInterfaceSpecificationBuilderOps(
      v: LaunchTemplateInstanceNetworkInterfaceSpecification.Builder
  ): LaunchTemplateInstanceNetworkInterfaceSpecificationBuilderOps =
    new LaunchTemplateInstanceNetworkInterfaceSpecificationBuilderOps(v)

  implicit def toLaunchTemplateInstanceNetworkInterfaceSpecificationOps(
      v: LaunchTemplateInstanceNetworkInterfaceSpecification
  ): LaunchTemplateInstanceNetworkInterfaceSpecificationOps =
    new LaunchTemplateInstanceNetworkInterfaceSpecificationOps(v)

}
