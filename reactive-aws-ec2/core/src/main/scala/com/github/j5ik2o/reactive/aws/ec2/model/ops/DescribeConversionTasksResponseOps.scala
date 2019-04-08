// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeConversionTasksResponseBuilderOps(val self: DescribeConversionTasksResponse.Builder)
    extends AnyVal {

  final def conversionTasksAsScala(value: Option[Seq[ConversionTask]]): DescribeConversionTasksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.conversionTasks(v.asJava)
    }
  }

}

final class DescribeConversionTasksResponseOps(val self: DescribeConversionTasksResponse) extends AnyVal {

  final def conversionTasksAsScala: Option[Seq[ConversionTask]] = Option(self.conversionTasks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeConversionTasksResponseOps {

  implicit def toDescribeConversionTasksResponseBuilderOps(
      v: DescribeConversionTasksResponse.Builder
  ): DescribeConversionTasksResponseBuilderOps = new DescribeConversionTasksResponseBuilderOps(v)

  implicit def toDescribeConversionTasksResponseOps(
      v: DescribeConversionTasksResponse
  ): DescribeConversionTasksResponseOps = new DescribeConversionTasksResponseOps(v)

}
