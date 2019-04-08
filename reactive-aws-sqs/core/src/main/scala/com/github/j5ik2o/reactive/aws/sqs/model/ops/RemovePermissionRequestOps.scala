// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class RemovePermissionRequestBuilderOps(val self: RemovePermissionRequest.Builder) extends AnyVal {

  final def queueUrlAsScala(value: Option[String]): RemovePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  }

  final def labelAsScala(value: Option[String]): RemovePermissionRequest.Builder = {
    value.fold(self) { v =>
      self.label(v)
    }
  }

}

final class RemovePermissionRequestOps(val self: RemovePermissionRequest) extends AnyVal {

  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  final def labelAsScala: Option[String] = Option(self.label)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRemovePermissionRequestOps {

  implicit def toRemovePermissionRequestBuilderOps(
      v: RemovePermissionRequest.Builder
  ): RemovePermissionRequestBuilderOps = new RemovePermissionRequestBuilderOps(v)

  implicit def toRemovePermissionRequestOps(v: RemovePermissionRequest): RemovePermissionRequestOps =
    new RemovePermissionRequestOps(v)

}
