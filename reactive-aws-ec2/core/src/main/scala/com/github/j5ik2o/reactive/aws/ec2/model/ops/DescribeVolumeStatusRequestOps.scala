// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVolumeStatusRequestBuilderOps(val self: DescribeVolumeStatusRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVolumeStatusRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeVolumeStatusRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeVolumeStatusRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdsAsScala(value: Option[Seq[String]]): DescribeVolumeStatusRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.volumeIds(v.asJava)
    }
  }

}

final class DescribeVolumeStatusRequestOps(val self: DescribeVolumeStatusRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumeIdsAsScala: Option[Seq[String]] = Option(self.volumeIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVolumeStatusRequestOps {

  implicit def toDescribeVolumeStatusRequestBuilderOps(
      v: DescribeVolumeStatusRequest.Builder
  ): DescribeVolumeStatusRequestBuilderOps = new DescribeVolumeStatusRequestBuilderOps(v)

  implicit def toDescribeVolumeStatusRequestOps(v: DescribeVolumeStatusRequest): DescribeVolumeStatusRequestOps =
    new DescribeVolumeStatusRequestOps(v)

}
