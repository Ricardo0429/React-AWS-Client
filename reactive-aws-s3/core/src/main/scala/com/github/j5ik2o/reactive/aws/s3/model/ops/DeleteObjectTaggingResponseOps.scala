// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteObjectTaggingResponseBuilderOps(val self: DeleteObjectTaggingResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala(value: Option[String]): DeleteObjectTaggingResponse.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  }

}

final class DeleteObjectTaggingResponseOps(val self: DeleteObjectTaggingResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionIdAsScala: Option[String] = Option(self.versionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteObjectTaggingResponseOps {

  implicit def toDeleteObjectTaggingResponseBuilderOps(
      v: DeleteObjectTaggingResponse.Builder
  ): DeleteObjectTaggingResponseBuilderOps = new DeleteObjectTaggingResponseBuilderOps(v)

  implicit def toDeleteObjectTaggingResponseOps(v: DeleteObjectTaggingResponse): DeleteObjectTaggingResponseOps =
    new DeleteObjectTaggingResponseOps(v)

}
