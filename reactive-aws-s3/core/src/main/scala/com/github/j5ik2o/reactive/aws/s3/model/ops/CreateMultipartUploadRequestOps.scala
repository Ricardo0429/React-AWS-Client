// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CreateMultipartUploadRequestBuilderOps(val self: CreateMultipartUploadRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def aclAsScala(value: Option[ObjectCannedACL]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.acl(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cacheControlAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.cacheControl(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentDispositionAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.contentDisposition(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentEncodingAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.contentEncoding(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentLanguageAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.contentLanguage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentTypeAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.contentType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiresAsScala(value: Option[java.time.Instant]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.expires(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantFullControlAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.grantFullControl(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantReadAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.grantRead(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantReadACPAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.grantReadACP(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantWriteACPAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.grantWriteACP(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metadataAsScala(value: Option[Map[String, String]]): CreateMultipartUploadRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.metadata(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverSideEncryptionAsScala(value: Option[ServerSideEncryption]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageClassAsScala(value: Option[StorageClass]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def websiteRedirectLocationAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.websiteRedirectLocation(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerAlgorithmAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKey(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyMD5AsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsKeyIdAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala(value: Option[RequestPayer]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.requestPayer(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taggingAsScala(value: Option[String]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.tagging(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectLockModeAsScala(value: Option[ObjectLockMode]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockMode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectLockRetainUntilDateAsScala(value: Option[java.time.Instant]): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockRetainUntilDate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectLockLegalHoldStatusAsScala(
      value: Option[ObjectLockLegalHoldStatus]
  ): CreateMultipartUploadRequest.Builder = {
    value.fold(self) { v =>
      self.objectLockLegalHoldStatus(v)
    }
  }

}

final class CreateMultipartUploadRequestOps(val self: CreateMultipartUploadRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def aclAsScala: Option[ObjectCannedACL] = Option(self.acl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cacheControlAsScala: Option[String] = Option(self.cacheControl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentDispositionAsScala: Option[String] = Option(self.contentDisposition)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentEncodingAsScala: Option[String] = Option(self.contentEncoding)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentLanguageAsScala: Option[String] = Option(self.contentLanguage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentTypeAsScala: Option[String] = Option(self.contentType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiresAsScala: Option[java.time.Instant] = Option(self.expires)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantFullControlAsScala: Option[String] = Option(self.grantFullControl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantReadAsScala: Option[String] = Option(self.grantRead)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantReadACPAsScala: Option[String] = Option(self.grantReadACP)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantWriteACPAsScala: Option[String] = Option(self.grantWriteACP)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyAsScala: Option[String] = Option(self.key)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metadataAsScala: Option[Map[String, String]] = Option(self.metadata).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def websiteRedirectLocationAsScala: Option[String] = Option(self.websiteRedirectLocation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyAsScala: Option[String] = Option(self.sseCustomerKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestPayerAsScala: Option[RequestPayer] = Option(self.requestPayer)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taggingAsScala: Option[String] = Option(self.tagging)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectLockModeAsScala: Option[ObjectLockMode] = Option(self.objectLockMode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectLockRetainUntilDateAsScala: Option[java.time.Instant] = Option(self.objectLockRetainUntilDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectLockLegalHoldStatusAsScala: Option[ObjectLockLegalHoldStatus] = Option(self.objectLockLegalHoldStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateMultipartUploadRequestOps {

  implicit def toCreateMultipartUploadRequestBuilderOps(
      v: CreateMultipartUploadRequest.Builder
  ): CreateMultipartUploadRequestBuilderOps = new CreateMultipartUploadRequestBuilderOps(v)

  implicit def toCreateMultipartUploadRequestOps(v: CreateMultipartUploadRequest): CreateMultipartUploadRequestOps =
    new CreateMultipartUploadRequestOps(v)

}
