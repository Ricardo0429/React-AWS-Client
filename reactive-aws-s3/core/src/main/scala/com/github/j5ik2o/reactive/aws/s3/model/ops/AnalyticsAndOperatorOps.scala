// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AnalyticsAndOperatorBuilderOps(val self: AnalyticsAndOperator.Builder) extends AnyVal {

  final def withPrefixAsScala(value: Option[String]): AnalyticsAndOperator.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def withTagsAsScala(value: Option[Seq[Tag]]): AnalyticsAndOperator.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Seq[Tag]
  }

}

final class AnalyticsAndOperatorOps(val self: AnalyticsAndOperator) extends AnyVal {

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAnalyticsAndOperatorOps {

  implicit def toAnalyticsAndOperatorBuilderOps(v: AnalyticsAndOperator.Builder): AnalyticsAndOperatorBuilderOps =
    new AnalyticsAndOperatorBuilderOps(v)

  implicit def toAnalyticsAndOperatorOps(v: AnalyticsAndOperator): AnalyticsAndOperatorOps =
    new AnalyticsAndOperatorOps(v)

}
