// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeCustomerGatewaysResponseBuilderOps(val self: DescribeCustomerGatewaysResponse.Builder)
    extends AnyVal {

  final def customerGatewaysAsScala(value: Option[Seq[CustomerGateway]]): DescribeCustomerGatewaysResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.customerGateways(v.asJava)
    }
  }

}

final class DescribeCustomerGatewaysResponseOps(val self: DescribeCustomerGatewaysResponse) extends AnyVal {

  final def customerGatewaysAsScala: Option[Seq[CustomerGateway]] = Option(self.customerGateways).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeCustomerGatewaysResponseOps {

  implicit def toDescribeCustomerGatewaysResponseBuilderOps(
      v: DescribeCustomerGatewaysResponse.Builder
  ): DescribeCustomerGatewaysResponseBuilderOps = new DescribeCustomerGatewaysResponseBuilderOps(v)

  implicit def toDescribeCustomerGatewaysResponseOps(
      v: DescribeCustomerGatewaysResponse
  ): DescribeCustomerGatewaysResponseOps = new DescribeCustomerGatewaysResponseOps(v)

}
