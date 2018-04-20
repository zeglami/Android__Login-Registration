<?php 
require_once '../includes/DbOperations.php';

$response = array();
if ($_SERVER['REQUEST_METHOD']=='POST') {
	if (isset($_POST['username'])
		and isset($_POST['password'])
		and isset($_POST['email'])

	 ) {
		$db=new DbOperations();

		$result=$db->createUser($_POST['username'],$_POST['password'],$_POST['email']);



	if ($result==1) {
			$response['error']=false;
			$response['message']="User Registred successfully";
		}elseif($result==2)
		{
			$response['error']=true;
			$response['message']="Some error occured please try again ";


		}elseif($result==0){
			$response['error']=true;
			$response['message']="It seems you already registred, please choose a diffrent email and username";




		}




	} else {
		$response['error']=true;
	$response['message']="Required fileds are missing";
	}
	


	
}else{
	$response['error']=true;
	$response['message']="Invalid Request";
}

echo json_encode($response);



