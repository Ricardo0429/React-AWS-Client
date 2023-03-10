// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetResolverResponseBuilderOps(val self: GetResolverResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resolverAsScala(value: Option[Resolver]): GetResolverResponse.Builder = {
    value.fold(self) { v =>
      self.resolver(v)
    }
  }

}

final class GetResolverResponseOps(val self: GetResolverResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resolverAsScala: Option[Resolver] = Option(self.resolver)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetResolverResponseOps {

  implicit def toGetResolverResponseBuilderOps(v: GetResolverResponse.Builder): GetResolverResponseBuilderOps =
    new GetResolverResponseBuilderOps(v)

  implicit def toGetResolverResponseOps(v: GetResolverResponse): GetResolverResponseOps = new GetResolverResponseOps(v)

}
