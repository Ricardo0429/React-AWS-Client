package com.github.j5ik2o.reactive.aws.s3.model

final case class CreateMultipartUploadRequest(
    acl: Option[ObjectCannedACL] = None,
    bucket: Option[String] = None,
    cacheControl: Option[String] = None,
    contentDisposition: Option[String] = None,
    contentEncoding: Option[String] = None,
    contentLanguage: Option[String] = None,
    contentType: Option[String] = None,
    expires: Option[java.time.Instant] = None,
    grantFullControl: Option[String] = None,
    grantRead: Option[String] = None,
    grantReadACP: Option[String] = None,
    grantWriteACP: Option[String] = None,
    key: Option[String] = None,
    metadata: Option[Map[String, String]] = None,
    serverSideEncryption: Option[ServerSideEncryption] = None,
    storageClass: Option[StorageClass] = None,
    websiteRedirectLocation: Option[String] = None,
    sseCustomerAlgorithm: Option[String] = None,
    sseCustomerKey: Option[String] = None,
    sseCustomerKeyMD5: Option[String] = None,
    ssekmsKeyId: Option[String] = None,
    requestPayer: Option[RequestPayer] = None,
    tagging: Option[String] = None,
    objectLockMode: Option[ObjectLockMode] = None,
    objectLockRetainUntilDate: Option[java.time.Instant] = None,
    objectLockLegalHoldStatus: Option[ObjectLockLegalHoldStatus] = None
) {
  def withAcl(value: Option[ObjectCannedACL]): CreateMultipartUploadRequest =
    copy(acl = value)
  def withBucket(value: Option[String]): CreateMultipartUploadRequest =
    copy(bucket = value)
  def withCacheControl(value: Option[String]): CreateMultipartUploadRequest =
    copy(cacheControl = value)
  def withContentDisposition(value: Option[String]): CreateMultipartUploadRequest =
    copy(contentDisposition = value)
  def withContentEncoding(value: Option[String]): CreateMultipartUploadRequest =
    copy(contentEncoding = value)
  def withContentLanguage(value: Option[String]): CreateMultipartUploadRequest =
    copy(contentLanguage = value)
  def withContentType(value: Option[String]): CreateMultipartUploadRequest =
    copy(contentType = value)
  def withExpires(value: Option[java.time.Instant]): CreateMultipartUploadRequest =
    copy(expires = value)
  def withGrantFullControl(value: Option[String]): CreateMultipartUploadRequest =
    copy(grantFullControl = value)
  def withGrantRead(value: Option[String]): CreateMultipartUploadRequest =
    copy(grantRead = value)
  def withGrantReadACP(value: Option[String]): CreateMultipartUploadRequest =
    copy(grantReadACP = value)
  def withGrantWriteACP(value: Option[String]): CreateMultipartUploadRequest =
    copy(grantWriteACP = value)
  def withKey(value: Option[String]): CreateMultipartUploadRequest =
    copy(key = value)
  def withMetadata(value: Option[Map[String, String]]): CreateMultipartUploadRequest =
    copy(metadata = value)
  def withServerSideEncryption(value: Option[ServerSideEncryption]): CreateMultipartUploadRequest =
    copy(serverSideEncryption = value)
  def withStorageClass(value: Option[StorageClass]): CreateMultipartUploadRequest =
    copy(storageClass = value)
  def withWebsiteRedirectLocation(value: Option[String]): CreateMultipartUploadRequest =
    copy(websiteRedirectLocation = value)
  def withSseCustomerAlgorithm(value: Option[String]): CreateMultipartUploadRequest =
    copy(sseCustomerAlgorithm = value)
  def withSseCustomerKey(value: Option[String]): CreateMultipartUploadRequest =
    copy(sseCustomerKey = value)
  def withSseCustomerKeyMD5(value: Option[String]): CreateMultipartUploadRequest =
    copy(sseCustomerKeyMD5 = value)
  def withSsekmsKeyId(value: Option[String]): CreateMultipartUploadRequest =
    copy(ssekmsKeyId = value)
  def withRequestPayer(value: Option[RequestPayer]): CreateMultipartUploadRequest =
    copy(requestPayer = value)
  def withTagging(value: Option[String]): CreateMultipartUploadRequest =
    copy(tagging = value)
  def withObjectLockMode(value: Option[ObjectLockMode]): CreateMultipartUploadRequest =
    copy(objectLockMode = value)
  def withObjectLockRetainUntilDate(value: Option[java.time.Instant]): CreateMultipartUploadRequest =
    copy(objectLockRetainUntilDate = value)
  def withObjectLockLegalHoldStatus(value: Option[ObjectLockLegalHoldStatus]): CreateMultipartUploadRequest =
    copy(objectLockLegalHoldStatus = value)
}
