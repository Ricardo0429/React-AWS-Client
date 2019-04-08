// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class UpdateShardCountRequestBuilderOps(val self: UpdateShardCountRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): UpdateShardCountRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  final def targetShardCountAsScala(value: Option[Int]): UpdateShardCountRequest.Builder = {
    value.fold(self) { v =>
      self.targetShardCount(v)
    }
  }

  final def scalingTypeAsScala(value: Option[ScalingType]): UpdateShardCountRequest.Builder = {
    value.fold(self) { v =>
      self.scalingType(v)
    }
  }

}

final class UpdateShardCountRequestOps(val self: UpdateShardCountRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName)

  final def targetShardCountAsScala: Option[Int] = Option(self.targetShardCount)

  final def scalingTypeAsScala: Option[ScalingType] = Option(self.scalingType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateShardCountRequestOps {

  implicit def toUpdateShardCountRequestBuilderOps(
      v: UpdateShardCountRequest.Builder
  ): UpdateShardCountRequestBuilderOps = new UpdateShardCountRequestBuilderOps(v)

  implicit def toUpdateShardCountRequestOps(v: UpdateShardCountRequest): UpdateShardCountRequestOps =
    new UpdateShardCountRequestOps(v)

}
