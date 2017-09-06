<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Wai Chan Weather - Current Weather By City</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
</head>
<body>
	<h1>Current Weather By City</h1>
<div ng-app="weatherApp" ng-controller="weatherCtrl">
	<Table>
		<TR>
			<TD>City</TD>
			<TD>{{weatherDetail.city}}</TD>
		</TR>
		<TR>
			<TD>Updated time</TD>
			<TD>{{weatherDetail.updatedTime}}</TD>
		</TR>
		<TR>
			<TD>Weather</TD>
			<TD>{{weatherDetail.weather}}</TD>
		</TR>
		<TR>
			<TD>Temperature</TD>
			<TD>{{weatherDetail.temperature}}°C</TD>
		</TR>
		<TR>
			<TD>Wind</TD>
			<TD>{{weatherDetail.wind}}km/h</TD>
		</TR>
	</Table>
</div>

<script>
//Get the weather details from the Rest API
var weatherApp = angular.module('weatherApp', []);
weatherApp.controller('weatherCtrl', function($scope, $http) {
	$interval($http({
        method : "GET",
        url : "weather"
    }).then((function(response) {
        $scope.weatherDetail = response.data;
    })), 1000);
});

</script>
</body>
</html>