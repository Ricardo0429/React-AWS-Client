package com.github.j5ik2o.reactive.aws.kinesis.model

import com.github.j5ik2o.reactive.aws.model.AbstractResponse

final case class DeregisterStreamConsumerResponse(
    override val statusCode: Option[Int] = None,
    override val statusText: Option[String] = None,
    override val httpHeaders: Option[Map[String, Seq[String]]] = None
) extends AbstractResponse(statusCode, statusText, httpHeaders) {
  override type ThisType = DeregisterStreamConsumerResponse
  override def withStatusCode(value: Option[Int]): DeregisterStreamConsumerResponse    = copy(statusCode = value)
  override def withStatusText(value: Option[String]): DeregisterStreamConsumerResponse = copy(statusText = value)
  override def withHttpHeaders(value: Option[Map[String, Seq[String]]]): DeregisterStreamConsumerResponse =
    copy(httpHeaders = value)
}
