// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ShardBuilderOps(val self: Shard.Builder) extends AnyVal {

  final def shardIdAsScala(value: Option[String]): Shard.Builder = {
    value.fold(self) { v =>
      self.shardId(v)
    }
  }

  final def sequenceNumberRangeAsScala(value: Option[SequenceNumberRange]): Shard.Builder = {
    value.fold(self) { v =>
      self.sequenceNumberRange(v)
    }
  }

  final def parentShardIdAsScala(value: Option[String]): Shard.Builder = {
    value.fold(self) { v =>
      self.parentShardId(v)
    }
  }

}

final class ShardOps(val self: Shard) extends AnyVal {

  final def shardIdAsScala: Option[String] = Option(self.shardId)

  final def sequenceNumberRangeAsScala: Option[SequenceNumberRange] = Option(self.sequenceNumberRange)

  final def parentShardIdAsScala: Option[String] = Option(self.parentShardId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToShardOps {

  implicit def toShardBuilderOps(v: Shard.Builder): ShardBuilderOps = new ShardBuilderOps(v)

  implicit def toShardOps(v: Shard): ShardOps = new ShardOps(v)

}
