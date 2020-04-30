// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeMovingAddressesResponseBuilderOps(val self: DescribeMovingAddressesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def movingAddressStatusesAsScala(value: Option[Seq[MovingAddressStatus]]): DescribeMovingAddressesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.movingAddressStatuses(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeMovingAddressesResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeMovingAddressesResponseOps(val self: DescribeMovingAddressesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def movingAddressStatusesAsScala: Option[Seq[MovingAddressStatus]] = Option(self.movingAddressStatuses).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeMovingAddressesResponseOps {

implicit def toDescribeMovingAddressesResponseBuilderOps(v: DescribeMovingAddressesResponse.Builder): DescribeMovingAddressesResponseBuilderOps = new DescribeMovingAddressesResponseBuilderOps(v)

implicit def toDescribeMovingAddressesResponseOps(v: DescribeMovingAddressesResponse): DescribeMovingAddressesResponseOps = new DescribeMovingAddressesResponseOps(v)

}

