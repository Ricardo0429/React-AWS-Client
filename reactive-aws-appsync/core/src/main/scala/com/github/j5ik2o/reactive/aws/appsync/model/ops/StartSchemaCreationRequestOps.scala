// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class StartSchemaCreationRequestBuilderOps(val self: StartSchemaCreationRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): StartSchemaCreationRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def definitionAsScala(
      value: Option[software.amazon.awssdk.core.SdkBytes]
  ): StartSchemaCreationRequest.Builder = {
    value.fold(self) { v =>
      self.definition(v)
    }
  }

}

final class StartSchemaCreationRequestOps(val self: StartSchemaCreationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def definitionAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.definition)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartSchemaCreationRequestOps {

  implicit def toStartSchemaCreationRequestBuilderOps(
      v: StartSchemaCreationRequest.Builder
  ): StartSchemaCreationRequestBuilderOps = new StartSchemaCreationRequestBuilderOps(v)

  implicit def toStartSchemaCreationRequestOps(v: StartSchemaCreationRequest): StartSchemaCreationRequestOps =
    new StartSchemaCreationRequestOps(v)

}
