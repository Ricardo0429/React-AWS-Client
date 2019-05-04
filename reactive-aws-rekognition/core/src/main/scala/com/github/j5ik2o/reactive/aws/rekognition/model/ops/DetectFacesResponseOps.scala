// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DetectFacesResponseBuilderOps(val self: DetectFacesResponse.Builder) extends AnyVal {

  final def faceDetailsAsScala(value: Option[Seq[FaceDetail]]): DetectFacesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.faceDetails(v.asJava)
    }
  }

  final def orientationCorrectionAsScala(value: Option[OrientationCorrection]): DetectFacesResponse.Builder = {
    value.fold(self) { v =>
      self.orientationCorrection(v)
    }
  }

}

final class DetectFacesResponseOps(val self: DetectFacesResponse) extends AnyVal {

  final def faceDetailsAsScala: Option[Seq[FaceDetail]] = Option(self.faceDetails).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def orientationCorrectionAsScala: Option[OrientationCorrection] = Option(self.orientationCorrection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDetectFacesResponseOps {

  implicit def toDetectFacesResponseBuilderOps(v: DetectFacesResponse.Builder): DetectFacesResponseBuilderOps =
    new DetectFacesResponseBuilderOps(v)

  implicit def toDetectFacesResponseOps(v: DetectFacesResponse): DetectFacesResponseOps = new DetectFacesResponseOps(v)

}
