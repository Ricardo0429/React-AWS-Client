// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFpgaImagesResponseBuilderOps(val self: DescribeFpgaImagesResponse.Builder) extends AnyVal {

  final def fpgaImagesAsScala(value: Option[Seq[FpgaImage]]): DescribeFpgaImagesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.fpgaImages(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeFpgaImagesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeFpgaImagesResponseOps(val self: DescribeFpgaImagesResponse) extends AnyVal {

  final def fpgaImagesAsScala: Option[Seq[FpgaImage]] = Option(self.fpgaImages).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFpgaImagesResponseOps {

  implicit def toDescribeFpgaImagesResponseBuilderOps(
      v: DescribeFpgaImagesResponse.Builder
  ): DescribeFpgaImagesResponseBuilderOps = new DescribeFpgaImagesResponseBuilderOps(v)

  implicit def toDescribeFpgaImagesResponseOps(v: DescribeFpgaImagesResponse): DescribeFpgaImagesResponseOps =
    new DescribeFpgaImagesResponseOps(v)

}
