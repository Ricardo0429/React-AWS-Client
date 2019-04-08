// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RevokeClientVpnIngressRequestBuilderOps(val self: RevokeClientVpnIngressRequest.Builder) extends AnyVal {

  final def clientVpnEndpointIdAsScala(value: Option[String]): RevokeClientVpnIngressRequest.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def targetNetworkCidrAsScala(value: Option[String]): RevokeClientVpnIngressRequest.Builder = {
    value.fold(self) { v =>
      self.targetNetworkCidr(v)
    }
  }

  final def accessGroupIdAsScala(value: Option[String]): RevokeClientVpnIngressRequest.Builder = {
    value.fold(self) { v =>
      self.accessGroupId(v)
    }
  }

  final def revokeAllGroupsAsScala(value: Option[Boolean]): RevokeClientVpnIngressRequest.Builder = {
    value.fold(self) { v =>
      self.revokeAllGroups(v)
    }
  }

}

final class RevokeClientVpnIngressRequestOps(val self: RevokeClientVpnIngressRequest) extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def targetNetworkCidrAsScala: Option[String] = Option(self.targetNetworkCidr)

  final def accessGroupIdAsScala: Option[String] = Option(self.accessGroupId)

  final def revokeAllGroupsAsScala: Option[Boolean] = Option(self.revokeAllGroups)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRevokeClientVpnIngressRequestOps {

  implicit def toRevokeClientVpnIngressRequestBuilderOps(
      v: RevokeClientVpnIngressRequest.Builder
  ): RevokeClientVpnIngressRequestBuilderOps = new RevokeClientVpnIngressRequestBuilderOps(v)

  implicit def toRevokeClientVpnIngressRequestOps(v: RevokeClientVpnIngressRequest): RevokeClientVpnIngressRequestOps =
    new RevokeClientVpnIngressRequestOps(v)

}
