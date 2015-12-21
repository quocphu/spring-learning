<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
        .error {
            color: #ff0000;
        }

        .errorblock {
            color: #000;
            background-color: #ffeeee;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
<title>Student 1</title>
</head>
<body>
	<form:form method="POST" commandName="student" action="student1" enctype="multipart/form-data">
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="error"/></td>
			</tr>
			<tr>
				<td><form:label path="age">Age</form:label></td>
				<td><form:input path="age" /></td>
				<td><form:errors path="age" /></td>
			</tr>
			<tr>
				<td><label for="avatar">Image</label></td>
				<td><input type="file" name="avatar"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>