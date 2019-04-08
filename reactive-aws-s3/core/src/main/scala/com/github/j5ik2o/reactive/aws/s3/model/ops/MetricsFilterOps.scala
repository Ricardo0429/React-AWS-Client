// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class MetricsFilterBuilderOps(val self: MetricsFilter.Builder) extends AnyVal {

  final def prefixAsScala(value: Option[String]): MetricsFilter.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def tagAsScala(value: Option[Tag]): MetricsFilter.Builder = {
    value.fold(self) { v =>
      self.tag(v)
    }
  }

  final def andAsScala(value: Option[MetricsAndOperator]): MetricsFilter.Builder = {
    value.fold(self) { v =>
      self.and(v)
    }
  }

}

final class MetricsFilterOps(val self: MetricsFilter) extends AnyVal {

  final def prefixAsScala: Option[String] = Option(self.prefix)

  final def tagAsScala: Option[Tag] = Option(self.tag)

  final def andAsScala: Option[MetricsAndOperator] = Option(self.and)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricsFilterOps {

  implicit def toMetricsFilterBuilderOps(v: MetricsFilter.Builder): MetricsFilterBuilderOps =
    new MetricsFilterBuilderOps(v)

  implicit def toMetricsFilterOps(v: MetricsFilter): MetricsFilterOps = new MetricsFilterOps(v)

}
