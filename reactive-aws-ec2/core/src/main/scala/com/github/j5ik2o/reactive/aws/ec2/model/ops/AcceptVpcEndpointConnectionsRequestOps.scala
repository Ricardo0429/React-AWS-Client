// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AcceptVpcEndpointConnectionsRequestBuilderOps(val self: AcceptVpcEndpointConnectionsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceIdAsScala(value: Option[String]): AcceptVpcEndpointConnectionsRequest.Builder = {
    value.fold(self) { v =>
      self.serviceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcEndpointIdsAsScala(value: Option[Seq[String]]): AcceptVpcEndpointConnectionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpcEndpointIds(v.asJava)
    }
  }

}

final class AcceptVpcEndpointConnectionsRequestOps(val self: AcceptVpcEndpointConnectionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceIdAsScala: Option[String] = Option(self.serviceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcEndpointIdsAsScala: Option[Seq[String]] = Option(self.vpcEndpointIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAcceptVpcEndpointConnectionsRequestOps {

  implicit def toAcceptVpcEndpointConnectionsRequestBuilderOps(
      v: AcceptVpcEndpointConnectionsRequest.Builder
  ): AcceptVpcEndpointConnectionsRequestBuilderOps = new AcceptVpcEndpointConnectionsRequestBuilderOps(v)

  implicit def toAcceptVpcEndpointConnectionsRequestOps(
      v: AcceptVpcEndpointConnectionsRequest
  ): AcceptVpcEndpointConnectionsRequestOps = new AcceptVpcEndpointConnectionsRequestOps(v)

}
