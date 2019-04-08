// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFleetsRequestBuilderOps(val self: DescribeFleetsRequest.Builder) extends AnyVal {

  final def maxResultsAsScala(value: Option[Int]): DescribeFleetsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeFleetsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def fleetIdsAsScala(value: Option[Seq[String]]): DescribeFleetsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.fleetIds(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeFleetsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

}

final class DescribeFleetsRequestOps(val self: DescribeFleetsRequest) extends AnyVal {

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def fleetIdsAsScala: Option[Seq[String]] = Option(self.fleetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFleetsRequestOps {

  implicit def toDescribeFleetsRequestBuilderOps(v: DescribeFleetsRequest.Builder): DescribeFleetsRequestBuilderOps =
    new DescribeFleetsRequestBuilderOps(v)

  implicit def toDescribeFleetsRequestOps(v: DescribeFleetsRequest): DescribeFleetsRequestOps =
    new DescribeFleetsRequestOps(v)

}
