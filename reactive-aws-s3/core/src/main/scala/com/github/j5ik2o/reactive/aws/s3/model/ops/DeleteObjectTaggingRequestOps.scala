// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteObjectTaggingRequestBuilderOps(val self: DeleteObjectTaggingRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): DeleteObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withKeyAsScala(value: Option[String]): DeleteObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withVersionIdAsScala(value: Option[String]): DeleteObjectTaggingRequest.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

}

final class DeleteObjectTaggingRequestOps(val self: DeleteObjectTaggingRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteObjectTaggingRequestOps {

  implicit def toDeleteObjectTaggingRequestBuilderOps(
      v: DeleteObjectTaggingRequest.Builder
  ): DeleteObjectTaggingRequestBuilderOps = new DeleteObjectTaggingRequestBuilderOps(v)

  implicit def toDeleteObjectTaggingRequestOps(v: DeleteObjectTaggingRequest): DeleteObjectTaggingRequestOps =
    new DeleteObjectTaggingRequestOps(v)

}