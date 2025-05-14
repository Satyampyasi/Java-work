
/*Scenario:
A company wants to send notifications through different channels like SMS, Email,
and Push Notification.

Requirements:
- Create a Notifier interface with a method sendNotification(String message).
- Implement this interface in classes: SMSNotifier, EmailNotifier, and PushNotifier.
- Create a method triggerAlert(Notifier notifier, String message) that sends the
  message using the given notifier.

Test Case:
- Trigger alerts using all three notifiers with the message:
   “Your order has been shipped.”
 */

interface Notifier{
     public void sendNotification(String message );
}
class SMSNotifier implements Notifier{
     public void sendNotification(String message){
          System.out.println("message  by sms notifer "+message);
     }
}
class EmailNotifier implements Notifier{
     public void sendNotification(String message){
          System.out.println(" message by email notifer "+message);
     }
}
class PushNotifier implements Notifier{
     public void sendNotification(String message){
          System.out.println(" message by push notifier "+message);
     }
     

}

class Alter{
     public static void  triggerAlert(Notifier notifier, String message){
          notifier.sendNotification(message);
     }
    
}


public class main2class {
     public static void main(String[] args) {
         Notifier sms = new SMSNotifier();
         Notifier email = new EmailNotifier();
         Notifier push = new PushNotifier();

           Alter.triggerAlert(sms,"good morning ");
           Alter.triggerAlert(email,"good afternoon ");
           Alter.triggerAlert(push,"good night ");

     }
}
