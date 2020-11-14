<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
<script type = "text/javascript">
// regular expression to match only alphanumeric characters and spaces
function checkForm(){
var re = /^(0|[1-9]\d*)$/;

// validation fails if the input doesn't match our regular expression
if(!re.test(document.myForm.userNumber1.value)) {
  alert("Error: Input contains invalid number!");
  document.myForm.userNumber1.focus();
  return false;
} else if (!re.test(document.myForm.userNumber2.value)) {
	  alert("Error: Input contains invalid number!");
	  document.myForm.userNumber2.focus();
	  return false;
}  else if(!re.test(document.myForm.userNumber3.value)) {
	  alert("Error: Input contains invalid number!");
	  document.myForm.userNumber3.focus();
	  return false;
}  else if(!re.test(document.myForm.userNumber4.value)) {
	  alert("Error: Input contains invalid number!");
	  document.myForm.userNumber4.focus();
	  return false;
}
// validation was successful
return true;
}
</script>

</head>
<body>
<h1>Calculator</h1>
<form name="myForm" action="getSumServlet" method="post" onsubmit="return (checkForm());">
Enter in a whole number: <input type="text" name="userNumber1" size="5" required> + <input type="text" name="userNumber2" size="5" required> + <input type="text" name="userNumber3" size="5" required> + <input type="text" name="userNumber4" size="5" required>
<input type="submit" value="Calculate Sum" />
</form>

</body>
</html>