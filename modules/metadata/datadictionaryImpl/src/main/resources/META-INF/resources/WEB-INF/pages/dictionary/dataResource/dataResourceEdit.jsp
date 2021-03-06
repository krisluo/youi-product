<%@ include file="/WEB-INF/pages/common/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<youi:page caption="数据资源编辑" autoLoadData="${param.id!=null}"
	dataSrc="/esb/web/dataResourceManager/getDataResource.json?id=${param.id}">
	<youi:form id="form_dataResource" panel="false" submit="NOT" reset="NOT" action="/esb/web/dataResourceManager/saveDataResource.json"
		idKeys="id">
		<youi:fieldLayout columns="1">
			<youi:fieldHidden property="id"  caption="i18n.dataResource.id"/>
			<youi:fieldText property="caption"  caption="i18n.dataResource.caption"/>
			<youi:fieldText property="schema"  caption="i18n.dataResource.schema"/>
			<youi:fieldText property="catalog"  caption="i18n.dataResource.catalog"/>
			<youi:fieldText property="status"  caption="i18n.dataResource.status"/>
		</youi:fieldLayout>
	</youi:form>
	
	<youi:button name="submit" caption="提交" submitProperty="submit" submitValue="1"/>
	
	<youi:func name="init" params="results">
		if(results&&results.record){
			$elem('form_dataResource',pageId).form('fillRecord',results.record);
		}
	</youi:func>
	
	<youi:func name="form_dataResource_afterSubmit" params="results">
		$.youi.messageUtils.showMessage('保存数据资源成功.');
		$elem('form_dataResource',pageId).form('reset');
		$.youi.pageUtils.closeAndRefreshSubpage(pageId,results.record);//关闭并刷新主页面的subpage组件
	</youi:func>
</youi:page>