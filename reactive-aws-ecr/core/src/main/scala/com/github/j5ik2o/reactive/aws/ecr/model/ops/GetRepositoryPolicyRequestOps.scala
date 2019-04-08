// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class GetRepositoryPolicyRequestBuilderOps(val self: GetRepositoryPolicyRequest.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): GetRepositoryPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): GetRepositoryPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

}

final class GetRepositoryPolicyRequestOps(val self: GetRepositoryPolicyRequest) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetRepositoryPolicyRequestOps {

  implicit def toGetRepositoryPolicyRequestBuilderOps(
      v: GetRepositoryPolicyRequest.Builder
  ): GetRepositoryPolicyRequestBuilderOps = new GetRepositoryPolicyRequestBuilderOps(v)

  implicit def toGetRepositoryPolicyRequestOps(v: GetRepositoryPolicyRequest): GetRepositoryPolicyRequestOps =
    new GetRepositoryPolicyRequestOps(v)

}
