// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class DeleteTypeRequestBuilderOps(val self: DeleteTypeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): DeleteTypeRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala(value: Option[String]): DeleteTypeRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

}

final class DeleteTypeRequestOps(val self: DeleteTypeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala: Option[String] = Option(self.typeName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTypeRequestOps {

  implicit def toDeleteTypeRequestBuilderOps(v: DeleteTypeRequest.Builder): DeleteTypeRequestBuilderOps =
    new DeleteTypeRequestBuilderOps(v)

  implicit def toDeleteTypeRequestOps(v: DeleteTypeRequest): DeleteTypeRequestOps = new DeleteTypeRequestOps(v)

}
