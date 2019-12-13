// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetCoipPoolUsageRequestBuilderOps(val self: GetCoipPoolUsageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolIdAsScala(value: Option[String]): GetCoipPoolUsageRequest.Builder = {
    value.fold(self) { v =>
      self.poolId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): GetCoipPoolUsageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): GetCoipPoolUsageRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetCoipPoolUsageRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class GetCoipPoolUsageRequestOps(val self: GetCoipPoolUsageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poolIdAsScala: Option[String] = Option(self.poolId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetCoipPoolUsageRequestOps {

  implicit def toGetCoipPoolUsageRequestBuilderOps(
      v: GetCoipPoolUsageRequest.Builder
  ): GetCoipPoolUsageRequestBuilderOps = new GetCoipPoolUsageRequestBuilderOps(v)

  implicit def toGetCoipPoolUsageRequestOps(v: GetCoipPoolUsageRequest): GetCoipPoolUsageRequestOps =
    new GetCoipPoolUsageRequestOps(v)

}
