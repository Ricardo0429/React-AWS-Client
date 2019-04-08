// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SnapshotDiskContainerBuilderOps(val self: SnapshotDiskContainer.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): SnapshotDiskContainer.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def formatAsScala(value: Option[String]): SnapshotDiskContainer.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  }

  final def urlAsScala(value: Option[String]): SnapshotDiskContainer.Builder = {
    value.fold(self) { v =>
      self.url(v)
    }
  }

  final def userBucketAsScala(value: Option[UserBucket]): SnapshotDiskContainer.Builder = {
    value.fold(self) { v =>
      self.userBucket(v)
    }
  }

}

final class SnapshotDiskContainerOps(val self: SnapshotDiskContainer) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def formatAsScala: Option[String] = Option(self.format)

  final def urlAsScala: Option[String] = Option(self.url)

  final def userBucketAsScala: Option[UserBucket] = Option(self.userBucket)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSnapshotDiskContainerOps {

  implicit def toSnapshotDiskContainerBuilderOps(v: SnapshotDiskContainer.Builder): SnapshotDiskContainerBuilderOps =
    new SnapshotDiskContainerBuilderOps(v)

  implicit def toSnapshotDiskContainerOps(v: SnapshotDiskContainer): SnapshotDiskContainerOps =
    new SnapshotDiskContainerOps(v)

}
