// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class VPCOptionsBuilderOps(val self: VPCOptions.Builder) extends AnyVal {

  final def withSubnetIdsAsScala(value: Option[Seq[String]]): VPCOptions.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetIds(v.asJava)
    } // Seq[String]
  }

  final def withSecurityGroupIdsAsScala(value: Option[Seq[String]]): VPCOptions.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    } // Seq[String]
  }

}

final class VPCOptionsOps(val self: VPCOptions) extends AnyVal {

  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVPCOptionsOps {

  implicit def toVPCOptionsBuilderOps(v: VPCOptions.Builder): VPCOptionsBuilderOps = new VPCOptionsBuilderOps(v)

  implicit def toVPCOptionsOps(v: VPCOptions): VPCOptionsOps = new VPCOptionsOps(v)

}
