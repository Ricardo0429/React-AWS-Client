// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReleaseHostsResponseBuilderOps(val self: ReleaseHostsResponse.Builder) extends AnyVal {

  final def successfulAsScala(value: Option[Seq[String]]): ReleaseHostsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.successful(v.asJava)
    }
  }

  final def unsuccessfulAsScala(value: Option[Seq[UnsuccessfulItem]]): ReleaseHostsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.unsuccessful(v.asJava)
    }
  }

}

final class ReleaseHostsResponseOps(val self: ReleaseHostsResponse) extends AnyVal {

  final def successfulAsScala: Option[Seq[String]] = Option(self.successful).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def unsuccessfulAsScala: Option[Seq[UnsuccessfulItem]] = Option(self.unsuccessful).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReleaseHostsResponseOps {

  implicit def toReleaseHostsResponseBuilderOps(v: ReleaseHostsResponse.Builder): ReleaseHostsResponseBuilderOps =
    new ReleaseHostsResponseBuilderOps(v)

  implicit def toReleaseHostsResponseOps(v: ReleaseHostsResponse): ReleaseHostsResponseOps =
    new ReleaseHostsResponseOps(v)

}
