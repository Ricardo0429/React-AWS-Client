// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateTransitGatewayRouteTableRequestBuilderOps(
    val self: AssociateTransitGatewayRouteTableRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala(
      value: Option[String]
  ): AssociateTransitGatewayRouteTableRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala(
      value: Option[String]
  ): AssociateTransitGatewayRouteTableRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayAttachmentId(v)
    }
  }

}

final class AssociateTransitGatewayRouteTableRequestOps(val self: AssociateTransitGatewayRouteTableRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayAttachmentIdAsScala: Option[String] = Option(self.transitGatewayAttachmentId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateTransitGatewayRouteTableRequestOps {

  implicit def toAssociateTransitGatewayRouteTableRequestBuilderOps(
      v: AssociateTransitGatewayRouteTableRequest.Builder
  ): AssociateTransitGatewayRouteTableRequestBuilderOps = new AssociateTransitGatewayRouteTableRequestBuilderOps(v)

  implicit def toAssociateTransitGatewayRouteTableRequestOps(
      v: AssociateTransitGatewayRouteTableRequest
  ): AssociateTransitGatewayRouteTableRequestOps = new AssociateTransitGatewayRouteTableRequestOps(v)

}
