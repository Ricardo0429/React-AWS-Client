// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class GetDownloadUrlForLayerResponseBuilderOps(val self: GetDownloadUrlForLayerResponse.Builder) extends AnyVal {

  final def downloadUrlAsScala(value: Option[String]): GetDownloadUrlForLayerResponse.Builder = {
    value.fold(self) { v =>
      self.downloadUrl(v)
    }
  }

  final def layerDigestAsScala(value: Option[String]): GetDownloadUrlForLayerResponse.Builder = {
    value.fold(self) { v =>
      self.layerDigest(v)
    }
  }

}

final class GetDownloadUrlForLayerResponseOps(val self: GetDownloadUrlForLayerResponse) extends AnyVal {

  final def downloadUrlAsScala: Option[String] = Option(self.downloadUrl)

  final def layerDigestAsScala: Option[String] = Option(self.layerDigest)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetDownloadUrlForLayerResponseOps {

  implicit def toGetDownloadUrlForLayerResponseBuilderOps(
      v: GetDownloadUrlForLayerResponse.Builder
  ): GetDownloadUrlForLayerResponseBuilderOps = new GetDownloadUrlForLayerResponseBuilderOps(v)

  implicit def toGetDownloadUrlForLayerResponseOps(
      v: GetDownloadUrlForLayerResponse
  ): GetDownloadUrlForLayerResponseOps = new GetDownloadUrlForLayerResponseOps(v)

}
