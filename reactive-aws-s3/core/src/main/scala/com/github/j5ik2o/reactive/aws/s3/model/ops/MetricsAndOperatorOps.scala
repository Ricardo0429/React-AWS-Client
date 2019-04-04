// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class MetricsAndOperatorBuilderOps(val self: MetricsAndOperator.Builder) extends AnyVal {

  final def withPrefixAsScala(value: Option[String]): MetricsAndOperator.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def withTagsAsScala(value: Option[Seq[Tag]]): MetricsAndOperator.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Seq[Tag]
  }

}

final class MetricsAndOperatorOps(val self: MetricsAndOperator) extends AnyVal {

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMetricsAndOperatorOps {

  implicit def toMetricsAndOperatorBuilderOps(v: MetricsAndOperator.Builder): MetricsAndOperatorBuilderOps =
    new MetricsAndOperatorBuilderOps(v)

  implicit def toMetricsAndOperatorOps(v: MetricsAndOperator): MetricsAndOperatorOps = new MetricsAndOperatorOps(v)

}
