// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DetectFacesRequestBuilderOps(val self: DetectFacesRequest.Builder) extends AnyVal {

  final def imageAsScala(value: Option[Image]): DetectFacesRequest.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  final def attributesAsScala(value: Option[Seq[Attribute]]): DetectFacesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributes(v.asJava)
    }
  }

}

final class DetectFacesRequestOps(val self: DetectFacesRequest) extends AnyVal {

  final def imageAsScala: Option[Image] = Option(self.image)

  final def attributesAsScala: Option[Seq[Attribute]] = Option(self.attributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectFacesRequestOps {

  implicit def toDetectFacesRequestBuilderOps(v: DetectFacesRequest.Builder): DetectFacesRequestBuilderOps =
    new DetectFacesRequestBuilderOps(v)

  implicit def toDetectFacesRequestOps(v: DetectFacesRequest): DetectFacesRequestOps = new DetectFacesRequestOps(v)

}
