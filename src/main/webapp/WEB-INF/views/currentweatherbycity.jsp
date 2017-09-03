<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Wai Chan Weather - Current Weather By City</title>
</head>
<body>
Current Weather By City
	<Table>
		<TR>
			<TD>City</TD>
			<TD>${weatherDetail.city}</TD>
		</TR>
		<TR>
			<TD>Updated time</TD>
			<TD>${weatherDetail.updatedTime}</TD>
		</TR>
		<TR>
			<TD>Weather</TD>
			<TD>${weatherDetail.weather}</TD>
		</TR>
		<TR>
			<TD>Temperature</TD>
			<TD>${weatherDetail.temperature}°C</TD>
		</TR>
		<TR>
			<TD>Wind</TD>
			<TD>${weatherDetail.wind}km/h</TD>
		</TR>
	</Table>

</body>
</html>