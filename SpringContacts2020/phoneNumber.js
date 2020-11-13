/**
 * 
 */


function validate(){
	if(Contact.name.value == ""){
		alert("Please provide a name!");
		Contact.name.focus();
		return false;
	}
	
	return (true);
}