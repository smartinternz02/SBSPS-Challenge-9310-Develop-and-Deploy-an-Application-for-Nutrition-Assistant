<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="webnutritionist" tagdir="/WEB-INF/tags"%>

<div class="well">
  <p>Найдено <strong>${page.totalElements }</strong> профиля</p>
</div>

<jsp:include page="profiles.jsp" />