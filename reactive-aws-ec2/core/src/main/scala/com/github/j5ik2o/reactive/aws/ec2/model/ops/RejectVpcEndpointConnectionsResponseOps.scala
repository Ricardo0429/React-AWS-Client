// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RejectVpcEndpointConnectionsResponseBuilderOps(val self: RejectVpcEndpointConnectionsResponse.Builder)
    extends AnyVal {

  final def unsuccessfulAsScala(value: Option[Seq[UnsuccessfulItem]]): RejectVpcEndpointConnectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.unsuccessful(v.asJava)
    }
  }

}

final class RejectVpcEndpointConnectionsResponseOps(val self: RejectVpcEndpointConnectionsResponse) extends AnyVal {

  final def unsuccessfulAsScala: Option[Seq[UnsuccessfulItem]] = Option(self.unsuccessful).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRejectVpcEndpointConnectionsResponseOps {

  implicit def toRejectVpcEndpointConnectionsResponseBuilderOps(
      v: RejectVpcEndpointConnectionsResponse.Builder
  ): RejectVpcEndpointConnectionsResponseBuilderOps = new RejectVpcEndpointConnectionsResponseBuilderOps(v)

  implicit def toRejectVpcEndpointConnectionsResponseOps(
      v: RejectVpcEndpointConnectionsResponse
  ): RejectVpcEndpointConnectionsResponseOps = new RejectVpcEndpointConnectionsResponseOps(v)

}
