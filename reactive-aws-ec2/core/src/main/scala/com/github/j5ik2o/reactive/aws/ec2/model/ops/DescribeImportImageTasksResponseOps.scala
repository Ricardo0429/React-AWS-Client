// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeImportImageTasksResponseBuilderOps(val self: DescribeImportImageTasksResponse.Builder)
    extends AnyVal {

  final def importImageTasksAsScala(value: Option[Seq[ImportImageTask]]): DescribeImportImageTasksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.importImageTasks(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeImportImageTasksResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeImportImageTasksResponseOps(val self: DescribeImportImageTasksResponse) extends AnyVal {

  final def importImageTasksAsScala: Option[Seq[ImportImageTask]] = Option(self.importImageTasks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeImportImageTasksResponseOps {

  implicit def toDescribeImportImageTasksResponseBuilderOps(
      v: DescribeImportImageTasksResponse.Builder
  ): DescribeImportImageTasksResponseBuilderOps = new DescribeImportImageTasksResponseBuilderOps(v)

  implicit def toDescribeImportImageTasksResponseOps(
      v: DescribeImportImageTasksResponse
  ): DescribeImportImageTasksResponseOps = new DescribeImportImageTasksResponseOps(v)

}
