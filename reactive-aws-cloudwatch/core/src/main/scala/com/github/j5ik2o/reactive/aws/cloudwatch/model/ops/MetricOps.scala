// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class MetricBuilderOps(val self: Metric.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala(value: Option[String]): Metric.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala(value: Option[String]): Metric.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala(value: Option[Seq[Dimension]]): Metric.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dimensions(v.asJava)
    }
  }

}

final class MetricOps(val self: Metric) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala: Option[String] = Option(self.namespace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala: Option[String] = Option(self.metricName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala: Option[Seq[Dimension]] = Option(self.dimensions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricOps {

  implicit def toMetricBuilderOps(v: Metric.Builder): MetricBuilderOps = new MetricBuilderOps(v)

  implicit def toMetricOps(v: Metric): MetricOps = new MetricOps(v)

}
