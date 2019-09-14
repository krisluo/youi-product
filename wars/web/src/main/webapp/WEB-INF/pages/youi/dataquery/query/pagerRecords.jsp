<%@ include file="/WEB-INF/pages/common/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<youi:page caption="数据查询结果" dataSrc="/metadataServices/services/dataQueryManager/getDataQuery.json?id=${param.id}">

    <youi:toolbar refWidgetId="grid_queryData">
        <youi:toolbarItem name="refresh" caption="查询" tooltips="" icon="search"/>
    </youi:toolbar>

    <youi:grid id="grid_queryData" load="false" reset="NOT" query="NOT" fixedFooter="true"
               src="/metadataServices/services/dataQueryService/queryRowDataByPager.json?id=${param.id}">

        <youi:fieldLayout>
            <youi:fieldHidden property="id" defaultValue="${param.id}"/>
        </youi:fieldLayout>

        <youi:gridCol property="Row" caption="序号" width="5%"/>
    </youi:grid>

    <youi:func name="init" params="result">
        var cols = [];
        $(result.record.queryColumns).each(function(){
            cols.push({
                property:this.columnName,
                caption:this.text||this.columnName,
                width:'20%'
            });
        });
        $elem('grid_queryData',pageId).grid('appendCols',cols).grid('refresh');
    </youi:func>

</youi:page>