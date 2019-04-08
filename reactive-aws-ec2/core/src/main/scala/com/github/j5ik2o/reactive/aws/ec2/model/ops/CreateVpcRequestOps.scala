// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpcRequestBuilderOps(val self: CreateVpcRequest.Builder) extends AnyVal {

  final def cidrBlockAsScala(value: Option[String]): CreateVpcRequest.Builder = {
    value.fold(self) { v =>
      self.cidrBlock(v)
    }
  }

  final def amazonProvidedIpv6CidrBlockAsScala(value: Option[Boolean]): CreateVpcRequest.Builder = {
    value.fold(self) { v =>
      self.amazonProvidedIpv6CidrBlock(v)
    }
  }

  final def instanceTenancyAsScala(value: Option[Tenancy]): CreateVpcRequest.Builder = {
    value.fold(self) { v =>
      self.instanceTenancy(v)
    }
  }

}

final class CreateVpcRequestOps(val self: CreateVpcRequest) extends AnyVal {

  final def cidrBlockAsScala: Option[String] = Option(self.cidrBlock)

  final def amazonProvidedIpv6CidrBlockAsScala: Option[Boolean] = Option(self.amazonProvidedIpv6CidrBlock)

  final def instanceTenancyAsScala: Option[Tenancy] = Option(self.instanceTenancy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpcRequestOps {

  implicit def toCreateVpcRequestBuilderOps(v: CreateVpcRequest.Builder): CreateVpcRequestBuilderOps =
    new CreateVpcRequestBuilderOps(v)

  implicit def toCreateVpcRequestOps(v: CreateVpcRequest): CreateVpcRequestOps = new CreateVpcRequestOps(v)

}
