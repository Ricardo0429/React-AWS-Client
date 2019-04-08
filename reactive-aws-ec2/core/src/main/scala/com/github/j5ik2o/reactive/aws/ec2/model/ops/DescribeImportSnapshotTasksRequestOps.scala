// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeImportSnapshotTasksRequestBuilderOps(val self: DescribeImportSnapshotTasksRequest.Builder)
    extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeImportSnapshotTasksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def importTaskIdsAsScala(value: Option[Seq[String]]): DescribeImportSnapshotTasksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.importTaskIds(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeImportSnapshotTasksRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeImportSnapshotTasksRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeImportSnapshotTasksRequestOps(val self: DescribeImportSnapshotTasksRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def importTaskIdsAsScala: Option[Seq[String]] = Option(self.importTaskIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeImportSnapshotTasksRequestOps {

  implicit def toDescribeImportSnapshotTasksRequestBuilderOps(
      v: DescribeImportSnapshotTasksRequest.Builder
  ): DescribeImportSnapshotTasksRequestBuilderOps = new DescribeImportSnapshotTasksRequestBuilderOps(v)

  implicit def toDescribeImportSnapshotTasksRequestOps(
      v: DescribeImportSnapshotTasksRequest
  ): DescribeImportSnapshotTasksRequestOps = new DescribeImportSnapshotTasksRequestOps(v)

}
