/**
 * 
 */

function check()
{
	var x=document.getElementById("season").value;
	var tit=document.getElementById("title").value;
	var ye=document.getElementById("year").value;
	var flag=true;
	if(x=="select")
		{
		flag=false;
		document.getElementById('sea').innerHTML="Please select season";
		}	
	if(tit=="")
	   {
		flag=false;
		
		document.getElementById('stitle').innerHTML="Please Enter Title";
	   }
	if(ye=="")
		{flag=false;
		document.getElementById('syear').innerHTML="Please Enter year";
		}
	return flag;
}