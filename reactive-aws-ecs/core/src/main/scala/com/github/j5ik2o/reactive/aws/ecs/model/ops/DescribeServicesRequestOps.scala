// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeServicesRequestBuilderOps(val self: DescribeServicesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): DescribeServicesRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def servicesAsScala(value: Option[Seq[String]]): DescribeServicesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.services(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeAsScala(value: Option[Seq[ServiceField]]): DescribeServicesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.include(v.asJava)
    }
  }

}

final class DescribeServicesRequestOps(val self: DescribeServicesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def servicesAsScala: Option[Seq[String]] = Option(self.services).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeAsScala: Option[Seq[ServiceField]] = Option(self.include).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeServicesRequestOps {

  implicit def toDescribeServicesRequestBuilderOps(
      v: DescribeServicesRequest.Builder
  ): DescribeServicesRequestBuilderOps = new DescribeServicesRequestBuilderOps(v)

  implicit def toDescribeServicesRequestOps(v: DescribeServicesRequest): DescribeServicesRequestOps =
    new DescribeServicesRequestOps(v)

}
