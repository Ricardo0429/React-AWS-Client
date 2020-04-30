// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointConnectionNotificationsRequestBuilderOps(val self: DescribeVpcEndpointConnectionNotificationsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def connectionNotificationIdAsScala(value: Option[String]): DescribeVpcEndpointConnectionNotificationsRequest.Builder = {
            value.fold(self){ v => self.connectionNotificationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVpcEndpointConnectionNotificationsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeVpcEndpointConnectionNotificationsRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointConnectionNotificationsRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeVpcEndpointConnectionNotificationsRequestOps(val self: DescribeVpcEndpointConnectionNotificationsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def connectionNotificationIdAsScala: Option[String] = Option(self.connectionNotificationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcEndpointConnectionNotificationsRequestOps {

implicit def toDescribeVpcEndpointConnectionNotificationsRequestBuilderOps(v: DescribeVpcEndpointConnectionNotificationsRequest.Builder): DescribeVpcEndpointConnectionNotificationsRequestBuilderOps = new DescribeVpcEndpointConnectionNotificationsRequestBuilderOps(v)

implicit def toDescribeVpcEndpointConnectionNotificationsRequestOps(v: DescribeVpcEndpointConnectionNotificationsRequest): DescribeVpcEndpointConnectionNotificationsRequestOps = new DescribeVpcEndpointConnectionNotificationsRequestOps(v)

}

