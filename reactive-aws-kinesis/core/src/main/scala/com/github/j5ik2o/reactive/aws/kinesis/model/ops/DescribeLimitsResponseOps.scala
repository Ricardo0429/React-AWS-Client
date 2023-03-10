// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DescribeLimitsResponseBuilderOps(val self: DescribeLimitsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardLimitAsScala(value: Option[Int]): DescribeLimitsResponse.Builder = {
    value.fold(self) { v =>
      self.shardLimit(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def openShardCountAsScala(value: Option[Int]): DescribeLimitsResponse.Builder = {
    value.fold(self) { v =>
      self.openShardCount(v)
    }
  }

}

final class DescribeLimitsResponseOps(val self: DescribeLimitsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def shardLimitAsScala: Option[Int] = Option(self.shardLimit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def openShardCountAsScala: Option[Int] = Option(self.openShardCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLimitsResponseOps {

  implicit def toDescribeLimitsResponseBuilderOps(v: DescribeLimitsResponse.Builder): DescribeLimitsResponseBuilderOps =
    new DescribeLimitsResponseBuilderOps(v)

  implicit def toDescribeLimitsResponseOps(v: DescribeLimitsResponse): DescribeLimitsResponseOps =
    new DescribeLimitsResponseOps(v)

}
