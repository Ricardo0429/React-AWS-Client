// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class GetLifecyclePolicyRequestBuilderOps(val self: GetLifecyclePolicyRequest.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): GetLifecyclePolicyRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): GetLifecyclePolicyRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

}

final class GetLifecyclePolicyRequestOps(val self: GetLifecyclePolicyRequest) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLifecyclePolicyRequestOps {

  implicit def toGetLifecyclePolicyRequestBuilderOps(
      v: GetLifecyclePolicyRequest.Builder
  ): GetLifecyclePolicyRequestBuilderOps = new GetLifecyclePolicyRequestBuilderOps(v)

  implicit def toGetLifecyclePolicyRequestOps(v: GetLifecyclePolicyRequest): GetLifecyclePolicyRequestOps =
    new GetLifecyclePolicyRequestOps(v)

}
