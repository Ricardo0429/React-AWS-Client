// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DeleteClusterRequestBuilderOps(val self: DeleteClusterRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): DeleteClusterRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  }

}

final class DeleteClusterRequestOps(val self: DeleteClusterRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteClusterRequestOps {

  implicit def toDeleteClusterRequestBuilderOps(v: DeleteClusterRequest.Builder): DeleteClusterRequestBuilderOps =
    new DeleteClusterRequestBuilderOps(v)

  implicit def toDeleteClusterRequestOps(v: DeleteClusterRequest): DeleteClusterRequestOps =
    new DeleteClusterRequestOps(v)

}
