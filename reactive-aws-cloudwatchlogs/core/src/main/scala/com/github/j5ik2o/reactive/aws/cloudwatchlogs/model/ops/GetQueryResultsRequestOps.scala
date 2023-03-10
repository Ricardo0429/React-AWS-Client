// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class GetQueryResultsRequestBuilderOps(val self: GetQueryResultsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryIdAsScala(value: Option[String]): GetQueryResultsRequest.Builder = {
    value.fold(self) { v =>
      self.queryId(v)
    }
  }

}

final class GetQueryResultsRequestOps(val self: GetQueryResultsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryIdAsScala: Option[String] = Option(self.queryId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetQueryResultsRequestOps {

  implicit def toGetQueryResultsRequestBuilderOps(v: GetQueryResultsRequest.Builder): GetQueryResultsRequestBuilderOps =
    new GetQueryResultsRequestBuilderOps(v)

  implicit def toGetQueryResultsRequestOps(v: GetQueryResultsRequest): GetQueryResultsRequestOps =
    new GetQueryResultsRequestOps(v)

}
