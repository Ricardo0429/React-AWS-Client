// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.monix

import com.github.j5ik2o.reactive.aws.dynamodb.monix.{ DynamoDBMonixClient => BaseDynamoDBMonixClient }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemRequest, BatchGetItemResponse, _ }
import com.github.j5ik2o.reactive.aws.dynamodb.v2.DynamoDBAsyncClient
import monix.reactive.Observable

object DynamoDBMonixClient {

def apply(underlying: DynamoDBAsyncClient): DynamoDBMonixClient = new DynamoDBMonixClientImpl(underlying)

}

trait DynamoDBMonixClient extends BaseDynamoDBMonixClient {

override val underlying: DynamoDBAsyncClient

<#list methods as method><#if targetMethod(method)>
    <#assign requestParameterName=method.parameterTypeDescs[0].name>
    <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
    <#assign responseTypeName=requestTypeName?replace("Request", "Response")>
    def ${method.name}(<#list method.parameterTypeDescs as p>${requestParameterName}: ${requestTypeName}<#if p_has_next>,</#if></#list>): Observable[${responseTypeName}] =
      Observable.fromReactivePublisher(underlying.${method.name}(${requestParameterName}))

</#if></#list>

}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if !methodDesc.name?ends_with("Paginator")>
        <#return false>
    </#if>
    <#if !methodDesc.parameterTypeDescs?has_content>
        <#return false>
    </#if>
    <#local target=true>
    <#list methodDesc.parameterTypeDescs as p>
        <#if p.parameterTypeDesc.fullTypeName == "Consumer[Builder]">
            <#local target = false>
            <#break >
        </#if>
    </#list>
    <#return target>
</#function>

