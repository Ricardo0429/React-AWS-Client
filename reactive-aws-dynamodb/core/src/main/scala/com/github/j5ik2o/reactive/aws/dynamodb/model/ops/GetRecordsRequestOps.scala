// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GetRecordsRequestBuilderOps(val self: GetRecordsRequest.Builder) extends AnyVal {

  final def withShardIteratorAsScala(value: Option[String]): GetRecordsRequest.Builder = {
    value.fold(self) { v =>
      self.shardIterator(v)
    }
  } // String

  final def withLimitAsScala(value: Option[Int]): GetRecordsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  } // Int

}

final class GetRecordsRequestOps(val self: GetRecordsRequest) extends AnyVal {

  final def shardIteratorAsScala: Option[String] = Option(self.shardIterator) // String

  final def limitAsScala: Option[Int] = Option(self.limit) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetRecordsRequestOps {

  implicit def toGetRecordsRequestBuilderOps(v: GetRecordsRequest.Builder): GetRecordsRequestBuilderOps =
    new GetRecordsRequestBuilderOps(v)

  implicit def toGetRecordsRequestOps(v: GetRecordsRequest): GetRecordsRequestOps = new GetRecordsRequestOps(v)

}