// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class GetAuthorizationTokenRequestBuilderOps(val self: GetAuthorizationTokenRequest.Builder) extends AnyVal {

  final def registryIdsAsScala(value: Option[Seq[String]]): GetAuthorizationTokenRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.registryIds(v.asJava)
    }
  }

}

final class GetAuthorizationTokenRequestOps(val self: GetAuthorizationTokenRequest) extends AnyVal {

  final def registryIdsAsScala: Option[Seq[String]] = Option(self.registryIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetAuthorizationTokenRequestOps {

  implicit def toGetAuthorizationTokenRequestBuilderOps(
      v: GetAuthorizationTokenRequest.Builder
  ): GetAuthorizationTokenRequestBuilderOps = new GetAuthorizationTokenRequestBuilderOps(v)

  implicit def toGetAuthorizationTokenRequestOps(v: GetAuthorizationTokenRequest): GetAuthorizationTokenRequestOps =
    new GetAuthorizationTokenRequestOps(v)

}
