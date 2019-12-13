// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportImageResponseBuilderOps(val self: ImportImageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def architectureAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.architecture(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala(value: Option[Boolean]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.encrypted(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hypervisorAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.hypervisor(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importTaskIdAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.importTaskId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.kmsKeyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseTypeAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.licenseType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.progress(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotDetailsAsScala(value: Option[Seq[SnapshotDetail]]): ImportImageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.snapshotDetails(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): ImportImageResponse.Builder = {
    value.fold(self) { v =>
      self.statusMessage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseSpecificationsAsScala(
      value: Option[Seq[ImportImageLicenseConfigurationResponse]]
  ): ImportImageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.licenseSpecifications(v.asJava)
    }
  }

}

final class ImportImageResponseOps(val self: ImportImageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def architectureAsScala: Option[String] = Option(self.architecture)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptedAsScala: Option[Boolean] = Option(self.encrypted)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hypervisorAsScala: Option[String] = Option(self.hypervisor)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[String] = Option(self.imageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def importTaskIdAsScala: Option[String] = Option(self.importTaskId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseTypeAsScala: Option[String] = Option(self.licenseType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformAsScala: Option[String] = Option(self.platform)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def progressAsScala: Option[String] = Option(self.progress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotDetailsAsScala: Option[Seq[SnapshotDetail]] = Option(self.snapshotDetails).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseSpecificationsAsScala: Option[Seq[ImportImageLicenseConfigurationResponse]] =
    Option(self.licenseSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportImageResponseOps {

  implicit def toImportImageResponseBuilderOps(v: ImportImageResponse.Builder): ImportImageResponseBuilderOps =
    new ImportImageResponseBuilderOps(v)

  implicit def toImportImageResponseOps(v: ImportImageResponse): ImportImageResponseOps = new ImportImageResponseOps(v)

}
