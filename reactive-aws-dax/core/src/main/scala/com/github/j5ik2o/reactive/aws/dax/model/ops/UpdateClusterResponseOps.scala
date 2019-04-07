// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class UpdateClusterResponseBuilderOps(val self: UpdateClusterResponse.Builder) extends AnyVal {

  final def withClusterAsScala(value: Option[Cluster]): UpdateClusterResponse.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  } // Cluster

}

final class UpdateClusterResponseOps(val self: UpdateClusterResponse) extends AnyVal {

  final def clusterAsScala: Option[Cluster] = Option(self.cluster) // Cluster

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateClusterResponseOps {

  implicit def toUpdateClusterResponseBuilderOps(v: UpdateClusterResponse.Builder): UpdateClusterResponseBuilderOps =
    new UpdateClusterResponseBuilderOps(v)

  implicit def toUpdateClusterResponseOps(v: UpdateClusterResponse): UpdateClusterResponseOps =
    new UpdateClusterResponseOps(v)

}
