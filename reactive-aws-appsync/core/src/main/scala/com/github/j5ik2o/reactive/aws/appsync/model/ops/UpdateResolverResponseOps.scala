// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateResolverResponseBuilderOps(val self: UpdateResolverResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resolverAsScala(value: Option[Resolver]): UpdateResolverResponse.Builder = {
    value.fold(self) { v =>
      self.resolver(v)
    }
  }

}

final class UpdateResolverResponseOps(val self: UpdateResolverResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resolverAsScala: Option[Resolver] = Option(self.resolver)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateResolverResponseOps {

  implicit def toUpdateResolverResponseBuilderOps(v: UpdateResolverResponse.Builder): UpdateResolverResponseBuilderOps =
    new UpdateResolverResponseBuilderOps(v)

  implicit def toUpdateResolverResponseOps(v: UpdateResolverResponse): UpdateResolverResponseOps =
    new UpdateResolverResponseOps(v)

}
