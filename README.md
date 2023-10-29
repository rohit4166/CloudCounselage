# Mail Sending using Java #

Overview
This module is a Java-based web application that demonstrates the use of the JavaMail API to send emails from a servlet. It provides a simple and practical example of how to send email messages programmatically through a Gmail SMTP server. This functionality can be integrated into various applications to enable automated email communication.

Key Features

Utilizes the JavaMail API to send emails, providing a versatile method for email communication.
Demonstrates how to configure and use Gmail's SMTP server for sending email messages.
Sends a basic email message with a subject and content from a specified sender to a recipient.

Usage

Clone or download this module to your local environment.
Configure the Gmail account information:
Update the user and password variables with your Gmail account credentials.
Make sure to enable "Less secure apps" in your Gmail account settings to allow SMTP access.Now-a-days this features not available on in Google account. So to do that you need to go two-step verification then you will find create new password for your app ,so there you can
provide name of your app and then google will provide one password for this app.
the same password you can use to login your google account. So dont share this password with anyone else.
Build and deploy the module on a Java Servlet container like Apache Tomcat.
Run the Servlet module.
The servlet will send an email to the recipient's address specified in the to variable.

Prerequisites

Java Development Kit (JDK) installed.
A Java Servlet container (e.g., Apache Tomcat) for deployment.
A Gmail account for sending emails.

Dependencies

JavaMail API: A Java-based library for sending and receiving email messages.
Servlet API: Part of the Java EE platform for building web applications.

  
