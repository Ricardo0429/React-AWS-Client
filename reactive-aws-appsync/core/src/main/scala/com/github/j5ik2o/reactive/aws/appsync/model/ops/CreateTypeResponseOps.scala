// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateTypeResponseBuilderOps(val self: CreateTypeResponse.Builder) extends AnyVal {

  final def typeAsScala(value: Option[Type]): CreateTypeResponse.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // Type

}

final class CreateTypeResponseOps(val self: CreateTypeResponse) extends AnyVal {

  final def typeAsScala: Option[Type] = Option(self.`type`) // Type

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTypeResponseOps {

  implicit def toCreateTypeResponseBuilderOps(v: CreateTypeResponse.Builder): CreateTypeResponseBuilderOps =
    new CreateTypeResponseBuilderOps(v)

  implicit def toCreateTypeResponseOps(v: CreateTypeResponse): CreateTypeResponseOps = new CreateTypeResponseOps(v)

}
