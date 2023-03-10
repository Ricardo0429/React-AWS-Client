// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class ListTagsRequestBuilderOps(val self: ListTagsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceNameAsScala(value: Option[String]): ListTagsRequest.Builder = {
    value.fold(self) { v =>
      self.resourceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListTagsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListTagsRequestOps(val self: ListTagsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceNameAsScala: Option[String] = Option(self.resourceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsRequestOps {

  implicit def toListTagsRequestBuilderOps(v: ListTagsRequest.Builder): ListTagsRequestBuilderOps =
    new ListTagsRequestBuilderOps(v)

  implicit def toListTagsRequestOps(v: ListTagsRequest): ListTagsRequestOps = new ListTagsRequestOps(v)

}
