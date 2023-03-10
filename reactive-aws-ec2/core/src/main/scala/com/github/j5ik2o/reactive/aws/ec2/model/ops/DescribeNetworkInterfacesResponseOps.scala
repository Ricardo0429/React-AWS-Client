// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeNetworkInterfacesResponseBuilderOps(val self: DescribeNetworkInterfacesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala(
      value: Option[Seq[NetworkInterface]]
  ): DescribeNetworkInterfacesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkInterfaces(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeNetworkInterfacesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeNetworkInterfacesResponseOps(val self: DescribeNetworkInterfacesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala: Option[Seq[NetworkInterface]] = Option(self.networkInterfaces).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeNetworkInterfacesResponseOps {

  implicit def toDescribeNetworkInterfacesResponseBuilderOps(
      v: DescribeNetworkInterfacesResponse.Builder
  ): DescribeNetworkInterfacesResponseBuilderOps = new DescribeNetworkInterfacesResponseBuilderOps(v)

  implicit def toDescribeNetworkInterfacesResponseOps(
      v: DescribeNetworkInterfacesResponse
  ): DescribeNetworkInterfacesResponseOps = new DescribeNetworkInterfacesResponseOps(v)

}
