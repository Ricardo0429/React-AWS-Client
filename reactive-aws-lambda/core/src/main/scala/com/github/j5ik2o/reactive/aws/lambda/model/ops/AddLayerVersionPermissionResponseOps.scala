// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AddLayerVersionPermissionResponseBuilderOps(val self: AddLayerVersionPermissionResponse.Builder)
    extends AnyVal {

  final def statementAsScala(value: Option[String]): AddLayerVersionPermissionResponse.Builder = {
    value.fold(self) { v =>
      self.statement(v)
    }
  }

  final def revisionIdAsScala(value: Option[String]): AddLayerVersionPermissionResponse.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

}

final class AddLayerVersionPermissionResponseOps(val self: AddLayerVersionPermissionResponse) extends AnyVal {

  final def statementAsScala: Option[String] = Option(self.statement)

  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddLayerVersionPermissionResponseOps {

  implicit def toAddLayerVersionPermissionResponseBuilderOps(
      v: AddLayerVersionPermissionResponse.Builder
  ): AddLayerVersionPermissionResponseBuilderOps = new AddLayerVersionPermissionResponseBuilderOps(v)

  implicit def toAddLayerVersionPermissionResponseOps(
      v: AddLayerVersionPermissionResponse
  ): AddLayerVersionPermissionResponseOps = new AddLayerVersionPermissionResponseOps(v)

}
