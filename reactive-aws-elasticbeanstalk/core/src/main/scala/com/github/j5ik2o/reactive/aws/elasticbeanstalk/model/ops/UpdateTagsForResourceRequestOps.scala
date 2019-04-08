// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateTagsForResourceRequestBuilderOps(val self: UpdateTagsForResourceRequest.Builder) extends AnyVal {

  final def resourceArnAsScala(value: Option[String]): UpdateTagsForResourceRequest.Builder = {
    value.fold(self) { v =>
      self.resourceArn(v)
    }
  } // String

  final def tagsToAddAsScala(value: Option[Seq[Tag]]): UpdateTagsForResourceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagsToAdd(v.asJava)
    } // Seq[Tag]
  }

  final def tagsToRemoveAsScala(value: Option[Seq[String]]): UpdateTagsForResourceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagsToRemove(v.asJava)
    } // Seq[String]
  }

}

final class UpdateTagsForResourceRequestOps(val self: UpdateTagsForResourceRequest) extends AnyVal {

  final def resourceArnAsScala: Option[String] = Option(self.resourceArn) // String

  final def tagsToAddAsScala: Option[Seq[Tag]] = Option(self.tagsToAdd).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

  final def tagsToRemoveAsScala: Option[Seq[String]] = Option(self.tagsToRemove).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTagsForResourceRequestOps {

  implicit def toUpdateTagsForResourceRequestBuilderOps(
      v: UpdateTagsForResourceRequest.Builder
  ): UpdateTagsForResourceRequestBuilderOps = new UpdateTagsForResourceRequestBuilderOps(v)

  implicit def toUpdateTagsForResourceRequestOps(v: UpdateTagsForResourceRequest): UpdateTagsForResourceRequestOps =
    new UpdateTagsForResourceRequestOps(v)

}
