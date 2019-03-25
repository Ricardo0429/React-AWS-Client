package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ItemCollectionMetrics => ScalaItemCollectionMetrics, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ItemCollectionMetrics => JavaItemCollectionMetrics }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ItemCollectionMetricsOps {

  implicit class ScalaItemCollectionMetricsOps(val self: ScalaItemCollectionMetrics) extends AnyVal {

    def toJava: JavaItemCollectionMetrics = {
      val result = JavaItemCollectionMetrics.builder()
                                              self.itemCollectionKey.filter(_.nonEmpty).foreach{ v => import scala.collection.JavaConverters._, AttributeValueOps._; result.itemCollectionKey(v.mapValues(_.toJava).asJava) } // Map[String, AttributeValue], case Map[_], UserDefined
                          self.sizeEstimateRangeGB.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Double])).foreach{ v => import scala.collection.JavaConverters._; result.sizeEstimateRangeGB(v.asJava) } // Seq[Double], case Seq[_], Defined

      result.build()
    }

  }

  implicit class JavaItemCollectionMetricsOps(val self: JavaItemCollectionMetrics) extends AnyVal {

     def toScala: ScalaItemCollectionMetrics = {
       ScalaItemCollectionMetrics()
                    .withItemCollectionKey(Option(self.itemCollectionKey).map{ v => import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala) }) // Map[String, AttributeValue], Map-8
                .withSizeEstimateRangeGB(Option(self.sizeEstimateRangeGB).map{ v => import scala.collection.JavaConverters._; v.asScala.map(_.doubleValue())}) // Seq[Double], Seq-4
     }

   }

}