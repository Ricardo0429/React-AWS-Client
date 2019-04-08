// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeMovingAddressesRequestBuilderOps(val self: DescribeMovingAddressesRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeMovingAddressesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeMovingAddressesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeMovingAddressesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def publicIpsAsScala(value: Option[Seq[String]]): DescribeMovingAddressesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.publicIps(v.asJava)
    }
  }

}

final class DescribeMovingAddressesRequestOps(val self: DescribeMovingAddressesRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def publicIpsAsScala: Option[Seq[String]] = Option(self.publicIps).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeMovingAddressesRequestOps {

  implicit def toDescribeMovingAddressesRequestBuilderOps(
      v: DescribeMovingAddressesRequest.Builder
  ): DescribeMovingAddressesRequestBuilderOps = new DescribeMovingAddressesRequestBuilderOps(v)

  implicit def toDescribeMovingAddressesRequestOps(
      v: DescribeMovingAddressesRequest
  ): DescribeMovingAddressesRequestOps = new DescribeMovingAddressesRequestOps(v)

}
