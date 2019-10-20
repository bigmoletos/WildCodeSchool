<?php

if (!defined('PHP_VERSION_ID')) {
   $version = explode('.',PHP_VERSION);
   define('PHP_VERSION_ID', ($version[0] * 10000 + $version[1] * 100 + $version[2]));
}

if (PHP_VERSION_ID < 50207) 
{
    define('PHP_MAJOR_VERSION',   $version[0]);
    define('PHP_MINOR_VERSION',   $version[1]);
    define('PHP_RELEASE_VERSION', $version[2]);
}

function getCurlData($url)
{
	$curl = curl_init();
	curl_setopt($curl, CURLOPT_URL, $url);
	curl_setopt($curl, CURLOPT_RETURNTRANSFER, 1);
	curl_setopt($curl, CURLOPT_TIMEOUT, 10);
	curl_setopt($curl, CURLOPT_USERAGENT, "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US; rv:1.9.2.16) Gecko/20110319 Firefox/3.6.16");
	$curlData = curl_exec($curl);
	curl_close($curl);
	return $curlData;
}



function waAddToMailHeader($var_name,$var_value,$reply_to) 
{
	$headers= "";
	
	if (strlen($var_value)>0)
	{
		if ($var_value=="[mail]")
		{
			$var_value = $reply_to;
		}
		
		if (strlen($var_value)>0)
		{
			$headers .= $var_name.":".$var_value."\r\n";
		}
		
	}
	return $headers;
}

function waFormatResultForm($res,$error,$success_message)
{
	$arr = array('success' => $res, 'error' => $error, 'success_message' => $success_message);
	return json_encode($arr);
}

function waRetrievePostParameter($k)
{
$val='';
if (isset($HTTP_POST_VARS)&&array_key_exists($k,$HTTP_POST_VARS)) $val= $HTTP_POST_VARS[$k];
if (isset($_POST)&&array_key_exists($k,$_POST)) $val= $_POST[$k];
return stripslashes( $val );
}

function waRetrieveGetParameter($k)
{
$val='';
if (isset($HTTP_GET_VARS)&&array_key_exists($k,$HTTP_GET_VARS)) $val= $HTTP_GET_VARS[$k];
if (isset($_GET)&&array_key_exists($k,$_GET)) $val= $_GET[$k];
return stripslashes( $val );
}

function waRetrieveGetServer($k)
{
$val='';
if (isset($HTTP_SERVER)&&array_key_exists($k,$HTTP_SERVER)) $val= $HTTP_SERVER[$k];
if (isset($_SERVER)&&array_key_exists($k,$_SERVER)) $val= $_SERVER[$k];
return $val;
}

function waRetrieveSession($k)
{
$val='';
if (isset($HTTP_SESSION_VARS)&&array_key_exists($k,$HTTP_SESSION_VARS)) $val= $HTTP_SESSION_VARS[$k];
if (isset($_SESSION)&&array_key_exists($k,$_SESSION)) $val= $_SESSION[$k];
return $val;
}
?>