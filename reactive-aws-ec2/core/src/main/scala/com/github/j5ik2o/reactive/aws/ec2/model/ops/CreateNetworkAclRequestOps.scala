// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateNetworkAclRequestBuilderOps(val self: CreateNetworkAclRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): CreateNetworkAclRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class CreateNetworkAclRequestOps(val self: CreateNetworkAclRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateNetworkAclRequestOps {

  implicit def toCreateNetworkAclRequestBuilderOps(
      v: CreateNetworkAclRequest.Builder
  ): CreateNetworkAclRequestBuilderOps = new CreateNetworkAclRequestBuilderOps(v)

  implicit def toCreateNetworkAclRequestOps(v: CreateNetworkAclRequest): CreateNetworkAclRequestOps =
    new CreateNetworkAclRequestOps(v)

}
