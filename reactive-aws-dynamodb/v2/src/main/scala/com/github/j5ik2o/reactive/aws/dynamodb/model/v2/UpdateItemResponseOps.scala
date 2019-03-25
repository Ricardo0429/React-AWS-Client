package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateItemResponse => ScalaUpdateItemResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateItemResponse => JavaUpdateItemResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateItemResponseOps {

  implicit class JavaUpdateItemResponseOps(val self: JavaUpdateItemResponse) extends AnyVal {

    def toScala: ScalaUpdateItemResponse = {
      ScalaUpdateItemResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withAttributes(Option(self.attributes).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue], Map-8
        .withConsumedCapacity(Option(self.consumedCapacity).map { v =>
          v.toScala
        }) // ConsumedCapacity, Map-12
        .withItemCollectionMetrics(Option(self.itemCollectionMetrics).map { v =>
          v.toScala
        }) // ItemCollectionMetrics, Map-12
    }

  }

}
