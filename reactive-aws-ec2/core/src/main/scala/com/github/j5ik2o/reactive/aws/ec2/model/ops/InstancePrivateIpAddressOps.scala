// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstancePrivateIpAddressBuilderOps(val self: InstancePrivateIpAddress.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationAsScala(value: Option[InstanceNetworkInterfaceAssociation]): InstancePrivateIpAddress.Builder = {
    value.fold(self) { v =>
      self.association(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def primaryAsScala(value: Option[Boolean]): InstancePrivateIpAddress.Builder = {
    value.fold(self) { v =>
      self.primary(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateDnsNameAsScala(value: Option[String]): InstancePrivateIpAddress.Builder = {
    value.fold(self) { v =>
      self.privateDnsName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala(value: Option[String]): InstancePrivateIpAddress.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

}

final class InstancePrivateIpAddressOps(val self: InstancePrivateIpAddress) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationAsScala: Option[InstanceNetworkInterfaceAssociation] = Option(self.association)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def primaryAsScala: Option[Boolean] = Option(self.primary)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateDnsNameAsScala: Option[String] = Option(self.privateDnsName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstancePrivateIpAddressOps {

  implicit def toInstancePrivateIpAddressBuilderOps(
      v: InstancePrivateIpAddress.Builder
  ): InstancePrivateIpAddressBuilderOps = new InstancePrivateIpAddressBuilderOps(v)

  implicit def toInstancePrivateIpAddressOps(v: InstancePrivateIpAddress): InstancePrivateIpAddressOps =
    new InstancePrivateIpAddressOps(v)

}
