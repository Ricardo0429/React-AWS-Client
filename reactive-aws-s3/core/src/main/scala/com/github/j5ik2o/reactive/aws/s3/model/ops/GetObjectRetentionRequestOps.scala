// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectRetentionRequestBuilderOps(val self: GetObjectRetentionRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): GetObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withKeyAsScala(value: Option[String]): GetObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withVersionIdAsScala(value: Option[String]): GetObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withRequestPayerAsScala(value: Option[RequestPayer]): GetObjectRetentionRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  } // String

}

final class GetObjectRetentionRequestOps(val self: GetObjectRetentionRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectRetentionRequestOps {

  implicit def toGetObjectRetentionRequestBuilderOps(
      v: GetObjectRetentionRequest.Builder
  ): GetObjectRetentionRequestBuilderOps = new GetObjectRetentionRequestBuilderOps(v)

  implicit def toGetObjectRetentionRequestOps(v: GetObjectRetentionRequest): GetObjectRetentionRequestOps =
    new GetObjectRetentionRequestOps(v)

}