// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UnmonitorInstancesResponseBuilderOps(val self: UnmonitorInstancesResponse.Builder) extends AnyVal {

  final def instanceMonitoringsAsScala(value: Option[Seq[InstanceMonitoring]]): UnmonitorInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instanceMonitorings(v.asJava)
    }
  }

}

final class UnmonitorInstancesResponseOps(val self: UnmonitorInstancesResponse) extends AnyVal {

  final def instanceMonitoringsAsScala: Option[Seq[InstanceMonitoring]] = Option(self.instanceMonitorings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUnmonitorInstancesResponseOps {

  implicit def toUnmonitorInstancesResponseBuilderOps(
      v: UnmonitorInstancesResponse.Builder
  ): UnmonitorInstancesResponseBuilderOps = new UnmonitorInstancesResponseBuilderOps(v)

  implicit def toUnmonitorInstancesResponseOps(v: UnmonitorInstancesResponse): UnmonitorInstancesResponseOps =
    new UnmonitorInstancesResponseOps(v)

}
