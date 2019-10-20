<?php

	include_once(__DIR__.'/phpmailer/src/POP3.php');

	include_once(__DIR__.'/phpmailer/src/PHPMailer.php');
	include_once(__DIR__.'/phpmailer/src/SMTP.php');
	include_once(__DIR__.'/phpmailer/src/Exception.php');	
	include_once(__DIR__.'/phpmailer/src/OAuth.php');	
	
	use PHPMailer\PHPMailer\PHPMailer;


	include_once('waStaticFunction.php');
	include_once('waErrorFunction.php');
	$GLOBALS['password'] = "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8";;
	



	function setSMTPSettings(PHPMailer &$mail)
    {
        $email_settings = [
'smtp'=>[
'enabled'=>0
]
];
        $smtp = null;
        if (($email_settings!==null)&& (array_key_exists('smtp',$email_settings)===true))
        {
            if ($email_settings['smtp']['enabled']===1)
            {
                $smtp = $email_settings['smtp'];
            }
        }
        if ($smtp !== null)
        {
            $mail->isSMTP();// Set mailer to use SMTP
            $mail->Host = $smtp['host'];  // Specify main and backup SMTP servers
            $mail->SMTPSecure = $smtp['protocol']; // Enable TLS encryption, `ssl` also accepted
            $mail->Port = $smtp['port'];

            $mail->SMTPAuth = ($smtp['b_auth']===1)?true:false;    // Enable SMTP authentication
            $mail->Username = $smtp['user']; // SMTP username
            $mail->Password = $smtp['pwd'];           // SMTP password
        }
    }

        function waSendMail( $to, $title, $mess, $reply_to='')
	{
		if (strlen($to)==0) $to = ""; 
		if (strlen($title)==0) $title = ""; 
		if (strlen($title)==0) $title = "Mail sent by WARC"; 
		if (strlen($to)==0)      
		{
			waSetError('No email');     
			return false;     
		}



                $main_address = "";
                $addresses = explode(";",$to);
                if (count($addresses)>0)
                {
                    $main_address = $addresses[0];
                }

                if (filter_var($main_address, FILTER_VALIDATE_EMAIL)===false)
		{
                    waSetError('Invalid email ! ('.$main_address.')');
		    return false;
		}


		$mail = new PHPMailer();
		$mail->CharSet = 'UTF-8';
		
		if (strlen($reply_to)>0)
		{
                        //$mail->addReplyTo($reply_to);
                        $mail->setFrom($reply_to);
		}
                else
                {
                    $mail->setFrom($main_address);
                }




                //$addresses = explode();

                foreach ($addresses as $address)
                {
                    $mail->addAddress($address);
                }





		setSMTPSettings($mail);
		//Content
                $mail->isHTML(false);
                $mail->Subject = $title;
                $mail->Body    = $mess;

                if (@$mail->send()===false)
                {
                                waSetError($mail->ErrorInfo);
                    return false;
                }
		return true;      
	}



