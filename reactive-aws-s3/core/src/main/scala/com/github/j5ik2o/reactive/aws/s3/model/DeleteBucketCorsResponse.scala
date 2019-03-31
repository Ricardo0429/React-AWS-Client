package com.github.j5ik2o.reactive.aws.s3.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class DeleteBucketCorsResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DeleteBucketCorsResponse
  override def withStatusCode(value: Option[Int]): DeleteBucketCorsResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DeleteBucketCorsResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DeleteBucketCorsResponse =
    copy(httpHeaders = value)
}
